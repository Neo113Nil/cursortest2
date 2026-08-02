package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class mt1 {
    public static final mt1 b;
    public static final mt1 c;
    public static final mt1 d;
    public static final /* synthetic */ mt1[] e;

    /* JADX INFO: Fake field, exist only in values array */
    mt1 EF0;

    static {
        mt1 mt1Var = new mt1("VERBOSE", 0);
        mt1 mt1Var2 = new mt1("DEBUG", 1);
        mt1 mt1Var3 = new mt1("INFO", 2);
        b = mt1Var3;
        mt1 mt1Var4 = new mt1("WARNING", 3);
        c = mt1Var4;
        mt1 mt1Var5 = new mt1("ERROR", 4);
        d = mt1Var5;
        e = new mt1[]{mt1Var, mt1Var2, mt1Var3, mt1Var4, mt1Var5};
    }

    public static mt1 valueOf(String str) {
        return (mt1) Enum.valueOf(mt1.class, str);
    }

    public static mt1[] values() {
        return (mt1[]) e.clone();
    }
}
