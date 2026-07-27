package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public final class B1 implements I0 {

    /* renamed from: n, reason: collision with root package name */
    public final W0 f23803n;

    /* renamed from: u, reason: collision with root package name */
    public final int f23804u;

    /* renamed from: v, reason: collision with root package name */
    public final U0 f23805v = new U0();

    public B1(W0 w02, int i) {
        this.f23803n = w02;
        this.f23804u = i;
    }

    public final long a(K0 k02) {
        long j6;
        U0 u02;
        W0 w02;
        long j9;
        int b9;
        while (true) {
            long q8 = k02.q();
            j6 = k02.f25818v;
            long j10 = j6 - 6;
            u02 = this.f23805v;
            w02 = this.f23803n;
            if (q8 >= j10) {
                j9 = -6;
                break;
            }
            long q9 = k02.q();
            Cr cr = new Cr(17);
            k02.A(cr.f24252a, 0, 2, false);
            char r9 = cr.r(0, ByteOrder.BIG_ENDIAN);
            int i = this.f23804u;
            if (r9 != i) {
                k02.f25821y = 0;
                k02.c((int) (q9 - k02.f25819w), false);
            } else {
                byte[] bArr = cr.f24252a;
                j9 = -6;
                int i6 = 0;
                while (i6 < 15 && (b9 = k02.b(bArr, 2 + i6, 15 - i6)) != -1) {
                    i6 += b9;
                }
                cr.C(i6 + 2);
                k02.f25821y = 0;
                k02.c((int) (q9 - k02.f25819w), false);
                if (AbstractC2968bG.m(cr, w02, i, u02)) {
                    break;
                }
            }
            k02.c(1, false);
        }
        if (k02.q() < j6 + j9) {
            return u02.f27844n;
        }
        k02.c((int) (j6 - k02.q()), false);
        return w02.f28299j;
    }

    @Override // com.google.android.gms.internal.ads.I0
    public final H0 p(K0 k02, long j6) {
        long j9 = k02.f25819w;
        long a9 = a(k02);
        long q8 = k02.q();
        k02.c(Math.max(6, this.f23803n.f28293c), false);
        long a10 = a(k02);
        return (a9 > j6 || a10 <= j6) ? a10 <= j6 ? new H0(-2, a10, k02.q()) : new H0(-1, a9, j9) : new H0(0, com.anythink.basead.exoplayer.b.f6382b, q8);
    }
}
