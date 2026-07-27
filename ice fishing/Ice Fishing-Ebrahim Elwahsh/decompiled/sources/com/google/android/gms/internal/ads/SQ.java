package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class SQ {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3985u f27566a;

    /* renamed from: b, reason: collision with root package name */
    public final Lr f27567b = new Lr(32);

    /* renamed from: c, reason: collision with root package name */
    public E2 f27568c;

    /* renamed from: d, reason: collision with root package name */
    public E2 f27569d;

    /* renamed from: e, reason: collision with root package name */
    public E2 f27570e;

    /* renamed from: f, reason: collision with root package name */
    public long f27571f;

    public SQ(InterfaceC3985u interfaceC3985u) {
        this.f27566a = interfaceC3985u;
        E2 e22 = new E2(0L);
        this.f27568c = e22;
        this.f27569d = e22;
        this.f27570e = e22;
    }

    public static E2 c(E2 e22, IN in, X1.b bVar, Lr lr) {
        int i;
        if (in.h(1073741824)) {
            long j9 = bVar.f3817u;
            lr.y(1);
            E2 e6 = e(e22, j9, lr.f26233a, 1);
            long j10 = j9 + 1;
            byte b9 = lr.f26233a[0];
            int i4 = b9 & com.anythink.core.common.s.a.c.f16474a;
            int i9 = b9 & Byte.MAX_VALUE;
            FN fn = in.f25551d;
            byte[] bArr = fn.f24951a;
            if (bArr == null) {
                fn.f24951a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z8 = i4 != 0;
            e22 = e(e6, j10, fn.f24951a, i9);
            long j11 = j10 + i9;
            if (z8) {
                lr.y(2);
                e22 = e(e22, j11, lr.f26233a, 2);
                j11 += 2;
                i = lr.L();
            } else {
                i = 1;
            }
            int[] iArr = fn.f24954d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = fn.f24955e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z8) {
                int i10 = i * 6;
                lr.y(i10);
                e22 = e(e22, j11, lr.f26233a, i10);
                j11 += i10;
                lr.E(0);
                for (int i11 = 0; i11 < i; i11++) {
                    iArr[i11] = lr.L();
                    iArr2[i11] = lr.h();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = bVar.f3818v - ((int) (j11 - bVar.f3817u));
            }
            C3394j1 c3394j1 = (C3394j1) bVar.f3819w;
            String str = AbstractC3548lu.f32613a;
            byte[] bArr2 = c3394j1.f32057b;
            byte[] bArr3 = fn.f24951a;
            fn.f24956f = i;
            fn.f24954d = iArr;
            fn.f24955e = iArr2;
            fn.f24952b = bArr2;
            fn.f24951a = bArr3;
            int i12 = c3394j1.f32056a;
            fn.f24953c = i12;
            int i13 = c3394j1.f32058c;
            fn.f24957g = i13;
            int i14 = c3394j1.f32059d;
            fn.f24958h = i14;
            MediaCodec.CryptoInfo cryptoInfo = fn.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i12;
            C4164xG c4164xG = fn.f24959j;
            c4164xG.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) c4164xG.f35133v;
            pattern.set(i13, i14);
            ((MediaCodec.CryptoInfo) c4164xG.f35132u).setPattern(pattern);
            long j12 = bVar.f3817u;
            int i15 = (int) (j11 - j12);
            bVar.f3817u = j12 + i15;
            bVar.f3818v -= i15;
        }
        if (!in.h(268435456)) {
            in.j(bVar.f3818v);
            return d(e22, bVar.f3817u, in.f25552e, bVar.f3818v);
        }
        lr.y(4);
        E2 e9 = e(e22, bVar.f3817u, lr.f26233a, 4);
        int h9 = lr.h();
        bVar.f3817u += 4;
        bVar.f3818v -= 4;
        in.j(h9);
        E2 d2 = d(e9, bVar.f3817u, in.f25552e, h9);
        bVar.f3817u += h9;
        int i16 = bVar.f3818v - h9;
        bVar.f3818v = i16;
        ByteBuffer byteBuffer = in.f25554g;
        if (byteBuffer == null || byteBuffer.capacity() < i16) {
            in.f25554g = ByteBuffer.allocate(i16);
        } else {
            in.f25554g.clear();
        }
        return d(d2, bVar.f3817u, in.f25554g, bVar.f3818v);
    }

    public static E2 d(E2 e22, long j9, ByteBuffer byteBuffer, int i) {
        while (j9 >= e22.f24633u) {
            e22 = (E2) e22.f24635w;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (e22.f24633u - j9));
            C3931t c3931t = (C3931t) e22.f24634v;
            byte[] bArr = c3931t.f34331a;
            long j10 = j9 - e22.f24632n;
            c3931t.getClass();
            byteBuffer.put(bArr, (int) j10, min);
            i -= min;
            j9 += min;
            if (j9 == e22.f24633u) {
                e22 = (E2) e22.f24635w;
            }
        }
        return e22;
    }

    public static E2 e(E2 e22, long j9, byte[] bArr, int i) {
        while (j9 >= e22.f24633u) {
            e22 = (E2) e22.f24635w;
        }
        int i4 = i;
        while (i4 > 0) {
            int min = Math.min(i4, (int) (e22.f24633u - j9));
            C3931t c3931t = (C3931t) e22.f24634v;
            byte[] bArr2 = c3931t.f34331a;
            long j10 = j9 - e22.f24632n;
            c3931t.getClass();
            System.arraycopy(bArr2, (int) j10, bArr, i - i4, min);
            i4 -= min;
            j9 += min;
            if (j9 == e22.f24633u) {
                e22 = (E2) e22.f24635w;
            }
        }
        return e22;
    }

    public final void a(long j9) {
        E2 e22;
        if (j9 != -1) {
            while (true) {
                e22 = this.f27568c;
                if (j9 < e22.f24633u) {
                    break;
                }
                this.f27566a.p((C3931t) e22.f24634v);
                E2 e23 = this.f27568c;
                e23.f24634v = null;
                E2 e24 = (E2) e23.f24635w;
                e23.f24635w = null;
                this.f27568c = e24;
            }
            if (this.f27569d.f24632n < e22.f24632n) {
                this.f27569d = e22;
            }
        }
    }

    public final int b(int i) {
        E2 e22 = this.f27570e;
        if (((C3931t) e22.f24634v) == null) {
            C3931t a9 = this.f27566a.a();
            E2 e23 = new E2(this.f27570e.f24633u);
            e22.f24634v = a9;
            e22.f24635w = e23;
        }
        return Math.min(i, (int) (this.f27570e.f24633u - this.f27571f));
    }
}
