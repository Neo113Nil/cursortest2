package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3860rQ {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34406a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34407b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34408c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34409d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34410e;

    public C3860rQ(Object obj, int i, int i4, long j6, int i6) {
        this.f34406a = obj;
        this.f34407b = i;
        this.f34408c = i4;
        this.f34409d = j6;
        this.f34410e = i6;
    }

    public final C3860rQ a(Object obj) {
        return this.f34406a.equals(obj) ? this : new C3860rQ(obj, this.f34407b, this.f34408c, this.f34409d, this.f34410e);
    }

    public final boolean b() {
        return this.f34407b != -1;
    }

    public final boolean c(C3860rQ c3860rQ) {
        if (c3860rQ == null) {
            return false;
        }
        if (this == c3860rQ) {
            return true;
        }
        return this.f34406a.equals(c3860rQ.f34406a) && this.f34407b == c3860rQ.f34407b && this.f34408c == c3860rQ.f34408c && this.f34409d == c3860rQ.f34409d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3860rQ)) {
            return false;
        }
        C3860rQ c3860rQ = (C3860rQ) obj;
        return c(c3860rQ) && this.f34410e == c3860rQ.f34410e;
    }

    public final int hashCode() {
        return ((((((((this.f34406a.hashCode() + 527) * 31) + this.f34407b) * 31) + this.f34408c) * 31) + ((int) this.f34409d)) * 31) + this.f34410e;
    }

    public C3860rQ(long j6, Object obj) {
        this(obj, -1, -1, j6, -1);
    }

    public C3860rQ(Object obj, long j6, int i) {
        this(obj, -1, -1, j6, i);
    }
}
