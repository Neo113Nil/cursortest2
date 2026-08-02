package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ct1 {
    public static final ct1 b;
    public static final ct1 c;
    public static final ct1 d;
    public static final /* synthetic */ ct1[] e;

    static {
        ct1 ct1Var = new ct1("INITIALIZATION_NOT_STARTED", 0);
        b = ct1Var;
        ct1 ct1Var2 = new ct1("INITIALIZING", 1);
        c = ct1Var2;
        ct1 ct1Var3 = new ct1("INITIALIZED", 2);
        d = ct1Var3;
        e = new ct1[]{ct1Var, ct1Var2, ct1Var3};
    }

    public static ct1 valueOf(String str) {
        return (ct1) Enum.valueOf(ct1.class, str);
    }

    public static ct1[] values() {
        return (ct1[]) e.clone();
    }
}
