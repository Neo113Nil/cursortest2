package com.gamericefishpro.space.i9;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x4 extends com.gamericefishpro.space.u6.f {
    public static final Logger k = Logger.getLogger(x4.class.getName());
    public static final boolean l = t6.e;
    public v5 g;
    public final byte[] h;
    public final int i;
    public int j;

    public x4(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.h = bArr;
            this.j = 0;
            this.i = i;
        } else {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("Array range is invalid. Buffer.length=" + length + ", offset=0, length=" + i);
        }
    }

    public static int P(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int Q(String str) {
        int length;
        try {
            length = v6.b(str);
        } catch (u6 unused) {
            length = str.getBytes(n5.a).length;
        }
        return g0(length) + length;
    }

    public static int g0(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void R(int i, int i2) throws y4 {
        a0((i << 3) | i2);
    }

    public final void S(int i, int i2) throws y4 {
        a0(i << 3);
        Z(i2);
    }

    public final void T(int i, int i2) throws y4 {
        a0(i << 3);
        a0(i2);
    }

    public final void U(int i, int i2) throws y4 {
        a0((i << 3) | 5);
        b0(i2);
    }

    public final void V(int i, long j) throws y4 {
        a0(i << 3);
        c0(j);
    }

    public final void W(int i, long j) throws y4 {
        a0((i << 3) | 1);
        d0(j);
    }

    public final void X(w4 w4Var) throws y4 {
        a0(w4Var.d());
        e0(w4Var.d(), w4Var.e);
    }

    public final void Y(byte b) throws y4 {
        int i = this.j;
        try {
            int i2 = i + 1;
            try {
                this.h[i] = b;
                this.j = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new y4(i, this.i, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    public final void Z(int i) throws y4 {
        if (i >= 0) {
            a0(i);
        } else {
            c0(i);
        }
    }

    public final void a0(int i) throws y4 {
        int i2;
        int i3 = this.j;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.h;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.j = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new y4(i2, this.i, 1, e);
                }
            }
            throw new y4(i2, this.i, 1, e);
        }
    }

    public final void b0(int i) throws y4 {
        int i2 = this.j;
        try {
            byte[] bArr = this.h;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.j = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new y4(i2, this.i, 4, e);
        }
    }

    public final void c0(long j) throws y4 {
        int i;
        int i2 = this.j;
        int i3 = this.i;
        byte[] bArr = this.h;
        if (!l || i3 - i2 < 10) {
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new y4(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new y4(i, i3, 1, e);
            }
        } else {
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                t6.c.a(bArr, t6.f + ((long) i2), (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            t6.c.a(bArr, t6.f + ((long) i2), (byte) j3);
        }
        this.j = i;
    }

    public final void d0(long j) throws y4 {
        int i = this.j;
        try {
            byte[] bArr = this.h;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.j = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new y4(i, this.i, 8, e);
        }
    }

    public final void e0(int i, byte[] bArr) throws y4 {
        try {
            System.arraycopy(bArr, 0, this.h, this.j, i);
            this.j += i;
        } catch (IndexOutOfBoundsException e) {
            throw new y4(this.j, this.i, i, e);
        }
    }

    public final void f0(String str) throws y4 {
        int i = this.j;
        try {
            int iG0 = g0(str.length() * 3);
            int iG1 = g0(str.length());
            int i2 = this.i;
            byte[] bArr = this.h;
            if (iG1 != iG0) {
                a0(v6.b(str));
                int i3 = this.j;
                this.j = v6.c(str, bArr, i3, i2 - i3);
            } else {
                int i4 = i + iG1;
                this.j = i4;
                int iC = v6.c(str, bArr, i4, i2 - i4);
                this.j = i;
                a0((iC - i) - iG1);
                this.j = iC;
            }
        } catch (u6 e) {
            this.j = i;
            k.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(n5.a);
            try {
                int length = bytes.length;
                a0(length);
                e0(length, bytes);
            } catch (IndexOutOfBoundsException e2) {
                throw new y4(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new y4(e3);
        }
    }
}
