package com.appsflyer.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFf1aSDK {
    public final boolean getMediationNetwork;
    public final long getMonetizationNetwork;
    public final String getRevenue;

    public AFf1aSDK(String str, long j, boolean z) {
        str.getClass();
        this.getRevenue = str;
        this.getMonetizationNetwork = j;
        this.getMediationNetwork = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1aSDK)) {
            return false;
        }
        AFf1aSDK aFf1aSDK = (AFf1aSDK) obj;
        return Intrinsics.areEqual(this.getRevenue, aFf1aSDK.getRevenue) && this.getMonetizationNetwork == aFf1aSDK.getMonetizationNetwork && this.getMediationNetwork == aFf1aSDK.getMediationNetwork;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.getRevenue.hashCode() * 31, 31, this.getMonetizationNetwork);
        boolean z = this.getMediationNetwork;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return m + i;
    }

    public final String toString() {
        String str = this.getRevenue;
        long j = this.getMonetizationNetwork;
        boolean z = this.getMediationNetwork;
        StringBuilder m = re$$ExternalSyntheticOutline0.m("AFUninstallToken(token=", str, ", receivedTime=", j);
        m.append(", isQueued=");
        m.append(z);
        m.append(")");
        return m.toString();
    }
}
