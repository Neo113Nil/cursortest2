package com.appsflyer.internal;

/* loaded from: classes4.dex */
public final class AFi1ySDK {
    public final String AFAdRevenueData;
    public final AFi1wSDK component1;
    public final Throwable component2;
    public final String component4;
    public final long getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final int getMonetizationNetwork;
    public final long getRevenue;

    public AFi1ySDK(String str, String str2, long j, long j2, int i, AFi1wSDK aFi1wSDK, String str3, Throwable th) {
        this.getMediationNetwork = str;
        this.AFAdRevenueData = str2;
        this.getRevenue = j;
        this.getCurrencyIso4217Code = j2;
        this.getMonetizationNetwork = i;
        this.component1 = aFi1wSDK;
        this.component4 = str3;
        this.component2 = th;
    }
}
