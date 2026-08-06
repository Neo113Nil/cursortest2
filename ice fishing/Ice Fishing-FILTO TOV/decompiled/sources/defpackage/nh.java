package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nh {
    public static final nh AvO7iQsrTN;
    public static final nh EljAMC1QTz;
    public static final /* synthetic */ nh[] JFJ3QoxA;
    public static final nh OOA6hdeuvCS;
    public static final nh encWxUiV2;
    public static final nh mOu10nynGul;

    static {
        nh nhVar = new nh("CPU_ACQUIRED", 0);
        OOA6hdeuvCS = nhVar;
        nh nhVar2 = new nh("BLOCKING", 1);
        EljAMC1QTz = nhVar2;
        nh nhVar3 = new nh("PARKING", 2);
        AvO7iQsrTN = nhVar3;
        nh nhVar4 = new nh("DORMANT", 3);
        encWxUiV2 = nhVar4;
        nh nhVar5 = new nh("TERMINATED", 4);
        mOu10nynGul = nhVar5;
        JFJ3QoxA = new nh[]{nhVar, nhVar2, nhVar3, nhVar4, nhVar5};
    }

    public static nh valueOf(String str) {
        return (nh) Enum.valueOf(nh.class, str);
    }

    public static nh[] values() {
        return (nh[]) JFJ3QoxA.clone();
    }
}
