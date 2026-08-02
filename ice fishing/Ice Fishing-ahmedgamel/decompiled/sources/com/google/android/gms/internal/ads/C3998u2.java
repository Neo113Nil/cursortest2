package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3998u2 implements B2, InterfaceC3136e1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f35229a;

    /* renamed from: b, reason: collision with root package name */
    public final long f35230b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35231c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35232d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35233e;

    /* renamed from: f, reason: collision with root package name */
    public final long f35234f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f35235g;

    /* renamed from: h, reason: collision with root package name */
    public final long f35236h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f35237j;

    /* renamed from: k, reason: collision with root package name */
    public final long f35238k;

    public C3998u2(long j6, long j9, int i, int i4, boolean z6) {
        long max;
        this.f35229a = j6;
        this.f35230b = j9;
        this.f35231c = i4 == -1 ? 1 : i4;
        this.f35233e = i;
        this.f35235g = z6;
        if (j6 == -1) {
            this.f35232d = -1L;
            max = com.anythink.basead.exoplayer.b.f7168b;
        } else {
            long j10 = j6 - j9;
            this.f35232d = j10;
            max = (Math.max(0L, j10) * 8000000) / i;
        }
        this.f35234f = max;
        this.f35236h = j9;
        this.i = i;
        this.f35237j = i4;
        this.f35238k = j6 == -1 ? -1L : j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final C3083d1 b(long j6) {
        long j9 = this.f35232d;
        long j10 = this.f35230b;
        if (j9 == -1) {
            C3190f1 c3190f1 = new C3190f1(0L, j10);
            return new C3083d1(c3190f1, c3190f1);
        }
        int i = this.f35233e;
        long j11 = this.f35231c;
        long j12 = (((i * j6) / 8000000) / j11) * j11;
        if (j9 != -1) {
            j12 = Math.min(j12, j9 - j11);
        }
        long max = Math.max(j12, 0L) + j10;
        long max2 = (Math.max(0L, max - j10) * 8000000) / i;
        C3190f1 c3190f12 = new C3190f1(max2, max);
        if (j9 != -1 && max2 < j6) {
            long j13 = max + j11;
            if (j13 < this.f35229a) {
                return new C3083d1(c3190f12, new C3190f1((Math.max(0L, j13 - j10) * 8000000) / i, j13));
            }
        }
        return new C3083d1(c3190f12, c3190f12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final long c() {
        return this.f35234f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final boolean f() {
        return this.f35232d != -1;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final int g() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final long h() {
        return this.f35238k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final boolean j() {
        return this.f35235g;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final long k(long j6) {
        return (Math.max(0L, j6 - this.f35230b) * 8000000) / this.f35233e;
    }
}
