package defpackage;

import androidx.core.app.q;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class sr4 extends yr4 {
    public final byte[] d;
    public final int e;
    public int f;

    public sr4(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            jj4.j("buffer");
            throw null;
        }
        int i3 = i + i2;
        if ((i | i2 | (bArr.length - i3)) < 0) {
            Locale locale = Locale.US;
            q.j(i2, dfi.l("Array range is invalid. Buffer.length=", bArr.length, i, ", offset=", ", length="));
            throw null;
        }
        this.d = bArr;
        this.f = i;
        this.e = i3;
    }

    @Override // defpackage.yr4
    public final void A(int i) {
        int i2;
        int i3 = this.f;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.d;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new ur4(i2, this.e, 1, e);
                }
            }
            throw new ur4(i2, this.e, 1, e);
        }
    }

    @Override // defpackage.yr4
    public final void B(int i, long j) {
        y(i, 0);
        C(j);
    }

    @Override // defpackage.yr4
    public final void C(long j) {
        int i;
        int i2 = this.f;
        boolean z = yr4.c;
        byte[] bArr = this.d;
        if (!z || D() < 10) {
            while ((j & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new ur4(i, this.e, 1, e);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while ((j & (-128)) != 0) {
                dmt.k(bArr, (byte) (((int) j) | 128), i2);
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            dmt.k(bArr, (byte) j, i2);
        }
        this.f = i;
    }

    public final int D() {
        return this.e - this.f;
    }

    public final void E(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.d, this.f, i2);
            this.f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new ur4(this.f, this.e, i2, e);
        }
    }

    @Override // defpackage.yr4
    public final void i(byte b) {
        int i = this.f;
        try {
            int i2 = i + 1;
            try {
                this.d[i] = b;
                this.f = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new ur4(i, this.e, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // defpackage.yr4
    public final void j(int i, boolean z) {
        y(i, 0);
        i(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.yr4
    public final void k(int i, byte[] bArr) {
        A(i);
        E(bArr, 0, i);
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
        y(i, 5);
        o(i2);
    }

    @Override // defpackage.yr4
    public final void o(int i) {
        int i2 = this.f;
        try {
            byte[] bArr = this.d;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new ur4(i2, this.e, 4, e);
        }
    }

    @Override // defpackage.yr4
    public final void p(int i, long j) {
        y(i, 1);
        q(j);
    }

    @Override // defpackage.yr4
    public final void q(long j) {
        int i = this.f;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new ur4(i, this.e, 8, e);
        }
    }

    @Override // defpackage.yr4
    public final void s(int i, int i2) {
        y(i, 0);
        t(i2);
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
        E(bArr, i, i2);
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
        int i = this.f;
        try {
            int f = yr4.f(str.length() * 3);
            int f2 = yr4.f(str.length());
            byte[] bArr = this.d;
            if (f2 != f) {
                A(nut.b(str));
                this.f = nut.a.C(str, bArr, this.f, D());
                return;
            }
            int i2 = i + f2;
            this.f = i2;
            int C = nut.a.C(str, bArr, i2, D());
            this.f = i;
            A((C - i) - f2);
            this.f = C;
        } catch (IndexOutOfBoundsException e) {
            throw new ur4(e);
        } catch (kut e2) {
            this.f = i;
            h(str, e2);
        }
    }

    @Override // defpackage.yr4
    public final void y(int i, int i2) {
        A((i << 3) | i2);
    }

    @Override // defpackage.yr4
    public final void z(int i, int i2) {
        y(i, 0);
        A(i2);
    }
}
