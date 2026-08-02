package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class p9 {
    public static final p9 b;
    public static final p9 c;
    public static final p9 d;
    public static final /* synthetic */ p9[] e;

    static {
        p9 p9Var = new p9("SINGLE", 0);
        b = p9Var;
        p9 p9Var2 = new p9("BLOCK", 1);
        c = p9Var2;
        p9 p9Var3 = new p9("BLOCK_INNER_CREATIVE", 2);
        d = p9Var3;
        e = new p9[]{p9Var, p9Var2, p9Var3};
    }

    public static p9 valueOf(String str) {
        return (p9) Enum.valueOf(p9.class, str);
    }

    public static p9[] values() {
        return (p9[]) e.clone();
    }
}
