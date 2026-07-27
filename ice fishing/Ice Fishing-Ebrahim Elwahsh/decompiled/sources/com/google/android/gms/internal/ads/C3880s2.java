package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3880s2 implements InterfaceC4204y2, InterfaceC3015c1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f34171a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34172b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34173c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34174d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34175e;

    /* renamed from: f, reason: collision with root package name */
    public final long f34176f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f34177g;

    /* renamed from: h, reason: collision with root package name */
    public final long f34178h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f34179j;

    /* renamed from: k, reason: collision with root package name */
    public final long f34180k;

    public C3880s2(long j9, long j10, int i, int i4, boolean z8) {
        long max;
        this.f34171a = j9;
        this.f34172b = j10;
        this.f34173c = i4 == -1 ? 1 : i4;
        this.f34175e = i;
        this.f34177g = z8;
        if (j9 == -1) {
            this.f34174d = -1L;
            max = com.anythink.basead.exoplayer.b.f6539b;
        } else {
            long j11 = j9 - j10;
            this.f34174d = j11;
            max = (Math.max(0L, j11) * 8000000) / i;
        }
        this.f34176f = max;
        this.f34178h = j10;
        this.i = i;
        this.f34179j = i4;
        this.f34180k = j9 == -1 ? -1L : j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final long a() {
        return this.f34176f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final C2961b1 c(long j9) {
        long j10 = this.f34174d;
        long j11 = this.f34172b;
        if (j10 == -1) {
            C3070d1 c3070d1 = new C3070d1(0L, j11);
            return new C2961b1(c3070d1, c3070d1);
        }
        int i = this.f34175e;
        long j12 = this.f34173c;
        long j13 = (((i * j9) / 8000000) / j12) * j12;
        if (j10 != -1) {
            j13 = Math.min(j13, j10 - j12);
        }
        long max = Math.max(j13, 0L) + j11;
        long max2 = (Math.max(0L, max - j11) * 8000000) / i;
        C3070d1 c3070d12 = new C3070d1(max2, max);
        if (j10 != -1 && max2 < j9) {
            long j14 = max + j12;
            if (j14 < this.f34171a) {
                return new C2961b1(c3070d12, new C3070d1((Math.max(0L, j14 - j11) * 8000000) / i, j14));
            }
        }
        return new C2961b1(c3070d12, c3070d12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final boolean d() {
        return this.f34174d != -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4204y2
    public final long e() {
        return this.f34180k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4204y2
    public final long f(long j9) {
        return (Math.max(0L, j9 - this.f34172b) * 8000000) / this.f34175e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4204y2
    public final int g() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3015c1
    public final boolean h() {
        return this.f34177g;
    }
}
