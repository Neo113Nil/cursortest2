package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFd1pSDK {
    public static boolean getCurrencyIso4217Code(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int mediationNetwork = AFk1xSDK.getMediationNetwork(str);
        int mediationNetwork2 = AFk1xSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str2);
        Pair<Integer, Integer> pairAFAdRevenueData = AFd1rSDK.AFAdRevenueData(str2);
        if (mediationNetwork2 != -1 && monetizationNetwork == null) {
            return mediationNetwork2 == mediationNetwork;
        }
        if (pairAFAdRevenueData != null) {
            return ((Number) pairAFAdRevenueData.d).intValue() <= mediationNetwork && mediationNetwork <= ((Number) pairAFAdRevenueData.e).intValue();
        }
        return monetizationNetwork != null && ((Number) monetizationNetwork.d).intValue() <= mediationNetwork && mediationNetwork <= ((Number) monetizationNetwork.e).intValue();
    }
}
