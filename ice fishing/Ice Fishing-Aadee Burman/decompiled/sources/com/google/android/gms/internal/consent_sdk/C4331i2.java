package com.google.android.gms.internal.consent_sdk;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.consent_sdk.i2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4331i2 extends E {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f35686g = Logger.getLogger(C4331i2.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f35687h = T2.f35619e;

    /* renamed from: b, reason: collision with root package name */
    public C4386w2 f35688b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f35689c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35690d;

    /* renamed from: e, reason: collision with root package name */
    public int f35691e;

    /* renamed from: f, reason: collision with root package name */
    public final OutputStream f35692f;

    public C4331i2(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i, 20);
        this.f35689c = new byte[max];
        this.f35690d = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f35692f = outputStream;
    }

    public static int h(String str) {
        int length;
        try {
            length = V2.b(str);
        } catch (U2 unused) {
            length = str.getBytes(AbstractC4370s2.f35744a).length;
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
        int i6 = this.f35691e;
        int i9 = this.f35690d;
        int i10 = i9 - i6;
        byte[] bArr2 = this.f35689c;
        if (i10 >= i) {
            System.arraycopy(bArr, 0, bArr2, i6, i);
            this.f35691e += i;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i6, i10);
        this.f35691e = i9;
        k();
        int i11 = i - i10;
        if (i11 > i9) {
            this.f35692f.write(bArr, i10, i11);
        } else {
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            this.f35691e = i11;
        }
    }

    public final void k() {
        this.f35692f.write(this.f35689c, 0, this.f35691e);
        this.f35691e = 0;
    }

    public final void l(int i) {
        if (this.f35690d - this.f35691e < i) {
            k();
        }
    }

    public final void m(int i) {
        int i6 = this.f35691e;
        byte[] bArr = this.f35689c;
        bArr[i6] = (byte) i;
        bArr[i6 + 1] = (byte) (i >> 8);
        bArr[i6 + 2] = (byte) (i >> 16);
        bArr[i6 + 3] = (byte) (i >> 24);
        this.f35691e = i6 + 4;
    }

    public final void n(long j6) {
        int i = this.f35691e;
        byte[] bArr = this.f35689c;
        bArr[i] = (byte) j6;
        bArr[i + 1] = (byte) (j6 >> 8);
        bArr[i + 2] = (byte) (j6 >> 16);
        bArr[i + 3] = (byte) (j6 >> 24);
        bArr[i + 4] = (byte) (j6 >> 32);
        bArr[i + 5] = (byte) (j6 >> 40);
        bArr[i + 6] = (byte) (j6 >> 48);
        bArr[i + 7] = (byte) (j6 >> 56);
        this.f35691e = i + 8;
    }

    public final void o(int i) {
        boolean z3 = f35687h;
        byte[] bArr = this.f35689c;
        if (!z3) {
            while ((i & (-128)) != 0) {
                int i6 = this.f35691e;
                this.f35691e = i6 + 1;
                bArr[i6] = (byte) (i | 128);
                i >>>= 7;
            }
            int i9 = this.f35691e;
            this.f35691e = i9 + 1;
            bArr[i9] = (byte) i;
            return;
        }
        while ((i & (-128)) != 0) {
            int i10 = this.f35691e;
            this.f35691e = i10 + 1;
            T2.f35617c.d(bArr, T2.f35620f + i10, (byte) (i | 128));
            i >>>= 7;
        }
        int i11 = this.f35691e;
        this.f35691e = i11 + 1;
        T2.f35617c.d(bArr, T2.f35620f + i11, (byte) i);
    }

    public final void p(long j6) {
        boolean z3 = f35687h;
        byte[] bArr = this.f35689c;
        if (z3) {
            while (true) {
                int i = (int) j6;
                if ((j6 & (-128)) == 0) {
                    int i6 = this.f35691e;
                    this.f35691e = i6 + 1;
                    T2.f35617c.d(bArr, T2.f35620f + i6, (byte) i);
                    return;
                }
                int i9 = this.f35691e;
                this.f35691e = i9 + 1;
                T2.f35617c.d(bArr, T2.f35620f + i9, (byte) (i | 128));
                j6 >>>= 7;
            }
        } else {
            while (true) {
                int i10 = (int) j6;
                if ((j6 & (-128)) == 0) {
                    int i11 = this.f35691e;
                    this.f35691e = i11 + 1;
                    bArr[i11] = (byte) i10;
                    return;
                } else {
                    int i12 = this.f35691e;
                    this.f35691e = i12 + 1;
                    bArr[i12] = (byte) (i10 | 128);
                    j6 >>>= 7;
                }
            }
        }
    }

    public final void q(C4327h2 c4327h2) {
        A(c4327h2.d());
        D(c4327h2.d(), c4327h2.f35683u);
    }

    public final void r(int i, int i6) {
        l(14);
        o((i << 3) | 5);
        m(i6);
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

    public final void v(int i, int i6) {
        l(20);
        o(i << 3);
        if (i6 >= 0) {
            o(i6);
        } else {
            p(i6);
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
            int i6 = i + length;
            int i9 = this.f35690d;
            if (i6 > i9) {
                byte[] bArr = new byte[length];
                int a9 = V2.a(bArr, 0, length, str);
                A(a9);
                D(a9, bArr);
                return;
            }
            if (i6 > i9 - this.f35691e) {
                k();
            }
            int i10 = i(str.length());
            int i11 = this.f35691e;
            byte[] bArr2 = this.f35689c;
            try {
                if (i10 == i) {
                    int i12 = i11 + i10;
                    this.f35691e = i12;
                    int a10 = V2.a(bArr2, i12, i9 - i12, str);
                    this.f35691e = i11;
                    o((a10 - i11) - i10);
                    this.f35691e = a10;
                } else {
                    int b9 = V2.b(str);
                    o(b9);
                    this.f35691e = V2.a(bArr2, this.f35691e, b9, str);
                }
            } catch (U2 e9) {
                this.f35691e = i11;
                throw e9;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new B1.z(e10);
            }
        } catch (U2 e11) {
            f35686g.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(AbstractC4370s2.f35744a);
            try {
                int length2 = bytes.length;
                A(length2);
                D(length2, bytes);
            } catch (IndexOutOfBoundsException e12) {
                throw new B1.z(e12);
            }
        }
    }

    public final void y(int i, int i6) {
        A((i << 3) | i6);
    }

    public final void z(int i, int i6) {
        l(20);
        o(i << 3);
        o(i6);
    }
}
