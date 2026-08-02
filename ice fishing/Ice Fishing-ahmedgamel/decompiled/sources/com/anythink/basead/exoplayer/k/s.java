package com.anythink.basead.exoplayer.k;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9288a;

    /* renamed from: b, reason: collision with root package name */
    private int f9289b;

    /* renamed from: c, reason: collision with root package name */
    private int f9290c;

    public s() {
    }

    private int A() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        int i4 = i + 1;
        this.f9289b = i4;
        int i6 = bArr[i] & 255;
        int i9 = i + 2;
        this.f9289b = i9;
        int i10 = ((bArr[i4] & 255) << 8) | i6;
        int i11 = i + 3;
        this.f9289b = i11;
        int i12 = i10 | ((bArr[i9] & 255) << 16);
        this.f9289b = i + 4;
        return ((bArr[i11] & 255) << 24) | i12;
    }

    private long B() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        this.f9289b = i + 1;
        this.f9289b = i + 2;
        this.f9289b = i + 3;
        long j6 = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f9289b = i + 4;
        long j9 = j6 | ((bArr[r8] & 255) << 24);
        this.f9289b = i + 5;
        long j10 = j9 | ((bArr[r7] & 255) << 32);
        this.f9289b = i + 6;
        long j11 = j10 | ((bArr[r8] & 255) << 40);
        this.f9289b = i + 7;
        long j12 = j11 | ((bArr[r7] & 255) << 48);
        this.f9289b = i + 8;
        return ((bArr[r8] & 255) << 56) | j12;
    }

    private int C() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        int i4 = i + 1;
        this.f9289b = i4;
        int i6 = bArr[i] & 255;
        int i9 = i + 2;
        this.f9289b = i9;
        int i10 = ((bArr[i4] & 255) << 8) | i6;
        int i11 = i + 3;
        this.f9289b = i11;
        int i12 = i10 | ((bArr[i9] & 255) << 16);
        this.f9289b = i + 4;
        int i13 = ((bArr[i11] & 255) << 24) | i12;
        if (i13 >= 0) {
            return i13;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(i13)));
    }

    private float D() {
        return Float.intBitsToFloat(i());
    }

    private double E() {
        return Double.longBitsToDouble(j());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r0 == r2) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String F() {
        if (a() == 0) {
            return null;
        }
        int i = this.f9289b;
        while (i < this.f9290c && !af.a((int) this.f9288a[i])) {
            i++;
        }
        int i4 = this.f9289b;
        if (i - i4 >= 3) {
            byte[] bArr = this.f9288a;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.f9289b = i4 + 3;
            }
        }
        byte[] bArr2 = this.f9288a;
        int i6 = this.f9289b;
        String a9 = af.a(bArr2, i6, i - i6);
        this.f9289b = i;
        int i9 = this.f9290c;
        if (i != i9) {
            byte[] bArr3 = this.f9288a;
            if (bArr3[i] == 13) {
                int i10 = i + 1;
                this.f9289b = i10;
            }
            int i11 = this.f9289b;
            if (bArr3[i11] == 10) {
                this.f9289b = i11 + 1;
            }
        }
        return a9;
    }

    private long G() {
        int i;
        int i4;
        long j6 = this.f9288a[this.f9289b];
        int i6 = 7;
        while (true) {
            if (i6 < 0) {
                break;
            }
            if (((1 << i6) & j6) != 0) {
                i6--;
            } else if (i6 < 6) {
                j6 &= r6 - 1;
                i4 = 7 - i6;
            } else if (i6 == 7) {
                i4 = 1;
            }
        }
        i4 = 0;
        if (i4 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: ".concat(String.valueOf(j6)));
        }
        for (i = 1; i < i4; i++) {
            if ((this.f9288a[this.f9289b + i] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: ".concat(String.valueOf(j6)));
            }
            j6 = (j6 << 6) | (r3 & com.anythink.core.common.s.a.c.f17105c);
        }
        this.f9289b += i4;
        return j6;
    }

    private void q() {
        this.f9289b = 0;
        this.f9290c = 0;
    }

    private int r() {
        byte[] bArr = this.f9288a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    private int s() {
        return this.f9288a[this.f9289b] & 255;
    }

    private char t() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    private int u() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        int i4 = i + 1;
        this.f9289b = i4;
        int i6 = bArr[i] & 255;
        this.f9289b = i + 2;
        return ((bArr[i4] & 255) << 8) | i6;
    }

    private short v() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        int i4 = i + 1;
        this.f9289b = i4;
        int i6 = bArr[i] & 255;
        this.f9289b = i + 2;
        return (short) (((bArr[i4] & 255) << 8) | i6);
    }

    private int w() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        int i4 = i + 1;
        this.f9289b = i4;
        int i6 = ((bArr[i] & 255) << 24) >> 8;
        int i9 = i + 2;
        this.f9289b = i9;
        int i10 = ((bArr[i4] & 255) << 8) | i6;
        this.f9289b = i + 3;
        return (bArr[i9] & 255) | i10;
    }

    private int x() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        int i4 = i + 1;
        this.f9289b = i4;
        int i6 = bArr[i] & 255;
        int i9 = i + 2;
        this.f9289b = i9;
        int i10 = ((bArr[i4] & 255) << 8) | i6;
        this.f9289b = i + 3;
        return ((bArr[i9] & 255) << 16) | i10;
    }

    private int y() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        int i4 = i + 1;
        this.f9289b = i4;
        int i6 = bArr[i] & 255;
        int i9 = i + 2;
        this.f9289b = i9;
        int i10 = ((bArr[i4] & 255) << 8) | i6;
        this.f9289b = i + 3;
        return ((bArr[i9] & 255) << 16) | i10;
    }

    private long z() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        this.f9289b = i + 1;
        this.f9289b = i + 2;
        this.f9289b = i + 3;
        long j6 = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f9289b = i + 4;
        return ((bArr[r4] & 255) << 24) | j6;
    }

    public final void a(byte[] bArr, int i) {
        this.f9288a = bArr;
        this.f9290c = i;
        this.f9289b = 0;
    }

    public final int b() {
        return this.f9290c;
    }

    public final int c() {
        return this.f9289b;
    }

    public final void d(int i) {
        c(this.f9289b + i);
    }

    public final int e() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        int i4 = i + 1;
        this.f9289b = i4;
        int i6 = (bArr[i] & 255) << 8;
        this.f9289b = i + 2;
        return (bArr[i4] & 255) | i6;
    }

    public final short f() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        int i4 = i + 1;
        this.f9289b = i4;
        int i6 = (bArr[i] & 255) << 8;
        this.f9289b = i + 2;
        return (short) ((bArr[i4] & 255) | i6);
    }

    public final int g() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        int i4 = i + 1;
        this.f9289b = i4;
        int i6 = (bArr[i] & 255) << 16;
        int i9 = i + 2;
        this.f9289b = i9;
        int i10 = ((bArr[i4] & 255) << 8) | i6;
        this.f9289b = i + 3;
        return (bArr[i9] & 255) | i10;
    }

    public final long h() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        this.f9289b = i + 1;
        this.f9289b = i + 2;
        this.f9289b = i + 3;
        long j6 = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f9289b = i + 4;
        return (bArr[r4] & 255) | j6;
    }

    public final int i() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        int i4 = i + 1;
        this.f9289b = i4;
        int i6 = (bArr[i] & 255) << 24;
        int i9 = i + 2;
        this.f9289b = i9;
        int i10 = ((bArr[i4] & 255) << 16) | i6;
        int i11 = i + 3;
        this.f9289b = i11;
        int i12 = i10 | ((bArr[i9] & 255) << 8);
        this.f9289b = i + 4;
        return (bArr[i11] & 255) | i12;
    }

    public final long j() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        this.f9289b = i + 1;
        this.f9289b = i + 2;
        this.f9289b = i + 3;
        long j6 = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f9289b = i + 4;
        long j9 = j6 | ((bArr[r4] & 255) << 32);
        this.f9289b = i + 5;
        long j10 = j9 | ((bArr[r7] & 255) << 24);
        this.f9289b = i + 6;
        long j11 = j10 | ((bArr[r4] & 255) << 16);
        this.f9289b = i + 7;
        long j12 = j11 | ((bArr[r7] & 255) << 8);
        this.f9289b = i + 8;
        return (bArr[r4] & 255) | j12;
    }

    public final int k() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        int i4 = i + 1;
        this.f9289b = i4;
        int i6 = (bArr[i] & 255) << 8;
        this.f9289b = i + 2;
        int i9 = (bArr[i4] & 255) | i6;
        this.f9289b = i + 4;
        return i9;
    }

    public final int l() {
        return (d() << 21) | (d() << 14) | (d() << 7) | d();
    }

    public final int m() {
        int i = i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(i)));
    }

    public final long n() {
        long j6 = j();
        if (j6 >= 0) {
            return j6;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(j6)));
    }

    public final String o() {
        String str = new String(this.f9288a, this.f9289b, 4, Charset.forName("UTF-8"));
        this.f9289b += 4;
        return str;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i = this.f9289b;
        while (i < this.f9290c && this.f9288a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f9288a;
        int i4 = this.f9289b;
        String a9 = af.a(bArr, i4, i - i4);
        this.f9289b = i;
        if (i < this.f9290c) {
            this.f9289b = i + 1;
        }
        return a9;
    }

    public s(int i) {
        this.f9288a = new byte[i];
        this.f9290c = i;
    }

    public final void b(int i) {
        a.a(i >= 0 && i <= this.f9288a.length);
        this.f9290c = i;
    }

    public final void c(int i) {
        a.a(i >= 0 && i <= this.f9290c);
        this.f9289b = i;
    }

    public final int d() {
        byte[] bArr = this.f9288a;
        int i = this.f9289b;
        this.f9289b = i + 1;
        return bArr[i] & 255;
    }

    public final String e(int i) {
        if (i == 0) {
            return "";
        }
        int i4 = this.f9289b;
        int i6 = (i4 + i) - 1;
        String a9 = af.a(this.f9288a, i4, (i6 >= this.f9290c || this.f9288a[i6] != 0) ? i : i - 1);
        this.f9289b += i;
        return a9;
    }

    public final int a() {
        return this.f9290c - this.f9289b;
    }

    public s(byte[] bArr) {
        this.f9288a = bArr;
        this.f9290c = bArr.length;
    }

    private void a(r rVar, int i) {
        a(rVar.f9284a, 0, i);
        rVar.a(0);
    }

    public final void a(byte[] bArr, int i, int i4) {
        System.arraycopy(this.f9288a, this.f9289b, bArr, i, i4);
        this.f9289b += i4;
    }

    public s(byte[] bArr, int i) {
        this.f9288a = bArr;
        this.f9290c = i;
    }

    private void a(ByteBuffer byteBuffer, int i) {
        byteBuffer.put(this.f9288a, this.f9289b, i);
        this.f9289b += i;
    }

    private String a(Charset charset) {
        String str = new String(this.f9288a, this.f9289b, 4, charset);
        this.f9289b += 4;
        return str;
    }

    public final void a(int i) {
        byte[] bArr = this.f9288a;
        if ((bArr == null ? 0 : bArr.length) < i) {
            bArr = new byte[i];
        }
        a(bArr, i);
    }
}
