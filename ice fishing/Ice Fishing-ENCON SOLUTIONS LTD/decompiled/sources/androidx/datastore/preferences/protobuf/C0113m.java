package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113m extends R1.d {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f2421f = Logger.getLogger(C0113m.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f2422g = j0.f2413d;

    /* renamed from: a, reason: collision with root package name */
    public F f2423a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2424b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2425c;

    /* renamed from: d, reason: collision with root package name */
    public int f2426d;

    /* renamed from: e, reason: collision with root package name */
    public final F.m0 f2427e;

    public C0113m(F.m0 m0Var, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i2, 20);
        this.f2424b = new byte[max];
        this.f2425c = max;
        this.f2427e = m0Var;
    }

    public static int P(int i2) {
        return f0(i2) + 1;
    }

    public static int Q(int i2, C0107g c0107g) {
        int f0 = f0(i2);
        int size = c0107g.size();
        return h0(size) + size + f0;
    }

    public static int R(int i2) {
        return f0(i2) + 8;
    }

    public static int S(int i2, int i3) {
        return j0(i3) + f0(i2);
    }

    public static int T(int i2) {
        return f0(i2) + 4;
    }

    public static int U(int i2) {
        return f0(i2) + 8;
    }

    public static int V(int i2) {
        return f0(i2) + 4;
    }

    public static int W(int i2, AbstractC0101a abstractC0101a, W w2) {
        return abstractC0101a.a(w2) + (f0(i2) * 2);
    }

    public static int X(int i2, int i3) {
        return j0(i3) + f0(i2);
    }

    public static int Y(int i2, long j2) {
        return j0(j2) + f0(i2);
    }

    public static int Z(int i2) {
        return f0(i2) + 4;
    }

    public static int a0(int i2) {
        return f0(i2) + 8;
    }

    public static int b0(int i2, int i3) {
        return h0((i3 >> 31) ^ (i3 << 1)) + f0(i2);
    }

    public static int c0(int i2, long j2) {
        return j0((j2 >> 63) ^ (j2 << 1)) + f0(i2);
    }

    public static int d0(int i2, String str) {
        return e0(str) + f0(i2);
    }

    public static int e0(String str) {
        int length;
        try {
            length = m0.a(str);
        } catch (l0 unused) {
            length = str.getBytes(AbstractC0124y.f2462a).length;
        }
        return h0(length) + length;
    }

    public static int f0(int i2) {
        return h0(i2 << 3);
    }

    public static int g0(int i2, int i3) {
        return h0(i3) + f0(i2);
    }

    public static int h0(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int i0(int i2, long j2) {
        return j0(j2) + f0(i2);
    }

    public static int j0(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public final void A0(int i2, int i3) {
        l0(20);
        M(i2, 0);
        N(i3);
    }

    public final void B0(int i2) {
        l0(5);
        N(i2);
    }

    public final void C0(int i2, long j2) {
        l0(20);
        M(i2, 0);
        O(j2);
    }

    public final void D0(long j2) {
        l0(10);
        O(j2);
    }

    @Override // R1.d
    public final void J(byte[] bArr, int i2, int i3) {
        n0(bArr, i2, i3);
    }

    public final void K(int i2) {
        int i3 = this.f2426d;
        int i4 = i3 + 1;
        this.f2426d = i4;
        byte b2 = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = this.f2424b;
        bArr[i3] = b2;
        int i5 = i3 + 2;
        this.f2426d = i5;
        bArr[i4] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i6 = i3 + 3;
        this.f2426d = i6;
        bArr[i5] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f2426d = i3 + 4;
        bArr[i6] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void L(long j2) {
        int i2 = this.f2426d;
        int i3 = i2 + 1;
        this.f2426d = i3;
        byte[] bArr = this.f2424b;
        bArr[i2] = (byte) (j2 & 255);
        int i4 = i2 + 2;
        this.f2426d = i4;
        bArr[i3] = (byte) ((j2 >> 8) & 255);
        int i5 = i2 + 3;
        this.f2426d = i5;
        bArr[i4] = (byte) ((j2 >> 16) & 255);
        int i6 = i2 + 4;
        this.f2426d = i6;
        bArr[i5] = (byte) (255 & (j2 >> 24));
        int i7 = i2 + 5;
        this.f2426d = i7;
        bArr[i6] = (byte) (((int) (j2 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i8 = i2 + 6;
        this.f2426d = i8;
        bArr[i7] = (byte) (((int) (j2 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i9 = i2 + 7;
        this.f2426d = i9;
        bArr[i8] = (byte) (((int) (j2 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f2426d = i2 + 8;
        bArr[i9] = (byte) (((int) (j2 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void M(int i2, int i3) {
        N((i2 << 3) | i3);
    }

    public final void N(int i2) {
        boolean z2 = f2422g;
        byte[] bArr = this.f2424b;
        if (z2) {
            while ((i2 & (-128)) != 0) {
                int i3 = this.f2426d;
                this.f2426d = i3 + 1;
                j0.j(bArr, i3, (byte) ((i2 | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
                i2 >>>= 7;
            }
            int i4 = this.f2426d;
            this.f2426d = i4 + 1;
            j0.j(bArr, i4, (byte) i2);
            return;
        }
        while ((i2 & (-128)) != 0) {
            int i5 = this.f2426d;
            this.f2426d = i5 + 1;
            bArr[i5] = (byte) ((i2 | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
            i2 >>>= 7;
        }
        int i6 = this.f2426d;
        this.f2426d = i6 + 1;
        bArr[i6] = (byte) i2;
    }

    public final void O(long j2) {
        boolean z2 = f2422g;
        byte[] bArr = this.f2424b;
        if (z2) {
            while ((j2 & (-128)) != 0) {
                int i2 = this.f2426d;
                this.f2426d = i2 + 1;
                j0.j(bArr, i2, (byte) ((((int) j2) | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
                j2 >>>= 7;
            }
            int i3 = this.f2426d;
            this.f2426d = i3 + 1;
            j0.j(bArr, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            int i4 = this.f2426d;
            this.f2426d = i4 + 1;
            bArr[i4] = (byte) ((((int) j2) | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
            j2 >>>= 7;
        }
        int i5 = this.f2426d;
        this.f2426d = i5 + 1;
        bArr[i5] = (byte) j2;
    }

    public final void k0() {
        this.f2427e.write(this.f2424b, 0, this.f2426d);
        this.f2426d = 0;
    }

    public final void l0(int i2) {
        if (this.f2425c - this.f2426d < i2) {
            k0();
        }
    }

    public final void m0(byte b2) {
        if (this.f2426d == this.f2425c) {
            k0();
        }
        int i2 = this.f2426d;
        this.f2426d = i2 + 1;
        this.f2424b[i2] = b2;
    }

    public final void n0(byte[] bArr, int i2, int i3) {
        int i4 = this.f2426d;
        int i5 = this.f2425c;
        int i6 = i5 - i4;
        byte[] bArr2 = this.f2424b;
        if (i6 >= i3) {
            System.arraycopy(bArr, i2, bArr2, i4, i3);
            this.f2426d += i3;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i4, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f2426d = i5;
        k0();
        if (i8 > i5) {
            this.f2427e.write(bArr, i7, i8);
        } else {
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            this.f2426d = i8;
        }
    }

    public final void o0(int i2, boolean z2) {
        l0(11);
        M(i2, 0);
        byte b2 = z2 ? (byte) 1 : (byte) 0;
        int i3 = this.f2426d;
        this.f2426d = i3 + 1;
        this.f2424b[i3] = b2;
    }

    public final void p0(int i2, C0107g c0107g) {
        z0(i2, 2);
        q0(c0107g);
    }

    public final void q0(C0107g c0107g) {
        B0(c0107g.size());
        J(c0107g.f2390b, c0107g.e(), c0107g.size());
    }

    public final void r0(int i2, int i3) {
        l0(14);
        M(i2, 5);
        K(i3);
    }

    public final void s0(int i2) {
        l0(4);
        K(i2);
    }

    public final void t0(int i2, long j2) {
        l0(18);
        M(i2, 1);
        L(j2);
    }

    public final void u0(long j2) {
        l0(8);
        L(j2);
    }

    public final void v0(int i2, int i3) {
        l0(20);
        M(i2, 0);
        if (i3 >= 0) {
            N(i3);
        } else {
            O(i3);
        }
    }

    public final void w0(int i2) {
        if (i2 >= 0) {
            B0(i2);
        } else {
            D0(i2);
        }
    }

    public final void x0(int i2, String str) {
        z0(i2, 2);
        y0(str);
    }

    public final void y0(String str) {
        try {
            int length = str.length() * 3;
            int h02 = h0(length);
            int i2 = h02 + length;
            int i3 = this.f2425c;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int p2 = m0.f2428a.p(str, bArr, 0, length);
                B0(p2);
                n0(bArr, 0, p2);
                return;
            }
            if (i2 > i3 - this.f2426d) {
                k0();
            }
            int h03 = h0(str.length());
            int i4 = this.f2426d;
            byte[] bArr2 = this.f2424b;
            try {
                try {
                    if (h03 == h02) {
                        int i5 = i4 + h03;
                        this.f2426d = i5;
                        int p3 = m0.f2428a.p(str, bArr2, i5, i3 - i5);
                        this.f2426d = i4;
                        N((p3 - i4) - h03);
                        this.f2426d = p3;
                    } else {
                        int a2 = m0.a(str);
                        N(a2);
                        this.f2426d = m0.f2428a.p(str, bArr2, this.f2426d, a2);
                    }
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new C0112l(e2);
                }
            } catch (l0 e3) {
                this.f2426d = i4;
                throw e3;
            }
        } catch (l0 e4) {
            f2421f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
            byte[] bytes = str.getBytes(AbstractC0124y.f2462a);
            try {
                B0(bytes.length);
                J(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e5) {
                throw new C0112l(e5);
            }
        }
    }

    public final void z0(int i2, int i3) {
        B0((i2 << 3) | i3);
    }
}
