package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class D2 implements B2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f24313a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24314b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24315c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24316d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24317e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24318f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f24319g;

    public D2(long j6, int i, long j9, int i6, long j10, long[] jArr) {
        this.f24313a = j6;
        this.f24314b = i;
        this.f24315c = j9;
        this.f24316d = i6;
        this.f24317e = j10;
        this.f24319g = jArr;
        this.f24318f = j10 != -1 ? j6 + j10 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final C3060d1 b(long j6) {
        double d2;
        double d9;
        boolean f3 = f();
        int i = this.f24314b;
        long j9 = this.f24313a;
        if (!f3) {
            C3167f1 c3167f1 = new C3167f1(0L, j9 + i);
            return new C3060d1(c3167f1, c3167f1);
        }
        String str = AbstractC3159eu.f29993a;
        long j10 = this.f24315c;
        long max = Math.max(0L, Math.min(j6, j10));
        double d10 = (max * 100.0d) / j10;
        double d11 = 0.0d;
        if (d10 <= 0.0d) {
            d2 = 256.0d;
        } else if (d10 >= 100.0d) {
            d2 = 256.0d;
            d11 = 256.0d;
        } else {
            int i6 = (int) d10;
            long[] jArr = this.f24319g;
            jArr.getClass();
            double d12 = jArr[i6];
            if (i6 == 99) {
                d2 = 256.0d;
                d9 = 256.0d;
            } else {
                d2 = 256.0d;
                d9 = jArr[i6 + 1];
            }
            d11 = ((d9 - d12) * (d10 - i6)) + d12;
        }
        long j11 = this.f24317e;
        C3167f1 c3167f12 = new C3167f1(max, j9 + Math.max(i, Math.min(Math.round((d11 / d2) * j11), j11 - 1)));
        return new C3060d1(c3167f12, c3167f12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final long c() {
        return this.f24315c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final boolean f() {
        return this.f24319g != null;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final int g() {
        return this.f24316d;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final long h() {
        return this.f24318f;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final long k(long j6) {
        if (!f()) {
            return 0L;
        }
        long j9 = j6 - this.f24313a;
        if (j9 <= this.f24314b) {
            return 0L;
        }
        long[] jArr = this.f24319g;
        jArr.getClass();
        double d2 = (j9 * 256.0d) / this.f24317e;
        int s9 = AbstractC3159eu.s(jArr, (long) d2, true);
        long j10 = this.f24315c;
        long j11 = (s9 * j10) / 100;
        long j12 = jArr[s9];
        int i = s9 + 1;
        long j13 = (j10 * i) / 100;
        return Math.round((j12 == (s9 == 99 ? 256L : jArr[i]) ? 0.0d : (d2 - j12) / (r0 - j12)) * (j13 - j11)) + j11;
    }
}
