package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class K4 implements J4 {

    /* renamed from: a, reason: collision with root package name */
    public final CQ f25841a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3543m1 f25842b;

    /* renamed from: c, reason: collision with root package name */
    public final M4 f25843c;

    /* renamed from: d, reason: collision with root package name */
    public final DP f25844d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25845e;

    /* renamed from: f, reason: collision with root package name */
    public long f25846f;

    /* renamed from: g, reason: collision with root package name */
    public int f25847g;

    /* renamed from: h, reason: collision with root package name */
    public long f25848h;

    public K4(CQ cq, InterfaceC3543m1 interfaceC3543m1, M4 m4, String str, int i) {
        this.f25841a = cq;
        this.f25842b = interfaceC3543m1;
        this.f25843c = m4;
        int i6 = m4.f26242d;
        int i9 = m4.f26239a;
        int i10 = (i6 * i9) / 8;
        int i11 = m4.f26241c;
        if (i11 != i10) {
            throw U4.a(null, D.y.r(new StringBuilder(String.valueOf(i10).length() + 28 + String.valueOf(i11).length()), "Expected block size: ", i10, "; got: ", i11));
        }
        int i12 = m4.f26240b;
        int i13 = i12 * i10;
        int i14 = i13 * 8;
        int max = Math.max(i10, i13 / 10);
        this.f25845e = max;
        C3299hP c3299hP = new C3299hP();
        c3299hP.d("audio/wav");
        c3299hP.e(str);
        c3299hP.f30787h = i14;
        c3299hP.i = i14;
        c3299hP.f30793o = max;
        c3299hP.f30772G = i9;
        int i15 = m4.f26243e;
        c3299hP.f30773H = i15 == 0 ? -1 : i15 << 2;
        c3299hP.f30774I = i12;
        c3299hP.J = i;
        this.f25844d = new DP(c3299hP);
    }

    @Override // com.google.android.gms.internal.ads.J4
    public final boolean a(K0 k02, long j6) {
        int i;
        int i6;
        long j9 = j6;
        while (j9 > 0 && (i = this.f25847g) < (i6 = this.f25845e)) {
            int d2 = this.f25842b.d(k02, (int) Math.min(i6 - i, j9), true);
            if (d2 == -1) {
                j9 = 0;
            } else {
                this.f25847g += d2;
                j9 -= d2;
            }
        }
        int i9 = this.f25847g;
        int i10 = this.f25843c.f26241c;
        int i11 = i9 / i10;
        if (i11 > 0) {
            long w6 = this.f25846f + AbstractC3159eu.w(this.f25848h, 1000000L, r2.f26240b, RoundingMode.DOWN);
            int i12 = i11 * i10;
            int i13 = this.f25847g - i12;
            this.f25842b.c(w6, 1, i12, i13, null);
            this.f25848h += i11;
            this.f25847g = i13;
        }
        return j9 <= 0;
    }

    @Override // com.google.android.gms.internal.ads.J4
    public final void b(long j6) {
        this.f25846f = j6;
        this.f25847g = 0;
        this.f25848h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.J4
    public final void c(int i, long j6) {
        this.f25841a.D(new N4(this.f25843c, 1, i, j6));
        this.f25842b.e(this.f25844d);
    }
}
