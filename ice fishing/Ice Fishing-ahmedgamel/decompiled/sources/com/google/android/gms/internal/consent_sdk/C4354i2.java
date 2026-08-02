package com.google.android.gms.internal.consent_sdk;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.consent_sdk.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4354i2 extends E {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f36455g = Logger.getLogger(C4354i2.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f36456h = T2.f36388e;

    /* renamed from: b, reason: collision with root package name */
    public C4409w2 f36457b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f36458c;

    /* renamed from: d, reason: collision with root package name */
    public final int f36459d;

    /* renamed from: e, reason: collision with root package name */
    public int f36460e;

    /* renamed from: f, reason: collision with root package name */
    public final OutputStream f36461f;

    public C4354i2(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i, 20);
        this.f36458c = new byte[max];
        this.f36459d = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f36461f = outputStream;
    }

    public static int h(String str) {
        int length;
        try {
            length = V2.b(str);
        } catch (U2 unused) {
            length = str.getBytes(AbstractC4393s2.f36513a).length;
        }
        return i(length) + length;
    }

    public static int i(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int j(long j6) {
        return (640 - (Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    public final void A(int i) {
        l(5);
        o(i);
    }

    public final void B(int i, long j6) {
        l(20);
        o(i << 3);
        p(j6);
    }

    public final void C(long j6) {
        l(10);
        p(j6);
    }

    public final void D(int i, byte[] bArr) {
        int i4 = this.f36460e;
        int i6 = this.f36459d;
        int i9 = i6 - i4;
        byte[] bArr2 = this.f36458c;
        if (i9 >= i) {
            System.arraycopy(bArr, 0, bArr2, i4, i);
            this.f36460e += i;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i4, i9);
        this.f36460e = i6;
        k();
        int i10 = i - i9;
        if (i10 > i6) {
            this.f36461f.write(bArr, i9, i10);
        } else {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.f36460e = i10;
        }
    }

    public final void k() {
        this.f36461f.write(this.f36458c, 0, this.f36460e);
        this.f36460e = 0;
    }

    public final void l(int i) {
        if (this.f36459d - this.f36460e < i) {
            k();
        }
    }

    public final void m(int i) {
        int i4 = this.f36460e;
        byte[] bArr = this.f36458c;
        bArr[i4] = (byte) i;
        bArr[i4 + 1] = (byte) (i >> 8);
        bArr[i4 + 2] = (byte) (i >> 16);
        bArr[i4 + 3] = (byte) (i >> 24);
        this.f36460e = i4 + 4;
    }

    public final void n(long j6) {
        int i = this.f36460e;
        byte[] bArr = this.f36458c;
        bArr[i] = (byte) j6;
        bArr[i + 1] = (byte) (j6 >> 8);
        bArr[i + 2] = (byte) (j6 >> 16);
        bArr[i + 3] = (byte) (j6 >> 24);
        bArr[i + 4] = (byte) (j6 >> 32);
        bArr[i + 5] = (byte) (j6 >> 40);
        bArr[i + 6] = (byte) (j6 >> 48);
        bArr[i + 7] = (byte) (j6 >> 56);
        this.f36460e = i + 8;
    }

    public final void o(int i) {
        boolean z6 = f36456h;
        byte[] bArr = this.f36458c;
        if (!z6) {
            while ((i & (-128)) != 0) {
                int i4 = this.f36460e;
                this.f36460e = i4 + 1;
                bArr[i4] = (byte) (i | 128);
                i >>>= 7;
            }
            int i6 = this.f36460e;
            this.f36460e = i6 + 1;
            bArr[i6] = (byte) i;
            return;
        }
        while ((i & (-128)) != 0) {
            int i9 = this.f36460e;
            this.f36460e = i9 + 1;
            T2.f36386c.d(bArr, T2.f36389f + i9, (byte) (i | 128));
            i >>>= 7;
        }
        int i10 = this.f36460e;
        this.f36460e = i10 + 1;
        T2.f36386c.d(bArr, T2.f36389f + i10, (byte) i);
    }

    public final void p(long j6) {
        boolean z6 = f36456h;
        byte[] bArr = this.f36458c;
        if (z6) {
            while (true) {
                int i = (int) j6;
                if ((j6 & (-128)) == 0) {
                    int i4 = this.f36460e;
                    this.f36460e = i4 + 1;
                    T2.f36386c.d(bArr, T2.f36389f + i4, (byte) i);
                    return;
                }
                int i6 = this.f36460e;
                this.f36460e = i6 + 1;
                T2.f36386c.d(bArr, T2.f36389f + i6, (byte) (i | 128));
                j6 >>>= 7;
            }
        } else {
            while (true) {
                int i9 = (int) j6;
                if ((j6 & (-128)) == 0) {
                    int i10 = this.f36460e;
                    this.f36460e = i10 + 1;
                    bArr[i10] = (byte) i9;
                    return;
                } else {
                    int i11 = this.f36460e;
                    this.f36460e = i11 + 1;
                    bArr[i11] = (byte) (i9 | 128);
                    j6 >>>= 7;
                }
            }
        }
    }

    public final void q(C4350h2 c4350h2) {
        A(c4350h2.d());
        D(c4350h2.d(), c4350h2.f36452u);
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

    public final void t(int i, long j6) {
        l(18);
        o((i << 3) | 1);
        n(j6);
    }

    public final void u(long j6) {
        l(8);
        n(j6);
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
            int i6 = this.f36459d;
            if (i4 > i6) {
                byte[] bArr = new byte[length];
                int a9 = V2.a(bArr, 0, length, str);
                A(a9);
                D(a9, bArr);
                return;
            }
            if (i4 > i6 - this.f36460e) {
                k();
            }
            int i9 = i(str.length());
            int i10 = this.f36460e;
            byte[] bArr2 = this.f36458c;
            try {
                if (i9 == i) {
                    int i11 = i10 + i9;
                    this.f36460e = i11;
                    int a10 = V2.a(bArr2, i11, i6 - i11, str);
                    this.f36460e = i10;
                    o((a10 - i10) - i9);
                    this.f36460e = a10;
                } else {
                    int b9 = V2.b(str);
                    o(b9);
                    this.f36460e = V2.a(bArr2, this.f36460e, b9, str);
                }
            } catch (U2 e9) {
                this.f36460e = i10;
                throw e9;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new D1.y(e10);
            }
        } catch (U2 e11) {
            f36455g.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(AbstractC4393s2.f36513a);
            try {
                int length2 = bytes.length;
                A(length2);
                D(length2, bytes);
            } catch (IndexOutOfBoundsException e12) {
                throw new D1.y(e12);
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
