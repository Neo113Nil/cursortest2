package defpackage;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;
import kotlin.KotlinVersion;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class hi3 implements ij3, gj3, Cloneable, ByteChannel {
    public xap a;
    public long b;

    @Override // defpackage.ij3
    public final boolean A0(long j, pn3 pn3Var) {
        pn3Var.getClass();
        int d = pn3Var.d();
        if (j >= 0 && d >= 0 && this.b - j >= d && pn3Var.d() >= d) {
            for (int i = 0; i < d; i++) {
                if (P(i + j) == pn3Var.k(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ij3
    public final String B() {
        long Q = Q((byte) 10, 0L, Long.MAX_VALUE);
        if (Q != -1) {
            return b.b(this, Q);
        }
        long j = this.b;
        if (j != 0) {
            return F0(j, Charsets.UTF_8);
        }
        return null;
    }

    @Override // defpackage.ij3
    public final long C(pn3 pn3Var) {
        pn3Var.getClass();
        return R(0L, pn3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d A[EDGE_INSN: B:40:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    @Override // defpackage.ij3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long C0() {
        int i;
        if (this.b == 0) {
            xq0.v();
            return 0L;
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            xap xapVar = this.a;
            xapVar.getClass();
            byte[] bArr = xapVar.a;
            int i3 = xapVar.b;
            int i4 = xapVar.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b >= 65 && b <= 70) {
                    i = b - 55;
                } else {
                    if (i2 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(ox6.O(b)));
                    }
                    z = true;
                    if (i3 != i4) {
                        this.a = xapVar.a();
                        lbp.a(xapVar);
                    } else {
                        xapVar.b = i3;
                    }
                    if (!z) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j) != 0) {
                    hi3 hi3Var = new hi3();
                    hi3Var.O0(j);
                    hi3Var.M0(b);
                    throw new NumberFormatException("Number too large: ".concat(hi3Var.G0()));
                }
                j = (j << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.a != null);
        this.b -= i2;
        return j;
    }

    @Override // defpackage.ij3
    public final InputStream E0() {
        return new fi3(this, 0);
    }

    public final String F0(long j, Charset charset) {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            xq0.o(dfi.d(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            xq0.v();
            return null;
        }
        if (j == 0) {
            return "";
        }
        xap xapVar = this.a;
        xapVar.getClass();
        int i = xapVar.b;
        if (i + j > xapVar.c) {
            return new String(X(j), charset);
        }
        int i2 = (int) j;
        String str = new String(xapVar.a, i, i2, charset);
        int i3 = xapVar.b + i2;
        xapVar.b = i3;
        this.b -= j;
        if (i3 == xapVar.c) {
            this.a = xapVar.a();
            lbp.a(xapVar);
        }
        return str;
    }

    @Override // defpackage.ij3
    public final String G(long j) {
        if (j < 0) {
            xq0.o(dfi.d(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long Q = Q((byte) 10, 0L, j2);
        if (Q != -1) {
            return b.b(this, Q);
        }
        if (j2 < this.b && P(j2 - 1) == 13 && P(j2) == 10) {
            return b.b(this, j2);
        }
        hi3 hi3Var = new hi3();
        I(hi3Var, 0L, Math.min(32, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + hi3Var.g0(hi3Var.b).e() + (char) 8230);
    }

    public final String G0() {
        return F0(this.b, Charsets.UTF_8);
    }

    public final long H() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        xap xapVar = this.a;
        xapVar.getClass();
        xap xapVar2 = xapVar.g;
        xapVar2.getClass();
        return (xapVar2.c >= 8192 || !xapVar2.e) ? j : j - (r3 - xapVar2.b);
    }

    public final int H0() {
        int i;
        int i2;
        int i3;
        if (this.b == 0) {
            xq0.v();
            return 0;
        }
        byte P = P(0L);
        if ((P & 128) == 0) {
            i = P & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((P & 224) == 192) {
            i = P & 31;
            i2 = 2;
            i3 = 128;
        } else if ((P & 240) == 224) {
            i = P & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((P & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = P & 7;
            i2 = 4;
            i3 = SQLiteDatabase.OPEN_FULLMUTEX;
        }
        long j = i2;
        if (this.b < j) {
            StringBuilder q = k5r.q(i2, "size < ", ": ");
            q.append(this.b);
            q.append(" (to read code point prefixed 0x");
            q.append(ox6.O(P));
            q.append(')');
            throw new EOFException(q.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte P2 = P(j2);
            if ((P2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (P2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public final void I(hi3 hi3Var, long j, long j2) {
        hi3Var.getClass();
        long j3 = j;
        ox6.A(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        hi3Var.b += j2;
        xap xapVar = this.a;
        while (true) {
            xapVar.getClass();
            long j4 = xapVar.c - xapVar.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            xapVar = xapVar.f;
        }
        xap xapVar2 = xapVar;
        long j5 = j2;
        while (j5 > 0) {
            xapVar2.getClass();
            xap c = xapVar2.c();
            int i = c.b + ((int) j3);
            c.b = i;
            c.c = Math.min(i + ((int) j5), c.c);
            xap xapVar3 = hi3Var.a;
            if (xapVar3 == null) {
                c.g = c;
                c.f = c;
                hi3Var.a = c;
            } else {
                xap xapVar4 = xapVar3.g;
                xapVar4.getClass();
                xapVar4.b(c);
            }
            j5 -= c.c - c.b;
            xapVar2 = xapVar2.f;
            j3 = 0;
        }
    }

    public final pn3 I0() {
        long j = this.b;
        if (j <= 2147483647L) {
            return J0((int) j);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    public final pn3 J0(int i) {
        if (i == 0) {
            return pn3.d;
        }
        ox6.A(this.b, 0L, i);
        xap xapVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            xapVar.getClass();
            int i5 = xapVar.c;
            int i6 = xapVar.b;
            if (i5 == i6) {
                xq0.w("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            xapVar = xapVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        xap xapVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            xapVar2.getClass();
            bArr[i7] = xapVar2.a;
            i2 += xapVar2.c - xapVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = xapVar2.b;
            xapVar2.d = true;
            i7++;
            xapVar2 = xapVar2.f;
        }
        return new mbp(bArr, iArr);
    }

    public final xap K0(int i) {
        if (i < 1 || i > 8192) {
            xq0.x("unexpected capacity");
            return null;
        }
        xap xapVar = this.a;
        if (xapVar == null) {
            xap b = lbp.b();
            this.a = b;
            b.g = b;
            b.f = b;
            return b;
        }
        xap xapVar2 = xapVar.g;
        xapVar2.getClass();
        if (xapVar2.c + i <= 8192 && xapVar2.e) {
            return xapVar2;
        }
        xap b2 = lbp.b();
        xapVar2.b(b2);
        return b2;
    }

    public final void L0(pn3 pn3Var) {
        pn3Var.getClass();
        pn3Var.v(this, pn3Var.d());
    }

    @Override // defpackage.gj3
    public final /* bridge */ /* synthetic */ gj3 M(String str) {
        S0(str);
        return this;
    }

    public final void M0(int i) {
        xap K0 = K0(1);
        byte[] bArr = K0.a;
        int i2 = K0.c;
        K0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final boolean N() {
        return this.b == 0;
    }

    public final void N0(long j) {
        boolean z;
        if (j == 0) {
            M0(48);
            return;
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                S0("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        xap K0 = K0(i);
        byte[] bArr = K0.a;
        int i2 = K0.c + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = b.a[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        K0.c += i;
        this.b += i;
    }

    @Override // defpackage.ij3
    public final void O(hi3 hi3Var, long j) {
        long j2 = this.b;
        if (j2 >= j) {
            hi3Var.t0(this, j);
        } else {
            hi3Var.t0(this, j2);
            xq0.v();
        }
    }

    public final void O0(long j) {
        if (j == 0) {
            M0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        xap K0 = K0(i);
        byte[] bArr = K0.a;
        int i2 = K0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        K0.c += i;
        this.b += i;
    }

    public final byte P(long j) {
        ox6.A(this.b, j, 1L);
        xap xapVar = this.a;
        xapVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                xapVar = xapVar.g;
                xapVar.getClass();
                j2 -= xapVar.c - xapVar.b;
            }
            return xapVar.a[(int) ((xapVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = xapVar.c;
            int i2 = xapVar.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return xapVar.a[(int) ((i2 + j) - j3)];
            }
            xapVar = xapVar.f;
            xapVar.getClass();
            j3 = j4;
        }
    }

    public final void P0(int i) {
        xap K0 = K0(4);
        byte[] bArr = K0.a;
        int i2 = K0.c;
        bArr[i2] = (byte) ((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i2 + 1] = (byte) ((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i2 + 2] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i2 + 3] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        K0.c = i2 + 4;
        this.b += 4;
    }

    public final long Q(byte b, long j, long j2) {
        xap xapVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.b);
            ouj.C(sb, " fromIndex=", j3, " toIndex=");
            sb.append(j4);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j6 = this.b;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (xapVar = this.a) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                xapVar = xapVar.g;
                xapVar.getClass();
                j6 -= xapVar.c - xapVar.b;
            }
            while (j6 < j4) {
                byte[] bArr = xapVar.a;
                long j8 = j7;
                int min = (int) Math.min(xapVar.c, (xapVar.b + j4) - j6);
                for (int i = (int) ((xapVar.b + j3) - j6); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - xapVar.b) + j6;
                    }
                }
                j6 += xapVar.c - xapVar.b;
                xapVar = xapVar.f;
                xapVar.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = (xapVar.c - xapVar.b) + j5;
            if (j9 > j3) {
                break;
            }
            xapVar = xapVar.f;
            xapVar.getClass();
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = xapVar.a;
            int min2 = (int) Math.min(xapVar.c, (xapVar.b + j4) - j5);
            for (int i2 = (int) ((xapVar.b + j3) - j5); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - xapVar.b) + j5;
                }
            }
            j5 += xapVar.c - xapVar.b;
            xapVar = xapVar.f;
            xapVar.getClass();
            j3 = j5;
        }
        return -1L;
    }

    public final void Q0(int i) {
        xap K0 = K0(2);
        byte[] bArr = K0.a;
        int i2 = K0.c;
        bArr[i2] = (byte) ((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i2 + 1] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        K0.c = i2 + 2;
        this.b += 2;
    }

    public final long R(long j, pn3 pn3Var) {
        pn3Var.getClass();
        long j2 = 0;
        if (j < 0) {
            xq0.o(dfi.d(j, "fromIndex < 0: "));
            return 0L;
        }
        xap xapVar = this.a;
        if (xapVar == null) {
            return -1L;
        }
        long j3 = this.b;
        if (j3 - j < j) {
            while (j3 > j) {
                xapVar = xapVar.g;
                xapVar.getClass();
                j3 -= xapVar.c - xapVar.b;
            }
            if (pn3Var.d() == 2) {
                byte k = pn3Var.k(0);
                byte k2 = pn3Var.k(1);
                while (j3 < this.b) {
                    byte[] bArr = xapVar.a;
                    int i = xapVar.c;
                    for (int i2 = (int) ((xapVar.b + j) - j3); i2 < i; i2++) {
                        byte b = bArr[i2];
                        if (b == k || b == k2) {
                            return (i2 - xapVar.b) + j3;
                        }
                    }
                    j3 += xapVar.c - xapVar.b;
                    xapVar = xapVar.f;
                    xapVar.getClass();
                    j = j3;
                }
            } else {
                byte[] i3 = pn3Var.i();
                while (j3 < this.b) {
                    byte[] bArr2 = xapVar.a;
                    int i4 = xapVar.c;
                    for (int i5 = (int) ((xapVar.b + j) - j3); i5 < i4; i5++) {
                        byte b2 = bArr2[i5];
                        for (byte b3 : i3) {
                            if (b2 == b3) {
                                return (i5 - xapVar.b) + j3;
                            }
                        }
                    }
                    j3 += xapVar.c - xapVar.b;
                    xapVar = xapVar.f;
                    xapVar.getClass();
                    j = j3;
                }
            }
            return -1L;
        }
        while (true) {
            long j4 = (xapVar.c - xapVar.b) + j2;
            if (j4 > j) {
                break;
            }
            xapVar = xapVar.f;
            xapVar.getClass();
            j2 = j4;
        }
        if (pn3Var.d() == 2) {
            byte k3 = pn3Var.k(0);
            byte k4 = pn3Var.k(1);
            while (j2 < this.b) {
                byte[] bArr3 = xapVar.a;
                int i6 = xapVar.c;
                for (int i7 = (int) ((xapVar.b + j) - j2); i7 < i6; i7++) {
                    byte b4 = bArr3[i7];
                    if (b4 == k3 || b4 == k4) {
                        return (i7 - xapVar.b) + j2;
                    }
                }
                j2 += xapVar.c - xapVar.b;
                xapVar = xapVar.f;
                xapVar.getClass();
                j = j2;
            }
        } else {
            byte[] i8 = pn3Var.i();
            while (j2 < this.b) {
                byte[] bArr4 = xapVar.a;
                int i9 = xapVar.c;
                for (int i10 = (int) ((xapVar.b + j) - j2); i10 < i9; i10++) {
                    byte b5 = bArr4[i10];
                    for (byte b6 : i8) {
                        if (b5 == b6) {
                            return (i10 - xapVar.b) + j2;
                        }
                    }
                }
                j2 += xapVar.c - xapVar.b;
                xapVar = xapVar.f;
                xapVar.getClass();
                j = j2;
            }
        }
        return -1L;
    }

    public final void R0(int i, int i2, String str) {
        char charAt;
        str.getClass();
        if (i < 0) {
            xq0.o(k5r.i(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            xq0.o(f1d.e(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            xq0.l(str.length(), k5r.q(i2, "endIndex > string.length: ", " > "));
            return;
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                xap K0 = K0(1);
                byte[] bArr = K0.a;
                int i3 = K0.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = K0.c;
                int i6 = (i3 + i) - i5;
                K0.c = i5 + i6;
                this.b += i6;
            } else {
                if (charAt2 < 2048) {
                    xap K02 = K0(2);
                    byte[] bArr2 = K02.a;
                    int i7 = K02.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    K02.c = i7 + 2;
                    this.b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    xap K03 = K0(3);
                    byte[] bArr3 = K03.a;
                    int i8 = K03.c;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    K03.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        M0(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + SQLiteDatabase.OPEN_FULLMUTEX;
                        xap K04 = K0(4);
                        byte[] bArr4 = K04.a;
                        int i11 = K04.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        K04.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final ei3 S(ei3 ei3Var) {
        ei3Var.getClass();
        byte[] bArr = b.a;
        ei3Var.getClass();
        if (ei3Var == ox6.b) {
            ei3Var = new ei3();
        }
        if (ei3Var.a != null) {
            xq0.q("already attached to a buffer");
            return null;
        }
        ei3Var.a = this;
        ei3Var.b = true;
        return ei3Var;
    }

    public final void S0(String str) {
        str.getClass();
        R0(0, str.length(), str);
    }

    @Override // defpackage.ij3
    public final String T() {
        return G(Long.MAX_VALUE);
    }

    public final void T0(int i) {
        if (i < 128) {
            M0(i);
            return;
        }
        if (i < 2048) {
            xap K0 = K0(2);
            byte[] bArr = K0.a;
            int i2 = K0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            K0.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            M0(63);
            return;
        }
        if (i < 65536) {
            xap K02 = K0(3);
            byte[] bArr2 = K02.a;
            int i3 = K02.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            K02.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            xq0.x("Unexpected code point: 0x".concat(ox6.P(i)));
            return;
        }
        xap K03 = K0(4);
        byte[] bArr3 = K03.a;
        int i4 = K03.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        K03.c = i4 + 4;
        this.b += 4;
    }

    @Override // defpackage.gj3
    public final /* bridge */ /* synthetic */ gj3 W(pn3 pn3Var) {
        L0(pn3Var);
        return this;
    }

    public final byte[] X(long j) {
        if (j < 0 || j > 2147483647L) {
            xq0.o(dfi.d(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            xq0.v();
            return null;
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        r3 = r19.b - r1;
        r19.b = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
    
        if (r1 >= r14) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (r3 == r17) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
    
        r1 = defpackage.tlm.m(r1, " but was 0x");
        r1.append(defpackage.ox6.O(P(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c8, code lost:
    
        defpackage.xq0.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cb, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
    
        if (r2 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d0, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
    
        r14 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long Y() {
        long j;
        byte b;
        long j2 = 0;
        if (this.b == 0) {
            xq0.v();
            return 0L;
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            xap xapVar = this.a;
            xapVar.getClass();
            byte[] bArr = xapVar.a;
            int i2 = xapVar.b;
            int i3 = xapVar.c;
            while (i2 < i3) {
                b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == -922337203685477580L && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + i4;
                } else {
                    j = j2;
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            j = j2;
            if (i2 == i3) {
                this.a = xapVar.a();
                lbp.a(xapVar);
            } else {
                xapVar.b = i2;
            }
            if (z2 || this.a == null) {
                break;
            }
            j2 = j;
        }
        hi3 hi3Var = new hi3();
        hi3Var.N0(j3);
        hi3Var.M0(b);
        if (!z) {
            hi3Var.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(hi3Var.G0()));
    }

    @Override // defpackage.ij3
    public final void a0(long j) {
        if (this.b >= j) {
            return;
        }
        xq0.v();
    }

    public final void b() {
        skip(this.b);
    }

    @Override // defpackage.gj3
    public final /* bridge */ /* synthetic */ gj3 c0(long j) {
        N0(j);
        return this;
    }

    @Override // defpackage.n3r
    public final long e0(hi3 hi3Var, long j) {
        hi3Var.getClass();
        if (j < 0) {
            xq0.o(dfi.d(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        hi3Var.t0(this, j);
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi3)) {
            return false;
        }
        long j = this.b;
        hi3 hi3Var = (hi3) obj;
        if (j != hi3Var.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        xap xapVar = this.a;
        xapVar.getClass();
        xap xapVar2 = hi3Var.a;
        xapVar2.getClass();
        int i = xapVar.b;
        int i2 = xapVar2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long min = Math.min(xapVar.c - i, xapVar2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (xapVar.a[i] != xapVar2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == xapVar.c) {
                xapVar = xapVar.f;
                xapVar.getClass();
                i = xapVar.b;
            }
            if (i2 == xapVar2.c) {
                xapVar2 = xapVar2.f;
                xapVar2.getClass();
                i2 = xapVar2.b;
            }
            j2 += min;
        }
        return true;
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final hi3 clone() {
        hi3 hi3Var = new hi3();
        if (this.b == 0) {
            return hi3Var;
        }
        xap xapVar = this.a;
        xapVar.getClass();
        xap c = xapVar.c();
        hi3Var.a = c;
        c.g = c;
        c.f = c;
        for (xap xapVar2 = xapVar.f; xapVar2 != xapVar; xapVar2 = xapVar2.f) {
            xap xapVar3 = c.g;
            xapVar3.getClass();
            xapVar2.getClass();
            xapVar3.b(xapVar2.c());
        }
        hi3Var.b = this.b;
        return hi3Var;
    }

    @Override // defpackage.ij3
    public final pn3 g0(long j) {
        if (j < 0 || j > 2147483647L) {
            xq0.o(dfi.d(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            xq0.v();
            return null;
        }
        if (j < 4096) {
            return new pn3(X(j));
        }
        pn3 J0 = J0((int) j);
        skip(j);
        return J0;
    }

    @Override // defpackage.ij3
    public final int h0(qwj qwjVar) {
        qwjVar.getClass();
        int c = b.c(this, qwjVar, false);
        if (c == -1) {
            return -1;
        }
        skip(qwjVar.b[c].d());
        return c;
    }

    public final int hashCode() {
        xap xapVar = this.a;
        if (xapVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = xapVar.c;
            for (int i3 = xapVar.b; i3 < i2; i3++) {
                i = (i * 31) + xapVar.a[i3];
            }
            xapVar = xapVar.f;
            xapVar.getClass();
        } while (xapVar != this.a);
        return i;
    }

    @Override // defpackage.n3r
    public final vis i() {
        return vis.d;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j0(GZIPInputStream gZIPInputStream) {
        xap K0;
        long j = Long.MAX_VALUE;
        while (true) {
            K0 = K0(1);
            int read = gZIPInputStream.read(K0.a, K0.c, (int) Math.min(j, 8192 - K0.c));
            if (read == -1) {
                break;
            }
            K0.c += read;
            long j2 = read;
            this.b += j2;
            j -= j2;
        }
        if (K0.b == K0.c) {
            this.a = K0.a();
            lbp.a(K0);
        }
    }

    @Override // defpackage.ij3
    public final byte[] k0() {
        return X(this.b);
    }

    public final short l0() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // defpackage.gj3
    public final long o0(n3r n3rVar) {
        n3rVar.getClass();
        long j = 0;
        while (true) {
            long e0 = n3rVar.e0(this, 8192L);
            if (e0 == -1) {
                return j;
            }
            j += e0;
        }
    }

    @Override // defpackage.ij3
    public final ikn peek() {
        return new ikn(new sjk(this));
    }

    @Override // defpackage.ij3
    public final long q0(gj3 gj3Var) {
        long j = this.b;
        if (j > 0) {
            gj3Var.t0(this, j);
        }
        return j;
    }

    @Override // defpackage.gj3
    public final /* bridge */ /* synthetic */ gj3 r0(int i, byte[] bArr) {
        write(bArr, 0, i);
        return this;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        ox6.A(bArr.length, i, i2);
        xap xapVar = this.a;
        if (xapVar == null) {
            return -1;
        }
        int min = Math.min(i2, xapVar.c - xapVar.b);
        byte[] bArr2 = xapVar.a;
        int i3 = xapVar.b;
        uz0.d(i, i3, i3 + min, bArr2, bArr);
        int i4 = xapVar.b + min;
        xapVar.b = i4;
        this.b -= min;
        if (i4 == xapVar.c) {
            this.a = xapVar.a();
            lbp.a(xapVar);
        }
        return min;
    }

    @Override // defpackage.ij3
    public final byte readByte() {
        if (this.b == 0) {
            xq0.v();
            return (byte) 0;
        }
        xap xapVar = this.a;
        xapVar.getClass();
        int i = xapVar.b;
        int i2 = xapVar.c;
        int i3 = i + 1;
        byte b = xapVar.a[i];
        this.b--;
        if (i3 != i2) {
            xapVar.b = i3;
            return b;
        }
        this.a = xapVar.a();
        lbp.a(xapVar);
        return b;
    }

    @Override // defpackage.ij3
    public final void readFully(byte[] bArr) {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                xq0.v();
                return;
            }
            i += read;
        }
    }

    @Override // defpackage.ij3
    public final int readInt() {
        if (this.b < 4) {
            xq0.v();
            return 0;
        }
        xap xapVar = this.a;
        xapVar.getClass();
        int i = xapVar.b;
        int i2 = xapVar.c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = xapVar.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 4;
        if (i5 != i2) {
            xapVar.b = i5;
            return i6;
        }
        this.a = xapVar.a();
        lbp.a(xapVar);
        return i6;
    }

    @Override // defpackage.ij3
    public final long readLong() {
        if (this.b < 8) {
            xq0.v();
            return 0L;
        }
        xap xapVar = this.a;
        xapVar.getClass();
        int i = xapVar.b;
        int i2 = xapVar.c;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = xapVar.a;
        int i3 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (bArr[i3] & 255);
        this.b -= 8;
        if (i4 != i2) {
            xapVar.b = i4;
            return j2;
        }
        this.a = xapVar.a();
        lbp.a(xapVar);
        return j2;
    }

    @Override // defpackage.ij3
    public final short readShort() {
        if (this.b < 2) {
            xq0.v();
            return (short) 0;
        }
        xap xapVar = this.a;
        xapVar.getClass();
        int i = xapVar.b;
        int i2 = xapVar.c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = xapVar.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b -= 2;
        if (i5 == i2) {
            this.a = xapVar.a();
            lbp.a(xapVar);
        } else {
            xapVar.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.ij3
    public final boolean request(long j) {
        return this.b >= j;
    }

    @Override // defpackage.ij3
    public final void skip(long j) {
        while (j > 0) {
            xap xapVar = this.a;
            if (xapVar == null) {
                xq0.v();
                return;
            }
            int min = (int) Math.min(j, xapVar.c - xapVar.b);
            long j2 = min;
            this.b -= j2;
            j -= j2;
            int i = xapVar.b + min;
            xapVar.b = i;
            if (i == xapVar.c) {
                this.a = xapVar.a();
                lbp.a(xapVar);
            }
        }
    }

    @Override // defpackage.jmq
    public final void t0(hi3 hi3Var, long j) {
        xap b;
        hi3Var.getClass();
        if (hi3Var == this) {
            xq0.x("source == this");
            return;
        }
        ox6.A(hi3Var.b, 0L, j);
        while (j > 0) {
            xap xapVar = hi3Var.a;
            xapVar.getClass();
            int i = xapVar.c;
            xap xapVar2 = hi3Var.a;
            xapVar2.getClass();
            long j2 = i - xapVar2.b;
            int i2 = 0;
            if (j < j2) {
                xap xapVar3 = this.a;
                xap xapVar4 = xapVar3 != null ? xapVar3.g : null;
                if (xapVar4 != null && xapVar4.e) {
                    if ((xapVar4.c + j) - (xapVar4.d ? 0 : xapVar4.b) <= 8192) {
                        xap xapVar5 = hi3Var.a;
                        xapVar5.getClass();
                        xapVar5.d(xapVar4, (int) j);
                        hi3Var.b -= j;
                        this.b += j;
                        return;
                    }
                }
                xap xapVar6 = hi3Var.a;
                xapVar6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > xapVar6.c - xapVar6.b) {
                    xq0.x("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    b = xapVar6.c();
                } else {
                    b = lbp.b();
                    byte[] bArr = xapVar6.a;
                    byte[] bArr2 = b.a;
                    int i4 = xapVar6.b;
                    uz0.d(0, i4, i4 + i3, bArr, bArr2);
                }
                b.c = b.b + i3;
                xapVar6.b += i3;
                xap xapVar7 = xapVar6.g;
                xapVar7.getClass();
                xapVar7.b(b);
                hi3Var.a = b;
            }
            xap xapVar8 = hi3Var.a;
            xapVar8.getClass();
            long j3 = xapVar8.c - xapVar8.b;
            hi3Var.a = xapVar8.a();
            xap xapVar9 = this.a;
            if (xapVar9 == null) {
                this.a = xapVar8;
                xapVar8.g = xapVar8;
                xapVar8.f = xapVar8;
            } else {
                xap xapVar10 = xapVar9.g;
                xapVar10.getClass();
                xapVar10.b(xapVar8);
                xap xapVar11 = xapVar8.g;
                if (xapVar11 == xapVar8) {
                    xq0.q("cannot compact");
                    return;
                }
                xapVar11.getClass();
                if (xapVar11.e) {
                    int i5 = xapVar8.c - xapVar8.b;
                    xap xapVar12 = xapVar8.g;
                    xapVar12.getClass();
                    int i6 = 8192 - xapVar12.c;
                    xap xapVar13 = xapVar8.g;
                    xapVar13.getClass();
                    if (!xapVar13.d) {
                        xap xapVar14 = xapVar8.g;
                        xapVar14.getClass();
                        i2 = xapVar14.b;
                    }
                    if (i5 <= i6 + i2) {
                        xap xapVar15 = xapVar8.g;
                        xapVar15.getClass();
                        xapVar8.d(xapVar15, i5);
                        xapVar8.a();
                        lbp.a(xapVar8);
                    }
                }
            }
            hi3Var.b -= j3;
            this.b += j3;
            j -= j3;
        }
    }

    public final String toString() {
        return I0().toString();
    }

    @Override // defpackage.ij3
    public final String v0(Charset charset) {
        charset.getClass();
        return F0(this.b, charset);
    }

    @Override // defpackage.gj3
    public final /* bridge */ /* synthetic */ gj3 w0(long j) {
        O0(j);
        return this;
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        ox6.A(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            xap K0 = K0(1);
            int min = Math.min(i3 - i, 8192 - K0.c);
            int i4 = i + min;
            uz0.d(K0.c, i, i4, bArr, K0.a);
            K0.c += min;
            i = i4;
        }
        this.b += j;
    }

    @Override // defpackage.gj3
    public final /* bridge */ /* synthetic */ gj3 writeByte(int i) {
        M0(i);
        return this;
    }

    @Override // defpackage.gj3
    public final /* bridge */ /* synthetic */ gj3 writeInt(int i) {
        P0(i);
        return this;
    }

    @Override // defpackage.gj3
    public final /* bridge */ /* synthetic */ gj3 writeShort(int i) {
        Q0(i);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.jmq
    public final void close() {
    }

    @Override // defpackage.gj3, defpackage.jmq, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.ij3, defpackage.gj3
    public final hi3 h() {
        return this;
    }

    @Override // defpackage.ij3
    public final hi3 s() {
        return this;
    }

    @Override // defpackage.gj3
    public final gj3 v() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            xap K0 = K0(1);
            int min = Math.min(i, 8192 - K0.c);
            byteBuffer.get(K0.a, K0.c, min);
            i -= min;
            K0.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    @Override // defpackage.gj3
    public final gj3 write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        xap xapVar = this.a;
        if (xapVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), xapVar.c - xapVar.b);
        byteBuffer.put(xapVar.a, xapVar.b, min);
        int i = xapVar.b + min;
        xapVar.b = i;
        this.b -= min;
        if (i == xapVar.c) {
            this.a = xapVar.a();
            lbp.a(xapVar);
        }
        return min;
    }
}
