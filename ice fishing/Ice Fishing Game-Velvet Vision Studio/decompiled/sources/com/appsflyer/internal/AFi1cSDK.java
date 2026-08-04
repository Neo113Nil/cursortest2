package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AFi1cSDK extends AFj1tSDK {
    private AFc1oSDK getCurrencyIso4217Code;

    public AFi1cSDK(String str, String str2, AFc1oSDK aFc1oSDK, Runnable runnable) {
        super(str, str2, runnable);
        this.getCurrencyIso4217Code = aFc1oSDK;
    }

    public final boolean getRevenue() {
        if (this.getCurrencyIso4217Code.getMediationNetwork.getRevenue("appsFlyerCount", 0) <= 0) {
            return true;
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install referrer will not load, the counter >= 1, ");
        return false;
    }
}
