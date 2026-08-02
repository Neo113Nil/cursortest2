package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class j5 {
    public static final j5 b;
    public static final j5 c;
    public static final j5 d;
    public static final j5 e;
    public static final j5 f;
    public static final /* synthetic */ j5[] g;

    static {
        j5 j5Var = new j5("CANCELLED", 0);
        b = j5Var;
        j5 j5Var2 = new j5("NOT_STARTED", 1);
        c = j5Var2;
        j5 j5Var3 = new j5("LOADING", 2);
        d = j5Var3;
        j5 j5Var4 = new j5("SUCCESSFULLY_LOADED", 3);
        e = j5Var4;
        j5 j5Var5 = new j5("ERRONEOUSLY_LOADED", 4);
        f = j5Var5;
        g = new j5[]{j5Var, j5Var2, j5Var3, j5Var4, j5Var5};
    }

    public static j5 valueOf(String str) {
        return (j5) Enum.valueOf(j5.class, str);
    }

    public static j5[] values() {
        return (j5[]) g.clone();
    }
}
