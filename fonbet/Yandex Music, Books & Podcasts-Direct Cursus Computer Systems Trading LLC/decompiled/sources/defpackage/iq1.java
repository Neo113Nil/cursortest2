package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class iq1 {
    public static final iq1 a;
    public static final iq1 b;
    public static final iq1 c;
    public static final iq1 d;
    public static final /* synthetic */ iq1[] e;

    static {
        iq1 iq1Var = new iq1("NO_SCALE", 0);
        a = iq1Var;
        iq1 iq1Var2 = new iq1("FIT", 1);
        b = iq1Var2;
        iq1 iq1Var3 = new iq1("FILL", 2);
        c = iq1Var3;
        iq1 iq1Var4 = new iq1("STRETCH", 3);
        d = iq1Var4;
        e = new iq1[]{iq1Var, iq1Var2, iq1Var3, iq1Var4};
    }

    public static iq1 valueOf(String str) {
        return (iq1) Enum.valueOf(iq1.class, str);
    }

    public static iq1[] values() {
        return (iq1[]) e.clone();
    }
}
