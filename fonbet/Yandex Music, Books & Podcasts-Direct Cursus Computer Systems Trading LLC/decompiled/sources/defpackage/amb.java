package defpackage;

/* loaded from: classes3.dex */
public enum amb {
    Top("top"),
    Track("track"),
    Album("album"),
    Artist("artist"),
    Playlist("playlist"),
    Podcast("podcast"),
    Book("book"),
    Spoken("spoken"),
    KidsMusic("kids_music"),
    KidsPlaylist("kids_playlist"),
    KidsSpoken("kids_spoken"),
    SpokenPlaylist("spoken_playlist"),
    Video("video"),
    /* JADX INFO: Fake field, exist only in values array */
    Clip("clip"),
    Other("other"),
    Concert("concert");

    public final String a;

    amb(String str) {
        this.a = str;
    }
}
