package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1vSDK {
    public static boolean getMonetizationNetwork(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int monetizationNetwork = AFc1vSDK.getMonetizationNetwork(str);
        int monetizationNetwork2 = AFc1vSDK.getMonetizationNetwork(str2);
        Pair<Integer, Integer> currencyIso4217Code = AFe1zSDK.getCurrencyIso4217Code(str2);
        Pair<Integer, Integer> revenue = AFe1zSDK.getRevenue(str2);
        if (monetizationNetwork2 != -1 && currencyIso4217Code == null) {
            return monetizationNetwork2 == monetizationNetwork;
        }
        if (revenue != null) {
            return ((Number) revenue.f155a).intValue() <= monetizationNetwork && monetizationNetwork <= ((Number) revenue.f156b).intValue();
        }
        return currencyIso4217Code != null && ((Number) currencyIso4217Code.f155a).intValue() <= monetizationNetwork && monetizationNetwork <= ((Number) currencyIso4217Code.f156b).intValue();
    }
}
