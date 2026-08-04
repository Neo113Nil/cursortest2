package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1oSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;
    final String getMediationNetwork;
    final int getMonetizationNetwork;
    final int getRevenue;

    public AFg1oSDK(int i2, int i3, int i4, int i5, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFAdRevenueData = i2;
        this.getRevenue = i3;
        this.getMonetizationNetwork = i4;
        this.getCurrencyIso4217Code = i5;
        this.getMediationNetwork = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1oSDK)) {
            return false;
        }
        AFg1oSDK aFg1oSDK = (AFg1oSDK) obj;
        return this.AFAdRevenueData == aFg1oSDK.AFAdRevenueData && this.getRevenue == aFg1oSDK.getRevenue && this.getMonetizationNetwork == aFg1oSDK.getMonetizationNetwork && this.getCurrencyIso4217Code == aFg1oSDK.getCurrencyIso4217Code && Intrinsics.a(this.getMediationNetwork, aFg1oSDK.getMediationNetwork);
    }

    public final int hashCode() {
        return this.getMediationNetwork.hashCode() + ((Integer.hashCode(this.getCurrencyIso4217Code) + ((Integer.hashCode(this.getMonetizationNetwork) + ((Integer.hashCode(this.getRevenue) + (Integer.hashCode(this.AFAdRevenueData) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CmpTcfData(policyVersion=" + this.AFAdRevenueData + ", gdprApplies=" + this.getRevenue + ", cmpSdkId=" + this.getMonetizationNetwork + ", cmpSdkVersion=" + this.getCurrencyIso4217Code + ", tcString=" + this.getMediationNetwork + ")";
    }
}
