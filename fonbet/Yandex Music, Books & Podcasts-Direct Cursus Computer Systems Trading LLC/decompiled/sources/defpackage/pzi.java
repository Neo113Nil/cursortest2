package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class pzi {
    public static final SparseArray a;
    public static final /* synthetic */ pzi[] b;

    /* JADX INFO: Fake field, exist only in values array */
    pzi EF1;

    static {
        pzi pziVar = new pzi("UNKNOWN_MOBILE_SUBTYPE", 0);
        pzi pziVar2 = new pzi("GPRS", 1);
        pzi pziVar3 = new pzi("EDGE", 2);
        pzi pziVar4 = new pzi("UMTS", 3);
        pzi pziVar5 = new pzi("CDMA", 4);
        pzi pziVar6 = new pzi("EVDO_0", 5);
        pzi pziVar7 = new pzi("EVDO_A", 6);
        pzi pziVar8 = new pzi("RTT", 7);
        pzi pziVar9 = new pzi("HSDPA", 8);
        pzi pziVar10 = new pzi("HSUPA", 9);
        pzi pziVar11 = new pzi("HSPA", 10);
        pzi pziVar12 = new pzi("IDEN", 11);
        pzi pziVar13 = new pzi("EVDO_B", 12);
        pzi pziVar14 = new pzi("LTE", 13);
        pzi pziVar15 = new pzi("EHRPD", 14);
        pzi pziVar16 = new pzi("HSPAP", 15);
        pzi pziVar17 = new pzi("GSM", 16);
        pzi pziVar18 = new pzi("TD_SCDMA", 17);
        pzi pziVar19 = new pzi("IWLAN", 18);
        pzi pziVar20 = new pzi("LTE_CA", 19);
        b = new pzi[]{pziVar, pziVar2, pziVar3, pziVar4, pziVar5, pziVar6, pziVar7, pziVar8, pziVar9, pziVar10, pziVar11, pziVar12, pziVar13, pziVar14, pziVar15, pziVar16, pziVar17, pziVar18, pziVar19, pziVar20, new pzi("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, pziVar);
        sparseArray.put(1, pziVar2);
        sparseArray.put(2, pziVar3);
        sparseArray.put(3, pziVar4);
        sparseArray.put(4, pziVar5);
        sparseArray.put(5, pziVar6);
        sparseArray.put(6, pziVar7);
        sparseArray.put(7, pziVar8);
        sparseArray.put(8, pziVar9);
        sparseArray.put(9, pziVar10);
        sparseArray.put(10, pziVar11);
        sparseArray.put(11, pziVar12);
        sparseArray.put(12, pziVar13);
        sparseArray.put(13, pziVar14);
        sparseArray.put(14, pziVar15);
        sparseArray.put(15, pziVar16);
        sparseArray.put(16, pziVar17);
        sparseArray.put(17, pziVar18);
        sparseArray.put(18, pziVar19);
        sparseArray.put(19, pziVar20);
    }

    public static pzi valueOf(String str) {
        return (pzi) Enum.valueOf(pzi.class, str);
    }

    public static pzi[] values() {
        return (pzi[]) b.clone();
    }
}
