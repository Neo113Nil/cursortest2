package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class aq3 {
    public static final aq3 a;
    public static final aq3 b;
    public static final /* synthetic */ aq3[] c;

    static {
        aq3 aq3Var = new aq3("DISK", 0);
        a = aq3Var;
        aq3 aq3Var2 = new aq3("IN_MEMORY", 1);
        b = aq3Var2;
        c = new aq3[]{aq3Var, aq3Var2};
    }

    public static aq3 valueOf(String str) {
        return (aq3) Enum.valueOf(aq3.class, str);
    }

    public static aq3[] values() {
        return (aq3[]) c.clone();
    }
}
