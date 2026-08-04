package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFc1eSDK {
    public AFb1rSDK AFAdRevenueData;
    public boolean areAllFieldsValid;
    public AppsFlyerConsent component1;
    public boolean component2;
    public AFh1rSDK component3;
    public AFd1aSDK component4;
    public AFb1gSDK copydefault;
    public String getCurrencyIso4217Code;
    public String getMediationNetwork;
    public String getMonetizationNetwork;
    public AFb1tSDK getRevenue;

    public final boolean AFAdRevenueData() {
        return this.component2;
    }

    public final synchronized void getMediationNetwork(AFd1aSDK aFd1aSDK) {
        this.component4 = aFd1aSDK;
    }

    public final boolean getMediationNetwork() {
        return this.areAllFieldsValid;
    }
}
