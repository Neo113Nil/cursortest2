package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class bi6 {
    public static final bi6 a;
    public static final bi6 b;
    public static final bi6 c;
    public static final /* synthetic */ bi6[] d;

    static {
        bi6 bi6Var = new bi6("Shelf", 0);
        a = bi6Var;
        bi6 bi6Var2 = new bi6("NewEpisodes", 1);
        b = bi6Var2;
        bi6 bi6Var3 = new bi6("Play", 2);
        c = bi6Var3;
        d = new bi6[]{bi6Var, bi6Var2, bi6Var3};
    }

    public static bi6 valueOf(String str) {
        return (bi6) Enum.valueOf(bi6.class, str);
    }

    public static bi6[] values() {
        return (bi6[]) d.clone();
    }
}
