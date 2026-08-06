package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ua1 {
    public static final ua1 AvO7iQsrTN;
    public static final ua1 EljAMC1QTz;
    public static final ua1 OOA6hdeuvCS;
    public static final /* synthetic */ ua1[] encWxUiV2;

    static {
        ua1 ua1Var = new ua1("ContinueTraversal", 0);
        OOA6hdeuvCS = ua1Var;
        ua1 ua1Var2 = new ua1("SkipSubtreeAndContinueTraversal", 1);
        EljAMC1QTz = ua1Var2;
        ua1 ua1Var3 = new ua1("CancelTraversal", 2);
        AvO7iQsrTN = ua1Var3;
        encWxUiV2 = new ua1[]{ua1Var, ua1Var2, ua1Var3};
    }

    public static ua1 valueOf(String str) {
        return (ua1) Enum.valueOf(ua1.class, str);
    }

    public static ua1[] values() {
        return (ua1[]) encWxUiV2.clone();
    }
}
