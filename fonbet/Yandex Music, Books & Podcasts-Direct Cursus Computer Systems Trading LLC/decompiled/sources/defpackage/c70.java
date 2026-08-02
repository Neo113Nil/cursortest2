package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c70 {
    public static final c70 a;
    public static final c70 b;
    public static final c70 c;
    public static final c70 d;
    public static final c70 e;
    public static final c70 f;
    public static final c70 g;
    public static final c70 h;
    public static final c70 i;
    public static final c70 j;
    public static final c70 k;
    public static final c70 l;
    public static final /* synthetic */ c70[] m;

    static {
        c70 c70Var = new c70("Album", 0);
        a = c70Var;
        c70 c70Var2 = new c70("UpcomingAlbum", 1);
        c70 c70Var3 = new c70("Artist", 2);
        b = c70Var3;
        c70 c70Var4 = new c70("Banner", 3);
        c = c70Var4;
        c70 c70Var5 = new c70("Playlist", 4);
        d = c70Var5;
        c70 c70Var6 = new c70("Wave", 5);
        e = c70Var6;
        c70 c70Var7 = new c70("Shortcut", 6);
        f = c70Var7;
        c70 c70Var8 = new c70("Track", 7);
        g = c70Var8;
        c70 c70Var9 = new c70("Feature", 8);
        h = c70Var9;
        c70 c70Var10 = new c70("Video", 9);
        i = c70Var10;
        c70 c70Var11 = new c70("Text", 10);
        j = c70Var11;
        c70 c70Var12 = new c70("Concert", 11);
        c70 c70Var13 = new c70("ConcertPurchase", 12);
        c70 c70Var14 = new c70("MusicHistory", 13);
        k = c70Var14;
        c70 c70Var15 = new c70("Donation", 14);
        c70 c70Var16 = new c70("Generative", 15);
        l = c70Var16;
        m = new c70[]{c70Var, c70Var2, c70Var3, c70Var4, c70Var5, c70Var6, c70Var7, c70Var8, c70Var9, c70Var10, c70Var11, c70Var12, c70Var13, c70Var14, c70Var15, c70Var16, new c70("NonApplicable", 16), new c70("Collection", 17), new c70("Downloaded", 18), new c70("Player", 19)};
    }

    public static c70 valueOf(String str) {
        return (c70) Enum.valueOf(c70.class, str);
    }

    public static c70[] values() {
        return (c70[]) m.clone();
    }
}
