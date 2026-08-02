package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class K4 implements J4 {

    /* renamed from: a, reason: collision with root package name */
    public final FQ f26593a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3566m1 f26594b;

    /* renamed from: c, reason: collision with root package name */
    public final M4 f26595c;

    /* renamed from: d, reason: collision with root package name */
    public final DP f26596d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26597e;

    /* renamed from: f, reason: collision with root package name */
    public long f26598f;

    /* renamed from: g, reason: collision with root package name */
    public int f26599g;

    /* renamed from: h, reason: collision with root package name */
    public long f26600h;

    public K4(FQ fq, InterfaceC3566m1 interfaceC3566m1, M4 m42, String str, int i) {
        this.f26593a = fq;
        this.f26594b = interfaceC3566m1;
        this.f26595c = m42;
        int i4 = m42.f27033d;
        int i6 = m42.f27030a;
        int i9 = (i4 * i6) / 8;
        int i10 = m42.f27032c;
        if (i10 != i9) {
            throw U4.a(null, D.x.o(new StringBuilder(String.valueOf(i9).length() + 28 + String.valueOf(i10).length()), "Expected block size: ", i9, "; got: ", i10));
        }
        int i11 = m42.f27031b;
        int i12 = i11 * i9;
        int i13 = i12 * 8;
        int max = Math.max(i9, i12 / 10);
        this.f26597e = max;
        C3322hP c3322hP = new C3322hP();
        c3322hP.d("audio/wav");
        c3322hP.e(str);
        c3322hP.f31553h = i13;
        c3322hP.i = i13;
        c3322hP.f31559o = max;
        c3322hP.f31538G = i6;
        int i14 = m42.f27034e;
        c3322hP.f31539H = i14 == 0 ? -1 : i14 << 2;
        c3322hP.f31540I = i11;
        c3322hP.J = i;
        this.f26596d = new DP(c3322hP);
    }

    @Override // com.google.android.gms.internal.ads.J4
    public final boolean a(K0 k02, long j6) {
        int i;
        int i4;
        long j9 = j6;
        while (j9 > 0 && (i = this.f26599g) < (i4 = this.f26597e)) {
            int d9 = this.f26594b.d(k02, (int) Math.min(i4 - i, j9), true);
            if (d9 == -1) {
                j9 = 0;
            } else {
                this.f26599g += d9;
                j9 -= d9;
            }
        }
        int i6 = this.f26599g;
        int i9 = this.f26595c.f27032c;
        int i10 = i6 / i9;
        if (i10 > 0) {
            long w3 = this.f26598f + AbstractC3182eu.w(this.f26600h, 1000000L, r2.f27031b, RoundingMode.DOWN);
            int i11 = i10 * i9;
            int i12 = this.f26599g - i11;
            this.f26594b.c(w3, 1, i11, i12, null);
            this.f26600h += i10;
            this.f26599g = i12;
        }
        return j9 <= 0;
    }

    @Override // com.google.android.gms.internal.ads.J4
    public final void b(long j6) {
        this.f26598f = j6;
        this.f26599g = 0;
        this.f26600h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.J4
    public final void c(int i, long j6) {
        this.f26593a.D(new N4(this.f26595c, 1, i, j6));
        this.f26594b.e(this.f26596d);
    }
}
