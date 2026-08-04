package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class AFd1aSDK {
    public final long getMediationNetwork;

    public AFd1aSDK(long j) {
        this.getMediationNetwork = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getMediationNetwork == ((AFd1aSDK) obj).getMediationNetwork;
    }

    public int hashCode() {
        long j = this.getMediationNetwork;
        return (int) (j ^ (j >>> 32));
    }
}
