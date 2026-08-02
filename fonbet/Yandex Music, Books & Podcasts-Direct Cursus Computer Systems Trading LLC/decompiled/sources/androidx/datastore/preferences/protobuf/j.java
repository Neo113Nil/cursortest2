package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.c1;
import androidx.datastore.preferences.protobuf.g;
import defpackage.vm3;
import defpackage.wzh;
import defpackage.xq0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class j extends vm3 {
    public static final Logger b = Logger.getLogger(j.class.getName());
    public static final boolean c = b1.f;
    public k a;

    public static abstract class a extends j {
        public final byte[] d;
        public final int e;
        public int f;

        public a(int i) {
            if (i < 0) {
                xq0.x("bufferSize must be >= 0");
                throw null;
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.d = bArr;
            this.e = bArr.length;
        }

        public final void F(int i) {
            int i2 = this.f;
            int i3 = i2 + 1;
            this.f = i3;
            byte b = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            byte[] bArr = this.d;
            bArr[i2] = b;
            int i4 = i2 + 2;
            this.f = i4;
            bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i2 + 3;
            this.f = i5;
            bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        public final void G(long j) {
            int i = this.f;
            int i2 = i + 1;
            this.f = i2;
            byte[] bArr = this.d;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.f = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.f = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.f = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i7 = i + 6;
            this.f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i8 = i + 7;
            this.f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        }

        public final void H(int i, int i2) {
            I((i << 3) | i2);
        }

        public final void I(int i) {
            boolean z = j.c;
            byte[] bArr = this.d;
            if (z) {
                while (true) {
                    int i2 = i & (-128);
                    int i3 = this.f;
                    if (i2 == 0) {
                        this.f = i3 + 1;
                        b1.j(bArr, (byte) i, i3);
                        return;
                    } else {
                        this.f = i3 + 1;
                        b1.j(bArr, (byte) ((i & 127) | 128), i3);
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
                        bArr[i5] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    }
                }
            }
        }

        public final void J(long j) {
            boolean z = j.c;
            byte[] bArr = this.d;
            if (z) {
                while (true) {
                    long j2 = j & (-128);
                    int i = this.f;
                    if (j2 == 0) {
                        this.f = i + 1;
                        b1.j(bArr, (byte) j, i);
                        return;
                    } else {
                        this.f = i + 1;
                        b1.j(bArr, (byte) ((((int) j) & 127) | 128), i);
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
                        bArr[i2] = (byte) ((((int) j) & 127) | 128);
                        j >>>= 7;
                    }
                }
            }
        }
    }

    public static class b extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public b(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }
    }

    public static final class c extends a {
        public final OutputStream g;

        public c(OutputStream outputStream, int i) {
            super(i);
            this.g = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void A(int i, int i2) {
            C((i << 3) | i2);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void B(int i, int i2) {
            L(20);
            H(i, 0);
            I(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void C(int i) {
            L(5);
            I(i);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void D(int i, long j) {
            L(20);
            H(i, 0);
            J(j);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void E(long j) {
            L(10);
            J(j);
        }

        public final void K() {
            this.g.write(this.d, 0, this.f);
            this.f = 0;
        }

        public final void L(int i) {
            if (this.e - this.f < i) {
                K();
            }
        }

        public final void M(byte[] bArr, int i, int i2) {
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
            K();
            if (i7 > i4) {
                this.g.write(bArr, i6, i7);
            } else {
                System.arraycopy(bArr, i6, bArr2, 0, i7);
                this.f = i7;
            }
        }

        @Override // defpackage.vm3
        public final void a(byte[] bArr, int i, int i2) {
            M(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void l(byte b) {
            if (this.f == this.e) {
                K();
            }
            int i = this.f;
            this.f = i + 1;
            this.d[i] = b;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void m(int i, boolean z) {
            L(11);
            H(i, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            int i2 = this.f;
            this.f = i2 + 1;
            this.d[i2] = b;
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void n(int i, byte[] bArr) {
            C(i);
            M(bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void o(int i, g gVar) {
            A(i, 2);
            p(gVar);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void p(g gVar) {
            C(gVar.size());
            g.e eVar = (g.e) gVar;
            a(eVar.d, eVar.o(), eVar.size());
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void q(int i, int i2) {
            L(14);
            H(i, 5);
            F(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void r(int i) {
            L(4);
            F(i);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void s(int i, long j) {
            L(18);
            H(i, 1);
            G(j);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void t(long j) {
            L(8);
            G(j);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void u(int i, int i2) {
            L(20);
            H(i, 0);
            if (i2 >= 0) {
                I(i2);
            } else {
                J(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void v(int i) {
            if (i >= 0) {
                C(i);
            } else {
                E(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void w(int i, wzh wzhVar, r0 r0Var) {
            A(i, 2);
            C(((androidx.datastore.preferences.protobuf.a) wzhVar).b(r0Var));
            r0Var.h(wzhVar, this.a);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void x(wzh wzhVar) {
            s sVar = (s) wzhVar;
            C(sVar.g());
            sVar.m(this);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void y(int i, String str) {
            A(i, 2);
            z(str);
        }

        @Override // androidx.datastore.preferences.protobuf.j
        public final void z(String str) {
            try {
                int length = str.length() * 3;
                int j = j.j(length);
                int i = j + length;
                int i2 = this.e;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int b = c1.a.b(str, bArr, 0, length);
                    C(b);
                    M(bArr, 0, b);
                    return;
                }
                if (i > i2 - this.f) {
                    K();
                }
                int j2 = j.j(str.length());
                int i3 = this.f;
                byte[] bArr2 = this.d;
                try {
                    if (j2 == j) {
                        int i4 = i3 + j2;
                        this.f = i4;
                        int b2 = c1.a.b(str, bArr2, i4, i2 - i4);
                        this.f = i3;
                        I((b2 - i3) - j2);
                        this.f = b2;
                    } else {
                        int b3 = c1.b(str);
                        I(b3);
                        this.f = c1.a.b(str, bArr2, this.f, b3);
                    }
                } catch (c1.d e) {
                    this.f = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new b(e2);
                }
            } catch (c1.d e3) {
                j.b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
                byte[] bytes = str.getBytes(u.a);
                try {
                    C(bytes.length);
                    a(bytes, 0, bytes.length);
                } catch (b e4) {
                    throw e4;
                } catch (IndexOutOfBoundsException e5) {
                    throw new b(e5);
                }
            }
        }
    }

    public static int b(int i, g gVar) {
        return c(gVar) + i(i);
    }

    public static int c(g gVar) {
        int size = gVar.size();
        return j(size) + size;
    }

    public static int d(int i) {
        return i(i) + 4;
    }

    public static int e(int i) {
        return i(i) + 8;
    }

    public static int f(int i, wzh wzhVar, r0 r0Var) {
        return ((androidx.datastore.preferences.protobuf.a) wzhVar).b(r0Var) + (i(i) * 2);
    }

    public static int g(int i) {
        if (i >= 0) {
            return j(i);
        }
        return 10;
    }

    public static int h(String str) {
        int length;
        try {
            length = c1.b(str);
        } catch (c1.d unused) {
            length = str.getBytes(u.a).length;
        }
        return j(length) + length;
    }

    public static int i(int i) {
        return j(i << 3);
    }

    public static int j(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int k(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public abstract void A(int i, int i2);

    public abstract void B(int i, int i2);

    public abstract void C(int i);

    public abstract void D(int i, long j);

    public abstract void E(long j);

    public abstract void l(byte b2);

    public abstract void m(int i, boolean z);

    public abstract void n(int i, byte[] bArr);

    public abstract void o(int i, g gVar);

    public abstract void p(g gVar);

    public abstract void q(int i, int i2);

    public abstract void r(int i);

    public abstract void s(int i, long j);

    public abstract void t(long j);

    public abstract void u(int i, int i2);

    public abstract void v(int i);

    public abstract void w(int i, wzh wzhVar, r0 r0Var);

    public abstract void x(wzh wzhVar);

    public abstract void y(int i, String str);

    public abstract void z(String str);
}
