package com.appsflyer.internal;

/* loaded from: classes4.dex */
public interface AFd1eSDK {

    public interface AFa1vSDK {
        void onConfigurationChanged(boolean z);
    }

    void getCurrencyIso4217Code();

    void getCurrencyIso4217Code(AFa1vSDK aFa1vSDK);

    void getMonetizationNetwork();

    void getRevenue(Throwable th, String str);
}
