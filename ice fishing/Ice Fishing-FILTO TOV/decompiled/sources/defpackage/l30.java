package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class l30 {
    public static final /* synthetic */ l30[] AvO7iQsrTN;
    public static final l30 EljAMC1QTz;
    public static final l30 OOA6hdeuvCS;

    static {
        l30 l30Var = new l30("Min", 0);
        OOA6hdeuvCS = l30Var;
        l30 l30Var2 = new l30("Max", 1);
        EljAMC1QTz = l30Var2;
        AvO7iQsrTN = new l30[]{l30Var, l30Var2};
    }

    public static l30 valueOf(String str) {
        return (l30) Enum.valueOf(l30.class, str);
    }

    public static l30[] values() {
        return (l30[]) AvO7iQsrTN.clone();
    }
}
