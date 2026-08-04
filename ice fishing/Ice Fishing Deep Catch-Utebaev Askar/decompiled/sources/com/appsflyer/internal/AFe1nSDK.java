package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public class AFe1nSDK {
    public final long getRevenue;

    public AFe1nSDK(long j2) {
        this.getRevenue = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getRevenue == ((AFe1nSDK) obj).getRevenue;
    }

    public int hashCode() {
        long j2 = this.getRevenue;
        return (int) (j2 ^ (j2 >>> 32));
    }
}
