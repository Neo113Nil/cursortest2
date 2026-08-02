package com.appsflyer.internal;

import kotlin.Pair;

/* loaded from: classes3.dex */
public final class AFd1pSDK {
    public static boolean getCurrencyIso4217Code(String str, String str2) {
        str.getClass();
        str2.getClass();
        int mediationNetwork = AFk1xSDK.getMediationNetwork(str);
        int mediationNetwork2 = AFk1xSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str2);
        Pair<Integer, Integer> AFAdRevenueData = AFd1rSDK.AFAdRevenueData(str2);
        return (mediationNetwork2 == -1 || monetizationNetwork != null) ? AFAdRevenueData != null ? ((Number) AFAdRevenueData.first).intValue() <= mediationNetwork && mediationNetwork <= ((Number) AFAdRevenueData.second).intValue() : monetizationNetwork != null && ((Number) monetizationNetwork.first).intValue() <= mediationNetwork && mediationNetwork <= ((Number) monetizationNetwork.second).intValue() : mediationNetwork2 == mediationNetwork;
    }
}
