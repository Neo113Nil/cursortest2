package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class k43 {
    public static final k43 b;
    public static final k43 c;
    public static final k43 d;
    public static final k43 e;
    public static final k43 f;
    public static final /* synthetic */ k43[] g;

    static {
        k43 k43Var = new k43("TIME", 0);
        b = k43Var;
        k43 k43Var2 = new k43("PERCENTAGE", 1);
        c = k43Var2;
        k43 k43Var3 = new k43("START", 2);
        d = k43Var3;
        k43 k43Var4 = new k43("END", 3);
        e = k43Var4;
        k43 k43Var5 = new k43("POSITION", 4);
        f = k43Var5;
        g = new k43[]{k43Var, k43Var2, k43Var3, k43Var4, k43Var5};
    }

    public static k43 valueOf(String str) {
        return (k43) Enum.valueOf(k43.class, str);
    }

    public static k43[] values() {
        return (k43[]) g.clone();
    }
}
