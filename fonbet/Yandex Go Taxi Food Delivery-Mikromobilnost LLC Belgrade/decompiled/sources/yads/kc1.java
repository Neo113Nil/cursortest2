package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class kc1 {
    public static final kc1 b;
    public static final kc1 c;
    public static final kc1 d;
    public static final /* synthetic */ kc1[] e;

    static {
        kc1 kc1Var = new kc1("LOAD", 0);
        b = kc1Var;
        kc1 kc1Var2 = new kc1("SHOW", 1);
        c = kc1Var2;
        kc1 kc1Var3 = new kc1("RETURN_TO_APP", 2);
        d = kc1Var3;
        e = new kc1[]{kc1Var, kc1Var2, kc1Var3};
    }

    public static kc1 valueOf(String str) {
        return (kc1) Enum.valueOf(kc1.class, str);
    }

    public static kc1[] values() {
        return (kc1[]) e.clone();
    }
}
