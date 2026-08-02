package defpackage;

import androidx.glance.appwidget.protobuf.a;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class xr4 {
    public static final Logger f = Logger.getLogger(xr4.class.getName());
    public static final boolean g = emt.e;
    public jzi a;
    public final byte[] b;
    public final int c;
    public int d;
    public final OutputStream e;

    public xr4(OutputStream outputStream, int i) {
        if (i < 0) {
            xq0.x("bufferSize must be >= 0");
            throw null;
        }
        int max = Math.max(i, 20);
        this.b = new byte[max];
        this.c = max;
        this.e = outputStream;
    }

    public static int f(int i, qn3 qn3Var) {
        int h = h(i);
        int size = qn3Var.size();
        return i(size) + size + h;
    }

    public static int g(String str) {
        int length;
        try {
            length = out.a(str);
        } catch (lut unused) {
            length = str.getBytes(vse.a).length;
        }
        return i(length) + length;
    }

    public static int h(int i) {
        return i(i << 3);
    }

    public static int i(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int j(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void A(int i) {
        l(5);
        d(i);
    }

    public final void B(int i, long j) {
        l(20);
        c(i, 0);
        e(j);
    }

    public final void C(long j) {
        l(10);
        e(j);
    }

    public final void a(int i) {
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        byte b = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = this.b;
        bArr[i2] = b;
        int i4 = i2 + 2;
        this.d = i4;
        bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i5 = i2 + 3;
        this.d = i5;
        bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.d = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void b(long j) {
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        byte[] bArr = this.b;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.d = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.d = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.d = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.d = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i7 = i + 6;
        this.d = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i8 = i + 7;
        this.d = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.d = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void c(int i, int i2) {
        d((i << 3) | i2);
    }

    public final void d(int i) {
        boolean z = g;
        byte[] bArr = this.b;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.d;
                if (i2 == 0) {
                    this.d = i3 + 1;
                    emt.j(bArr, (byte) i, i3);
                    return;
                } else {
                    this.d = i3 + 1;
                    emt.j(bArr, (byte) ((i | 128) & KotlinVersion.MAX_COMPONENT_VALUE), i3);
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.d;
                if (i4 == 0) {
                    this.d = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.d = i5 + 1;
                    bArr[i5] = (byte) ((i | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
                    i >>>= 7;
                }
            }
        }
    }

    public final void e(long j) {
        boolean z = g;
        byte[] bArr = this.b;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.d;
                if (j2 == 0) {
                    this.d = i + 1;
                    emt.j(bArr, (byte) j, i);
                    return;
                } else {
                    this.d = i + 1;
                    emt.j(bArr, (byte) ((((int) j) | 128) & KotlinVersion.MAX_COMPONENT_VALUE), i);
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.d;
                if (j3 == 0) {
                    this.d = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.d = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
                    j >>>= 7;
                }
            }
        }
    }

    public final void k() {
        this.e.write(this.b, 0, this.d);
        this.d = 0;
    }

    public final void l(int i) {
        if (this.c - this.d < i) {
            k();
        }
    }

    public final void m(byte[] bArr, int i, int i2) {
        int i3 = this.d;
        int i4 = this.c;
        int i5 = i4 - i3;
        byte[] bArr2 = this.b;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.d = i4;
        k();
        if (i7 > i4) {
            this.e.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.d = i7;
        }
    }

    public final void n(int i, boolean z) {
        l(11);
        c(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.d;
        this.d = i2 + 1;
        this.b[i2] = b;
    }

    public final void o(int i, qn3 qn3Var) {
        y(i, 2);
        A(qn3Var.size());
        ln3 ln3Var = (ln3) qn3Var;
        v(ln3Var.d, ln3Var.q(), ln3Var.size());
    }

    public final void p(int i, int i2) {
        l(14);
        c(i, 5);
        a(i2);
    }

    public final void q(int i) {
        l(4);
        a(i);
    }

    public final void r(int i, long j) {
        l(18);
        c(i, 1);
        b(j);
    }

    public final void s(long j) {
        l(8);
        b(j);
    }

    public final void t(int i, int i2) {
        l(20);
        c(i, 0);
        if (i2 >= 0) {
            d(i2);
        } else {
            e(i2);
        }
    }

    public final void u(int i) {
        if (i >= 0) {
            A(i);
        } else {
            C(i);
        }
    }

    public final void v(byte[] bArr, int i, int i2) {
        m(bArr, i, i2);
    }

    public final void w(int i, a aVar, xto xtoVar) {
        y(i, 2);
        A(aVar.a(xtoVar));
        xtoVar.h(aVar, this.a);
    }

    public final void x(int i, String str) {
        y(i, 2);
        try {
            int length = str.length() * 3;
            int i2 = i(length);
            int i3 = i2 + length;
            int i4 = this.c;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int s = out.a.s(str, bArr, 0, length);
                A(s);
                m(bArr, 0, s);
                return;
            }
            if (i3 > i4 - this.d) {
                k();
            }
            int i5 = i(str.length());
            int i6 = this.d;
            byte[] bArr2 = this.b;
            try {
                if (i5 != i2) {
                    int a = out.a(str);
                    d(a);
                    this.d = out.a.s(str, bArr2, this.d, a);
                    return;
                }
                int i7 = i6 + i5;
                this.d = i7;
                int s2 = out.a.s(str, bArr2, i7, i4 - i7);
                this.d = i6;
                d((s2 - i6) - i5);
                this.d = s2;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new vr4(e);
            } catch (lut e2) {
                this.d = i6;
                throw e2;
            }
        } catch (lut e3) {
            f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(vse.a);
            try {
                A(bytes.length);
                v(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new vr4(e4);
            }
        }
    }

    public final void y(int i, int i2) {
        A((i << 3) | i2);
    }

    public final void z(int i, int i2) {
        l(20);
        c(i, 0);
        d(i2);
    }
}
