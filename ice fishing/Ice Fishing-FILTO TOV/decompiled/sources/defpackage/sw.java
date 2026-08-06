package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class sw {
    public static final /* synthetic */ sw[] AvO7iQsrTN;
    public static final sw EljAMC1QTz;
    public static final sw OOA6hdeuvCS;

    static {
        sw swVar = new sw("NO_SCANS_LEFT", 0);
        OOA6hdeuvCS = swVar;
        sw swVar2 = new sw("NOTHING_TO_SCAN", 1);
        EljAMC1QTz = swVar2;
        AvO7iQsrTN = new sw[]{swVar, swVar2};
    }

    public static sw valueOf(String str) {
        return (sw) Enum.valueOf(sw.class, str);
    }

    public static sw[] values() {
        return (sw[]) AvO7iQsrTN.clone();
    }
}
