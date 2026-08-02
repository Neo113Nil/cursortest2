package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class D2 implements B2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f25058a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25059b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25060c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25061d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25062e;

    /* renamed from: f, reason: collision with root package name */
    public final long f25063f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f25064g;

    public D2(long j6, int i, long j9, int i4, long j10, long[] jArr) {
        this.f25058a = j6;
        this.f25059b = i;
        this.f25060c = j9;
        this.f25061d = i4;
        this.f25062e = j10;
        this.f25064g = jArr;
        this.f25063f = j10 != -1 ? j6 + j10 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final C3083d1 b(long j6) {
        double d9;
        double d10;
        boolean f2 = f();
        int i = this.f25059b;
        long j9 = this.f25058a;
        if (!f2) {
            C3190f1 c3190f1 = new C3190f1(0L, j9 + i);
            return new C3083d1(c3190f1, c3190f1);
        }
        String str = AbstractC3182eu.f30782a;
        long j10 = this.f25060c;
        long max = Math.max(0L, Math.min(j6, j10));
        double d11 = (max * 100.0d) / j10;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d9 = 256.0d;
        } else if (d11 >= 100.0d) {
            d9 = 256.0d;
            d12 = 256.0d;
        } else {
            int i4 = (int) d11;
            long[] jArr = this.f25064g;
            jArr.getClass();
            double d13 = jArr[i4];
            if (i4 == 99) {
                d9 = 256.0d;
                d10 = 256.0d;
            } else {
                d9 = 256.0d;
                d10 = jArr[i4 + 1];
            }
            d12 = ((d10 - d13) * (d11 - i4)) + d13;
        }
        long j11 = this.f25062e;
        C3190f1 c3190f12 = new C3190f1(max, j9 + Math.max(i, Math.min(Math.round((d12 / d9) * j11), j11 - 1)));
        return new C3083d1(c3190f12, c3190f12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final long c() {
        return this.f25060c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final boolean f() {
        return this.f25064g != null;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final int g() {
        return this.f25061d;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final long h() {
        return this.f25063f;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final long k(long j6) {
        if (!f()) {
            return 0L;
        }
        long j9 = j6 - this.f25058a;
        if (j9 <= this.f25059b) {
            return 0L;
        }
        long[] jArr = this.f25064g;
        jArr.getClass();
        double d9 = (j9 * 256.0d) / this.f25062e;
        int s9 = AbstractC3182eu.s(jArr, (long) d9, true);
        long j10 = this.f25060c;
        long j11 = (s9 * j10) / 100;
        long j12 = jArr[s9];
        int i = s9 + 1;
        long j13 = (j10 * i) / 100;
        return Math.round((j12 == (s9 == 99 ? 256L : jArr[i]) ? 0.0d : (d9 - j12) / (r0 - j12)) * (j13 - j11)) + j11;
    }
}
