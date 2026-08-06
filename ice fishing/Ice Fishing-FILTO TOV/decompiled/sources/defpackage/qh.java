package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qh {
    public static final qh AvO7iQsrTN;
    public static final qh EljAMC1QTz;
    public static final qh OOA6hdeuvCS;
    public static final /* synthetic */ qh[] encWxUiV2;

    static {
        qh qhVar = new qh("COROUTINE_SUSPENDED", 0);
        OOA6hdeuvCS = qhVar;
        qh qhVar2 = new qh("UNDECIDED", 1);
        EljAMC1QTz = qhVar2;
        qh qhVar3 = new qh("RESUMED", 2);
        AvO7iQsrTN = qhVar3;
        encWxUiV2 = new qh[]{qhVar, qhVar2, qhVar3};
    }

    public static qh valueOf(String str) {
        return (qh) Enum.valueOf(qh.class, str);
    }

    public static qh[] values() {
        return (qh[]) encWxUiV2.clone();
    }
}
