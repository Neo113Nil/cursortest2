package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class gd5 {
    public static final gd5 a;
    public static final gd5 b;
    public static final /* synthetic */ gd5[] c;

    static {
        gd5 gd5Var = new gd5("Albums", 0);
        a = gd5Var;
        gd5 gd5Var2 = new gd5("Playlists", 1);
        b = gd5Var2;
        c = new gd5[]{gd5Var, gd5Var2};
    }

    public static gd5 valueOf(String str) {
        return (gd5) Enum.valueOf(gd5.class, str);
    }

    public static gd5[] values() {
        return (gd5[]) c.clone();
    }
}
