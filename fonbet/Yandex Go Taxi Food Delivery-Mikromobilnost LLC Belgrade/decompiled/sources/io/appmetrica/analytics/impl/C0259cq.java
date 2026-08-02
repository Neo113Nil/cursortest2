package io.appmetrica.analytics.impl;

import defpackage.b64;

/* renamed from: io.appmetrica.analytics.impl.cq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0259cq {
    public final long a;

    public C0259cq(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0259cq.class == obj.getClass() && this.a == ((C0259cq) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return b64.o(new StringBuilder("StatSending{disabledReportingInterval="), this.a, '}');
    }
}
