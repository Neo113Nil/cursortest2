package com.appsflyer.internal;

/* loaded from: classes4.dex */
public class AFe1nSDK {
    public final long getRevenue;

    public AFe1nSDK(long j) {
        this.getRevenue = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getRevenue == ((AFe1nSDK) obj).getRevenue;
    }

    public int hashCode() {
        long j = this.getRevenue;
        return (int) (j ^ (j >>> 32));
    }
}
