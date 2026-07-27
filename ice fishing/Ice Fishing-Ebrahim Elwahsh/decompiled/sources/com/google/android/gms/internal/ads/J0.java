package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class J0 implements P0 {

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3572mH f25673u;

    /* renamed from: v, reason: collision with root package name */
    public final long f25674v;

    /* renamed from: w, reason: collision with root package name */
    public long f25675w;

    /* renamed from: y, reason: collision with root package name */
    public int f25677y;

    /* renamed from: z, reason: collision with root package name */
    public int f25678z;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f25676x = new byte[com.anythink.basead.exoplayer.b.aX];

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f25672n = new byte[4096];

    static {
        A2.a("media3.extractor");
    }

    public J0(InterfaceC3572mH interfaceC3572mH, long j9, long j10) {
        this.f25673u = interfaceC3572mH;
        this.f25675w = j9;
        this.f25674v = j10;
    }

    @Override // com.google.android.gms.internal.ads.P0
    public final void B(byte[] bArr, int i, int i4) {
        I(bArr, i, i4, false);
    }

    @Override // com.google.android.gms.internal.ads.P0
    public final boolean E(byte[] bArr, int i, int i4, boolean z8) {
        int min;
        int i9 = this.f25678z;
        if (i9 == 0) {
            min = 0;
        } else {
            min = Math.min(i9, i4);
            System.arraycopy(this.f25676x, 0, bArr, i, min);
            f(min);
        }
        int i10 = min;
        while (i10 < i4 && i10 != -1) {
            i10 = g(bArr, i, i4, i10, z8);
        }
        if (i10 != -1) {
            this.f25675w += i10;
        }
        return i10 != -1;
    }

    @Override // com.google.android.gms.internal.ads.P0
    public final boolean I(byte[] bArr, int i, int i4, boolean z8) {
        if (!d(i4, z8)) {
            return false;
        }
        System.arraycopy(this.f25676x, this.f25677y - i4, bArr, i, i4);
        return true;
    }

    public final boolean b(int i, boolean z8) {
        int min = Math.min(this.f25678z, i);
        f(min);
        int i4 = min;
        while (i4 < i && i4 != -1) {
            i4 = g(this.f25672n, -i4, Math.min(i, i4 + 4096), i4, z8);
        }
        if (i4 != -1) {
            this.f25675w += i4;
        }
        return i4 != -1;
    }

    public final int c(byte[] bArr, int i, int i4) {
        J0 j02;
        int min;
        e(i4);
        int i9 = this.f25678z;
        int i10 = this.f25677y;
        int i11 = i9 - i10;
        if (i11 == 0) {
            j02 = this;
            min = j02.g(this.f25676x, i10, i4, 0, true);
            if (min == -1) {
                return -1;
            }
            j02.f25678z += min;
        } else {
            j02 = this;
            min = Math.min(i4, i11);
        }
        System.arraycopy(j02.f25676x, j02.f25677y, bArr, i, min);
        j02.f25677y += min;
        return min;
    }

    public final boolean d(int i, boolean z8) {
        e(i);
        int i4 = this.f25678z - this.f25677y;
        while (i4 < i) {
            int i9 = i;
            boolean z9 = z8;
            i4 = g(this.f25676x, this.f25677y, i9, i4, z9);
            if (i4 == -1) {
                return false;
            }
            this.f25678z = this.f25677y + i4;
            i = i9;
            z8 = z9;
        }
        this.f25677y += i;
        return true;
    }

    public final void e(int i) {
        int i4 = this.f25677y + i;
        int length = this.f25676x.length;
        if (i4 > length) {
            String str = AbstractC3548lu.f32613a;
            this.f25676x = Arrays.copyOf(this.f25676x, Math.max(com.anythink.basead.exoplayer.b.aX + i4, Math.min(length + length, i4 + 524288)));
        }
    }

    public final void f(int i) {
        int i4 = this.f25678z - i;
        this.f25678z = i4;
        this.f25677y = 0;
        byte[] bArr = this.f25676x;
        byte[] bArr2 = i4 < bArr.length + (-524288) ? new byte[com.anythink.basead.exoplayer.b.aX + i4] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i4);
        this.f25676x = bArr2;
    }

    public final int g(byte[] bArr, int i, int i4, int i9, boolean z8) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int z9 = this.f25673u.z(bArr, i + i9, i4 - i9);
        if (z9 != -1) {
            return i9 + z9;
        }
        if (i9 == 0 && z8) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.P0
    public final void k() {
        this.f25677y = 0;
    }

    @Override // com.google.android.gms.internal.ads.P0
    public final long m() {
        return this.f25675w + this.f25677y;
    }

    @Override // com.google.android.gms.internal.ads.P0
    public final long p() {
        return this.f25675w;
    }

    @Override // com.google.android.gms.internal.ads.P0
    public final long q() {
        return this.f25674v;
    }

    @Override // com.google.android.gms.internal.ads.P0
    public final void s(int i) {
        b(i, false);
    }

    @Override // com.google.android.gms.internal.ads.P0
    public final void u(int i) {
        d(i, false);
    }

    @Override // com.google.android.gms.internal.ads.P0
    public final void y(byte[] bArr, int i, int i4) {
        E(bArr, i, i4, false);
    }

    @Override // com.google.android.gms.internal.ads.JN
    public final int z(byte[] bArr, int i, int i4) {
        J0 j02;
        int i9 = this.f25678z;
        int i10 = 0;
        if (i9 != 0) {
            int min = Math.min(i9, i4);
            System.arraycopy(this.f25676x, 0, bArr, i, min);
            f(min);
            i10 = min;
        }
        if (i10 == 0) {
            j02 = this;
            i10 = j02.g(bArr, i, i4, 0, true);
        } else {
            j02 = this;
        }
        if (i10 != -1) {
            j02.f25675w += i10;
        }
        return i10;
    }
}
