package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class gm {
    public static final gm AvO7iQsrTN;
    public static final gm EljAMC1QTz;
    public static final gm OOA6hdeuvCS;
    public static final /* synthetic */ gm[] encWxUiV2;

    static {
        gm gmVar = new gm("Vertical", 0);
        OOA6hdeuvCS = gmVar;
        gm gmVar2 = new gm("Horizontal", 1);
        EljAMC1QTz = gmVar2;
        gm gmVar3 = new gm("Both", 2);
        AvO7iQsrTN = gmVar3;
        encWxUiV2 = new gm[]{gmVar, gmVar2, gmVar3};
    }

    public static gm valueOf(String str) {
        return (gm) Enum.valueOf(gm.class, str);
    }

    public static gm[] values() {
        return (gm[]) encWxUiV2.clone();
    }
}
