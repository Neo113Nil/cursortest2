package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class yb0 {
    public static final yb0 AvO7iQsrTN;
    public static final yb0 EljAMC1QTz;
    public static final yb0 OOA6hdeuvCS;
    public static final /* synthetic */ yb0[] encWxUiV2;

    static {
        yb0 yb0Var = new yb0("IsPlacedInLookahead", 0);
        OOA6hdeuvCS = yb0Var;
        yb0 yb0Var2 = new yb0("IsPlacedInApproach", 1);
        EljAMC1QTz = yb0Var2;
        yb0 yb0Var3 = new yb0("IsNotPlaced", 2);
        AvO7iQsrTN = yb0Var3;
        encWxUiV2 = new yb0[]{yb0Var, yb0Var2, yb0Var3};
    }

    public static yb0 valueOf(String str) {
        return (yb0) Enum.valueOf(yb0.class, str);
    }

    public static yb0[] values() {
        return (yb0[]) encWxUiV2.clone();
    }
}
