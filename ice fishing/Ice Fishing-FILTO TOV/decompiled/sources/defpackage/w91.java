package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class w91 {
    public static final /* synthetic */ w91[] AvO7iQsrTN;
    public static final w91 EljAMC1QTz;
    public static final w91 OOA6hdeuvCS;

    static {
        w91 w91Var = new w91("On", 0);
        OOA6hdeuvCS = w91Var;
        w91 w91Var2 = new w91("Off", 1);
        EljAMC1QTz = w91Var2;
        AvO7iQsrTN = new w91[]{w91Var, w91Var2, new w91("Indeterminate", 2)};
    }

    public static w91 valueOf(String str) {
        return (w91) Enum.valueOf(w91.class, str);
    }

    public static w91[] values() {
        return (w91[]) AvO7iQsrTN.clone();
    }
}
