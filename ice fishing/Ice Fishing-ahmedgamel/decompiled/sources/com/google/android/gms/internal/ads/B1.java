package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public final class B1 implements I0 {

    /* renamed from: n, reason: collision with root package name */
    public final W0 f24575n;

    /* renamed from: u, reason: collision with root package name */
    public final int f24576u;

    /* renamed from: v, reason: collision with root package name */
    public final U0 f24577v = new U0();

    public B1(W0 w02, int i) {
        this.f24575n = w02;
        this.f24576u = i;
    }

    public final long a(K0 k02) {
        long j6;
        U0 u02;
        W0 w02;
        long j9;
        int c9;
        while (true) {
            long q8 = k02.q();
            j6 = k02.f26570v;
            long j10 = j6 - 6;
            u02 = this.f24577v;
            w02 = this.f24575n;
            if (q8 >= j10) {
                j9 = -6;
                break;
            }
            long q9 = k02.q();
            Cr cr = new Cr(17);
            k02.E(cr.f24997a, 0, 2, false);
            char r9 = cr.r(0, ByteOrder.BIG_ENDIAN);
            int i = this.f24576u;
            if (r9 != i) {
                k02.f26573y = 0;
                k02.d((int) (q9 - k02.f26571w), false);
            } else {
                byte[] bArr = cr.f24997a;
                j9 = -6;
                int i4 = 0;
                while (i4 < 15 && (c9 = k02.c(bArr, 2 + i4, 15 - i4)) != -1) {
                    i4 += c9;
                }
                cr.C(i4 + 2);
                k02.f26573y = 0;
                k02.d((int) (q9 - k02.f26571w), false);
                if (AbstractC2991bG.m(cr, w02, i, u02)) {
                    break;
                }
            }
            k02.d(1, false);
        }
        if (k02.q() < j6 + j9) {
            return u02.f28641n;
        }
        k02.d((int) (j6 - k02.q()), false);
        return w02.f29097j;
    }

    @Override // com.google.android.gms.internal.ads.I0
    public final H0 q(K0 k02, long j6) {
        long j9 = k02.f26571w;
        long a9 = a(k02);
        long q8 = k02.q();
        k02.d(Math.max(6, this.f24575n.f29091c), false);
        long a10 = a(k02);
        return (a9 > j6 || a10 <= j6) ? a10 <= j6 ? new H0(-2, a10, k02.q()) : new H0(-1, a9, j9) : new H0(0, com.anythink.basead.exoplayer.b.f7168b, q8);
    }
}
