package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qzi {
    public static final SparseArray a;
    public static final /* synthetic */ qzi[] b;

    /* JADX INFO: Fake field, exist only in values array */
    qzi EF1;

    static {
        qzi qziVar = new qzi("MOBILE", 0);
        qzi qziVar2 = new qzi("WIFI", 1);
        qzi qziVar3 = new qzi("MOBILE_MMS", 2);
        qzi qziVar4 = new qzi("MOBILE_SUPL", 3);
        qzi qziVar5 = new qzi("MOBILE_DUN", 4);
        qzi qziVar6 = new qzi("MOBILE_HIPRI", 5);
        qzi qziVar7 = new qzi("WIMAX", 6);
        qzi qziVar8 = new qzi("BLUETOOTH", 7);
        qzi qziVar9 = new qzi("DUMMY", 8);
        qzi qziVar10 = new qzi("ETHERNET", 9);
        qzi qziVar11 = new qzi("MOBILE_FOTA", 10);
        qzi qziVar12 = new qzi("MOBILE_IMS", 11);
        qzi qziVar13 = new qzi("MOBILE_CBS", 12);
        qzi qziVar14 = new qzi("WIFI_P2P", 13);
        qzi qziVar15 = new qzi("MOBILE_IA", 14);
        qzi qziVar16 = new qzi("MOBILE_EMERGENCY", 15);
        qzi qziVar17 = new qzi("PROXY", 16);
        qzi qziVar18 = new qzi("VPN", 17);
        qzi qziVar19 = new qzi("NONE", 18);
        b = new qzi[]{qziVar, qziVar2, qziVar3, qziVar4, qziVar5, qziVar6, qziVar7, qziVar8, qziVar9, qziVar10, qziVar11, qziVar12, qziVar13, qziVar14, qziVar15, qziVar16, qziVar17, qziVar18, qziVar19};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, qziVar);
        sparseArray.put(1, qziVar2);
        sparseArray.put(2, qziVar3);
        sparseArray.put(3, qziVar4);
        sparseArray.put(4, qziVar5);
        sparseArray.put(5, qziVar6);
        sparseArray.put(6, qziVar7);
        sparseArray.put(7, qziVar8);
        sparseArray.put(8, qziVar9);
        sparseArray.put(9, qziVar10);
        sparseArray.put(10, qziVar11);
        sparseArray.put(11, qziVar12);
        sparseArray.put(12, qziVar13);
        sparseArray.put(13, qziVar14);
        sparseArray.put(14, qziVar15);
        sparseArray.put(15, qziVar16);
        sparseArray.put(16, qziVar17);
        sparseArray.put(17, qziVar18);
        sparseArray.put(-1, qziVar19);
    }

    public static qzi valueOf(String str) {
        return (qzi) Enum.valueOf(qzi.class, str);
    }

    public static qzi[] values() {
        return (qzi[]) b.clone();
    }
}
