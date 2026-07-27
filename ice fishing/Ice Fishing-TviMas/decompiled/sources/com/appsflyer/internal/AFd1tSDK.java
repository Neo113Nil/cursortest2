package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;

/* loaded from: classes4.dex */
public final class AFd1tSDK {
    public String AFAdRevenueData;
    public boolean areAllFieldsValid;
    public AppsFlyerConsent component1;
    public AFe1nSDK component3;
    public AFh1pSDK component4;
    public String getCurrencyIso4217Code;
    public AFc1cSDK getMediationNetwork;
    public AFc1aSDK getMonetizationNetwork;
    public String getRevenue;

    public final synchronized void getRevenue(AFe1nSDK aFe1nSDK) {
        this.component3 = aFe1nSDK;
    }

    public final boolean getMonetizationNetwork() {
        return this.areAllFieldsValid;
    }
}
