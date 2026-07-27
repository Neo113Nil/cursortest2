package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class H4 implements G4 {

    /* renamed from: a, reason: collision with root package name */
    public final PQ f25280a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3448k1 f25281b;

    /* renamed from: c, reason: collision with root package name */
    public final J4 f25282c;

    /* renamed from: d, reason: collision with root package name */
    public final TP f25283d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25284e;

    /* renamed from: f, reason: collision with root package name */
    public long f25285f;

    /* renamed from: g, reason: collision with root package name */
    public int f25286g;

    /* renamed from: h, reason: collision with root package name */
    public long f25287h;

    public H4(PQ pq, InterfaceC3448k1 interfaceC3448k1, J4 j42, String str, int i) {
        this.f25280a = pq;
        this.f25281b = interfaceC3448k1;
        this.f25282c = j42;
        int i4 = j42.f25731d;
        int i9 = j42.f25728a;
        int i10 = (i4 * i9) / 8;
        int i11 = j42.f25730c;
        if (i11 != i10) {
            throw W4.a(null, D.y.n(new StringBuilder(String.valueOf(i10).length() + 28 + String.valueOf(i11).length()), "Expected block size: ", i10, "; got: ", i11));
        }
        int i12 = j42.f25729b;
        int i13 = i12 * i10;
        int i14 = i13 * 8;
        int max = Math.max(i10, i13 / 10);
        this.f25284e = max;
        C4065vP c4065vP = new C4065vP();
        c4065vP.d("audio/wav");
        c4065vP.e(str);
        c4065vP.f34780h = i14;
        c4065vP.i = i14;
        c4065vP.f34786o = max;
        c4065vP.f34765F = i9;
        int i15 = j42.f25732e;
        c4065vP.f34766G = i15 == 0 ? -1 : i15 << 2;
        c4065vP.f34767H = i12;
        c4065vP.f34768I = i;
        this.f25283d = new TP(c4065vP);
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void a(int i, long j9) {
        this.f25280a.w(new L4(this.f25282c, 1, i, j9));
        this.f25281b.e(this.f25283d);
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final boolean b(J0 j02, long j9) {
        int i;
        int i4;
        long j10 = j9;
        while (j10 > 0 && (i = this.f25286g) < (i4 = this.f25284e)) {
            int d2 = this.f25281b.d(j02, (int) Math.min(i4 - i, j10), true);
            if (d2 == -1) {
                j10 = 0;
            } else {
                this.f25286g += d2;
                j10 -= d2;
            }
        }
        int i9 = this.f25286g;
        int i10 = this.f25282c.f25730c;
        int i11 = i9 / i10;
        if (i11 > 0) {
            long w9 = this.f25285f + AbstractC3548lu.w(this.f25287h, 1000000L, r2.f25729b, RoundingMode.DOWN);
            int i12 = i11 * i10;
            int i13 = this.f25286g - i12;
            this.f25281b.b(w9, 1, i12, i13, null);
            this.f25287h += i11;
            this.f25286g = i13;
        }
        return j10 <= 0;
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void d(long j9) {
        this.f25285f = j9;
        this.f25286g = 0;
        this.f25287h = 0L;
    }
}
