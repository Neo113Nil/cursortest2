package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class Cr {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f24248d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f24249e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final XB f24250f = XB.o(new Object[]{StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE}, 5);

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f24251g = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public byte[] f24252a;

    /* renamed from: b, reason: collision with root package name */
    public int f24253b;

    /* renamed from: c, reason: collision with root package name */
    public int f24254c;

    public Cr(byte[] bArr, int i) {
        this.f24252a = bArr;
        this.f24254c = i;
    }

    public static int u(Charset charset) {
        AbstractC2772Sd.C(f24250f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean w(byte b9) {
        return (b9 & 192) == 128;
    }

    public static int x(int i, int i6, int i9, int i10) {
        return UC.m((byte) 0, WC.a(((i & 7) << 2) | ((i6 & 48) >> 4)), WC.a(((i9 & 60) >> 2) | ((i6 & 15) << 4)), WC.a((i10 & 63) | ((i9 & 3) << 6)));
    }

    public final void A(int i) {
        byte[] bArr = this.f24252a;
        if (i > bArr.length) {
            this.f24252a = Arrays.copyOf(bArr, i);
        }
    }

    public final int B() {
        return Math.max(this.f24254c - this.f24253b, 0);
    }

    public final void C(int i) {
        boolean z3 = false;
        if (i >= 0 && i <= this.f24252a.length) {
            z3 = true;
        }
        AbstractC2772Sd.i(z3);
        this.f24254c = i;
    }

    public final int D() {
        return this.f24253b;
    }

    public final void E(int i) {
        boolean z3 = false;
        if (i >= 0 && i <= this.f24254c) {
            z3 = true;
        }
        AbstractC2772Sd.i(z3);
        this.f24253b = i;
    }

    public final byte[] F() {
        return this.f24252a;
    }

    public final void G(int i) {
        E(this.f24253b + i);
    }

    public final void H(byte[] bArr, int i, int i6) {
        v(i6);
        System.arraycopy(this.f24252a, this.f24253b, bArr, i, i6);
        this.f24253b += i6;
    }

    public final int I() {
        v(1);
        return this.f24252a[this.f24253b] & 255;
    }

    public final int J() {
        if (B() >= 4) {
            this.f24253b -= 4;
            return b();
        }
        int i = this.f24253b;
        int i6 = this.f24254c;
        throw new IndexOutOfBoundsException(D.y.r(new StringBuilder(String.valueOf(i).length() + 17 + String.valueOf(i6).length()), "position=", i, ", limit=", i6));
    }

    public final int K() {
        v(1);
        byte[] bArr = this.f24252a;
        int i = this.f24253b;
        this.f24253b = i + 1;
        return bArr[i] & 255;
    }

    public final int L() {
        v(2);
        byte[] bArr = this.f24252a;
        int i = this.f24253b;
        int i6 = i + 1;
        this.f24253b = i6;
        int i9 = bArr[i] & 255;
        this.f24253b = i + 2;
        return (bArr[i6] & 255) | (i9 << 8);
    }

    public final int M() {
        v(2);
        byte[] bArr = this.f24252a;
        int i = this.f24253b;
        int i6 = i + 1;
        this.f24253b = i6;
        int i9 = bArr[i] & 255;
        this.f24253b = i + 2;
        return ((bArr[i6] & 255) << 8) | i9;
    }

    public final short N() {
        v(2);
        byte[] bArr = this.f24252a;
        int i = this.f24253b;
        int i6 = i + 1;
        this.f24253b = i6;
        int i9 = bArr[i] & 255;
        this.f24253b = i + 2;
        return (short) ((bArr[i6] & 255) | (i9 << 8));
    }

    public final int O() {
        v(3);
        byte[] bArr = this.f24252a;
        int i = this.f24253b;
        int i6 = i + 1;
        this.f24253b = i6;
        int i9 = bArr[i] & 255;
        int i10 = i + 2;
        this.f24253b = i10;
        int i11 = bArr[i6] & 255;
        this.f24253b = i + 3;
        return (bArr[i10] & 255) | (i9 << 16) | (i11 << 8);
    }

    public final long P() {
        v(4);
        byte[] bArr = this.f24252a;
        int i = this.f24253b;
        int i6 = i + 1;
        this.f24253b = i6;
        long j6 = bArr[i];
        int i9 = i + 2;
        this.f24253b = i9;
        long j9 = bArr[i6];
        this.f24253b = i + 3;
        long j10 = bArr[i9];
        this.f24253b = i + 4;
        return (bArr[r3] & 255) | ((j6 & 255) << 24) | ((j9 & 255) << 16) | ((j10 & 255) << 8);
    }

    public final long a() {
        v(4);
        byte[] bArr = this.f24252a;
        int i = this.f24253b;
        int i6 = i + 1;
        this.f24253b = i6;
        long j6 = bArr[i];
        int i9 = i + 2;
        this.f24253b = i9;
        long j9 = bArr[i6];
        this.f24253b = i + 3;
        long j10 = bArr[i9];
        this.f24253b = i + 4;
        return ((bArr[r3] & 255) << 24) | (255 & j6) | ((j9 & 255) << 8) | ((j10 & 255) << 16);
    }

    public final int b() {
        v(4);
        byte[] bArr = this.f24252a;
        int i = this.f24253b;
        int i6 = i + 1;
        this.f24253b = i6;
        int i9 = bArr[i] & 255;
        int i10 = i + 2;
        this.f24253b = i10;
        int i11 = bArr[i6] & 255;
        int i12 = i + 3;
        this.f24253b = i12;
        int i13 = bArr[i10] & 255;
        this.f24253b = i + 4;
        return (bArr[i12] & 255) | (i9 << 24) | (i11 << 16) | (i13 << 8);
    }

    public final int c() {
        v(4);
        byte[] bArr = this.f24252a;
        int i = this.f24253b;
        int i6 = i + 1;
        this.f24253b = i6;
        int i9 = bArr[i] & 255;
        int i10 = i + 2;
        this.f24253b = i10;
        int i11 = bArr[i6] & 255;
        int i12 = i + 3;
        this.f24253b = i12;
        int i13 = bArr[i10] & 255;
        this.f24253b = i + 4;
        return ((bArr[i12] & 255) << 24) | (i11 << 8) | i9 | (i13 << 16);
    }

    public final long d() {
        v(8);
        byte[] bArr = this.f24252a;
        int i = this.f24253b;
        int i6 = i + 1;
        this.f24253b = i6;
        long j6 = bArr[i];
        int i9 = i + 2;
        this.f24253b = i9;
        long j9 = bArr[i6];
        int i10 = i + 3;
        this.f24253b = i10;
        long j10 = bArr[i9];
        int i11 = i + 4;
        this.f24253b = i11;
        long j11 = bArr[i10];
        int i12 = i + 5;
        this.f24253b = i12;
        long j12 = bArr[i11];
        int i13 = i + 6;
        this.f24253b = i13;
        long j13 = bArr[i12];
        this.f24253b = i + 7;
        long j14 = bArr[i13];
        this.f24253b = i + 8;
        return ((j14 & 255) << 8) | ((j6 & 255) << 56) | ((j9 & 255) << 48) | ((j10 & 255) << 40) | ((j11 & 255) << 32) | ((j12 & 255) << 24) | ((j13 & 255) << 16) | (bArr[r4] & 255);
    }

    public final long e() {
        v(8);
        byte[] bArr = this.f24252a;
        int i = this.f24253b;
        int i6 = i + 1;
        this.f24253b = i6;
        long j6 = bArr[i];
        int i9 = i + 2;
        this.f24253b = i9;
        long j9 = bArr[i6];
        int i10 = i + 3;
        this.f24253b = i10;
        long j10 = bArr[i9];
        int i11 = i + 4;
        this.f24253b = i11;
        long j11 = bArr[i10];
        int i12 = i + 5;
        this.f24253b = i12;
        long j12 = bArr[i11];
        int i13 = i + 6;
        this.f24253b = i13;
        long j13 = bArr[i12];
        this.f24253b = i + 7;
        long j14 = bArr[i13];
        this.f24253b = i + 8;
        return ((j14 & 255) << 48) | (j6 & 255) | ((j9 & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((j12 & 255) << 32) | ((j13 & 255) << 40) | ((bArr[r4] & 255) << 56);
    }

    public final int f() {
        v(4);
        byte[] bArr = this.f24252a;
        int i = this.f24253b;
        int i6 = i + 1;
        this.f24253b = i6;
        int i9 = bArr[i] & 255;
        this.f24253b = i + 2;
        int i10 = bArr[i6] & 255;
        this.f24253b = i + 4;
        return (i9 << 8) | i10;
    }

    public final int g() {
        return (K() << 21) | (K() << 14) | (K() << 7) | K();
    }

    public final int h() {
        int b9 = b();
        if (b9 >= 0) {
            return b9;
        }
        throw new IllegalStateException(D.y.m(b9, "Top bit not zero: ", new StringBuilder(String.valueOf(b9).length() + 18)));
    }

    public final int i() {
        int c9 = c();
        if (c9 >= 0) {
            return c9;
        }
        throw new IllegalStateException(D.y.m(c9, "Top bit not zero: ", new StringBuilder(String.valueOf(c9).length() + 18)));
    }

    public final long j() {
        long d2 = d();
        if (d2 >= 0) {
            return d2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(d2);
        throw new IllegalStateException(sb.toString());
    }

    public final String k(int i, Charset charset) {
        v(i);
        byte[] bArr = this.f24252a;
        int i6 = this.f24253b;
        String str = new String(bArr, i6, i, charset);
        this.f24253b = i6 + i;
        return str;
    }

    public final String l(int i) {
        v(i);
        if (i == 0) {
            return "";
        }
        int i6 = this.f24253b;
        int i9 = (i6 + i) - 1;
        int i10 = (i9 >= this.f24254c || this.f24252a[i9] != 0) ? i : i - 1;
        byte[] bArr = this.f24252a;
        String str = AbstractC3159eu.f29993a;
        String str2 = new String(bArr, i6, i10, StandardCharsets.UTF_8);
        this.f24253b += i;
        return str2;
    }

    public final String m() {
        if (B() == 0) {
            return null;
        }
        int i = this.f24253b;
        while (i < this.f24254c && this.f24252a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f24252a;
        int i6 = this.f24253b;
        String str = AbstractC3159eu.f29993a;
        String str2 = new String(bArr, i6, i - i6, StandardCharsets.UTF_8);
        this.f24253b = i;
        if (i < this.f24254c) {
            this.f24253b = i + 1;
        }
        return str2;
    }

    public final String n(Charset charset) {
        int i;
        AbstractC2772Sd.C(f24250f.contains(charset), "Unsupported charset: %s", charset);
        if (B() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            q();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            i = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i6 = this.f24253b;
        while (true) {
            int i9 = this.f24254c;
            if (i6 >= i9 - (i - 1)) {
                i6 = i9;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b9 = this.f24252a[i6];
                String str = AbstractC3159eu.f29993a;
                if (b9 != 10) {
                    if (b9 == 13) {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.f24252a;
                if (bArr[i6] == 0) {
                    byte b10 = bArr[i6 + 1];
                    String str2 = AbstractC3159eu.f29993a;
                    if (b10 != 10) {
                        if (b10 == 13) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.f24252a;
                if (bArr2[i6 + 1] == 0) {
                    byte b11 = bArr2[i6];
                    String str3 = AbstractC3159eu.f29993a;
                    if (b11 == 10 || b11 == 13) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            i6 += i;
        }
        String k9 = k(i6 - this.f24253b, charset);
        if (this.f24253b != this.f24254c && s(charset, f24248d) == '\r') {
            s(charset, f24249e);
        }
        return k9;
    }

    public final long o() {
        int i;
        v(1);
        long j6 = this.f24252a[this.f24253b];
        int i6 = 7;
        while (true) {
            i = 0;
            if (i6 < 0) {
                break;
            }
            if (((1 << i6) & j6) != 0) {
                i6--;
            } else if (i6 < 6) {
                j6 &= r7 - 1;
                i = 7 - i6;
            } else if (i6 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 35);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j6);
            throw new NumberFormatException(sb.toString());
        }
        v(i);
        for (int i9 = 1; i9 < i; i9++) {
            if ((this.f24252a[this.f24253b + i9] & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j6).length() + 42);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j6);
                throw new NumberFormatException(sb2.toString());
            }
            j6 = (j6 << 6) | (r3 & com.anythink.core.common.s.a.c.f16318c);
        }
        this.f24253b += i;
        return j6;
    }

    public final long p() {
        long j6 = 0;
        for (int i = 0; i < 9; i++) {
            if (this.f24253b == this.f24254c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long K7 = K();
            j6 |= (127 & K7) << (i * 7);
            if ((K7 & 128) == 0) {
                return j6;
            }
        }
        return j6;
    }

    public final Charset q() {
        if (B() >= 3) {
            byte[] bArr = this.f24252a;
            int i = this.f24253b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f24253b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (B() < 2) {
            return null;
        }
        byte[] bArr2 = this.f24252a;
        int i6 = this.f24253b;
        byte b9 = bArr2[i6];
        if (b9 == -2) {
            if (bArr2[i6 + 1] != -1) {
                return null;
            }
            this.f24253b = i6 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b9 != -1 || bArr2[i6 + 1] != -2) {
            return null;
        }
        this.f24253b = i6 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final char r(int i, ByteOrder byteOrder) {
        byte b9;
        byte b10;
        v(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f24252a;
            int i6 = this.f24253b + i;
            b9 = bArr[i6];
            b10 = bArr[i6 + 1];
        } else {
            byte[] bArr2 = this.f24252a;
            int i9 = this.f24253b + i;
            b9 = bArr2[i9 + 1];
            b10 = bArr2[i9];
        }
        return (char) ((b9 << 8) | (b10 & 255));
    }

    public final char s(Charset charset, char[] cArr) {
        int t6;
        if (B() >= u(charset) && (t6 = t(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(r0)) {
                long j6 = r0;
                char c9 = (char) j6;
                AbstractC2772Sd.A(((long) c9) == j6, "Out of range: %s", j6);
                for (char c10 : cArr) {
                    if (c10 == c9) {
                        this.f24253b = UC.a(t6 & com.anythink.basead.exoplayer.k.p.f8473b) + this.f24253b;
                        return c9;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int t(Charset charset) {
        int i;
        int i6;
        int i9;
        AbstractC2772Sd.C(f24250f.contains(charset), "Unsupported charset: %s", charset);
        if (B() < u(charset)) {
            int i10 = this.f24253b;
            int i11 = this.f24254c;
            throw new IndexOutOfBoundsException(D.y.r(new StringBuilder(String.valueOf(i10).length() + 17 + String.valueOf(i11).length()), "position=", i10, ", limit=", i11));
        }
        int i12 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b9 = this.f24252a[this.f24253b];
            if ((b9 & com.anythink.core.common.s.a.c.f16316a) == 0) {
                i = b9 & 255;
                return (i << 8) | i12;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b10 = this.f24252a[this.f24253b];
            if ((b10 & com.anythink.core.common.s.a.c.f16316a) == 0) {
                i6 = 1;
            } else if ((b10 & 224) == 192 && B() >= 2 && w(this.f24252a[this.f24253b + 1])) {
                i6 = 2;
            } else {
                if ((this.f24252a[this.f24253b] & 240) == 224 && B() >= 3) {
                    byte[] bArr = this.f24252a;
                    int i13 = this.f24253b;
                    if (w(bArr[i13 + 1]) && w(bArr[i13 + 2])) {
                        i6 = 3;
                    }
                }
                if ((this.f24252a[this.f24253b] & 248) == 240 && B() >= 4) {
                    byte[] bArr2 = this.f24252a;
                    int i14 = this.f24253b;
                    if (w(bArr2[i14 + 1]) && w(bArr2[i14 + 2]) && w(bArr2[i14 + 3])) {
                        i6 = 4;
                    }
                }
                i6 = 0;
            }
            if (i6 == 1) {
                i9 = this.f24252a[this.f24253b] & 255;
            } else if (i6 == 2) {
                byte[] bArr3 = this.f24252a;
                int i15 = this.f24253b;
                i9 = x(0, 0, bArr3[i15], bArr3[i15 + 1]);
            } else {
                if (i6 != 3) {
                    if (i6 == 4) {
                        byte[] bArr4 = this.f24252a;
                        int i16 = this.f24253b;
                        i9 = x(bArr4[i16], bArr4[i16 + 1], bArr4[i16 + 2], bArr4[i16 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.f24252a;
                int i17 = this.f24253b;
                i9 = x(0, bArr5[i17] & 15, bArr5[i17 + 1], bArr5[i17 + 2]);
            }
            i12 = i6;
            i = i9;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char r9 = r(0, byteOrder);
            if (!Character.isHighSurrogate(r9) || B() < 4) {
                i = r9;
                i12 = 2;
            } else {
                i = Character.toCodePoint(r9, r(2, byteOrder));
                i12 = 4;
            }
        }
        return (i << 8) | i12;
    }

    public final void v(int i) {
        if (!f24251g.get() || B() >= i) {
            return;
        }
        int B9 = B();
        throw new IndexOutOfBoundsException(D.y.r(new StringBuilder(String.valueOf(i).length() + 25 + String.valueOf(B9).length()), "bytesNeeded= ", i, ", bytesLeft=", B9));
    }

    public final void y(int i) {
        byte[] bArr = this.f24252a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        z(i, bArr);
    }

    public final void z(int i, byte[] bArr) {
        this.f24252a = bArr;
        this.f24254c = i;
        this.f24253b = 0;
    }

    public Cr() {
        this.f24252a = AbstractC3159eu.f29994b;
    }

    public Cr(int i) {
        this.f24252a = new byte[i];
        this.f24254c = i;
    }

    public Cr(byte[] bArr) {
        this.f24252a = bArr;
        this.f24254c = bArr.length;
    }
}
