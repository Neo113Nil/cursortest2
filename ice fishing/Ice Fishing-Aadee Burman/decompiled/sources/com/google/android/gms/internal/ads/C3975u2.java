package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3975u2 implements B2, InterfaceC3113e1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f34455a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34456b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34457c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34458d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34459e;

    /* renamed from: f, reason: collision with root package name */
    public final long f34460f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f34461g;

    /* renamed from: h, reason: collision with root package name */
    public final long f34462h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f34463j;

    /* renamed from: k, reason: collision with root package name */
    public final long f34464k;

    public C3975u2(long j6, long j9, int i, int i6, boolean z3) {
        long max;
        this.f34455a = j6;
        this.f34456b = j9;
        this.f34457c = i6 == -1 ? 1 : i6;
        this.f34459e = i;
        this.f34461g = z3;
        if (j6 == -1) {
            this.f34458d = -1L;
            max = com.anythink.basead.exoplayer.b.f6382b;
        } else {
            long j10 = j6 - j9;
            this.f34458d = j10;
            max = (Math.max(0L, j10) * 8000000) / i;
        }
        this.f34460f = max;
        this.f34462h = j9;
        this.i = i;
        this.f34463j = i6;
        this.f34464k = j6 == -1 ? -1L : j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final C3060d1 b(long j6) {
        long j9 = this.f34458d;
        long j10 = this.f34456b;
        if (j9 == -1) {
            C3167f1 c3167f1 = new C3167f1(0L, j10);
            return new C3060d1(c3167f1, c3167f1);
        }
        int i = this.f34459e;
        long j11 = this.f34457c;
        long j12 = (((i * j6) / 8000000) / j11) * j11;
        if (j9 != -1) {
            j12 = Math.min(j12, j9 - j11);
        }
        long max = Math.max(j12, 0L) + j10;
        long max2 = (Math.max(0L, max - j10) * 8000000) / i;
        C3167f1 c3167f12 = new C3167f1(max2, max);
        if (j9 != -1 && max2 < j6) {
            long j13 = max + j11;
            if (j13 < this.f34455a) {
                return new C3060d1(c3167f12, new C3167f1((Math.max(0L, j13 - j10) * 8000000) / i, j13));
            }
        }
        return new C3060d1(c3167f12, c3167f12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final long c() {
        return this.f34460f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final boolean f() {
        return this.f34458d != -1;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final int g() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final long h() {
        return this.f34464k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final boolean j() {
        return this.f34461g;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final long k(long j6) {
        return (Math.max(0L, j6 - this.f34456b) * 8000000) / this.f34459e;
    }
}
