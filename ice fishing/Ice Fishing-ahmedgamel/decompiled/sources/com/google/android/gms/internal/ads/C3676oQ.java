package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3676oQ {

    /* renamed from: a, reason: collision with root package name */
    public final Object f32905a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32906b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32907c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32908d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32909e;

    public C3676oQ(Object obj, int i, int i6, long j6, int i9) {
        this.f32905a = obj;
        this.f32906b = i;
        this.f32907c = i6;
        this.f32908d = j6;
        this.f32909e = i9;
    }

    public final C3676oQ a(Object obj) {
        return this.f32905a.equals(obj) ? this : new C3676oQ(obj, this.f32906b, this.f32907c, this.f32908d, this.f32909e);
    }

    public final boolean b() {
        return this.f32906b != -1;
    }

    public final boolean c(C3676oQ c3676oQ) {
        if (c3676oQ == null) {
            return false;
        }
        if (this == c3676oQ) {
            return true;
        }
        return this.f32905a.equals(c3676oQ.f32905a) && this.f32906b == c3676oQ.f32906b && this.f32907c == c3676oQ.f32907c && this.f32908d == c3676oQ.f32908d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3676oQ)) {
            return false;
        }
        C3676oQ c3676oQ = (C3676oQ) obj;
        return c(c3676oQ) && this.f32909e == c3676oQ.f32909e;
    }

    public final int hashCode() {
        return ((((((((this.f32905a.hashCode() + 527) * 31) + this.f32906b) * 31) + this.f32907c) * 31) + ((int) this.f32908d)) * 31) + this.f32909e;
    }

    public C3676oQ(long j6, Object obj) {
        this(obj, -1, -1, j6, -1);
    }

    public C3676oQ(Object obj, long j6, int i) {
        this(obj, -1, -1, j6, i);
    }
}
