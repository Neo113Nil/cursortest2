package com.appsflyer.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
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
        return this.getMediationNetwork == aFi1jSDK.getMediationNetwork && this.getCurrencyIso4217Code == aFi1jSDK.getCurrencyIso4217Code && Intrinsics.areEqual(this.getRevenue, aFi1jSDK.getRevenue) && Intrinsics.areEqual(this.AFAdRevenueData, aFi1jSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.getMediationNetwork) * 31, 31, this.getCurrencyIso4217Code);
        String str = this.getRevenue;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.AFAdRevenueData;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        long j = this.getMediationNetwork;
        long j2 = this.getCurrencyIso4217Code;
        String str = this.getRevenue;
        String str2 = this.AFAdRevenueData;
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "PlayIntegrityApiData(piaTimestamp=", ", ttrMillis=");
        Fragment$5$$ExternalSyntheticOutline0.m(j2, ", piaToken=", str, m1149m);
        return Recorder$$ExternalSyntheticOutline2.m(m1149m, ", errorCode=", str2, ")");
    }
}
