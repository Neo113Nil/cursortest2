package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class de3 {
    public static final de3 b;
    public static final de3 c;
    public static final de3 d;
    public static final de3 e;
    public static final /* synthetic */ de3[] f;

    static {
        de3 de3Var = new de3("PREROLL", 0);
        b = de3Var;
        de3 de3Var2 = new de3("MIDROLL", 1);
        c = de3Var2;
        de3 de3Var3 = new de3("POSTROLL", 2);
        d = de3Var3;
        de3 de3Var4 = new de3("STANDALONE", 3);
        e = de3Var4;
        f = new de3[]{de3Var, de3Var2, de3Var3, de3Var4};
    }

    public static de3 valueOf(String str) {
        return (de3) Enum.valueOf(de3.class, str);
    }

    public static de3[] values() {
        return (de3[]) f.clone();
    }
}
