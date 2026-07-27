package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AFe1hSDK {
    final String AFAdRevenueData;
    final String getMediationNetwork;

    public AFe1hSDK(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AFAdRevenueData = str;
        this.getMediationNetwork = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1hSDK)) {
            return false;
        }
        AFe1hSDK aFe1hSDK = (AFe1hSDK) obj;
        return Intrinsics.areEqual(this.AFAdRevenueData, aFe1hSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getMediationNetwork, aFe1hSDK.getMediationNetwork);
    }

    public final int hashCode() {
        return (this.AFAdRevenueData.hashCode() * 31) + this.getMediationNetwork.hashCode();
    }

    public final String toString() {
        return "HostConfig(prefix=" + this.AFAdRevenueData + ", host=" + this.getMediationNetwork + ")";
    }
}
