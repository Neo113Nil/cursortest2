package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class l8 {
    public static final l8 AvO7iQsrTN;
    public static final l8 EljAMC1QTz;
    public static final l8 OOA6hdeuvCS;
    public static final /* synthetic */ l8[] encWxUiV2;

    static {
        l8 l8Var = new l8("SUSPEND", 0);
        OOA6hdeuvCS = l8Var;
        l8 l8Var2 = new l8("DROP_OLDEST", 1);
        EljAMC1QTz = l8Var2;
        l8 l8Var3 = new l8("DROP_LATEST", 2);
        AvO7iQsrTN = l8Var3;
        encWxUiV2 = new l8[]{l8Var, l8Var2, l8Var3};
    }

    public static l8 valueOf(String str) {
        return (l8) Enum.valueOf(l8.class, str);
    }

    public static l8[] values() {
        return (l8[]) encWxUiV2.clone();
    }
}
