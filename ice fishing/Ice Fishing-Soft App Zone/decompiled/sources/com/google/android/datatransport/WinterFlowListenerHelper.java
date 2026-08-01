package com.google.android.datatransport;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowListenerHelper {
    public static final /* synthetic */ WinterFlowListenerHelper[] WinterFlowTransactionManagerStrategy;
    public static final SparseArray WinterFlowVariableVersionControl;

    /* JADX INFO: Fake field, exist only in values array */
    WinterFlowListenerHelper EF1;

    static {
        WinterFlowListenerHelper winterFlowListenerHelper = new WinterFlowListenerHelper("MOBILE", 0);
        WinterFlowListenerHelper winterFlowListenerHelper2 = new WinterFlowListenerHelper("WIFI", 1);
        WinterFlowListenerHelper winterFlowListenerHelper3 = new WinterFlowListenerHelper("MOBILE_MMS", 2);
        WinterFlowListenerHelper winterFlowListenerHelper4 = new WinterFlowListenerHelper("MOBILE_SUPL", 3);
        WinterFlowListenerHelper winterFlowListenerHelper5 = new WinterFlowListenerHelper("MOBILE_DUN", 4);
        WinterFlowListenerHelper winterFlowListenerHelper6 = new WinterFlowListenerHelper("MOBILE_HIPRI", 5);
        WinterFlowListenerHelper winterFlowListenerHelper7 = new WinterFlowListenerHelper("WIMAX", 6);
        WinterFlowListenerHelper winterFlowListenerHelper8 = new WinterFlowListenerHelper("BLUETOOTH", 7);
        WinterFlowListenerHelper winterFlowListenerHelper9 = new WinterFlowListenerHelper("DUMMY", 8);
        WinterFlowListenerHelper winterFlowListenerHelper10 = new WinterFlowListenerHelper("ETHERNET", 9);
        WinterFlowListenerHelper winterFlowListenerHelper11 = new WinterFlowListenerHelper("MOBILE_FOTA", 10);
        WinterFlowListenerHelper winterFlowListenerHelper12 = new WinterFlowListenerHelper("MOBILE_IMS", 11);
        WinterFlowListenerHelper winterFlowListenerHelper13 = new WinterFlowListenerHelper("MOBILE_CBS", 12);
        WinterFlowListenerHelper winterFlowListenerHelper14 = new WinterFlowListenerHelper("WIFI_P2P", 13);
        WinterFlowListenerHelper winterFlowListenerHelper15 = new WinterFlowListenerHelper("MOBILE_IA", 14);
        WinterFlowListenerHelper winterFlowListenerHelper16 = new WinterFlowListenerHelper("MOBILE_EMERGENCY", 15);
        WinterFlowListenerHelper winterFlowListenerHelper17 = new WinterFlowListenerHelper("PROXY", 16);
        WinterFlowListenerHelper winterFlowListenerHelper18 = new WinterFlowListenerHelper("VPN", 17);
        WinterFlowListenerHelper winterFlowListenerHelper19 = new WinterFlowListenerHelper("NONE", 18);
        WinterFlowTransactionManagerStrategy = new WinterFlowListenerHelper[]{winterFlowListenerHelper, winterFlowListenerHelper2, winterFlowListenerHelper3, winterFlowListenerHelper4, winterFlowListenerHelper5, winterFlowListenerHelper6, winterFlowListenerHelper7, winterFlowListenerHelper8, winterFlowListenerHelper9, winterFlowListenerHelper10, winterFlowListenerHelper11, winterFlowListenerHelper12, winterFlowListenerHelper13, winterFlowListenerHelper14, winterFlowListenerHelper15, winterFlowListenerHelper16, winterFlowListenerHelper17, winterFlowListenerHelper18, winterFlowListenerHelper19};
        SparseArray sparseArray = new SparseArray();
        WinterFlowVariableVersionControl = sparseArray;
        sparseArray.put(0, winterFlowListenerHelper);
        sparseArray.put(1, winterFlowListenerHelper2);
        sparseArray.put(2, winterFlowListenerHelper3);
        sparseArray.put(3, winterFlowListenerHelper4);
        sparseArray.put(4, winterFlowListenerHelper5);
        sparseArray.put(5, winterFlowListenerHelper6);
        sparseArray.put(6, winterFlowListenerHelper7);
        sparseArray.put(7, winterFlowListenerHelper8);
        sparseArray.put(8, winterFlowListenerHelper9);
        sparseArray.put(9, winterFlowListenerHelper10);
        sparseArray.put(10, winterFlowListenerHelper11);
        sparseArray.put(11, winterFlowListenerHelper12);
        sparseArray.put(12, winterFlowListenerHelper13);
        sparseArray.put(13, winterFlowListenerHelper14);
        sparseArray.put(14, winterFlowListenerHelper15);
        sparseArray.put(15, winterFlowListenerHelper16);
        sparseArray.put(16, winterFlowListenerHelper17);
        sparseArray.put(17, winterFlowListenerHelper18);
        sparseArray.put(-1, winterFlowListenerHelper19);
    }

    public static WinterFlowListenerHelper valueOf(String str) {
        return (WinterFlowListenerHelper) Enum.valueOf(WinterFlowListenerHelper.class, str);
    }

    public static WinterFlowListenerHelper[] values() {
        return (WinterFlowListenerHelper[]) WinterFlowTransactionManagerStrategy.clone();
    }
}
