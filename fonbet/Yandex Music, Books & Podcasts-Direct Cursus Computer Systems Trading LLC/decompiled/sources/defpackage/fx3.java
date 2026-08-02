package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class fx3 {
    public static final fx3 a;
    public static final fx3 b;
    public static final /* synthetic */ fx3[] c;

    static {
        fx3 fx3Var = new fx3("FULL", 0);
        a = fx3Var;
        fx3 fx3Var2 = new fx3("MASKED", 1);
        b = fx3Var2;
        c = new fx3[]{fx3Var, fx3Var2};
    }

    public static fx3 valueOf(String str) {
        return (fx3) Enum.valueOf(fx3.class, str);
    }

    public static fx3[] values() {
        return (fx3[]) c.clone();
    }
}
