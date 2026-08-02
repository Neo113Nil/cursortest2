package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class g70 {
    public static final g70 a;
    public static final g70 b;
    public static final /* synthetic */ g70[] c;

    /* JADX INFO: Fake field, exist only in values array */
    g70 EF0;

    static {
        g70 g70Var = new g70("AlbumList", 0);
        g70 g70Var2 = new g70("ArtistList", 1);
        g70 g70Var3 = new g70("PlaylistList", 2);
        g70 g70Var4 = new g70("ArtistConcertList", 3);
        g70 g70Var5 = new g70("ArtistAbout", 4);
        a = g70Var5;
        g70 g70Var6 = new g70("ArtistFullscreenGallery", 5);
        b = g70Var6;
        c = new g70[]{g70Var, g70Var2, g70Var3, g70Var4, g70Var5, g70Var6, new g70("ArtistFamiliarToYou", 6), new g70("ArtistTrackListScreen", 7), new g70("Link", 8)};
    }

    public static g70 valueOf(String str) {
        return (g70) Enum.valueOf(g70.class, str);
    }

    public static g70[] values() {
        return (g70[]) c.clone();
    }
}
