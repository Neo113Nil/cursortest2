package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1ySDK {
    public final String AFAdRevenueData;
    public final AFi1wSDK component1;
    public final Throwable component2;
    public final String component4;
    public final long getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final int getMonetizationNetwork;
    public final long getRevenue;

    public AFi1ySDK(String str, String str2, long j2, long j3, int i2, AFi1wSDK aFi1wSDK, String str3, Throwable th) {
        this.getMediationNetwork = str;
        this.AFAdRevenueData = str2;
        this.getRevenue = j2;
        this.getCurrencyIso4217Code = j3;
        this.getMonetizationNetwork = i2;
        this.component1 = aFi1wSDK;
        this.component4 = str3;
        this.component2 = th;
    }
}
