package io.appmetrica.analytics.impl;

import defpackage.eta;

/* loaded from: classes5.dex */
public final class Kp {
    public final long a;

    public Kp(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Kp.class == obj.getClass() && this.a == ((Kp) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return eta.g(new StringBuilder("StatSending{disabledReportingInterval="), this.a, '}');
    }
}
