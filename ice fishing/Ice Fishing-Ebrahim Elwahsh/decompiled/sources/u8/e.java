package u8;

import com.google.android.gms.internal.ads.CL;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import r7.AbstractC4978i;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: n, reason: collision with root package name */
    public s f41276n;

    /* renamed from: u, reason: collision with root package name */
    public long f41277u;

    public final byte[] A(long j9) {
        if (j9 < 0 || j9 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j9).toString());
        }
        if (this.f41277u < j9) {
            throw new EOFException();
        }
        int i = (int) j9;
        byte[] bArr = new byte[i];
        int i4 = 0;
        while (i4 < i) {
            int m8 = m(bArr, i4, i - i4);
            if (m8 == -1) {
                throw new EOFException();
            }
            i4 += m8;
        }
        return bArr;
    }

    public final h B(long j9) {
        if (j9 < 0 || j9 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j9).toString());
        }
        if (this.f41277u < j9) {
            throw new EOFException();
        }
        if (j9 < 4096) {
            return new h(A(j9));
        }
        h I2 = I((int) j9);
        H(j9);
        return I2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4 A[EDGE_INSN: B:40:0x00a4->B:37:0x00a4 BREAK  A[LOOP:0: B:4:0x0012->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long C() {
        int i;
        if (this.f41277u == 0) {
            throw new EOFException();
        }
        int i4 = 0;
        boolean z8 = false;
        long j9 = 0;
        do {
            s sVar = this.f41276n;
            kotlin.jvm.internal.h.b(sVar);
            int i9 = sVar.f41312b;
            int i10 = sVar.f41313c;
            while (i9 < i10) {
                byte b9 = sVar.f41311a[i9];
                if (b9 >= 48 && b9 <= 57) {
                    i = b9 - 48;
                } else if (b9 >= 97 && b9 <= 102) {
                    i = b9 - 87;
                } else if (b9 >= 65 && b9 <= 70) {
                    i = b9 - 55;
                } else {
                    if (i4 == 0) {
                        char[] cArr = v8.b.f41377a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b9 >> 4) & 15], cArr[b9 & 15]})));
                    }
                    z8 = true;
                    if (i9 != i10) {
                        this.f41276n = sVar.a();
                        t.a(sVar);
                    } else {
                        sVar.f41312b = i9;
                    }
                    if (!z8) {
                        break;
                    }
                }
                if ((j9 & (-1152921504606846976L)) != 0) {
                    e eVar = new e();
                    eVar.Z(j9);
                    eVar.X(b9);
                    throw new NumberFormatException("Number too large: ".concat(eVar.G()));
                }
                j9 = (j9 << 4) | i;
                i9++;
                i4++;
            }
            if (i9 != i10) {
            }
            if (!z8) {
            }
        } while (this.f41276n != null);
        this.f41277u -= i4;
        return j9;
    }

    public final int D() {
        if (this.f41277u < 4) {
            throw new EOFException();
        }
        s sVar = this.f41276n;
        kotlin.jvm.internal.h.b(sVar);
        int i = sVar.f41312b;
        int i4 = sVar.f41313c;
        if (i4 - i < 4) {
            return ((z() & 255) << 24) | ((z() & 255) << 16) | ((z() & 255) << 8) | (z() & 255);
        }
        byte[] bArr = sVar.f41311a;
        int i9 = i + 3;
        int i10 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i11 = i + 4;
        int i12 = i10 | (bArr[i9] & 255);
        this.f41277u -= 4;
        if (i11 != i4) {
            sVar.f41312b = i11;
            return i12;
        }
        this.f41276n = sVar.a();
        t.a(sVar);
        return i12;
    }

    public final short E() {
        if (this.f41277u < 2) {
            throw new EOFException();
        }
        s sVar = this.f41276n;
        kotlin.jvm.internal.h.b(sVar);
        int i = sVar.f41312b;
        int i4 = sVar.f41313c;
        if (i4 - i < 2) {
            return (short) (((z() & 255) << 8) | (z() & 255));
        }
        int i9 = i + 1;
        byte[] bArr = sVar.f41311a;
        int i10 = (bArr[i] & 255) << 8;
        int i11 = i + 2;
        int i12 = (bArr[i9] & 255) | i10;
        this.f41277u -= 2;
        if (i11 == i4) {
            this.f41276n = sVar.a();
            t.a(sVar);
        } else {
            sVar.f41312b = i11;
        }
        return (short) i12;
    }

    public final String F(long j9, Charset charset) {
        kotlin.jvm.internal.h.e(charset, "charset");
        if (j9 < 0 || j9 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j9).toString());
        }
        if (this.f41277u < j9) {
            throw new EOFException();
        }
        if (j9 == 0) {
            return "";
        }
        s sVar = this.f41276n;
        kotlin.jvm.internal.h.b(sVar);
        int i = sVar.f41312b;
        if (i + j9 > sVar.f41313c) {
            return new String(A(j9), charset);
        }
        int i4 = (int) j9;
        String str = new String(sVar.f41311a, i, i4, charset);
        int i9 = sVar.f41312b + i4;
        sVar.f41312b = i9;
        this.f41277u -= j9;
        if (i9 == sVar.f41313c) {
            this.f41276n = sVar.a();
            t.a(sVar);
        }
        return str;
    }

    public final String G() {
        return F(this.f41277u, M7.a.f1916a);
    }

    public final void H(long j9) {
        while (j9 > 0) {
            s sVar = this.f41276n;
            if (sVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j9, sVar.f41313c - sVar.f41312b);
            long j10 = min;
            this.f41277u -= j10;
            j9 -= j10;
            int i = sVar.f41312b + min;
            sVar.f41312b = i;
            if (i == sVar.f41313c) {
                this.f41276n = sVar.a();
                t.a(sVar);
            }
        }
    }

    public final h I(int i) {
        if (i == 0) {
            return h.f41278w;
        }
        b.d(this.f41277u, 0L, i);
        s sVar = this.f41276n;
        int i4 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i) {
            kotlin.jvm.internal.h.b(sVar);
            int i11 = sVar.f41313c;
            int i12 = sVar.f41312b;
            if (i11 == i12) {
                throw new AssertionError("s.limit == s.pos");
            }
            i9 += i11 - i12;
            i10++;
            sVar = sVar.f41316f;
        }
        byte[][] bArr = new byte[i10][];
        int[] iArr = new int[i10 * 2];
        s sVar2 = this.f41276n;
        int i13 = 0;
        while (i4 < i) {
            kotlin.jvm.internal.h.b(sVar2);
            bArr[i13] = sVar2.f41311a;
            i4 += sVar2.f41313c - sVar2.f41312b;
            iArr[i13] = Math.min(i4, i);
            iArr[i13 + i10] = sVar2.f41312b;
            sVar2.f41314d = true;
            i13++;
            sVar2 = sVar2.f41316f;
        }
        return new u(bArr, iArr);
    }

    public final s J(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        s sVar = this.f41276n;
        if (sVar == null) {
            s b9 = t.b();
            this.f41276n = b9;
            b9.f41317g = b9;
            b9.f41316f = b9;
            return b9;
        }
        s sVar2 = sVar.f41317g;
        kotlin.jvm.internal.h.b(sVar2);
        if (sVar2.f41313c + i <= 8192 && sVar2.f41315e) {
            return sVar2;
        }
        s b10 = t.b();
        sVar2.b(b10);
        return b10;
    }

    public final void K(h byteString) {
        kotlin.jvm.internal.h.e(byteString, "byteString");
        byteString.m(this, byteString.a());
    }

    @Override // u8.x
    public final z L() {
        return z.f41323d;
    }

    @Override // u8.v
    public final void N(long j9, e source) {
        s b9;
        kotlin.jvm.internal.h.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        b.d(source.f41277u, 0L, j9);
        while (j9 > 0) {
            s sVar = source.f41276n;
            kotlin.jvm.internal.h.b(sVar);
            int i = sVar.f41313c;
            s sVar2 = source.f41276n;
            kotlin.jvm.internal.h.b(sVar2);
            long j10 = i - sVar2.f41312b;
            int i4 = 0;
            if (j9 < j10) {
                s sVar3 = this.f41276n;
                s sVar4 = sVar3 != null ? sVar3.f41317g : null;
                if (sVar4 != null && sVar4.f41315e) {
                    if ((sVar4.f41313c + j9) - (sVar4.f41314d ? 0 : sVar4.f41312b) <= 8192) {
                        s sVar5 = source.f41276n;
                        kotlin.jvm.internal.h.b(sVar5);
                        sVar5.d(sVar4, (int) j9);
                        source.f41277u -= j9;
                        this.f41277u += j9;
                        return;
                    }
                }
                s sVar6 = source.f41276n;
                kotlin.jvm.internal.h.b(sVar6);
                int i9 = (int) j9;
                if (i9 <= 0 || i9 > sVar6.f41313c - sVar6.f41312b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i9 >= 1024) {
                    b9 = sVar6.c();
                } else {
                    b9 = t.b();
                    int i10 = sVar6.f41312b;
                    AbstractC4978i.J(sVar6.f41311a, 0, b9.f41311a, i10, i10 + i9);
                }
                b9.f41313c = b9.f41312b + i9;
                sVar6.f41312b += i9;
                s sVar7 = sVar6.f41317g;
                kotlin.jvm.internal.h.b(sVar7);
                sVar7.b(b9);
                source.f41276n = b9;
            }
            s sVar8 = source.f41276n;
            kotlin.jvm.internal.h.b(sVar8);
            long j11 = sVar8.f41313c - sVar8.f41312b;
            source.f41276n = sVar8.a();
            s sVar9 = this.f41276n;
            if (sVar9 == null) {
                this.f41276n = sVar8;
                sVar8.f41317g = sVar8;
                sVar8.f41316f = sVar8;
            } else {
                s sVar10 = sVar9.f41317g;
                kotlin.jvm.internal.h.b(sVar10);
                sVar10.b(sVar8);
                s sVar11 = sVar8.f41317g;
                if (sVar11 == sVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.h.b(sVar11);
                if (sVar11.f41315e) {
                    int i11 = sVar8.f41313c - sVar8.f41312b;
                    s sVar12 = sVar8.f41317g;
                    kotlin.jvm.internal.h.b(sVar12);
                    int i12 = 8192 - sVar12.f41313c;
                    s sVar13 = sVar8.f41317g;
                    kotlin.jvm.internal.h.b(sVar13);
                    if (!sVar13.f41314d) {
                        s sVar14 = sVar8.f41317g;
                        kotlin.jvm.internal.h.b(sVar14);
                        i4 = sVar14.f41312b;
                    }
                    if (i11 <= i12 + i4) {
                        s sVar15 = sVar8.f41317g;
                        kotlin.jvm.internal.h.b(sVar15);
                        sVar8.d(sVar15, i11);
                        sVar8.a();
                        t.a(sVar8);
                    }
                }
            }
            source.f41277u -= j11;
            this.f41277u += j11;
            j9 -= j11;
        }
    }

    @Override // u8.g
    public final byte[] P() {
        return A(this.f41277u);
    }

    @Override // u8.g
    public final boolean S(long j9) {
        return this.f41277u >= j9;
    }

    public final void V(byte[] source, int i, int i4) {
        kotlin.jvm.internal.h.e(source, "source");
        long j9 = i4;
        b.d(source.length, i, j9);
        int i9 = i4 + i;
        while (i < i9) {
            s J = J(1);
            int min = Math.min(i9 - i, 8192 - J.f41313c);
            int i10 = i + min;
            AbstractC4978i.J(source, J.f41313c, J.f41311a, i, i10);
            J.f41313c += min;
            i = i10;
        }
        this.f41277u += j9;
    }

    public final long W(x source) {
        kotlin.jvm.internal.h.e(source, "source");
        long j9 = 0;
        while (true) {
            long f6 = source.f(8192L, this);
            if (f6 == -1) {
                return j9;
            }
            j9 += f6;
        }
    }

    public final void X(int i) {
        s J = J(1);
        int i4 = J.f41313c;
        J.f41313c = i4 + 1;
        J.f41311a[i4] = (byte) i;
        this.f41277u++;
    }

    public final void Y(long j9) {
        boolean z8;
        byte[] bArr;
        if (j9 == 0) {
            X(48);
            return;
        }
        if (j9 < 0) {
            j9 = -j9;
            if (j9 < 0) {
                d0("-9223372036854775808");
                return;
            }
            z8 = true;
        } else {
            z8 = false;
        }
        byte[] bArr2 = v8.a.f41375a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j9)) * 10) >>> 5;
        int i = numberOfLeadingZeros + (j9 > v8.a.f41376b[numberOfLeadingZeros] ? 1 : 0);
        if (z8) {
            i++;
        }
        s J = J(i);
        int i4 = J.f41313c + i;
        while (true) {
            bArr = J.f41311a;
            if (j9 == 0) {
                break;
            }
            long j10 = 10;
            i4--;
            bArr[i4] = v8.a.f41375a[(int) (j9 % j10)];
            j9 /= j10;
        }
        if (z8) {
            bArr[i4 - 1] = 45;
        }
        J.f41313c += i;
        this.f41277u += i;
    }

    public final void Z(long j9) {
        if (j9 == 0) {
            X(48);
            return;
        }
        long j10 = (j9 >>> 1) | j9;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + 3) / 4);
        s J = J(i);
        int i4 = J.f41313c;
        for (int i9 = (i4 + i) - 1; i9 >= i4; i9--) {
            J.f41311a[i9] = v8.a.f41375a[(int) (15 & j9)];
            j9 >>>= 4;
        }
        J.f41313c += i;
        this.f41277u += i;
    }

    public final void a(e out, long j9, long j10) {
        kotlin.jvm.internal.h.e(out, "out");
        long j11 = j9;
        b.d(this.f41277u, j11, j10);
        if (j10 == 0) {
            return;
        }
        out.f41277u += j10;
        s sVar = this.f41276n;
        while (true) {
            kotlin.jvm.internal.h.b(sVar);
            long j12 = sVar.f41313c - sVar.f41312b;
            if (j11 < j12) {
                break;
            }
            j11 -= j12;
            sVar = sVar.f41316f;
        }
        s sVar2 = sVar;
        long j13 = j10;
        while (j13 > 0) {
            kotlin.jvm.internal.h.b(sVar2);
            s c4 = sVar2.c();
            int i = c4.f41312b + ((int) j11);
            c4.f41312b = i;
            c4.f41313c = Math.min(i + ((int) j13), c4.f41313c);
            s sVar3 = out.f41276n;
            if (sVar3 == null) {
                c4.f41317g = c4;
                c4.f41316f = c4;
                out.f41276n = c4;
            } else {
                s sVar4 = sVar3.f41317g;
                kotlin.jvm.internal.h.b(sVar4);
                sVar4.b(c4);
            }
            j13 -= c4.f41313c - c4.f41312b;
            sVar2 = sVar2.f41316f;
            j11 = 0;
        }
    }

    public final void a0(int i) {
        s J = J(4);
        int i4 = J.f41313c;
        byte b9 = (byte) ((i >>> 24) & com.anythink.basead.exoplayer.k.p.f8630b);
        byte[] bArr = J.f41311a;
        bArr[i4] = b9;
        bArr[i4 + 1] = (byte) ((i >>> 16) & com.anythink.basead.exoplayer.k.p.f8630b);
        bArr[i4 + 2] = (byte) ((i >>> 8) & com.anythink.basead.exoplayer.k.p.f8630b);
        bArr[i4 + 3] = (byte) (i & com.anythink.basead.exoplayer.k.p.f8630b);
        J.f41313c = i4 + 4;
        this.f41277u += 4;
    }

    public final void b0(long j9) {
        long j10 = ((j9 & 255) << 56) | (((-72057594037927936L) & j9) >>> 56) | ((71776119061217280L & j9) >>> 40) | ((280375465082880L & j9) >>> 24) | ((1095216660480L & j9) >>> 8) | ((4278190080L & j9) << 8) | ((16711680 & j9) << 24) | ((65280 & j9) << 40);
        s J = J(8);
        int i = J.f41313c;
        byte[] bArr = J.f41311a;
        bArr[i] = (byte) ((j10 >>> 56) & 255);
        bArr[i + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i + 7] = (byte) (j10 & 255);
        J.f41313c = i + 8;
        this.f41277u += 8;
    }

    public final void c0(int i, int i4, String string) {
        char charAt;
        kotlin.jvm.internal.h.e(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(CL.i(i, "beginIndex < 0: ").toString());
        }
        if (i4 < i) {
            throw new IllegalArgumentException(AbstractC5051n.c(i4, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i4 > string.length()) {
            StringBuilder l9 = CL.l(i4, "endIndex > string.length: ", " > ");
            l9.append(string.length());
            throw new IllegalArgumentException(l9.toString().toString());
        }
        while (i < i4) {
            char charAt2 = string.charAt(i);
            if (charAt2 < 128) {
                s J = J(1);
                int i9 = J.f41313c - i;
                int min = Math.min(i4, 8192 - i9);
                int i10 = i + 1;
                byte[] bArr = J.f41311a;
                bArr[i + i9] = (byte) charAt2;
                while (true) {
                    i = i10;
                    if (i >= min || (charAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i10 = i + 1;
                    bArr[i + i9] = (byte) charAt;
                }
                int i11 = J.f41313c;
                int i12 = (i9 + i) - i11;
                J.f41313c = i11 + i12;
                this.f41277u += i12;
            } else {
                if (charAt2 < 2048) {
                    s J8 = J(2);
                    int i13 = J8.f41313c;
                    byte[] bArr2 = J8.f41311a;
                    bArr2[i13] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i13 + 1] = (byte) ((charAt2 & '?') | 128);
                    J8.f41313c = i13 + 2;
                    this.f41277u += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    s J9 = J(3);
                    int i14 = J9.f41313c;
                    byte[] bArr3 = J9.f41311a;
                    bArr3[i14] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i14 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i14 + 2] = (byte) ((charAt2 & '?') | 128);
                    J9.f41313c = i14 + 3;
                    this.f41277u += 3;
                } else {
                    int i15 = i + 1;
                    char charAt3 = i15 < i4 ? string.charAt(i15) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        X(63);
                        i = i15;
                    } else {
                        int i16 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + com.anythink.basead.exoplayer.b.aX;
                        s J10 = J(4);
                        int i17 = J10.f41313c;
                        byte[] bArr4 = J10.f41311a;
                        bArr4[i17] = (byte) ((i16 >> 18) | 240);
                        bArr4[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                        bArr4[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                        bArr4[i17 + 3] = (byte) ((i16 & 63) | 128);
                        J10.f41313c = i17 + 4;
                        this.f41277u += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final Object clone() {
        e eVar = new e();
        if (this.f41277u == 0) {
            return eVar;
        }
        s sVar = this.f41276n;
        kotlin.jvm.internal.h.b(sVar);
        s c4 = sVar.c();
        eVar.f41276n = c4;
        c4.f41317g = c4;
        c4.f41316f = c4;
        for (s sVar2 = sVar.f41316f; sVar2 != sVar; sVar2 = sVar2.f41316f) {
            s sVar3 = c4.f41317g;
            kotlin.jvm.internal.h.b(sVar3);
            kotlin.jvm.internal.h.b(sVar2);
            sVar3.b(sVar2.c());
        }
        eVar.f41277u = this.f41277u;
        return eVar;
    }

    public final void d0(String string) {
        kotlin.jvm.internal.h.e(string, "string");
        c0(0, string.length(), string);
    }

    public final void e0(int i) {
        if (i < 128) {
            X(i);
            return;
        }
        if (i < 2048) {
            s J = J(2);
            int i4 = J.f41313c;
            byte[] bArr = J.f41311a;
            bArr[i4] = (byte) ((i >> 6) | 192);
            bArr[i4 + 1] = (byte) ((i & 63) | 128);
            J.f41313c = i4 + 2;
            this.f41277u += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            X(63);
            return;
        }
        if (i < 65536) {
            s J8 = J(3);
            int i9 = J8.f41313c;
            byte[] bArr2 = J8.f41311a;
            bArr2[i9] = (byte) ((i >> 12) | 224);
            bArr2[i9 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i9 + 2] = (byte) ((i & 63) | 128);
            J8.f41313c = i9 + 3;
            this.f41277u += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(b.i(i)));
        }
        s J9 = J(4);
        int i10 = J9.f41313c;
        byte[] bArr3 = J9.f41311a;
        bArr3[i10] = (byte) ((i >> 18) | 240);
        bArr3[i10 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i10 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i10 + 3] = (byte) ((i & 63) | 128);
        J9.f41313c = i10 + 4;
        this.f41277u += 4;
    }

    public final boolean equals(Object obj) {
        boolean z8 = true;
        if (this == obj) {
            return true;
        }
        boolean z9 = false;
        if (!(obj instanceof e)) {
            return false;
        }
        long j9 = this.f41277u;
        e eVar = (e) obj;
        if (j9 != eVar.f41277u) {
            return false;
        }
        if (j9 == 0) {
            return true;
        }
        s sVar = this.f41276n;
        kotlin.jvm.internal.h.b(sVar);
        s sVar2 = eVar.f41276n;
        kotlin.jvm.internal.h.b(sVar2);
        int i = sVar.f41312b;
        int i4 = sVar2.f41312b;
        long j10 = 0;
        while (j10 < this.f41277u) {
            long min = Math.min(sVar.f41313c - i, sVar2.f41313c - i4);
            long j11 = 0;
            while (j11 < min) {
                int i9 = i + 1;
                boolean z10 = z8;
                byte b9 = sVar.f41311a[i];
                int i10 = i4 + 1;
                boolean z11 = z9;
                if (b9 != sVar2.f41311a[i4]) {
                    return z11;
                }
                j11++;
                i4 = i10;
                i = i9;
                z8 = z10;
                z9 = z11;
            }
            boolean z12 = z8;
            boolean z13 = z9;
            if (i == sVar.f41313c) {
                s sVar3 = sVar.f41316f;
                kotlin.jvm.internal.h.b(sVar3);
                i = sVar3.f41312b;
                sVar = sVar3;
            }
            if (i4 == sVar2.f41313c) {
                sVar2 = sVar2.f41316f;
                kotlin.jvm.internal.h.b(sVar2);
                i4 = sVar2.f41312b;
            }
            j10 += min;
            z8 = z12;
            z9 = z13;
        }
        return z8;
    }

    @Override // u8.x
    public final long f(long j9, e sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        if (j9 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j9).toString());
        }
        long j10 = this.f41277u;
        if (j10 == 0) {
            return -1L;
        }
        if (j9 > j10) {
            j9 = j10;
        }
        sink.N(j9, this);
        return j9;
    }

    public final int hashCode() {
        s sVar = this.f41276n;
        if (sVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i4 = sVar.f41313c;
            for (int i9 = sVar.f41312b; i9 < i4; i9++) {
                i = (i * 31) + sVar.f41311a[i9];
            }
            sVar = sVar.f41316f;
            kotlin.jvm.internal.h.b(sVar);
        } while (sVar != this.f41276n);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final boolean j() {
        return this.f41277u == 0;
    }

    public final byte k(long j9) {
        b.d(this.f41277u, j9, 1L);
        s sVar = this.f41276n;
        if (sVar == null) {
            kotlin.jvm.internal.h.b(null);
            throw null;
        }
        long j10 = this.f41277u;
        if (j10 - j9 < j9) {
            while (j10 > j9) {
                sVar = sVar.f41317g;
                kotlin.jvm.internal.h.b(sVar);
                j10 -= sVar.f41313c - sVar.f41312b;
            }
            return sVar.f41311a[(int) ((sVar.f41312b + j9) - j10)];
        }
        long j11 = 0;
        while (true) {
            int i = sVar.f41313c;
            int i4 = sVar.f41312b;
            long j12 = (i - i4) + j11;
            if (j12 > j9) {
                return sVar.f41311a[(int) ((i4 + j9) - j11)];
            }
            sVar = sVar.f41316f;
            kotlin.jvm.internal.h.b(sVar);
            j11 = j12;
        }
    }

    public final int m(byte[] bArr, int i, int i4) {
        b.d(bArr.length, i, i4);
        s sVar = this.f41276n;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(i4, sVar.f41313c - sVar.f41312b);
        int i9 = sVar.f41312b;
        AbstractC4978i.J(sVar.f41311a, i, bArr, i9, i9 + min);
        int i10 = sVar.f41312b + min;
        sVar.f41312b = i10;
        this.f41277u -= min;
        if (i10 == sVar.f41313c) {
            this.f41276n = sVar.a();
            t.a(sVar);
        }
        return min;
    }

    @Override // u8.f
    public final /* bridge */ /* synthetic */ f r(long j9) {
        b0(j9);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        s sVar = this.f41276n;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), sVar.f41313c - sVar.f41312b);
        sink.put(sVar.f41311a, sVar.f41312b, min);
        int i = sVar.f41312b + min;
        sVar.f41312b = i;
        this.f41277u -= min;
        if (i == sVar.f41313c) {
            this.f41276n = sVar.a();
            t.a(sVar);
        }
        return min;
    }

    @Override // u8.f
    public final f s(int i) {
        a0(b.f(i));
        return this;
    }

    @Override // u8.f
    public final /* bridge */ /* synthetic */ f t(int i) {
        X(i);
        return this;
    }

    public final String toString() {
        long j9 = this.f41277u;
        if (j9 <= 2147483647L) {
            return I((int) j9).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f41277u).toString());
    }

    @Override // u8.f
    public final /* bridge */ /* synthetic */ f u(String str) {
        d0(str);
        return this;
    }

    @Override // u8.f
    public final /* bridge */ /* synthetic */ f v(h hVar) {
        K(hVar);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.h.e(source, "source");
        int remaining = source.remaining();
        int i = remaining;
        while (i > 0) {
            s J = J(1);
            int min = Math.min(i, 8192 - J.f41313c);
            source.get(J.f41311a, J.f41313c, min);
            i -= min;
            J.f41313c += min;
        }
        this.f41277u += remaining;
        return remaining;
    }

    public final byte z() {
        if (this.f41277u == 0) {
            throw new EOFException();
        }
        s sVar = this.f41276n;
        kotlin.jvm.internal.h.b(sVar);
        int i = sVar.f41312b;
        int i4 = sVar.f41313c;
        int i9 = i + 1;
        byte b9 = sVar.f41311a[i];
        this.f41277u--;
        if (i9 != i4) {
            sVar.f41312b = i9;
            return b9;
        }
        this.f41276n = sVar.a();
        t.a(sVar);
        return b9;
    }

    @Override // u8.g
    public final e Q() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, u8.v
    public final void close() {
    }

    @Override // u8.v, java.io.Flushable
    public final void flush() {
    }
}
