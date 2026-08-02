package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b72 implements a82 {
    public static final b72 b;
    public static final b72 c;
    public static final b72 d;
    public static final b72 e;
    public static final b72 f;
    public static final b72 g;
    public static final b72 h;
    public static final /* synthetic */ b72[] i;
    public static final /* synthetic */ rdb j;
    public final String a;

    static {
        b72 b72Var = new b72("DOWNLOADED_KIDS_ALBUMS", 0, "DOWNLOADED_KIDS_ALBUMS_MEDIA_ID");
        b72 b72Var2 = new b72("DOWNLOADED_KIDS_PLAYLISTS", 1, "DOWNLOADED_KIDS_PLAYLISTS_MEDIA_ID");
        b72 b72Var3 = new b72("DOWNLOADED_KIDS_TRACKS", 2, "DOWNLOADED_KIDS_TRACKS_MEDIA_ID");
        b72 b72Var4 = new b72("DOWNLOADED_ALL_PODCASTS", 3, "DOWNLOADED_ALL_PODCASTS_MEDIA_ID");
        b72 b72Var5 = new b72("DOWNLOADED_EPISODES", 4, "DOWNLOADED_EPISODES_MEDIA_ID");
        b72 b72Var6 = new b72("DOWNLOADED_ALL_AUDIOBOOKS", 5, "DOWNLOADED_ALL_AUDIOBOOKS_MEDIA_ID");
        b72 b72Var7 = new b72("DOWNLOADED_CHAPTERS", 6, "DOWNLOADED_CHAPTERS_MEDIA_ID");
        b72 b72Var8 = new b72("DOWNLOADED_KIDS_BLOCK", 7, "DOWNLOADED_KIDS_BLOCK_MEDIA_ID");
        b = b72Var8;
        b72 b72Var9 = new b72("DOWNLOADED_ARTISTS_BLOCK", 8, "DOWNLOADED_ARTISTS_BLOCK_MEDIA_ID");
        c = b72Var9;
        b72 b72Var10 = new b72("DOWNLOADED_AUDIOBOOKS_BLOCK", 9, "DOWNLOADED_AUDIOBOOKS_BLOCK_MEDIA_ID");
        d = b72Var10;
        b72 b72Var11 = new b72("DOWNLOADED_PODCASTS_BLOCK", 10, "DOWNLOADED_PODCASTS_BLOCK_MEDIA_ID");
        e = b72Var11;
        b72 b72Var12 = new b72("DOWNLOADED_ALBUMS_BLOCK", 11, "DOWNLOADED_ALBUMS_BLOCK_MEDIA_ID");
        f = b72Var12;
        b72 b72Var13 = new b72("DOWNLOADED_PLAYLISTS_BLOCK", 12, "DOWNLOADED_PLAYLISTS_BLOCK_MEDIA_ID");
        g = b72Var13;
        b72 b72Var14 = new b72("DOWNLOADED_TRACKS_BLOCK", 13, "DOWNLOADED_TRACKS_BLOCK_MEDIA_ID");
        h = b72Var14;
        b72[] b72VarArr = {b72Var, b72Var2, b72Var3, b72Var4, b72Var5, b72Var6, b72Var7, b72Var8, b72Var9, b72Var10, b72Var11, b72Var12, b72Var13, b72Var14};
        i = b72VarArr;
        j = new rdb(b72VarArr);
    }

    public b72(String str, int i2, String str2) {
        this.a = str2;
    }

    public static b72 valueOf(String str) {
        return (b72) Enum.valueOf(b72.class, str);
    }

    public static b72[] values() {
        return (b72[]) i.clone();
    }

    @Override // defpackage.a82
    public final String a() {
        return this.a;
    }
}
