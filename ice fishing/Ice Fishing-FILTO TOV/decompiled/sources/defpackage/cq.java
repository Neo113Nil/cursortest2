package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cq {
    public static final cq AvO7iQsrTN;
    public static final cq EljAMC1QTz;
    public static final cq OOA6hdeuvCS;
    public static final /* synthetic */ cq[] encWxUiV2;

    static {
        cq cqVar = new cq("PreEnter", 0);
        OOA6hdeuvCS = cqVar;
        cq cqVar2 = new cq("Visible", 1);
        EljAMC1QTz = cqVar2;
        cq cqVar3 = new cq("PostExit", 2);
        AvO7iQsrTN = cqVar3;
        encWxUiV2 = new cq[]{cqVar, cqVar2, cqVar3};
    }

    public static cq valueOf(String str) {
        return (cq) Enum.valueOf(cq.class, str);
    }

    public static cq[] values() {
        return (cq[]) encWxUiV2.clone();
    }
}
