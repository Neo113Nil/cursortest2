package com.google.android.datatransport;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBatchStructure {
    public static final /* synthetic */ WinterFlowBatchStructure[] WinterFlowTransactionManagerStrategy;
    public static final SparseArray WinterFlowVariableVersionControl;

    /* JADX INFO: Fake field, exist only in values array */
    WinterFlowBatchStructure EF1;

    static {
        WinterFlowBatchStructure winterFlowBatchStructure = new WinterFlowBatchStructure("UNKNOWN_MOBILE_SUBTYPE", 0);
        WinterFlowBatchStructure winterFlowBatchStructure2 = new WinterFlowBatchStructure("GPRS", 1);
        WinterFlowBatchStructure winterFlowBatchStructure3 = new WinterFlowBatchStructure("EDGE", 2);
        WinterFlowBatchStructure winterFlowBatchStructure4 = new WinterFlowBatchStructure("UMTS", 3);
        WinterFlowBatchStructure winterFlowBatchStructure5 = new WinterFlowBatchStructure("CDMA", 4);
        WinterFlowBatchStructure winterFlowBatchStructure6 = new WinterFlowBatchStructure("EVDO_0", 5);
        WinterFlowBatchStructure winterFlowBatchStructure7 = new WinterFlowBatchStructure("EVDO_A", 6);
        WinterFlowBatchStructure winterFlowBatchStructure8 = new WinterFlowBatchStructure("RTT", 7);
        WinterFlowBatchStructure winterFlowBatchStructure9 = new WinterFlowBatchStructure("HSDPA", 8);
        WinterFlowBatchStructure winterFlowBatchStructure10 = new WinterFlowBatchStructure("HSUPA", 9);
        WinterFlowBatchStructure winterFlowBatchStructure11 = new WinterFlowBatchStructure("HSPA", 10);
        WinterFlowBatchStructure winterFlowBatchStructure12 = new WinterFlowBatchStructure("IDEN", 11);
        WinterFlowBatchStructure winterFlowBatchStructure13 = new WinterFlowBatchStructure("EVDO_B", 12);
        WinterFlowBatchStructure winterFlowBatchStructure14 = new WinterFlowBatchStructure("LTE", 13);
        WinterFlowBatchStructure winterFlowBatchStructure15 = new WinterFlowBatchStructure("EHRPD", 14);
        WinterFlowBatchStructure winterFlowBatchStructure16 = new WinterFlowBatchStructure("HSPAP", 15);
        WinterFlowBatchStructure winterFlowBatchStructure17 = new WinterFlowBatchStructure("GSM", 16);
        WinterFlowBatchStructure winterFlowBatchStructure18 = new WinterFlowBatchStructure("TD_SCDMA", 17);
        WinterFlowBatchStructure winterFlowBatchStructure19 = new WinterFlowBatchStructure("IWLAN", 18);
        WinterFlowBatchStructure winterFlowBatchStructure20 = new WinterFlowBatchStructure("LTE_CA", 19);
        WinterFlowTransactionManagerStrategy = new WinterFlowBatchStructure[]{winterFlowBatchStructure, winterFlowBatchStructure2, winterFlowBatchStructure3, winterFlowBatchStructure4, winterFlowBatchStructure5, winterFlowBatchStructure6, winterFlowBatchStructure7, winterFlowBatchStructure8, winterFlowBatchStructure9, winterFlowBatchStructure10, winterFlowBatchStructure11, winterFlowBatchStructure12, winterFlowBatchStructure13, winterFlowBatchStructure14, winterFlowBatchStructure15, winterFlowBatchStructure16, winterFlowBatchStructure17, winterFlowBatchStructure18, winterFlowBatchStructure19, winterFlowBatchStructure20, new WinterFlowBatchStructure("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        WinterFlowVariableVersionControl = sparseArray;
        sparseArray.put(0, winterFlowBatchStructure);
        sparseArray.put(1, winterFlowBatchStructure2);
        sparseArray.put(2, winterFlowBatchStructure3);
        sparseArray.put(3, winterFlowBatchStructure4);
        sparseArray.put(4, winterFlowBatchStructure5);
        sparseArray.put(5, winterFlowBatchStructure6);
        sparseArray.put(6, winterFlowBatchStructure7);
        sparseArray.put(7, winterFlowBatchStructure8);
        sparseArray.put(8, winterFlowBatchStructure9);
        sparseArray.put(9, winterFlowBatchStructure10);
        sparseArray.put(10, winterFlowBatchStructure11);
        sparseArray.put(11, winterFlowBatchStructure12);
        sparseArray.put(12, winterFlowBatchStructure13);
        sparseArray.put(13, winterFlowBatchStructure14);
        sparseArray.put(14, winterFlowBatchStructure15);
        sparseArray.put(15, winterFlowBatchStructure16);
        sparseArray.put(16, winterFlowBatchStructure17);
        sparseArray.put(17, winterFlowBatchStructure18);
        sparseArray.put(18, winterFlowBatchStructure19);
        sparseArray.put(19, winterFlowBatchStructure20);
    }

    public static WinterFlowBatchStructure valueOf(String str) {
        return (WinterFlowBatchStructure) Enum.valueOf(WinterFlowBatchStructure.class, str);
    }

    public static WinterFlowBatchStructure[] values() {
        return (WinterFlowBatchStructure[]) WinterFlowTransactionManagerStrategy.clone();
    }
}
