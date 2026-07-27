package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class K0 implements R0 {

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3613nH f25817u;

    /* renamed from: v, reason: collision with root package name */
    public final long f25818v;

    /* renamed from: w, reason: collision with root package name */
    public long f25819w;

    /* renamed from: y, reason: collision with root package name */
    public int f25821y;

    /* renamed from: z, reason: collision with root package name */
    public int f25822z;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f25820x = new byte[com.anythink.basead.exoplayer.b.aX];

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f25816n = new byte[4096];

    static {
        AbstractC4083w2.a("media3.extractor");
    }

    public K0(InterfaceC3613nH interfaceC3613nH, long j6, long j9) {
        this.f25817u = interfaceC3613nH;
        this.f25819w = j6;
        this.f25818v = j9;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean A(byte[] bArr, int i, int i6, boolean z3) {
        if (!c(i6, z3)) {
            return false;
        }
        System.arraycopy(this.f25820x, this.f25821y - i6, bArr, i, i6);
        return true;
    }

    public final boolean a(int i, boolean z3) {
        int min = Math.min(this.f25822z, i);
        e(min);
        int i6 = min;
        while (i6 < i && i6 != -1) {
            i6 = f(this.f25816n, -i6, Math.min(i, i6 + 4096), i6, z3);
        }
        if (i6 != -1) {
            this.f25819w += i6;
        }
        return i6 != -1;
    }

    public final int b(byte[] bArr, int i, int i6) {
        K0 k02;
        int min;
        d(i6);
        int i9 = this.f25822z;
        int i10 = this.f25821y;
        int i11 = i9 - i10;
        if (i11 == 0) {
            k02 = this;
            min = k02.f(this.f25820x, i10, i6, 0, true);
            if (min == -1) {
                return -1;
            }
            k02.f25822z += min;
        } else {
            k02 = this;
            min = Math.min(i6, i11);
        }
        System.arraycopy(k02.f25820x, k02.f25821y, bArr, i, min);
        k02.f25821y += min;
        return min;
    }

    public final boolean c(int i, boolean z3) {
        d(i);
        int i6 = this.f25822z - this.f25821y;
        while (i6 < i) {
            int i9 = i;
            boolean z6 = z3;
            i6 = f(this.f25820x, this.f25821y, i9, i6, z6);
            if (i6 == -1) {
                return false;
            }
            this.f25822z = this.f25821y + i6;
            i = i9;
            z3 = z6;
        }
        this.f25821y += i;
        return true;
    }

    public final void d(int i) {
        int i6 = this.f25821y + i;
        int length = this.f25820x.length;
        if (i6 > length) {
            String str = AbstractC3159eu.f29993a;
            this.f25820x = Arrays.copyOf(this.f25820x, Math.max(com.anythink.basead.exoplayer.b.aX + i6, Math.min(length + length, i6 + 524288)));
        }
    }

    public final void e(int i) {
        int i6 = this.f25822z - i;
        this.f25822z = i6;
        this.f25821y = 0;
        byte[] bArr = this.f25820x;
        byte[] bArr2 = i6 < bArr.length + (-524288) ? new byte[com.anythink.basead.exoplayer.b.aX + i6] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i6);
        this.f25820x = bArr2;
    }

    public final int f(byte[] bArr, int i, int i6, int i9, boolean z3) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int m4 = this.f25817u.m(bArr, i + i9, i6 - i9);
        if (m4 != -1) {
            return i9 + m4;
        }
        if (i9 == 0 && z3) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final void l() {
        this.f25821y = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4050vN
    public final int m(byte[] bArr, int i, int i6) {
        K0 k02;
        int i9 = this.f25822z;
        int i10 = 0;
        if (i9 != 0) {
            int min = Math.min(i9, i6);
            System.arraycopy(this.f25820x, 0, bArr, i, min);
            e(min);
            i10 = min;
        }
        if (i10 == 0) {
            k02 = this;
            i10 = k02.f(bArr, i, i6, 0, true);
        } else {
            k02 = this;
        }
        if (i10 != -1) {
            k02.f25819w += i10;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long p() {
        return this.f25819w;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long q() {
        return this.f25819w + this.f25821y;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long s() {
        return this.f25818v;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final void t(int i) {
        c(i, false);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final void u(byte[] bArr, int i, int i6) {
        z(bArr, i, i6, false);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final void v(int i) {
        a(i, false);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final void y(byte[] bArr, int i, int i6) {
        A(bArr, i, i6, false);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean z(byte[] bArr, int i, int i6, boolean z3) {
        int min;
        int i9 = this.f25822z;
        if (i9 == 0) {
            min = 0;
        } else {
            min = Math.min(i9, i6);
            System.arraycopy(this.f25820x, 0, bArr, i, min);
            e(min);
        }
        int i10 = min;
        while (i10 < i6 && i10 != -1) {
            i10 = f(bArr, i, i6, i10, z3);
        }
        if (i10 != -1) {
            this.f25819w += i10;
        }
        return i10 != -1;
    }
}
