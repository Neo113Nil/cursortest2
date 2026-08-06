package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Gm {

    /* renamed from: a, reason: collision with root package name */
    public final long f4443a;

    public Gm(long j2) {
        this.f4443a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Gm.class == obj.getClass() && this.f4443a == ((Gm) obj).f4443a;
    }

    public final int hashCode() {
        long j2 = this.f4443a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return "StatSending{disabledReportingInterval=" + this.f4443a + '}';
    }
}
