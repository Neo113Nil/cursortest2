package com.gamericefishpro.space.q4;

import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.y4;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends d5 {
    public static final Logger h = Logger.getLogger(i.class.getName());
    public static final boolean i = e1.e;
    public c0 c;
    public final byte[] d;
    public final int e;
    public int f;
    public final com.gamericefishpro.space.l4.w0 g;

    public i(com.gamericefishpro.space.l4.w0 w0Var, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i2, 20);
        this.d = new byte[iMax];
        this.e = iMax;
        this.g = w0Var;
    }

    public static int A0(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int B0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int x0(int i2, f fVar) {
        int iZ0 = z0(i2);
        int size = fVar.size();
        return A0(size) + size + iZ0;
    }

    public static int y0(String str) {
        int length;
        try {
            length = h1.a(str);
        } catch (g1 unused) {
            length = str.getBytes(u.a).length;
        }
        return A0(length) + length;
    }

    public static int z0(int i2) {
        return A0(i2 << 3);
    }

    public final void C0() throws IOException {
        this.g.write(this.d, 0, this.f);
        this.f = 0;
    }

    public final void D0(int i2) throws IOException {
        if (this.e - this.f < i2) {
            C0();
        }
    }

    public final void E0(byte b) throws IOException {
        if (this.f == this.e) {
            C0();
        }
        int i2 = this.f;
        this.f = i2 + 1;
        this.d[i2] = b;
    }

    public final void F0(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f;
        int i5 = this.e;
        int i6 = i5 - i4;
        byte[] bArr2 = this.d;
        if (i6 >= i3) {
            System.arraycopy(bArr, i2, bArr2, i4, i3);
            this.f += i3;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i4, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f = i5;
        C0();
        if (i8 > i5) {
            this.g.write(bArr, i7, i8);
        } else {
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            this.f = i8;
        }
    }

    public final void G0(int i2, boolean z) throws IOException {
        D0(11);
        u0(i2, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i3 = this.f;
        this.f = i3 + 1;
        this.d[i3] = b;
    }

    public final void H0(int i2, f fVar) throws IOException {
        S0(i2, 2);
        I0(fVar);
    }

    public final void I0(f fVar) throws IOException {
        U0(fVar.size());
        c0(fVar.e, fVar.h(), fVar.size());
    }

    public final void J0(int i2, int i3) throws IOException {
        D0(14);
        u0(i2, 5);
        s0(i3);
    }

    public final void K0(int i2) throws IOException {
        D0(4);
        s0(i2);
    }

    public final void L0(int i2, long j) throws IOException {
        D0(18);
        u0(i2, 1);
        t0(j);
    }

    public final void M0(long j) throws IOException {
        D0(8);
        t0(j);
    }

    public final void N0(int i2, int i3) throws IOException {
        D0(20);
        u0(i2, 0);
        if (i3 >= 0) {
            v0(i3);
        } else {
            w0(i3);
        }
    }

    public final void O0(int i2) throws IOException {
        if (i2 >= 0) {
            U0(i2);
        } else {
            W0(i2);
        }
    }

    public final void P0(int i2, a aVar, t0 t0Var) throws IOException {
        S0(i2, 2);
        U0(aVar.a(t0Var));
        t0Var.i(aVar, this.c);
    }

    public final void Q0(int i2, String str) throws IOException {
        S0(i2, 2);
        R0(str);
    }

    public final void R0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iA0 = A0(length);
            int i2 = iA0 + length;
            int i3 = this.e;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iN = h1.a.n(str, bArr, 0, length);
                U0(iN);
                F0(bArr, 0, iN);
                return;
            }
            if (i2 > i3 - this.f) {
                C0();
            }
            int iA1 = A0(str.length());
            int i4 = this.f;
            byte[] bArr2 = this.d;
            try {
                try {
                    if (iA1 == iA0) {
                        int i5 = i4 + iA1;
                        this.f = i5;
                        int iN2 = h1.a.n(str, bArr2, i5, i3 - i5);
                        this.f = i4;
                        v0((iN2 - i4) - iA1);
                        this.f = iN2;
                    } else {
                        int iA = h1.a(str);
                        v0(iA);
                        this.f = h1.a.n(str, bArr2, this.f, iA);
                    }
                } catch (g1 e) {
                    this.f = i4;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new y4(e2);
            }
        } catch (g1 e3) {
            h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(u.a);
            try {
                U0(bytes.length);
                c0(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new y4(e4);
            }
        }
    }

    public final void S0(int i2, int i3) {
        U0((i2 << 3) | i3);
    }

    public final void T0(int i2, int i3) throws IOException {
        D0(20);
        u0(i2, 0);
        v0(i3);
    }

    public final void U0(int i2) throws IOException {
        D0(5);
        v0(i2);
    }

    public final void V0(int i2, long j) throws IOException {
        D0(20);
        u0(i2, 0);
        w0(j);
    }

    public final void W0(long j) throws IOException {
        D0(10);
        w0(j);
    }

    @Override // com.gamericefishpro.space.i9.d5
    public final void c0(byte[] bArr, int i2, int i3) throws IOException {
        F0(bArr, i2, i3);
    }

    public final void s0(int i2) {
        int i3 = this.f;
        int i4 = i3 + 1;
        this.f = i4;
        byte[] bArr = this.d;
        bArr[i3] = (byte) (i2 & 255);
        int i5 = i3 + 2;
        this.f = i5;
        bArr[i4] = (byte) ((i2 >> 8) & 255);
        int i6 = i3 + 3;
        this.f = i6;
        bArr[i5] = (byte) ((i2 >> 16) & 255);
        this.f = i3 + 4;
        bArr[i6] = (byte) ((i2 >> 24) & 255);
    }

    public final void t0(long j) {
        int i2 = this.f;
        int i3 = i2 + 1;
        this.f = i3;
        byte[] bArr = this.d;
        bArr[i2] = (byte) (j & 255);
        int i4 = i2 + 2;
        this.f = i4;
        bArr[i3] = (byte) ((j >> 8) & 255);
        int i5 = i2 + 3;
        this.f = i5;
        bArr[i4] = (byte) ((j >> 16) & 255);
        int i6 = i2 + 4;
        this.f = i6;
        bArr[i5] = (byte) (255 & (j >> 24));
        int i7 = i2 + 5;
        this.f = i7;
        bArr[i6] = (byte) (((int) (j >> 32)) & 255);
        int i8 = i2 + 6;
        this.f = i8;
        bArr[i7] = (byte) (((int) (j >> 40)) & 255);
        int i9 = i2 + 7;
        this.f = i9;
        bArr[i8] = (byte) (((int) (j >> 48)) & 255);
        this.f = i2 + 8;
        bArr[i9] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void u0(int i2, int i3) {
        v0((i2 << 3) | i3);
    }

    public final void v0(int i2) {
        boolean z = i;
        byte[] bArr = this.d;
        if (z) {
            while ((i2 & (-128)) != 0) {
                int i3 = this.f;
                this.f = i3 + 1;
                e1.j(bArr, i3, (byte) ((i2 | 128) & 255));
                i2 >>>= 7;
            }
            int i4 = this.f;
            this.f = i4 + 1;
            e1.j(bArr, i4, (byte) i2);
            return;
        }
        while ((i2 & (-128)) != 0) {
            int i5 = this.f;
            this.f = i5 + 1;
            bArr[i5] = (byte) ((i2 | 128) & 255);
            i2 >>>= 7;
        }
        int i6 = this.f;
        this.f = i6 + 1;
        bArr[i6] = (byte) i2;
    }

    public final void w0(long j) {
        boolean z = i;
        byte[] bArr = this.d;
        if (z) {
            while ((j & (-128)) != 0) {
                int i2 = this.f;
                this.f = i2 + 1;
                e1.j(bArr, i2, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i3 = this.f;
            this.f = i3 + 1;
            e1.j(bArr, i3, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i4 = this.f;
            this.f = i4 + 1;
            bArr[i4] = (byte) ((((int) j) | 128) & 255);
            j >>>= 7;
        }
        int i5 = this.f;
        this.f = i5 + 1;
        bArr[i5] = (byte) j;
    }
}
