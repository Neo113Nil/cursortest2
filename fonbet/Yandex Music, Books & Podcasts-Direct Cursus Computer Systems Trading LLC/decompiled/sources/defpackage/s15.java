package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class s15 {
    public static final ogp b;
    public static final /* synthetic */ s15[] c;
    public static final /* synthetic */ rdb d;
    public final String a;

    static {
        s15[] s15VarArr = {new s15("MY_PLAYLISTS", 0, "my_playlists"), new s15("LIKED_PLAYLISTS", 1, "liked_playlists"), new s15("ALBUMS", 2, "albums"), new s15("VIDEO_CLIPS", 3, "clips"), new s15("ARTISTS", 4, "artists"), new s15("PODCASTS", 5, "podcasts"), new s15("AUDIOBOOKS", 6, "audiobooks"), new s15("KIDS", 7, "kids"), new s15("CACHED_TRACKS", 8, "cached_tracks"), new s15("FAVORITE_TRACKS", 9, "favorite_tracks"), new s15("DOWNLOADS", 10, "downloads"), new s15("TRACKS", 11, "tracks")};
        c = s15VarArr;
        d = new rdb(s15VarArr);
        b = new ogp();
    }

    public s15(String str, int i, String str2) {
        this.a = str2;
    }

    public static s15 valueOf(String str) {
        return (s15) Enum.valueOf(s15.class, str);
    }

    public static s15[] values() {
        return (s15[]) c.clone();
    }
}
