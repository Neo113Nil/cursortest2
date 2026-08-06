package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qt {
    public static final qt AvO7iQsrTN;
    public static final qt EljAMC1QTz;
    public static final qt OOA6hdeuvCS;
    public static final /* synthetic */ qt[] encWxUiV2;

    static {
        qt qtVar = new qt("Active", 0);
        OOA6hdeuvCS = qtVar;
        qt qtVar2 = new qt("ActiveParent", 1);
        EljAMC1QTz = qtVar2;
        qt qtVar3 = new qt("Captured", 2);
        qt qtVar4 = new qt("Inactive", 3);
        AvO7iQsrTN = qtVar4;
        encWxUiV2 = new qt[]{qtVar, qtVar2, qtVar3, qtVar4};
    }

    public static qt valueOf(String str) {
        return (qt) Enum.valueOf(qt.class, str);
    }

    public static qt[] values() {
        return (qt[]) encWxUiV2.clone();
    }

    public final boolean GWasM1elztuh() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                o4.xqGvceK5x();
                return false;
            }
        }
        return true;
    }
}
