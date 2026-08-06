package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class z00 {
    public static final z00 AvO7iQsrTN;
    public static final z00 EljAMC1QTz;
    public static final z00 OOA6hdeuvCS;
    public static final /* synthetic */ z00[] encWxUiV2;

    static {
        z00 z00Var = new z00("Yes", 0);
        OOA6hdeuvCS = z00Var;
        z00 z00Var2 = new z00("No", 1);
        EljAMC1QTz = z00Var2;
        z00 z00Var3 = new z00("NotInitialized", 2);
        AvO7iQsrTN = z00Var3;
        encWxUiV2 = new z00[]{z00Var, z00Var2, z00Var3};
    }

    public static z00 valueOf(String str) {
        return (z00) Enum.valueOf(z00.class, str);
    }

    public static z00[] values() {
        return (z00[]) encWxUiV2.clone();
    }
}
