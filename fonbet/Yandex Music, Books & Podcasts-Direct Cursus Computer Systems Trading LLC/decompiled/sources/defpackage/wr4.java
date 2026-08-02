package defpackage;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class wr4 extends yr4 {
    public final byte[] d;
    public final int e;
    public int f;
    public final OutputStream g;

    public wr4(OutputStream outputStream, int i) {
        if (i < 0) {
            xq0.x("bufferSize must be >= 0");
            throw null;
        }
        int max = Math.max(i, 20);
        this.d = new byte[max];
        this.e = max;
        if (outputStream != null) {
            this.g = outputStream;
        } else {
            jj4.j("out");
            throw null;
        }
    }

    @Override // defpackage.yr4
    public final void A(int i) {
        J(5);
        G(i);
    }

    @Override // defpackage.yr4
    public final void B(int i, long j) {
        J(20);
        F(i, 0);
        H(j);
    }

    @Override // defpackage.yr4
    public final void C(long j) {
        J(10);
        H(j);
    }

    public final void D(int i) {
        int i2 = this.f;
        byte[] bArr = this.d;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f = i2 + 4;
    }

    public final void E(long j) {
        int i = this.f;
        byte[] bArr = this.d;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.f = i + 8;
    }

    public final void F(int i, int i2) {
        G((i << 3) | i2);
    }

    public final void G(int i) {
        boolean z = yr4.c;
        byte[] bArr = this.d;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f;
                if (i2 == 0) {
                    this.f = i3 + 1;
                    dmt.k(bArr, (byte) i, i3);
                    return;
                } else {
                    this.f = i3 + 1;
                    dmt.k(bArr, (byte) (i | 128), i3);
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f;
                if (i4 == 0) {
                    this.f = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    public final void H(long j) {
        boolean z = yr4.c;
        byte[] bArr = this.d;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f;
                if (j2 == 0) {
                    this.f = i + 1;
                    dmt.k(bArr, (byte) j, i);
                    return;
                } else {
                    this.f = i + 1;
                    dmt.k(bArr, (byte) (((int) j) | 128), i);
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.f;
                if (j3 == 0) {
                    this.f = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.f = i2 + 1;
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void I() {
        this.g.write(this.d, 0, this.f);
        this.f = 0;
    }

    public final void J(int i) {
        if (this.e - this.f < i) {
            I();
        }
    }

    public final void K(byte[] bArr, int i, int i2) {
        int i3 = this.f;
        int i4 = this.e;
        int i5 = i4 - i3;
        byte[] bArr2 = this.d;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f = i4;
        I();
        if (i7 > i4) {
            this.g.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f = i7;
        }
    }

    @Override // defpackage.yr4
    public final void i(byte b) {
        if (this.f == this.e) {
            I();
        }
        int i = this.f;
        this.d[i] = b;
        this.f = i + 1;
    }

    @Override // defpackage.yr4
    public final void j(int i, boolean z) {
        J(11);
        F(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f;
        this.d[i2] = b;
        this.f = i2 + 1;
    }

    @Override // defpackage.yr4
    public final void k(int i, byte[] bArr) {
        A(i);
        K(bArr, 0, i);
    }

    @Override // defpackage.yr4
    public final void l(int i, nn3 nn3Var) {
        y(i, 2);
        m(nn3Var);
    }

    @Override // defpackage.yr4
    public final void m(nn3 nn3Var) {
        A(nn3Var.size());
        nn3Var.z(this);
    }

    @Override // defpackage.yr4
    public final void n(int i, int i2) {
        J(14);
        F(i, 5);
        D(i2);
    }

    @Override // defpackage.yr4
    public final void o(int i) {
        J(4);
        D(i);
    }

    @Override // defpackage.yr4
    public final void p(int i, long j) {
        J(18);
        F(i, 1);
        E(j);
    }

    @Override // defpackage.yr4
    public final void q(long j) {
        J(8);
        E(j);
    }

    @Override // defpackage.yr4
    public final void s(int i, int i2) {
        J(20);
        F(i, 0);
        if (i2 >= 0) {
            G(i2);
        } else {
            H(i2);
        }
    }

    @Override // defpackage.yr4
    public final void t(int i) {
        if (i >= 0) {
            A(i);
        } else {
            C(i);
        }
    }

    @Override // defpackage.yr4
    public final void u(byte[] bArr, int i, int i2) {
        K(bArr, i, i2);
    }

    @Override // defpackage.yr4
    public final void v(vzh vzhVar) {
        A(vzhVar.getSerializedSize());
        vzhVar.writeTo(this);
    }

    @Override // defpackage.yr4
    public final void w(int i, String str) {
        y(i, 2);
        x(str);
    }

    @Override // defpackage.yr4
    public final void x(String str) {
        try {
            int length = str.length() * 3;
            int f = yr4.f(length);
            int i = f + length;
            int i2 = this.e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int C = nut.a.C(str, bArr, 0, length);
                A(C);
                K(bArr, 0, C);
                return;
            }
            if (i > i2 - this.f) {
                I();
            }
            int f2 = yr4.f(str.length());
            int i3 = this.f;
            byte[] bArr2 = this.d;
            try {
                try {
                    if (f2 == f) {
                        int i4 = i3 + f2;
                        this.f = i4;
                        int C2 = nut.a.C(str, bArr2, i4, i2 - i4);
                        this.f = i3;
                        G((C2 - i3) - f2);
                        this.f = C2;
                    } else {
                        int b = nut.b(str);
                        G(b);
                        this.f = nut.a.C(str, bArr2, this.f, b);
                    }
                } catch (kut e) {
                    this.f = i3;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new ur4(e2);
            }
        } catch (kut e3) {
            h(str, e3);
        }
    }

    @Override // defpackage.yr4
    public final void y(int i, int i2) {
        A((i << 3) | i2);
    }

    @Override // defpackage.yr4
    public final void z(int i, int i2) {
        J(20);
        F(i, 0);
        G(i2);
    }
}
