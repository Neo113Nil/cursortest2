package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2909a4 implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2964b4 f29172a = new C2964b4(0, 0, null, com.anythink.basead.exoplayer.k.o.f8625z);

    /* renamed from: b, reason: collision with root package name */
    public final Lr f29173b = new Lr(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f29174c;

    static {
        int i = PA.f26868T;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        this.f29172a.e(q02, new D4(Integer.MIN_VALUE, 0, 1));
        PQ pq = (PQ) q02;
        pq.v();
        pq.w(new T0(com.anythink.basead.exoplayer.b.f6539b, 0L));
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        J0 j02;
        int y6;
        Lr lr = new Lr(10);
        int i = 0;
        while (true) {
            j02 = (J0) p02;
            j02.I(lr.f26233a, 0, 10, false);
            lr.E(0);
            if (lr.O() != 4801587) {
                break;
            }
            lr.G(3);
            int g9 = lr.g();
            i += g9 + 10;
            j02.d(g9, false);
        }
        j02.f25677y = 0;
        j02.d(i, false);
        int i4 = 0;
        int i9 = i;
        while (true) {
            j02.I(lr.f26233a, 0, 6, false);
            lr.E(0);
            if (lr.L() != 2935) {
                j02.f25677y = 0;
                i9++;
                if (i9 - i >= 8192) {
                    break;
                }
                j02.d(i9, false);
                i4 = 0;
            } else {
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] bArr = lr.f26233a;
                if (bArr.length < 6) {
                    y6 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    int i10 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                    y6 = i10 + i10;
                } else {
                    byte b9 = bArr[4];
                    y6 = AbstractC2655Lg.y((b9 & 192) >> 6, b9 & com.anythink.core.common.s.a.c.f16476c);
                }
                if (y6 == -1) {
                    break;
                }
                j02.d(y6 - 6, false);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        this.f29174c = false;
        this.f29172a.a();
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final int e(P0 p02, S0 s02) {
        Lr lr = this.f29173b;
        int z8 = ((J0) p02).z(lr.f26233a, 0, 2786);
        if (z8 == -1) {
            return -1;
        }
        lr.E(0);
        lr.C(z8);
        boolean z9 = this.f29174c;
        C2964b4 c2964b4 = this.f29172a;
        if (!z9) {
            c2964b4.f29400o = 0L;
            this.f29174c = true;
        }
        c2964b4.c(lr);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }
}
