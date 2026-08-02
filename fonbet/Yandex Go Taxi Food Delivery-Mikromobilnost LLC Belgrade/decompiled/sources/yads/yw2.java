package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class yw2 {
    public static final yw2 b;
    public static final yw2 c;
    public static final yw2 d;
    public static final /* synthetic */ yw2[] e;

    static {
        yw2 yw2Var = new yw2("AD", 0);
        b = yw2Var;
        yw2 yw2Var2 = new yw2("DSP", 1);
        c = yw2Var2;
        yw2 yw2Var3 = new yw2("UNDEFINED", 2);
        d = yw2Var3;
        e = new yw2[]{yw2Var, yw2Var2, yw2Var3};
    }

    public static yw2 valueOf(String str) {
        return (yw2) Enum.valueOf(yw2.class, str);
    }

    public static yw2[] values() {
        return (yw2[]) e.clone();
    }
}
