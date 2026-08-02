package com.appsflyer.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFf1bSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;
    final int getMediationNetwork;
    final String getMonetizationNetwork;
    final int getRevenue;

    public AFf1bSDK(int i, int i2, int i3, int i4, String str) {
        str.getClass();
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
        return this.getCurrencyIso4217Code == aFf1bSDK.getCurrencyIso4217Code && this.getMediationNetwork == aFf1bSDK.getMediationNetwork && this.AFAdRevenueData == aFf1bSDK.AFAdRevenueData && this.getRevenue == aFf1bSDK.getRevenue && Intrinsics.areEqual(this.getMonetizationNetwork, aFf1bSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        return this.getMonetizationNetwork.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.getRevenue, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.AFAdRevenueData, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.getMediationNetwork, Integer.hashCode(this.getCurrencyIso4217Code) * 31, 31), 31), 31);
    }

    public final String toString() {
        int i = this.getCurrencyIso4217Code;
        int i2 = this.getMediationNetwork;
        int i3 = this.AFAdRevenueData;
        int i4 = this.getRevenue;
        String str = this.getMonetizationNetwork;
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "CmpTcfData(policyVersion=", ", gdprApplies=", ", cmpSdkId=");
        Recorder$$ExternalSyntheticOutline1.m105m(i3, i4, ", cmpSdkVersion=", ", tcString=", m107m);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m107m, str, ")");
    }
}
