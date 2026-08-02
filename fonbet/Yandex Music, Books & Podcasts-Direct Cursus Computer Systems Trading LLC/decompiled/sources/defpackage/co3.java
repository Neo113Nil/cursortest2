package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class co3 {
    public static final co3 a;
    public static final co3 b;
    public static final /* synthetic */ co3[] c;

    static {
        co3 co3Var = new co3("all", 0);
        a = co3Var;
        co3 co3Var2 = new co3("aural", 1);
        co3 co3Var3 = new co3("braille", 2);
        co3 co3Var4 = new co3("embossed", 3);
        co3 co3Var5 = new co3("handheld", 4);
        co3 co3Var6 = new co3("print", 5);
        co3 co3Var7 = new co3("projection", 6);
        co3 co3Var8 = new co3("screen", 7);
        b = co3Var8;
        c = new co3[]{co3Var, co3Var2, co3Var3, co3Var4, co3Var5, co3Var6, co3Var7, co3Var8, new co3("speech", 8), new co3("tty", 9), new co3("tv", 10)};
    }

    public static co3 valueOf(String str) {
        return (co3) Enum.valueOf(co3.class, str);
    }

    public static co3[] values() {
        return (co3[]) c.clone();
    }
}
