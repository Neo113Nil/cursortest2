package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1gSDK {
    public final String AFAdRevenueData;
    public final String getCurrencyIso4217Code;
    public final long getMonetizationNetwork;
    public final long getRevenue;

    public AFi1gSDK(long j2, long j3, String str, String str2) {
        this.getMonetizationNetwork = j2;
        this.getRevenue = j3;
        this.AFAdRevenueData = str;
        this.getCurrencyIso4217Code = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1gSDK)) {
            return false;
        }
        AFi1gSDK aFi1gSDK = (AFi1gSDK) obj;
        return this.getMonetizationNetwork == aFi1gSDK.getMonetizationNetwork && this.getRevenue == aFi1gSDK.getRevenue && Intrinsics.a(this.AFAdRevenueData, aFi1gSDK.AFAdRevenueData) && Intrinsics.a(this.getCurrencyIso4217Code, aFi1gSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        int iHashCode = (Long.hashCode(this.getRevenue) + (Long.hashCode(this.getMonetizationNetwork) * 31)) * 31;
        String str = this.AFAdRevenueData;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.getCurrencyIso4217Code;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "PlayIntegrityApiData(piaTimestamp=" + this.getMonetizationNetwork + ", ttrMillis=" + this.getRevenue + ", piaToken=" + this.AFAdRevenueData + ", errorCode=" + this.getCurrencyIso4217Code + ")";
    }
}
