package com.appsflyer.internal;

import defpackage.dfi;
import defpackage.f1d;
import defpackage.hrg;
import defpackage.su4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFf1fSDK {
    final int AFAdRevenueData;

    @NotNull
    final String getCurrencyIso4217Code;
    final int getMediationNetwork;
    final int getMonetizationNetwork;
    final int getRevenue;

    public AFf1fSDK(int i, int i2, int i3, int i4, @NotNull String str) {
        str.getClass();
        this.getRevenue = i;
        this.getMediationNetwork = i2;
        this.AFAdRevenueData = i3;
        this.getMonetizationNetwork = i4;
        this.getCurrencyIso4217Code = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1fSDK)) {
            return false;
        }
        AFf1fSDK aFf1fSDK = (AFf1fSDK) obj;
        return this.getRevenue == aFf1fSDK.getRevenue && this.getMediationNetwork == aFf1fSDK.getMediationNetwork && this.AFAdRevenueData == aFf1fSDK.AFAdRevenueData && this.getMonetizationNetwork == aFf1fSDK.getMonetizationNetwork && Intrinsics.d(this.getCurrencyIso4217Code, aFf1fSDK.getCurrencyIso4217Code);
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code.hashCode() + f1d.a(this.getMonetizationNetwork, f1d.a(this.AFAdRevenueData, f1d.a(this.getMediationNetwork, Integer.hashCode(this.getRevenue) * 31, 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        int i = this.getRevenue;
        int i2 = this.getMediationNetwork;
        int i3 = this.AFAdRevenueData;
        int i4 = this.getMonetizationNetwork;
        String str = this.getCurrencyIso4217Code;
        StringBuilder l = dfi.l("CmpTcfData(policyVersion=", i, i2, ", gdprApplies=", ", cmpSdkId=");
        hrg.w(i3, i4, ", cmpSdkVersion=", ", tcString=", l);
        return su4.o(l, str, ")");
    }
}
