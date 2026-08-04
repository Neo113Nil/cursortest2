package com.appsflyer.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface AFc1cSDK {
    String AFAdRevenueData(Throwable th, String str);

    void getCurrencyIso4217Code(int i, int i2);

    boolean getCurrencyIso4217Code();

    int getMediationNetwork();

    boolean getMonetizationNetwork(String... strArr);

    List<AFc1aSDK> getRevenue();
}
