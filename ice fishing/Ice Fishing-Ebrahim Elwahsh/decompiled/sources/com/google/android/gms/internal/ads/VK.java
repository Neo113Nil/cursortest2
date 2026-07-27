package com.google.android.gms.internal.ads;

import java.util.Locale;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class VK extends XK {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f28240d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28241e;

    /* renamed from: f, reason: collision with root package name */
    public int f28242f;

    public VK(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC5051n.c(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f28240d = bArr;
        this.f28242f = 0;
        this.f28241e = i;
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void A(int i) {
        int i4;
        int i9 = this.f28242f;
        while (true) {
            int i10 = i & (-128);
            byte[] bArr = this.f28240d;
            if (i10 == 0) {
                i4 = i9 + 1;
                bArr[i9] = (byte) i;
                this.f28242f = i4;
                return;
            } else {
                i4 = i9 + 1;
                try {
                    bArr[i9] = (byte) (i | 128);
                    i >>>= 7;
                    i9 = i4;
                } catch (IndexOutOfBoundsException e6) {
                    throw new B1.y(i4, this.f28241e, 1, e6);
                }
            }
            throw new B1.y(i4, this.f28241e, 1, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void B(int i) {
        int i4 = this.f28242f;
        try {
            byte[] bArr = this.f28240d;
            bArr[i4] = (byte) i;
            bArr[i4 + 1] = (byte) (i >> 8);
            bArr[i4 + 2] = (byte) (i >> 16);
            bArr[i4 + 3] = (byte) (i >> 24);
            this.f28242f = i4 + 4;
        } catch (IndexOutOfBoundsException e6) {
            throw new B1.y(i4, this.f28241e, 4, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void C(long j9) {
        int i;
        int i4 = this.f28242f;
        byte[] bArr = this.f28240d;
        boolean z8 = XK.f28631c;
        int i9 = this.f28241e;
        if (!z8 || i9 - i4 < 10) {
            long j10 = j9;
            while ((j10 & (-128)) != 0) {
                i = i4 + 1;
                try {
                    bArr[i4] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                    i4 = i;
                } catch (IndexOutOfBoundsException e6) {
                    throw new B1.y(i, i9, 1, e6);
                }
            }
            i = i4 + 1;
            bArr[i4] = (byte) j10;
        } else {
            long j11 = j9;
            while ((j11 & (-128)) != 0) {
                AbstractC3036cM.l(bArr, i4, (byte) (((int) j11) | 128));
                j11 >>>= 7;
                i4++;
            }
            i = i4 + 1;
            AbstractC3036cM.l(bArr, i4, (byte) j11);
        }
        this.f28242f = i;
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void D(long j9) {
        int i = this.f28242f;
        try {
            byte[] bArr = this.f28240d;
            bArr[i] = (byte) j9;
            bArr[i + 1] = (byte) (j9 >> 8);
            bArr[i + 2] = (byte) (j9 >> 16);
            bArr[i + 3] = (byte) (j9 >> 24);
            bArr[i + 4] = (byte) (j9 >> 32);
            bArr[i + 5] = (byte) (j9 >> 40);
            bArr[i + 6] = (byte) (j9 >> 48);
            bArr[i + 7] = (byte) (j9 >> 56);
            this.f28242f = i + 8;
        } catch (IndexOutOfBoundsException e6) {
            throw new B1.y(i, this.f28241e, 8, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void E(String str) {
        int i = this.f28242f;
        try {
            int j9 = XK.j(str.length() * 3);
            int j10 = XK.j(str.length());
            byte[] bArr = this.f28240d;
            if (j10 != j9) {
                A(AbstractC3145eM.b(str));
                int i4 = this.f28242f;
                this.f28242f = AbstractC3145eM.c(bArr, i4, bArr.length - i4, str);
            } else {
                int i9 = i + j10;
                this.f28242f = i9;
                int c4 = AbstractC3145eM.c(bArr, i9, bArr.length - i9, str);
                this.f28242f = i;
                A((c4 - i) - j10);
                this.f28242f = c4;
            }
        } catch (IndexOutOfBoundsException e6) {
            throw new B1.y(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final int F() {
        return this.f28241e - this.f28242f;
    }

    public final void G(byte[] bArr, int i, int i4) {
        try {
            System.arraycopy(bArr, i, this.f28240d, this.f28242f, i4);
            this.f28242f += i4;
        } catch (IndexOutOfBoundsException e6) {
            throw new B1.y(this.f28242f, this.f28241e, i4, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.YD
    public final void a(byte[] bArr, int i, int i4) {
        G(bArr, i, i4);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void m(int i, int i4) {
        A((i << 3) | i4);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void n(int i, int i4) {
        A(i << 3);
        z(i4);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void o(int i, int i4) {
        A(i << 3);
        A(i4);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void p(int i, int i4) {
        A((i << 3) | 5);
        B(i4);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void q(int i, long j9) {
        A(i << 3);
        C(j9);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void r(int i, long j9) {
        A((i << 3) | 1);
        D(j9);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void s(int i, boolean z8) {
        A(i << 3);
        y(z8 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void t(int i, String str) {
        A((i << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void u(int i, SK sk) {
        A((i << 3) | 2);
        v(sk);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void v(SK sk) {
        A(sk.f());
        sk.k(this);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void w(int i, byte[] bArr) {
        A(i);
        G(bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void x(IK ik) {
        A(((AbstractC3199fL) ik).d(null));
        ((AbstractC3199fL) ik).v(this);
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void y(byte b9) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.f28242f;
        try {
            int i4 = i + 1;
            try {
                this.f28240d[i] = b9;
                this.f28242f = i4;
            } catch (IndexOutOfBoundsException e6) {
                indexOutOfBoundsException = e6;
                i = i4;
                throw new B1.y(i, this.f28241e, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e9) {
            indexOutOfBoundsException = e9;
        }
    }

    @Override // com.google.android.gms.internal.ads.XK
    public final void z(int i) {
        if (i >= 0) {
            A(i);
        } else {
            C(i);
        }
    }
}
