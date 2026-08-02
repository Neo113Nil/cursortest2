package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class zb1 {
    public static final zb1 a;
    public static final zb1 b;
    public static final zb1 c;
    public static final zb1 d;
    public static final zb1 e;
    public static final zb1 f;
    public static final /* synthetic */ zb1[] g;

    static {
        zb1 zb1Var = new zb1("POPULAR_TRACKS", 0);
        a = zb1Var;
        zb1 zb1Var2 = new zb1("DOWNLOADED_TRACKS", 1);
        b = zb1Var2;
        zb1 zb1Var3 = new zb1("ALBUMS", 2);
        c = zb1Var3;
        zb1 zb1Var4 = new zb1("DISCOGRAPHY", 3);
        d = zb1Var4;
        zb1 zb1Var5 = new zb1("COMPILATIONS", 4);
        e = zb1Var5;
        zb1 zb1Var6 = new zb1("SIMILAR_ARTISTS", 5);
        f = zb1Var6;
        g = new zb1[]{zb1Var, zb1Var2, zb1Var3, zb1Var4, zb1Var5, zb1Var6};
    }

    public static zb1 valueOf(String str) {
        return (zb1) Enum.valueOf(zb1.class, str);
    }

    public static zb1[] values() {
        return (zb1[]) g.clone();
    }
}
