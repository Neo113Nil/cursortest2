package com.google.android.gms.internal.consent_sdk;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.consent_sdk.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4344i2 extends E {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f35849g = Logger.getLogger(C4344i2.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f35850h = T2.f35782e;

    /* renamed from: b, reason: collision with root package name */
    public C4399w2 f35851b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f35852c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35853d;

    /* renamed from: e, reason: collision with root package name */
    public int f35854e;

    /* renamed from: f, reason: collision with root package name */
    public final OutputStream f35855f;

    public C4344i2(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i, 20);
        this.f35852c = new byte[max];
        this.f35853d = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f35855f = outputStream;
    }

    public static int h(String str) {
        int length;
        try {
            length = V2.b(str);
        } catch (U2 unused) {
            length = str.getBytes(AbstractC4383s2.f35907a).length;
        }
        return i(length) + length;
    }

    public static int i(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int j(long j9) {
        return (640 - (Long.numberOfLeadingZeros(j9) * 9)) >>> 6;
    }

    public final void A(int i) {
        l(5);
        o(i);
    }

    public final void B(int i, long j9) {
        l(20);
        o(i << 3);
        p(j9);
    }

    public final void C(long j9) {
        l(10);
        p(j9);
    }

    public final void D(int i, byte[] bArr) {
        int i4 = this.f35854e;
        int i9 = this.f35853d;
        int i10 = i9 - i4;
        byte[] bArr2 = this.f35852c;
        if (i10 >= i) {
            System.arraycopy(bArr, 0, bArr2, i4, i);
            this.f35854e += i;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i4, i10);
        this.f35854e = i9;
        k();
        int i11 = i - i10;
        if (i11 > i9) {
            this.f35855f.write(bArr, i10, i11);
        } else {
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            this.f35854e = i11;
        }
    }

    public final void k() {
        this.f35855f.write(this.f35852c, 0, this.f35854e);
        this.f35854e = 0;
    }

    public final void l(int i) {
        if (this.f35853d - this.f35854e < i) {
            k();
        }
    }

    public final void m(int i) {
        int i4 = this.f35854e;
        byte[] bArr = this.f35852c;
        bArr[i4] = (byte) i;
        bArr[i4 + 1] = (byte) (i >> 8);
        bArr[i4 + 2] = (byte) (i >> 16);
        bArr[i4 + 3] = (byte) (i >> 24);
        this.f35854e = i4 + 4;
    }

    public final void n(long j9) {
        int i = this.f35854e;
        byte[] bArr = this.f35852c;
        bArr[i] = (byte) j9;
        bArr[i + 1] = (byte) (j9 >> 8);
        bArr[i + 2] = (byte) (j9 >> 16);
        bArr[i + 3] = (byte) (j9 >> 24);
        bArr[i + 4] = (byte) (j9 >> 32);
        bArr[i + 5] = (byte) (j9 >> 40);
        bArr[i + 6] = (byte) (j9 >> 48);
        bArr[i + 7] = (byte) (j9 >> 56);
        this.f35854e = i + 8;
    }

    public final void o(int i) {
        boolean z8 = f35850h;
        byte[] bArr = this.f35852c;
        if (!z8) {
            while ((i & (-128)) != 0) {
                int i4 = this.f35854e;
                this.f35854e = i4 + 1;
                bArr[i4] = (byte) (i | 128);
                i >>>= 7;
            }
            int i9 = this.f35854e;
            this.f35854e = i9 + 1;
            bArr[i9] = (byte) i;
            return;
        }
        while ((i & (-128)) != 0) {
            int i10 = this.f35854e;
            this.f35854e = i10 + 1;
            T2.f35780c.d(bArr, T2.f35783f + i10, (byte) (i | 128));
            i >>>= 7;
        }
        int i11 = this.f35854e;
        this.f35854e = i11 + 1;
        T2.f35780c.d(bArr, T2.f35783f + i11, (byte) i);
    }

    public final void p(long j9) {
        boolean z8 = f35850h;
        byte[] bArr = this.f35852c;
        if (z8) {
            while (true) {
                int i = (int) j9;
                if ((j9 & (-128)) == 0) {
                    int i4 = this.f35854e;
                    this.f35854e = i4 + 1;
                    T2.f35780c.d(bArr, T2.f35783f + i4, (byte) i);
                    return;
                }
                int i9 = this.f35854e;
                this.f35854e = i9 + 1;
                T2.f35780c.d(bArr, T2.f35783f + i9, (byte) (i | 128));
                j9 >>>= 7;
            }
        } else {
            while (true) {
                int i10 = (int) j9;
                if ((j9 & (-128)) == 0) {
                    int i11 = this.f35854e;
                    this.f35854e = i11 + 1;
                    bArr[i11] = (byte) i10;
                    return;
                } else {
                    int i12 = this.f35854e;
                    this.f35854e = i12 + 1;
                    bArr[i12] = (byte) (i10 | 128);
                    j9 >>>= 7;
                }
            }
        }
    }

    public final void q(C4340h2 c4340h2) {
        A(c4340h2.d());
        D(c4340h2.d(), c4340h2.f35846u);
    }

    public final void r(int i, int i4) {
        l(14);
        o((i << 3) | 5);
        m(i4);
    }

    public final void s(int i) {
        l(4);
        m(i);
    }

    public final void t(int i, long j9) {
        l(18);
        o((i << 3) | 1);
        n(j9);
    }

    public final void u(long j9) {
        l(8);
        n(j9);
    }

    public final void v(int i, int i4) {
        l(20);
        o(i << 3);
        if (i4 >= 0) {
            o(i4);
        } else {
            p(i4);
        }
    }

    public final void w(int i) {
        if (i >= 0) {
            A(i);
        } else {
            C(i);
        }
    }

    public final void x(String str) {
        try {
            int length = str.length() * 3;
            int i = i(length);
            int i4 = i + length;
            int i9 = this.f35853d;
            if (i4 > i9) {
                byte[] bArr = new byte[length];
                int a9 = V2.a(bArr, 0, length, str);
                A(a9);
                D(a9, bArr);
                return;
            }
            if (i4 > i9 - this.f35854e) {
                k();
            }
            int i10 = i(str.length());
            int i11 = this.f35854e;
            byte[] bArr2 = this.f35852c;
            try {
                if (i10 == i) {
                    int i12 = i11 + i10;
                    this.f35854e = i12;
                    int a10 = V2.a(bArr2, i12, i9 - i12, str);
                    this.f35854e = i11;
                    o((a10 - i11) - i10);
                    this.f35854e = a10;
                } else {
                    int b9 = V2.b(str);
                    o(b9);
                    this.f35854e = V2.a(bArr2, this.f35854e, b9, str);
                }
            } catch (U2 e6) {
                this.f35854e = i11;
                throw e6;
            } catch (ArrayIndexOutOfBoundsException e9) {
                throw new B1.y(e9);
            }
        } catch (U2 e10) {
            f35849g.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(AbstractC4383s2.f35907a);
            try {
                int length2 = bytes.length;
                A(length2);
                D(length2, bytes);
            } catch (IndexOutOfBoundsException e11) {
                throw new B1.y(e11);
            }
        }
    }

    public final void y(int i, int i4) {
        A((i << 3) | i4);
    }

    public final void z(int i, int i4) {
        l(20);
        o(i << 3);
        o(i4);
    }
}
