package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class FQ {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4026v f24799a;

    /* renamed from: b, reason: collision with root package name */
    public final Cr f24800b = new Cr(32);

    /* renamed from: c, reason: collision with root package name */
    public G2 f24801c;

    /* renamed from: d, reason: collision with root package name */
    public G2 f24802d;

    /* renamed from: e, reason: collision with root package name */
    public G2 f24803e;

    /* renamed from: f, reason: collision with root package name */
    public long f24804f;

    public FQ(InterfaceC4026v interfaceC4026v) {
        this.f24799a = interfaceC4026v;
        G2 g22 = new G2(0L);
        this.f24801c = g22;
        this.f24802d = g22;
        this.f24803e = g22;
    }

    public static G2 c(G2 g22, C3996uN c3996uN, X1.b bVar, Cr cr) {
        int i;
        if (c3996uN.h(1073741824)) {
            long j6 = bVar.f3761u;
            cr.y(1);
            G2 e9 = e(g22, j6, cr.f24252a, 1);
            long j9 = j6 + 1;
            byte b9 = cr.f24252a[0];
            int i6 = b9 & com.anythink.core.common.s.a.c.f16316a;
            int i9 = b9 & Byte.MAX_VALUE;
            C3834rN c3834rN = c3996uN.f34527d;
            byte[] bArr = c3834rN.f33572a;
            if (bArr == null) {
                c3834rN.f33572a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z3 = i6 != 0;
            g22 = e(e9, j9, c3834rN.f33572a, i9);
            long j10 = j9 + i9;
            if (z3) {
                cr.y(2);
                g22 = e(g22, j10, cr.f24252a, 2);
                j10 += 2;
                i = cr.L();
            } else {
                i = 1;
            }
            int[] iArr = c3834rN.f33575d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = c3834rN.f33576e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z3) {
                int i10 = i * 6;
                cr.y(i10);
                g22 = e(g22, j10, cr.f24252a, i10);
                j10 += i10;
                cr.E(0);
                for (int i11 = 0; i11 < i; i11++) {
                    iArr[i11] = cr.L();
                    iArr2[i11] = cr.h();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f3762v - ((int) (j10 - bVar.f3761u));
            }
            C3489l1 c3489l1 = (C3489l1) bVar.f3763w;
            String str = AbstractC3159eu.f29993a;
            byte[] bArr2 = c3489l1.f31681b;
            byte[] bArr3 = c3834rN.f33572a;
            c3834rN.f33577f = i;
            c3834rN.f33575d = iArr;
            c3834rN.f33576e = iArr2;
            c3834rN.f33573b = bArr2;
            c3834rN.f33572a = bArr3;
            int i12 = c3489l1.f31680a;
            c3834rN.f33574c = i12;
            int i13 = c3489l1.f31682c;
            c3834rN.f33578g = i13;
            int i14 = c3489l1.f31683d;
            c3834rN.f33579h = i14;
            MediaCodec.CryptoInfo cryptoInfo = c3834rN.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i12;
            S0.c cVar = c3834rN.f33580j;
            cVar.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) cVar.f2776v;
            pattern.set(i13, i14);
            ((MediaCodec.CryptoInfo) cVar.f2775u).setPattern(pattern);
            long j11 = bVar.f3761u;
            int i15 = (int) (j10 - j11);
            bVar.f3761u = j11 + i15;
            bVar.f3762v -= i15;
        }
        if (!c3996uN.h(268435456)) {
            c3996uN.j(bVar.f3762v);
            return d(g22, bVar.f3761u, c3996uN.f34528e, bVar.f3762v);
        }
        cr.y(4);
        G2 e10 = e(g22, bVar.f3761u, cr.f24252a, 4);
        int h9 = cr.h();
        bVar.f3761u += 4;
        bVar.f3762v -= 4;
        c3996uN.j(h9);
        G2 d2 = d(e10, bVar.f3761u, c3996uN.f34528e, h9);
        bVar.f3761u += h9;
        int i16 = bVar.f3762v - h9;
        bVar.f3762v = i16;
        ByteBuffer byteBuffer = c3996uN.f34530g;
        if (byteBuffer == null || byteBuffer.capacity() < i16) {
            c3996uN.f34530g = ByteBuffer.allocate(i16);
        } else {
            c3996uN.f34530g.clear();
        }
        return d(d2, bVar.f3761u, c3996uN.f34530g, bVar.f3762v);
    }

    public static G2 d(G2 g22, long j6, ByteBuffer byteBuffer, int i) {
        while (j6 >= g22.f24908u) {
            g22 = (G2) g22.f24910w;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (g22.f24908u - j6));
            C3972u c3972u = (C3972u) g22.f24909v;
            byte[] bArr = c3972u.f34445a;
            long j9 = j6 - g22.f24907n;
            c3972u.getClass();
            byteBuffer.put(bArr, (int) j9, min);
            i -= min;
            j6 += min;
            if (j6 == g22.f24908u) {
                g22 = (G2) g22.f24910w;
            }
        }
        return g22;
    }

    public static G2 e(G2 g22, long j6, byte[] bArr, int i) {
        while (j6 >= g22.f24908u) {
            g22 = (G2) g22.f24910w;
        }
        int i6 = i;
        while (i6 > 0) {
            int min = Math.min(i6, (int) (g22.f24908u - j6));
            C3972u c3972u = (C3972u) g22.f24909v;
            byte[] bArr2 = c3972u.f34445a;
            long j9 = j6 - g22.f24907n;
            c3972u.getClass();
            System.arraycopy(bArr2, (int) j9, bArr, i - i6, min);
            i6 -= min;
            j6 += min;
            if (j6 == g22.f24908u) {
                g22 = (G2) g22.f24910w;
            }
        }
        return g22;
    }

    public final void a(long j6) {
        G2 g22;
        if (j6 != -1) {
            while (true) {
                g22 = this.f24801c;
                if (j6 < g22.f24908u) {
                    break;
                }
                this.f24799a.p((C3972u) g22.f24909v);
                G2 g23 = this.f24801c;
                g23.f24909v = null;
                G2 g24 = (G2) g23.f24910w;
                g23.f24910w = null;
                this.f24801c = g24;
            }
            if (this.f24802d.f24907n < g22.f24907n) {
                this.f24802d = g22;
            }
        }
    }

    public final int b(int i) {
        G2 g22 = this.f24803e;
        if (((C3972u) g22.f24909v) == null) {
            C3972u c9 = this.f24799a.c();
            G2 g23 = new G2(this.f24803e.f24908u);
            g22.f24909v = c9;
            g22.f24910w = g23;
        }
        return Math.min(i, (int) (this.f24803e.f24908u - this.f24804f));
    }
}
