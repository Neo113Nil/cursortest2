package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xm0 {
    public static final /* synthetic */ xm0[] AvO7iQsrTN;
    public static final xm0 EljAMC1QTz;
    public static final xm0 OOA6hdeuvCS;

    static {
        xm0 xm0Var = new xm0("Vertical", 0);
        OOA6hdeuvCS = xm0Var;
        xm0 xm0Var2 = new xm0("Horizontal", 1);
        EljAMC1QTz = xm0Var2;
        AvO7iQsrTN = new xm0[]{xm0Var, xm0Var2};
    }

    public static xm0 valueOf(String str) {
        return (xm0) Enum.valueOf(xm0.class, str);
    }

    public static xm0[] values() {
        return (xm0[]) AvO7iQsrTN.clone();
    }
}
