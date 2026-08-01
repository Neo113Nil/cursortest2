package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class RQ {

    /* renamed from: a, reason: collision with root package name */
    public final long f27284a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27285b;

    public RQ(long j6, long j9) {
        this.f27284a = j6;
        this.f27285b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RQ)) {
            return false;
        }
        RQ rq = (RQ) obj;
        return this.f27284a == rq.f27284a && this.f27285b == rq.f27285b;
    }

    public final int hashCode() {
        return (((int) this.f27284a) * 31) + ((int) this.f27285b);
    }
}
