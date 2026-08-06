package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.w7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0840w7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f7094a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7095b;

    public C0840w7(long j2, int i2) {
        this.f7094a = j2;
        this.f7095b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0840w7)) {
            return false;
        }
        C0840w7 c0840w7 = (C0840w7) obj;
        return this.f7094a == c0840w7.f7094a && this.f7095b == c0840w7.f7095b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7095b) + (Long.hashCode(this.f7094a) * 31);
    }

    public final String toString() {
        return "DecimalProtoModel(mantissa=" + this.f7094a + ", exponent=" + this.f7095b + ')';
    }
}
