package io.appmetrica.analytics.impl;

import defpackage.eta;

/* loaded from: classes5.dex */
public final class S3 {
    public final long a;

    public S3(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && S3.class == obj.getClass() && this.a == ((S3) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return eta.g(new StringBuilder("CacheControl{lastKnownLocationTtl="), this.a, '}');
    }
}
