package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345d3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5783a;

    public C0345d3(long j2) {
        this.f5783a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0345d3.class == obj.getClass() && this.f5783a == ((C0345d3) obj).f5783a;
    }

    public final int hashCode() {
        long j2 = this.f5783a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return "CacheControl{lastKnownLocationTtl=" + this.f5783a + '}';
    }
}
