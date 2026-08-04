package com.appsflyer.internal;

import android.content.pm.PackageManager;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface AFd1oSDK {
    void AFAdRevenueData(String str, int i, String str2);

    boolean AFAdRevenueData();

    boolean areAllFieldsValid();

    void getCurrencyIso4217Code();

    void getMediationNetwork();

    void getMonetizationNetwork();

    void getMonetizationNetwork(String str, String str2);

    void getRevenue();

    void getRevenue(String str, String str2);

    void getRevenue(String str, String... strArr);

    void getRevenue(Throwable th);

    void q_(String str, PackageManager packageManager);
}
