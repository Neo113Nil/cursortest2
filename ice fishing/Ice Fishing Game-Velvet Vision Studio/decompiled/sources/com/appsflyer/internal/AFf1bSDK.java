package com.appsflyer.internal;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFf1bSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;
    final int getMediationNetwork;
    final String getMonetizationNetwork;
    final int getRevenue;

    public AFf1bSDK(int i, int i2, int i3, int i4, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getCurrencyIso4217Code = i;
        this.getMediationNetwork = i2;
        this.AFAdRevenueData = i3;
        this.getRevenue = i4;
        this.getMonetizationNetwork = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1bSDK)) {
            return false;
        }
        AFf1bSDK aFf1bSDK = (AFf1bSDK) obj;
        return this.getCurrencyIso4217Code == aFf1bSDK.getCurrencyIso4217Code && this.getMediationNetwork == aFf1bSDK.getMediationNetwork && this.AFAdRevenueData == aFf1bSDK.AFAdRevenueData && this.getRevenue == aFf1bSDK.getRevenue && Intrinsics.a(this.getMonetizationNetwork, aFf1bSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        return this.getMonetizationNetwork.hashCode() + com.gamericefishpro.space.m5.a.t(this.getRevenue, com.gamericefishpro.space.m5.a.t(this.AFAdRevenueData, com.gamericefishpro.space.m5.a.t(this.getMediationNetwork, Integer.hashCode(this.getCurrencyIso4217Code) * 31, 31), 31), 31);
    }

    public final String toString() {
        int i = this.getCurrencyIso4217Code;
        int i2 = this.getMediationNetwork;
        int i3 = this.AFAdRevenueData;
        int i4 = this.getRevenue;
        String str = this.getMonetizationNetwork;
        StringBuilder sb = new StringBuilder("CmpTcfData(policyVersion=");
        sb.append(i);
        sb.append(", gdprApplies=");
        sb.append(i2);
        sb.append(", cmpSdkId=");
        sb.append(i3);
        sb.append(", cmpSdkVersion=");
        sb.append(i4);
        sb.append(", tcString=");
        return y0.j(sb, str, ")");
    }
}
