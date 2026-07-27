package com.appsflyer.internal;

import android.content.pm.PackageManager;

/* loaded from: classes4.dex */
public interface AFb1cSDK {
    void AFAdRevenueData();

    boolean areAllFieldsValid();

    void getCurrencyIso4217Code(String str, String str2);

    boolean getCurrencyIso4217Code();

    void getMediationNetwork();

    void getMediationNetwork(String str, int i, String str2);

    void getMediationNetwork(String str, String str2);

    void getMediationNetwork(String str, String... strArr);

    void getMonetizationNetwork();

    void getRevenue();

    void getRevenue(Throwable th);

    void k_(String str, PackageManager packageManager);
}
