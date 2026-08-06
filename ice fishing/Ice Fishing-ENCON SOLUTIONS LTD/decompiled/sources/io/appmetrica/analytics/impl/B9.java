package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class B9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f4196a;

    public B9(long j2) {
        this.f4196a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B9) && this.f4196a == ((B9) obj).f4196a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4196a);
    }

    public final String toString() {
        return "ExternalAttributionConfig(collectingInterval=" + this.f4196a + ')';
    }
}
