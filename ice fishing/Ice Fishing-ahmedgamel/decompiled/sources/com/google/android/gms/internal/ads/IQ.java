package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class IQ {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4049v f26258a;

    /* renamed from: b, reason: collision with root package name */
    public final Cr f26259b = new Cr(32);

    /* renamed from: c, reason: collision with root package name */
    public G2 f26260c;

    /* renamed from: d, reason: collision with root package name */
    public G2 f26261d;

    /* renamed from: e, reason: collision with root package name */
    public G2 f26262e;

    /* renamed from: f, reason: collision with root package name */
    public long f26263f;

    public IQ(InterfaceC4049v interfaceC4049v) {
        this.f26258a = interfaceC4049v;
        G2 g22 = new G2(0L);
        this.f26260c = g22;
        this.f26261d = g22;
        this.f26262e = g22;
    }

    public static G2 c(G2 g22, C4019uN c4019uN, Z1.b bVar, Cr cr) {
        int i;
        if (c4019uN.h(1073741824)) {
            long j6 = bVar.f4112u;
            cr.y(1);
            G2 e9 = e(g22, j6, cr.f24997a, 1);
            long j9 = j6 + 1;
            byte b9 = cr.f24997a[0];
            int i4 = b9 & com.anythink.core.common.s.a.c.f17103a;
            int i6 = b9 & Byte.MAX_VALUE;
            C3857rN c3857rN = c4019uN.f35301d;
            byte[] bArr = c3857rN.f34340a;
            if (bArr == null) {
                c3857rN.f34340a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z6 = i4 != 0;
            g22 = e(e9, j9, c3857rN.f34340a, i6);
            long j10 = j9 + i6;
            if (z6) {
                cr.y(2);
                g22 = e(g22, j10, cr.f24997a, 2);
                j10 += 2;
                i = cr.L();
            } else {
                i = 1;
            }
            int[] iArr = c3857rN.f34343d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = c3857rN.f34344e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z6) {
                int i9 = i * 6;
                cr.y(i9);
                g22 = e(g22, j10, cr.f24997a, i9);
                j10 += i9;
                cr.E(0);
                for (int i10 = 0; i10 < i; i10++) {
                    iArr[i10] = cr.L();
                    iArr2[i10] = cr.h();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f4113v - ((int) (j10 - bVar.f4112u));
            }
            C3512l1 c3512l1 = (C3512l1) bVar.f4114w;
            String str = AbstractC3182eu.f30782a;
            byte[] bArr2 = c3512l1.f32461b;
            byte[] bArr3 = c3857rN.f34340a;
            c3857rN.f34345f = i;
            c3857rN.f34343d = iArr;
            c3857rN.f34344e = iArr2;
            c3857rN.f34341b = bArr2;
            c3857rN.f34340a = bArr3;
            int i11 = c3512l1.f32460a;
            c3857rN.f34342c = i11;
            int i12 = c3512l1.f32462c;
            c3857rN.f34346g = i12;
            int i13 = c3512l1.f32463d;
            c3857rN.f34347h = i13;
            MediaCodec.CryptoInfo cryptoInfo = c3857rN.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i11;
            S0.c cVar = c3857rN.f34348j;
            cVar.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) cVar.f2903v;
            pattern.set(i12, i13);
            ((MediaCodec.CryptoInfo) cVar.f2902u).setPattern(pattern);
            long j11 = bVar.f4112u;
            int i14 = (int) (j10 - j11);
            bVar.f4112u = j11 + i14;
            bVar.f4113v -= i14;
        }
        if (!c4019uN.h(268435456)) {
            c4019uN.j(bVar.f4113v);
            return d(g22, bVar.f4112u, c4019uN.f35302e, bVar.f4113v);
        }
        cr.y(4);
        G2 e10 = e(g22, bVar.f4112u, cr.f24997a, 4);
        int h3 = cr.h();
        bVar.f4112u += 4;
        bVar.f4113v -= 4;
        c4019uN.j(h3);
        G2 d9 = d(e10, bVar.f4112u, c4019uN.f35302e, h3);
        bVar.f4112u += h3;
        int i15 = bVar.f4113v - h3;
        bVar.f4113v = i15;
        ByteBuffer byteBuffer = c4019uN.f35304g;
        if (byteBuffer == null || byteBuffer.capacity() < i15) {
            c4019uN.f35304g = ByteBuffer.allocate(i15);
        } else {
            c4019uN.f35304g.clear();
        }
        return d(d9, bVar.f4112u, c4019uN.f35304g, bVar.f4113v);
    }

    public static G2 d(G2 g22, long j6, ByteBuffer byteBuffer, int i) {
        while (j6 >= g22.f25698u) {
            g22 = (G2) g22.f25700w;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (g22.f25698u - j6));
            C3995u c3995u = (C3995u) g22.f25699v;
            byte[] bArr = c3995u.f35219a;
            long j9 = j6 - g22.f25697n;
            c3995u.getClass();
            byteBuffer.put(bArr, (int) j9, min);
            i -= min;
            j6 += min;
            if (j6 == g22.f25698u) {
                g22 = (G2) g22.f25700w;
            }
        }
        return g22;
    }

    public static G2 e(G2 g22, long j6, byte[] bArr, int i) {
        while (j6 >= g22.f25698u) {
            g22 = (G2) g22.f25700w;
        }
        int i4 = i;
        while (i4 > 0) {
            int min = Math.min(i4, (int) (g22.f25698u - j6));
            C3995u c3995u = (C3995u) g22.f25699v;
            byte[] bArr2 = c3995u.f35219a;
            long j9 = j6 - g22.f25697n;
            c3995u.getClass();
            System.arraycopy(bArr2, (int) j9, bArr, i - i4, min);
            i4 -= min;
            j6 += min;
            if (j6 == g22.f25698u) {
                g22 = (G2) g22.f25700w;
            }
        }
        return g22;
    }

    public final void a(long j6) {
        G2 g22;
        if (j6 != -1) {
            while (true) {
                g22 = this.f26260c;
                if (j6 < g22.f25698u) {
                    break;
                }
                this.f26258a.p((C3995u) g22.f25699v);
                G2 g23 = this.f26260c;
                g23.f25699v = null;
                G2 g24 = (G2) g23.f25700w;
                g23.f25700w = null;
                this.f26260c = g24;
            }
            if (this.f26261d.f25697n < g22.f25697n) {
                this.f26261d = g22;
            }
        }
    }

    public final int b(int i) {
        G2 g22 = this.f26262e;
        if (((C3995u) g22.f25699v) == null) {
            C3995u c9 = this.f26258a.c();
            G2 g23 = new G2(this.f26262e.f25698u);
            g22.f25699v = c9;
            g22.f25700w = g23;
        }
        return Math.min(i, (int) (this.f26262e.f25698u - this.f26263f));
    }
}
