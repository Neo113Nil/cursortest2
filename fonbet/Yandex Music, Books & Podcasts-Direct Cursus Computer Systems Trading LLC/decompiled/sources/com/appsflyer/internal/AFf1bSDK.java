package com.appsflyer.internal;

import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFf1bSDK {

    @NotNull
    public final String AFAdRevenueData;
    public final long getMediationNetwork;
    public final boolean getRevenue;

    public AFf1bSDK(@NotNull String str, long j, boolean z) {
        str.getClass();
        this.AFAdRevenueData = str;
        this.getMediationNetwork = j;
        this.getRevenue = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1bSDK)) {
            return false;
        }
        AFf1bSDK aFf1bSDK = (AFf1bSDK) obj;
        return Intrinsics.d(this.AFAdRevenueData, aFf1bSDK.AFAdRevenueData) && this.getMediationNetwork == aFf1bSDK.getMediationNetwork && this.getRevenue == aFf1bSDK.getRevenue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int c = tlm.c(this.getMediationNetwork, this.AFAdRevenueData.hashCode() * 31, 31);
        boolean z = this.getRevenue;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return c + i;
    }

    @NotNull
    public final String toString() {
        String str = this.AFAdRevenueData;
        long j = this.getMediationNetwork;
        boolean z = this.getRevenue;
        StringBuilder q = k.q("AFUninstallToken(token=", j, str, ", receivedTime=");
        q.append(", isQueued=");
        q.append(z);
        q.append(")");
        return q.toString();
    }
}
