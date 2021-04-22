import java.util.ArrayList;

public class Playlist {
    public String name;
    public ArrayList<Song> playlist = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public boolean isEmpty() {
        return playlist.isEmpty();
    }

    public void addSong(Song song) {
        playlist.add(song);
    }

    public String[] songNames() {
        String[] songArray = new String[playlist.size()];

        for (int i = 0; i < playlist.size(); i++) {
            songArray[i] = playlist.get(i).title;
        }

        return songArray;
    }

    public int totalDuration() {
        int duration = 0;

        for (int i = 0; i < playlist.size(); i++) {
            duration += playlist.get(i).durationInSeconds;
        }

        return duration;
    }

    public String[] swap(Song song1, Song song2) {
        String[] swappedSongOrder = new String[playlist.size()];

        for (int i = 0; i < playlist.size(); i++) {
            if (playlist.get(i).title.equals(song1.title)) {
                swappedSongOrder[i] = song2.title;
            } else if (playlist.get(i).title.equals(song2.title)) {
                swappedSongOrder[i] = song1.title;
            } else {
                swappedSongOrder[i] = playlist.get(i).title;
            }
        }

        return swappedSongOrder;
    }

    public String[] removeSong(Song song) {
        String[] withRemoved = new String[playlist.size() - 1];
        playlist.remove(song);

        for (int i = 0; i < playlist.size(); i++) {
            withRemoved[i] = playlist.get(i).title;
        }

        return withRemoved;
    }
}
