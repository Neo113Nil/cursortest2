package y8;

import com.icefishingapp.icefishing.AbstractC4404f;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import v7.AbstractC5128i;

/* loaded from: classes2.dex */
public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: n, reason: collision with root package name */
    public s f41952n;

    /* renamed from: u, reason: collision with root package name */
    public long f41953u;

    public final byte[] A(long j6) {
        if (j6 < 0 || j6 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j6).toString());
        }
        if (this.f41953u < j6) {
            throw new EOFException();
        }
        int i = (int) j6;
        byte[] bArr = new byte[i];
        int i6 = 0;
        while (i6 < i) {
            int l9 = l(bArr, i6, i - i6);
            if (l9 == -1) {
                throw new EOFException();
            }
            i6 += l9;
        }
        return bArr;
    }

    public final h B(long j6) {
        if (j6 < 0 || j6 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j6).toString());
        }
        if (this.f41953u < j6) {
            throw new EOFException();
        }
        if (j6 < 4096) {
            return new h(A(j6));
        }
        h I8 = I((int) j6);
        H(j6);
        return I8;
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
        if (this.f41953u == 0) {
            throw new EOFException();
        }
        int i6 = 0;
        boolean z3 = false;
        long j6 = 0;
        do {
            s sVar = this.f41952n;
            kotlin.jvm.internal.h.b(sVar);
            int i9 = sVar.f41988b;
            int i10 = sVar.f41989c;
            while (i9 < i10) {
                byte b9 = sVar.f41987a[i9];
                if (b9 >= 48 && b9 <= 57) {
                    i = b9 - 48;
                } else if (b9 >= 97 && b9 <= 102) {
                    i = b9 - 87;
                } else if (b9 >= 65 && b9 <= 70) {
                    i = b9 - 55;
                } else {
                    if (i6 == 0) {
                        char[] cArr = z8.b.f42277a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b9 >> 4) & 15], cArr[b9 & 15]})));
                    }
                    z3 = true;
                    if (i9 != i10) {
                        this.f41952n = sVar.a();
                        t.a(sVar);
                    } else {
                        sVar.f41988b = i9;
                    }
                    if (!z3) {
                        break;
                    }
                }
                if ((j6 & (-1152921504606846976L)) != 0) {
                    e eVar = new e();
                    eVar.Z(j6);
                    eVar.X(b9);
                    throw new NumberFormatException("Number too large: ".concat(eVar.G()));
                }
                j6 = (j6 << 4) | i;
                i9++;
                i6++;
            }
            if (i9 != i10) {
            }
            if (!z3) {
            }
        } while (this.f41952n != null);
        this.f41953u -= i6;
        return j6;
    }

    public final int D() {
        if (this.f41953u < 4) {
            throw new EOFException();
        }
        s sVar = this.f41952n;
        kotlin.jvm.internal.h.b(sVar);
        int i = sVar.f41988b;
        int i6 = sVar.f41989c;
        if (i6 - i < 4) {
            return ((z() & 255) << 24) | ((z() & 255) << 16) | ((z() & 255) << 8) | (z() & 255);
        }
        byte[] bArr = sVar.f41987a;
        int i9 = i + 3;
        int i10 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i11 = i + 4;
        int i12 = i10 | (bArr[i9] & 255);
        this.f41953u -= 4;
        if (i11 != i6) {
            sVar.f41988b = i11;
            return i12;
        }
        this.f41952n = sVar.a();
        t.a(sVar);
        return i12;
    }

    public final short E() {
        if (this.f41953u < 2) {
            throw new EOFException();
        }
        s sVar = this.f41952n;
        kotlin.jvm.internal.h.b(sVar);
        int i = sVar.f41988b;
        int i6 = sVar.f41989c;
        if (i6 - i < 2) {
            return (short) (((z() & 255) << 8) | (z() & 255));
        }
        int i9 = i + 1;
        byte[] bArr = sVar.f41987a;
        int i10 = (bArr[i] & 255) << 8;
        int i11 = i + 2;
        int i12 = (bArr[i9] & 255) | i10;
        this.f41953u -= 2;
        if (i11 == i6) {
            this.f41952n = sVar.a();
            t.a(sVar);
        } else {
            sVar.f41988b = i11;
        }
        return (short) i12;
    }

    public final String F(long j6, Charset charset) {
        kotlin.jvm.internal.h.e(charset, "charset");
        if (j6 < 0 || j6 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j6).toString());
        }
        if (this.f41953u < j6) {
            throw new EOFException();
        }
        if (j6 == 0) {
            return "";
        }
        s sVar = this.f41952n;
        kotlin.jvm.internal.h.b(sVar);
        int i = sVar.f41988b;
        if (i + j6 > sVar.f41989c) {
            return new String(A(j6), charset);
        }
        int i6 = (int) j6;
        String str = new String(sVar.f41987a, i, i6, charset);
        int i9 = sVar.f41988b + i6;
        sVar.f41988b = i9;
        this.f41953u -= j6;
        if (i9 == sVar.f41989c) {
            this.f41952n = sVar.a();
            t.a(sVar);
        }
        return str;
    }

    public final String G() {
        return F(this.f41953u, Q7.a.f2664a);
    }

    public final void H(long j6) {
        while (j6 > 0) {
            s sVar = this.f41952n;
            if (sVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j6, sVar.f41989c - sVar.f41988b);
            long j9 = min;
            this.f41953u -= j9;
            j6 -= j9;
            int i = sVar.f41988b + min;
            sVar.f41988b = i;
            if (i == sVar.f41989c) {
                this.f41952n = sVar.a();
                t.a(sVar);
            }
        }
    }

    public final h I(int i) {
        if (i == 0) {
            return h.f41954w;
        }
        b.d(this.f41953u, 0L, i);
        s sVar = this.f41952n;
        int i6 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i) {
            kotlin.jvm.internal.h.b(sVar);
            int i11 = sVar.f41989c;
            int i12 = sVar.f41988b;
            if (i11 == i12) {
                throw new AssertionError("s.limit == s.pos");
            }
            i9 += i11 - i12;
            i10++;
            sVar = sVar.f41992f;
        }
        byte[][] bArr = new byte[i10][];
        int[] iArr = new int[i10 * 2];
        s sVar2 = this.f41952n;
        int i13 = 0;
        while (i6 < i) {
            kotlin.jvm.internal.h.b(sVar2);
            bArr[i13] = sVar2.f41987a;
            i6 += sVar2.f41989c - sVar2.f41988b;
            iArr[i13] = Math.min(i6, i);
            iArr[i13 + i10] = sVar2.f41988b;
            sVar2.f41990d = true;
            i13++;
            sVar2 = sVar2.f41992f;
        }
        return new u(bArr, iArr);
    }

    public final s J(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        s sVar = this.f41952n;
        if (sVar == null) {
            s b9 = t.b();
            this.f41952n = b9;
            b9.f41993g = b9;
            b9.f41992f = b9;
            return b9;
        }
        s sVar2 = sVar.f41993g;
        kotlin.jvm.internal.h.b(sVar2);
        if (sVar2.f41989c + i <= 8192 && sVar2.f41991e) {
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

    @Override // y8.x
    public final z L() {
        return z.f41999d;
    }

    @Override // y8.g
    public final byte[] O() {
        return A(this.f41953u);
    }

    @Override // y8.g
    public final boolean S(long j6) {
        return this.f41953u >= j6;
    }

    @Override // y8.v
    public final void T(long j6, e source) {
        s b9;
        kotlin.jvm.internal.h.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        b.d(source.f41953u, 0L, j6);
        while (j6 > 0) {
            s sVar = source.f41952n;
            kotlin.jvm.internal.h.b(sVar);
            int i = sVar.f41989c;
            s sVar2 = source.f41952n;
            kotlin.jvm.internal.h.b(sVar2);
            long j9 = i - sVar2.f41988b;
            int i6 = 0;
            if (j6 < j9) {
                s sVar3 = this.f41952n;
                s sVar4 = sVar3 != null ? sVar3.f41993g : null;
                if (sVar4 != null && sVar4.f41991e) {
                    if ((sVar4.f41989c + j6) - (sVar4.f41990d ? 0 : sVar4.f41988b) <= 8192) {
                        s sVar5 = source.f41952n;
                        kotlin.jvm.internal.h.b(sVar5);
                        sVar5.d(sVar4, (int) j6);
                        source.f41953u -= j6;
                        this.f41953u += j6;
                        return;
                    }
                }
                s sVar6 = source.f41952n;
                kotlin.jvm.internal.h.b(sVar6);
                int i9 = (int) j6;
                if (i9 <= 0 || i9 > sVar6.f41989c - sVar6.f41988b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i9 >= 1024) {
                    b9 = sVar6.c();
                } else {
                    b9 = t.b();
                    int i10 = sVar6.f41988b;
                    AbstractC5128i.s(sVar6.f41987a, 0, b9.f41987a, i10, i10 + i9);
                }
                b9.f41989c = b9.f41988b + i9;
                sVar6.f41988b += i9;
                s sVar7 = sVar6.f41993g;
                kotlin.jvm.internal.h.b(sVar7);
                sVar7.b(b9);
                source.f41952n = b9;
            }
            s sVar8 = source.f41952n;
            kotlin.jvm.internal.h.b(sVar8);
            long j10 = sVar8.f41989c - sVar8.f41988b;
            source.f41952n = sVar8.a();
            s sVar9 = this.f41952n;
            if (sVar9 == null) {
                this.f41952n = sVar8;
                sVar8.f41993g = sVar8;
                sVar8.f41992f = sVar8;
            } else {
                s sVar10 = sVar9.f41993g;
                kotlin.jvm.internal.h.b(sVar10);
                sVar10.b(sVar8);
                s sVar11 = sVar8.f41993g;
                if (sVar11 == sVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.h.b(sVar11);
                if (sVar11.f41991e) {
                    int i11 = sVar8.f41989c - sVar8.f41988b;
                    s sVar12 = sVar8.f41993g;
                    kotlin.jvm.internal.h.b(sVar12);
                    int i12 = 8192 - sVar12.f41989c;
                    s sVar13 = sVar8.f41993g;
                    kotlin.jvm.internal.h.b(sVar13);
                    if (!sVar13.f41990d) {
                        s sVar14 = sVar8.f41993g;
                        kotlin.jvm.internal.h.b(sVar14);
                        i6 = sVar14.f41988b;
                    }
                    if (i11 <= i12 + i6) {
                        s sVar15 = sVar8.f41993g;
                        kotlin.jvm.internal.h.b(sVar15);
                        sVar8.d(sVar15, i11);
                        sVar8.a();
                        t.a(sVar8);
                    }
                }
            }
            source.f41953u -= j10;
            this.f41953u += j10;
            j6 -= j10;
        }
    }

    public final void V(byte[] source, int i, int i6) {
        kotlin.jvm.internal.h.e(source, "source");
        long j6 = i6;
        b.d(source.length, i, j6);
        int i9 = i6 + i;
        while (i < i9) {
            s J = J(1);
            int min = Math.min(i9 - i, 8192 - J.f41989c);
            int i10 = i + min;
            AbstractC5128i.s(source, J.f41989c, J.f41987a, i, i10);
            J.f41989c += min;
            i = i10;
        }
        this.f41953u += j6;
    }

    public final long W(x source) {
        kotlin.jvm.internal.h.e(source, "source");
        long j6 = 0;
        while (true) {
            long d2 = source.d(8192L, this);
            if (d2 == -1) {
                return j6;
            }
            j6 += d2;
        }
    }

    public final void X(int i) {
        s J = J(1);
        int i6 = J.f41989c;
        J.f41989c = i6 + 1;
        J.f41987a[i6] = (byte) i;
        this.f41953u++;
    }

    public final void Y(long j6) {
        boolean z3;
        byte[] bArr;
        if (j6 == 0) {
            X(48);
            return;
        }
        if (j6 < 0) {
            j6 = -j6;
            if (j6 < 0) {
                d0("-9223372036854775808");
                return;
            }
            z3 = true;
        } else {
            z3 = false;
        }
        byte[] bArr2 = z8.a.f42275a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j6)) * 10) >>> 5;
        int i = numberOfLeadingZeros + (j6 > z8.a.f42276b[numberOfLeadingZeros] ? 1 : 0);
        if (z3) {
            i++;
        }
        s J = J(i);
        int i6 = J.f41989c + i;
        while (true) {
            bArr = J.f41987a;
            if (j6 == 0) {
                break;
            }
            long j9 = 10;
            i6--;
            bArr[i6] = z8.a.f42275a[(int) (j6 % j9)];
            j6 /= j9;
        }
        if (z3) {
            bArr[i6 - 1] = 45;
        }
        J.f41989c += i;
        this.f41953u += i;
    }

    public final void Z(long j6) {
        if (j6 == 0) {
            X(48);
            return;
        }
        long j9 = (j6 >>> 1) | j6;
        long j10 = j9 | (j9 >>> 2);
        long j11 = j10 | (j10 >>> 4);
        long j12 = j11 | (j11 >>> 8);
        long j13 = j12 | (j12 >>> 16);
        long j14 = j13 | (j13 >>> 32);
        long j15 = j14 - ((j14 >>> 1) & 6148914691236517205L);
        long j16 = ((j15 >>> 2) & 3689348814741910323L) + (j15 & 3689348814741910323L);
        long j17 = ((j16 >>> 4) + j16) & 1085102592571150095L;
        long j18 = j17 + (j17 >>> 8);
        long j19 = j18 + (j18 >>> 16);
        int i = (int) ((((j19 & 63) + ((j19 >>> 32) & 63)) + 3) / 4);
        s J = J(i);
        int i6 = J.f41989c;
        for (int i9 = (i6 + i) - 1; i9 >= i6; i9--) {
            J.f41987a[i9] = z8.a.f42275a[(int) (15 & j6)];
            j6 >>>= 4;
        }
        J.f41989c += i;
        this.f41953u += i;
    }

    public final void a(e out, long j6, long j9) {
        kotlin.jvm.internal.h.e(out, "out");
        long j10 = j6;
        b.d(this.f41953u, j10, j9);
        if (j9 == 0) {
            return;
        }
        out.f41953u += j9;
        s sVar = this.f41952n;
        while (true) {
            kotlin.jvm.internal.h.b(sVar);
            long j11 = sVar.f41989c - sVar.f41988b;
            if (j10 < j11) {
                break;
            }
            j10 -= j11;
            sVar = sVar.f41992f;
        }
        s sVar2 = sVar;
        long j12 = j9;
        while (j12 > 0) {
            kotlin.jvm.internal.h.b(sVar2);
            s c9 = sVar2.c();
            int i = c9.f41988b + ((int) j10);
            c9.f41988b = i;
            c9.f41989c = Math.min(i + ((int) j12), c9.f41989c);
            s sVar3 = out.f41952n;
            if (sVar3 == null) {
                c9.f41993g = c9;
                c9.f41992f = c9;
                out.f41952n = c9;
            } else {
                s sVar4 = sVar3.f41993g;
                kotlin.jvm.internal.h.b(sVar4);
                sVar4.b(c9);
            }
            j12 -= c9.f41989c - c9.f41988b;
            sVar2 = sVar2.f41992f;
            j10 = 0;
        }
    }

    public final void a0(int i) {
        s J = J(4);
        int i6 = J.f41989c;
        byte b9 = (byte) ((i >>> 24) & com.anythink.basead.exoplayer.k.p.f8473b);
        byte[] bArr = J.f41987a;
        bArr[i6] = b9;
        bArr[i6 + 1] = (byte) ((i >>> 16) & com.anythink.basead.exoplayer.k.p.f8473b);
        bArr[i6 + 2] = (byte) ((i >>> 8) & com.anythink.basead.exoplayer.k.p.f8473b);
        bArr[i6 + 3] = (byte) (i & com.anythink.basead.exoplayer.k.p.f8473b);
        J.f41989c = i6 + 4;
        this.f41953u += 4;
    }

    public final void b0(long j6) {
        long j9 = ((j6 & 255) << 56) | (((-72057594037927936L) & j6) >>> 56) | ((71776119061217280L & j6) >>> 40) | ((280375465082880L & j6) >>> 24) | ((1095216660480L & j6) >>> 8) | ((4278190080L & j6) << 8) | ((16711680 & j6) << 24) | ((65280 & j6) << 40);
        s J = J(8);
        int i = J.f41989c;
        byte[] bArr = J.f41987a;
        bArr[i] = (byte) ((j9 >>> 56) & 255);
        bArr[i + 1] = (byte) ((j9 >>> 48) & 255);
        bArr[i + 2] = (byte) ((j9 >>> 40) & 255);
        bArr[i + 3] = (byte) ((j9 >>> 32) & 255);
        bArr[i + 4] = (byte) ((j9 >>> 24) & 255);
        bArr[i + 5] = (byte) ((j9 >>> 16) & 255);
        bArr[i + 6] = (byte) ((j9 >>> 8) & 255);
        bArr[i + 7] = (byte) (j9 & 255);
        J.f41989c = i + 8;
        this.f41953u += 8;
    }

    public final void c0(int i, int i6, String string) {
        char charAt;
        kotlin.jvm.internal.h.e(string, "string");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC4404f.e(i, "beginIndex < 0: ").toString());
        }
        if (i6 < i) {
            throw new IllegalArgumentException(u1.h.c(i6, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i6 > string.length()) {
            StringBuilder i9 = AbstractC4404f.i(i6, "endIndex > string.length: ", " > ");
            i9.append(string.length());
            throw new IllegalArgumentException(i9.toString().toString());
        }
        while (i < i6) {
            char charAt2 = string.charAt(i);
            if (charAt2 < 128) {
                s J = J(1);
                int i10 = J.f41989c - i;
                int min = Math.min(i6, 8192 - i10);
                int i11 = i + 1;
                byte[] bArr = J.f41987a;
                bArr[i + i10] = (byte) charAt2;
                while (true) {
                    i = i11;
                    if (i >= min || (charAt = string.charAt(i)) >= 128) {
                        break;
                    }
                    i11 = i + 1;
                    bArr[i + i10] = (byte) charAt;
                }
                int i12 = J.f41989c;
                int i13 = (i10 + i) - i12;
                J.f41989c = i12 + i13;
                this.f41953u += i13;
            } else {
                if (charAt2 < 2048) {
                    s J2 = J(2);
                    int i14 = J2.f41989c;
                    byte[] bArr2 = J2.f41987a;
                    bArr2[i14] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i14 + 1] = (byte) ((charAt2 & '?') | 128);
                    J2.f41989c = i14 + 2;
                    this.f41953u += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    s J8 = J(3);
                    int i15 = J8.f41989c;
                    byte[] bArr3 = J8.f41987a;
                    bArr3[i15] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i15 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i15 + 2] = (byte) ((charAt2 & '?') | 128);
                    J8.f41989c = i15 + 3;
                    this.f41953u += 3;
                } else {
                    int i16 = i + 1;
                    char charAt3 = i16 < i6 ? string.charAt(i16) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        X(63);
                        i = i16;
                    } else {
                        int i17 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + com.anythink.basead.exoplayer.b.aX;
                        s J9 = J(4);
                        int i18 = J9.f41989c;
                        byte[] bArr4 = J9.f41987a;
                        bArr4[i18] = (byte) ((i17 >> 18) | 240);
                        bArr4[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                        bArr4[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                        bArr4[i18 + 3] = (byte) ((i17 & 63) | 128);
                        J9.f41989c = i18 + 4;
                        this.f41953u += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final Object clone() {
        e eVar = new e();
        if (this.f41953u == 0) {
            return eVar;
        }
        s sVar = this.f41952n;
        kotlin.jvm.internal.h.b(sVar);
        s c9 = sVar.c();
        eVar.f41952n = c9;
        c9.f41993g = c9;
        c9.f41992f = c9;
        for (s sVar2 = sVar.f41992f; sVar2 != sVar; sVar2 = sVar2.f41992f) {
            s sVar3 = c9.f41993g;
            kotlin.jvm.internal.h.b(sVar3);
            kotlin.jvm.internal.h.b(sVar2);
            sVar3.b(sVar2.c());
        }
        eVar.f41953u = this.f41953u;
        return eVar;
    }

    @Override // y8.x
    public final long d(long j6, e sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        if (j6 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
        }
        long j9 = this.f41953u;
        if (j9 == 0) {
            return -1L;
        }
        if (j6 > j9) {
            j6 = j9;
        }
        sink.T(j6, this);
        return j6;
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
            int i6 = J.f41989c;
            byte[] bArr = J.f41987a;
            bArr[i6] = (byte) ((i >> 6) | 192);
            bArr[i6 + 1] = (byte) ((i & 63) | 128);
            J.f41989c = i6 + 2;
            this.f41953u += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            X(63);
            return;
        }
        if (i < 65536) {
            s J2 = J(3);
            int i9 = J2.f41989c;
            byte[] bArr2 = J2.f41987a;
            bArr2[i9] = (byte) ((i >> 12) | 224);
            bArr2[i9 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i9 + 2] = (byte) ((i & 63) | 128);
            J2.f41989c = i9 + 3;
            this.f41953u += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(b.i(i)));
        }
        s J8 = J(4);
        int i10 = J8.f41989c;
        byte[] bArr3 = J8.f41987a;
        bArr3[i10] = (byte) ((i >> 18) | 240);
        bArr3[i10 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i10 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i10 + 3] = (byte) ((i & 63) | 128);
        J8.f41989c = i10 + 4;
        this.f41953u += 4;
    }

    public final boolean equals(Object obj) {
        boolean z3 = true;
        if (this == obj) {
            return true;
        }
        boolean z6 = false;
        if (!(obj instanceof e)) {
            return false;
        }
        long j6 = this.f41953u;
        e eVar = (e) obj;
        if (j6 != eVar.f41953u) {
            return false;
        }
        if (j6 == 0) {
            return true;
        }
        s sVar = this.f41952n;
        kotlin.jvm.internal.h.b(sVar);
        s sVar2 = eVar.f41952n;
        kotlin.jvm.internal.h.b(sVar2);
        int i = sVar.f41988b;
        int i6 = sVar2.f41988b;
        long j9 = 0;
        while (j9 < this.f41953u) {
            long min = Math.min(sVar.f41989c - i, sVar2.f41989c - i6);
            long j10 = 0;
            while (j10 < min) {
                int i9 = i + 1;
                boolean z9 = z3;
                byte b9 = sVar.f41987a[i];
                int i10 = i6 + 1;
                boolean z10 = z6;
                if (b9 != sVar2.f41987a[i6]) {
                    return z10;
                }
                j10++;
                i6 = i10;
                i = i9;
                z3 = z9;
                z6 = z10;
            }
            boolean z11 = z3;
            boolean z12 = z6;
            if (i == sVar.f41989c) {
                s sVar3 = sVar.f41992f;
                kotlin.jvm.internal.h.b(sVar3);
                i = sVar3.f41988b;
                sVar = sVar3;
            }
            if (i6 == sVar2.f41989c) {
                sVar2 = sVar2.f41992f;
                kotlin.jvm.internal.h.b(sVar2);
                i6 = sVar2.f41988b;
            }
            j9 += min;
            z3 = z11;
            z6 = z12;
        }
        return z3;
    }

    public final int hashCode() {
        s sVar = this.f41952n;
        if (sVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i6 = sVar.f41989c;
            for (int i9 = sVar.f41988b; i9 < i6; i9++) {
                i = (i * 31) + sVar.f41987a[i9];
            }
            sVar = sVar.f41992f;
            kotlin.jvm.internal.h.b(sVar);
        } while (sVar != this.f41952n);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final boolean j() {
        return this.f41953u == 0;
    }

    public final byte k(long j6) {
        b.d(this.f41953u, j6, 1L);
        s sVar = this.f41952n;
        if (sVar == null) {
            kotlin.jvm.internal.h.b(null);
            throw null;
        }
        long j9 = this.f41953u;
        if (j9 - j6 < j6) {
            while (j9 > j6) {
                sVar = sVar.f41993g;
                kotlin.jvm.internal.h.b(sVar);
                j9 -= sVar.f41989c - sVar.f41988b;
            }
            return sVar.f41987a[(int) ((sVar.f41988b + j6) - j9)];
        }
        long j10 = 0;
        while (true) {
            int i = sVar.f41989c;
            int i6 = sVar.f41988b;
            long j11 = (i - i6) + j10;
            if (j11 > j6) {
                return sVar.f41987a[(int) ((i6 + j6) - j10)];
            }
            sVar = sVar.f41992f;
            kotlin.jvm.internal.h.b(sVar);
            j10 = j11;
        }
    }

    public final int l(byte[] bArr, int i, int i6) {
        b.d(bArr.length, i, i6);
        s sVar = this.f41952n;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(i6, sVar.f41989c - sVar.f41988b);
        int i9 = sVar.f41988b;
        AbstractC5128i.s(sVar.f41987a, i, bArr, i9, i9 + min);
        int i10 = sVar.f41988b + min;
        sVar.f41988b = i10;
        this.f41953u -= min;
        if (i10 == sVar.f41989c) {
            this.f41952n = sVar.a();
            t.a(sVar);
        }
        return min;
    }

    @Override // y8.f
    public final /* bridge */ /* synthetic */ f r(long j6) {
        b0(j6);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        s sVar = this.f41952n;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), sVar.f41989c - sVar.f41988b);
        sink.put(sVar.f41987a, sVar.f41988b, min);
        int i = sVar.f41988b + min;
        sVar.f41988b = i;
        this.f41953u -= min;
        if (i == sVar.f41989c) {
            this.f41952n = sVar.a();
            t.a(sVar);
        }
        return min;
    }

    @Override // y8.f
    public final f s(int i) {
        a0(b.f(i));
        return this;
    }

    @Override // y8.f
    public final /* bridge */ /* synthetic */ f t(int i) {
        X(i);
        return this;
    }

    public final String toString() {
        long j6 = this.f41953u;
        if (j6 <= 2147483647L) {
            return I((int) j6).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f41953u).toString());
    }

    @Override // y8.f
    public final /* bridge */ /* synthetic */ f u(String str) {
        d0(str);
        return this;
    }

    @Override // y8.f
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
            int min = Math.min(i, 8192 - J.f41989c);
            source.get(J.f41987a, J.f41989c, min);
            i -= min;
            J.f41989c += min;
        }
        this.f41953u += remaining;
        return remaining;
    }

    public final byte z() {
        if (this.f41953u == 0) {
            throw new EOFException();
        }
        s sVar = this.f41952n;
        kotlin.jvm.internal.h.b(sVar);
        int i = sVar.f41988b;
        int i6 = sVar.f41989c;
        int i9 = i + 1;
        byte b9 = sVar.f41987a[i];
        this.f41953u--;
        if (i9 != i6) {
            sVar.f41988b = i9;
            return b9;
        }
        this.f41952n = sVar.a();
        t.a(sVar);
        return b9;
    }

    @Override // y8.g
    public final e P() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, y8.v
    public final void close() {
    }

    @Override // y8.v, java.io.Flushable
    public final void flush() {
    }
}
