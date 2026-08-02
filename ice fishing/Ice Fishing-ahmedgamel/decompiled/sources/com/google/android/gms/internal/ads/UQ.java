package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class UQ {

    /* renamed from: a, reason: collision with root package name */
    public final long f28721a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28722b;

    public UQ(long j6, long j9) {
        this.f28721a = j6;
        this.f28722b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UQ)) {
            return false;
        }
        UQ uq = (UQ) obj;
        return this.f28721a == uq.f28721a && this.f28722b == uq.f28722b;
    }

    public final int hashCode() {
        return (((int) this.f28721a) * 31) + ((int) this.f28722b);
    }
}
