package io.appmetrica.analytics.impl;

import defpackage.b64;

/* loaded from: classes9.dex */
public final class V3 {
    public final long a;

    public V3(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && V3.class == obj.getClass() && this.a == ((V3) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return b64.o(new StringBuilder("CacheControl{lastKnownLocationTtl="), this.a, '}');
    }
}
