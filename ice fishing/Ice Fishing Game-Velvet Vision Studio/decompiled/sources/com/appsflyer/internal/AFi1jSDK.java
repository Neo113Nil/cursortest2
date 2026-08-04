package com.appsflyer.internal;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFi1jSDK {
    public final String AFAdRevenueData;
    public final long getCurrencyIso4217Code;
    public final long getMediationNetwork;
    public final String getRevenue;

    public AFi1jSDK(long j, long j2, String str, String str2) {
        this.getMediationNetwork = j;
        this.getCurrencyIso4217Code = j2;
        this.getRevenue = str;
        this.AFAdRevenueData = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1jSDK)) {
            return false;
        }
        AFi1jSDK aFi1jSDK = (AFi1jSDK) obj;
        return this.getMediationNetwork == aFi1jSDK.getMediationNetwork && this.getCurrencyIso4217Code == aFi1jSDK.getCurrencyIso4217Code && Intrinsics.a(this.getRevenue, aFi1jSDK.getRevenue) && Intrinsics.a(this.AFAdRevenueData, aFi1jSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        int iB = y0.b(Long.hashCode(this.getMediationNetwork) * 31, 31, this.getCurrencyIso4217Code);
        String str = this.getRevenue;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.AFAdRevenueData;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        long j = this.getMediationNetwork;
        long j2 = this.getCurrencyIso4217Code;
        String str = this.getRevenue;
        String str2 = this.AFAdRevenueData;
        StringBuilder sb = new StringBuilder("PlayIntegrityApiData(piaTimestamp=");
        sb.append(j);
        sb.append(", ttrMillis=");
        sb.append(j2);
        sb.append(", piaToken=");
        sb.append(str);
        return com.gamericefishpro.space.m5.a.j(sb, ", errorCode=", str2, ")");
    }
}
