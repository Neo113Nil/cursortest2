package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class K0 implements R0 {

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3636nH f26569u;

    /* renamed from: v, reason: collision with root package name */
    public final long f26570v;

    /* renamed from: w, reason: collision with root package name */
    public long f26571w;

    /* renamed from: y, reason: collision with root package name */
    public int f26573y;

    /* renamed from: z, reason: collision with root package name */
    public int f26574z;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f26572x = new byte[com.anythink.basead.exoplayer.b.aX];

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f26568n = new byte[4096];

    static {
        AbstractC4106w2.a("media3.extractor");
    }

    public K0(InterfaceC3636nH interfaceC3636nH, long j6, long j9) {
        this.f26569u = interfaceC3636nH;
        this.f26571w = j6;
        this.f26570v = j9;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean A(byte[] bArr, int i, int i4, boolean z6) {
        int min;
        int i6 = this.f26574z;
        if (i6 == 0) {
            min = 0;
        } else {
            min = Math.min(i6, i4);
            System.arraycopy(this.f26572x, 0, bArr, i, min);
            f(min);
        }
        int i9 = min;
        while (i9 < i4 && i9 != -1) {
            i9 = g(bArr, i, i4, i9, z6);
        }
        if (i9 != -1) {
            this.f26571w += i9;
        }
        return i9 != -1;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean E(byte[] bArr, int i, int i4, boolean z6) {
        if (!d(i4, z6)) {
            return false;
        }
        System.arraycopy(this.f26572x, this.f26573y - i4, bArr, i, i4);
        return true;
    }

    public final boolean a(int i, boolean z6) {
        int min = Math.min(this.f26574z, i);
        f(min);
        int i4 = min;
        while (i4 < i && i4 != -1) {
            i4 = g(this.f26568n, -i4, Math.min(i, i4 + 4096), i4, z6);
        }
        if (i4 != -1) {
            this.f26571w += i4;
        }
        return i4 != -1;
    }

    public final int c(byte[] bArr, int i, int i4) {
        K0 k02;
        int min;
        e(i4);
        int i6 = this.f26574z;
        int i9 = this.f26573y;
        int i10 = i6 - i9;
        if (i10 == 0) {
            k02 = this;
            min = k02.g(this.f26572x, i9, i4, 0, true);
            if (min == -1) {
                return -1;
            }
            k02.f26574z += min;
        } else {
            k02 = this;
            min = Math.min(i4, i10);
        }
        System.arraycopy(k02.f26572x, k02.f26573y, bArr, i, min);
        k02.f26573y += min;
        return min;
    }

    public final boolean d(int i, boolean z6) {
        e(i);
        int i4 = this.f26574z - this.f26573y;
        while (i4 < i) {
            int i6 = i;
            boolean z9 = z6;
            i4 = g(this.f26572x, this.f26573y, i6, i4, z9);
            if (i4 == -1) {
                return false;
            }
            this.f26574z = this.f26573y + i4;
            i = i6;
            z6 = z9;
        }
        this.f26573y += i;
        return true;
    }

    public final void e(int i) {
        int i4 = this.f26573y + i;
        int length = this.f26572x.length;
        if (i4 > length) {
            String str = AbstractC3182eu.f30782a;
            this.f26572x = Arrays.copyOf(this.f26572x, Math.max(com.anythink.basead.exoplayer.b.aX + i4, Math.min(length + length, i4 + 524288)));
        }
    }

    public final void f(int i) {
        int i4 = this.f26574z - i;
        this.f26574z = i4;
        this.f26573y = 0;
        byte[] bArr = this.f26572x;
        byte[] bArr2 = i4 < bArr.length + (-524288) ? new byte[com.anythink.basead.exoplayer.b.aX + i4] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i4);
        this.f26572x = bArr2;
    }

    public final int g(byte[] bArr, int i, int i4, int i6, boolean z6) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int r9 = this.f26569u.r(bArr, i + i6, i4 - i6);
        if (r9 != -1) {
            return i6 + r9;
        }
        if (i6 == 0 && z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final void l() {
        this.f26573y = 0;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long p() {
        return this.f26571w;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long q() {
        return this.f26571w + this.f26573y;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4073vN
    public final int r(byte[] bArr, int i, int i4) {
        K0 k02;
        int i6 = this.f26574z;
        int i9 = 0;
        if (i6 != 0) {
            int min = Math.min(i6, i4);
            System.arraycopy(this.f26572x, 0, bArr, i, min);
            f(min);
            i9 = min;
        }
        if (i9 == 0) {
            k02 = this;
            i9 = k02.g(bArr, i, i4, 0, true);
        } else {
            k02 = this;
        }
        if (i9 != -1) {
            k02.f26571w += i9;
        }
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long s() {
        return this.f26570v;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final void t(int i) {
        d(i, false);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final void u(byte[] bArr, int i, int i4) {
        A(bArr, i, i4, false);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final void v(int i) {
        a(i, false);
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final void x(byte[] bArr, int i, int i4) {
        E(bArr, i, i4, false);
    }
}
