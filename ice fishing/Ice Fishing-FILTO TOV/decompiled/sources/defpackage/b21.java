package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class b21 {
    public static final b21 AvO7iQsrTN;
    public static final b21 EljAMC1QTz;
    public static final b21 OOA6hdeuvCS;
    public static final /* synthetic */ b21[] encWxUiV2;

    /* JADX INFO: Fake field, exist only in values array */
    b21 EF0;

    static {
        b21 b21Var = new b21("CornerExtraExtraLarge", 0);
        b21 b21Var2 = new b21("CornerExtraLarge", 1);
        OOA6hdeuvCS = b21Var2;
        b21 b21Var3 = new b21("CornerExtraLargeIncreased", 2);
        b21 b21Var4 = new b21("CornerExtraLargeTop", 3);
        b21 b21Var5 = new b21("CornerExtraSmall", 4);
        EljAMC1QTz = b21Var5;
        b21 b21Var6 = new b21("CornerExtraSmallTop", 5);
        b21 b21Var7 = new b21("CornerFull", 6);
        AvO7iQsrTN = b21Var7;
        encWxUiV2 = new b21[]{b21Var, b21Var2, b21Var3, b21Var4, b21Var5, b21Var6, b21Var7, new b21("CornerLarge", 7), new b21("CornerLargeEnd", 8), new b21("CornerLargeIncreased", 9), new b21("CornerLargeStart", 10), new b21("CornerLargeTop", 11), new b21("CornerMedium", 12), new b21("CornerNone", 13), new b21("CornerSmall", 14)};
    }

    public static b21 valueOf(String str) {
        return (b21) Enum.valueOf(b21.class, str);
    }

    public static b21[] values() {
        return (b21[]) encWxUiV2.clone();
    }
}
