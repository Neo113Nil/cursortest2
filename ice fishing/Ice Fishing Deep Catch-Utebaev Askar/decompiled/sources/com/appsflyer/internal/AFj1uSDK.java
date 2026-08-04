package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1uSDK {
    public final AFd1kSDK AFAdRevenueData;
    public final List<AFj1sSDK> getMonetizationNetwork = new ArrayList();

    public AFj1uSDK(AFd1kSDK aFd1kSDK) {
        this.AFAdRevenueData = aFd1kSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component4(Runnable runnable) {
        AFj1vSDK aFj1vSDK = new AFj1vSDK(this.AFAdRevenueData.getMediationNetwork(), this.AFAdRevenueData.getMonetizationNetwork(), AFj1xSDK.INSTAGRAM, runnable, new s(this, runnable, 2));
        getMonetizationNetwork(aFj1vSDK);
        aFj1vSDK.getMediationNetwork(this.AFAdRevenueData.values().AFAdRevenueData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(AFi1eSDK aFi1eSDK, Runnable runnable) {
        AFd1rSDK revenue = this.AFAdRevenueData.getRevenue();
        int mediationNetwork = this.AFAdRevenueData.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0);
        boolean mediationNetwork2 = revenue.getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT);
        boolean z = aFi1eSDK.component2 == AFj1sSDK.AFa1zSDK.NOT_STARTED;
        if (mediationNetwork == 1) {
            if (z || mediationNetwork2) {
                runnable.run();
            }
        }
    }

    public final AFi1eSDK AFAdRevenueData(Runnable runnable) {
        return new AFi1eSDK(new s(this, runnable, 3), this.AFAdRevenueData.getMonetizationNetwork(), this.AFAdRevenueData.getMediationNetwork());
    }

    public final void getCurrencyIso4217Code(Runnable runnable) {
        getMonetizationNetwork(new AFj1vSDK(this.AFAdRevenueData.getMediationNetwork(), this.AFAdRevenueData.getMonetizationNetwork(), AFj1xSDK.FACEBOOK, runnable, new s(this, runnable, 1)));
    }

    public final synchronized void getMonetizationNetwork(AFj1sSDK aFj1sSDK) {
        this.getMonetizationNetwork.add(aFj1sSDK);
    }

    public final Runnable getRevenue(AFi1eSDK aFi1eSDK, Runnable runnable) {
        return new g(this, aFi1eSDK, runnable, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMediationNetwork(Runnable runnable) {
        AFj1vSDK aFj1vSDK = new AFj1vSDK(this.AFAdRevenueData.getMediationNetwork(), this.AFAdRevenueData.getMonetizationNetwork(), AFj1xSDK.FACEBOOK_LITE, runnable, new t());
        getMonetizationNetwork(aFj1vSDK);
        aFj1vSDK.getMediationNetwork(this.AFAdRevenueData.values().AFAdRevenueData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(Runnable runnable) {
        AFj1cSDK.getMonetizationNetwork(this.AFAdRevenueData.AFAdRevenueData(), new s(this, runnable, 0), 0L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getRevenue() {
    }

    public final boolean AFAdRevenueData() {
        return this.AFAdRevenueData.getMediationNetwork().AFAdRevenueData("AF_PREINSTALL_DISABLED", false);
    }

    public final synchronized AFj1sSDK[] getCurrencyIso4217Code() {
        return (AFj1sSDK[]) this.getMonetizationNetwork.toArray(new AFj1sSDK[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(Runnable runnable) {
        try {
            if (getMediationNetwork(new AFh1lSDK())) {
                runnable.run();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    public final boolean getMediationNetwork(AFa1oSDK aFa1oSDK) {
        int mediationNetwork = this.AFAdRevenueData.getMediationNetwork().getRevenue.getMediationNetwork("appsFlyerCount", 0);
        return (!this.AFAdRevenueData.getRevenue().getMediationNetwork(AppsFlyerProperties.NEW_REFERRER_SENT) && mediationNetwork == 1) || (mediationNetwork == 1 && !(aFa1oSDK instanceof AFh1lSDK));
    }
}
