package com.anythink.basead.exoplayer.k;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8502a;

    /* renamed from: b, reason: collision with root package name */
    private int f8503b;

    /* renamed from: c, reason: collision with root package name */
    private int f8504c;

    public s() {
    }

    private int A() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        int i6 = i + 1;
        this.f8503b = i6;
        int i9 = bArr[i] & 255;
        int i10 = i + 2;
        this.f8503b = i10;
        int i11 = ((bArr[i6] & 255) << 8) | i9;
        int i12 = i + 3;
        this.f8503b = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 16);
        this.f8503b = i + 4;
        return ((bArr[i12] & 255) << 24) | i13;
    }

    private long B() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        this.f8503b = i + 1;
        this.f8503b = i + 2;
        this.f8503b = i + 3;
        long j6 = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f8503b = i + 4;
        long j9 = j6 | ((bArr[r8] & 255) << 24);
        this.f8503b = i + 5;
        long j10 = j9 | ((bArr[r7] & 255) << 32);
        this.f8503b = i + 6;
        long j11 = j10 | ((bArr[r8] & 255) << 40);
        this.f8503b = i + 7;
        long j12 = j11 | ((bArr[r7] & 255) << 48);
        this.f8503b = i + 8;
        return ((bArr[r8] & 255) << 56) | j12;
    }

    private int C() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        int i6 = i + 1;
        this.f8503b = i6;
        int i9 = bArr[i] & 255;
        int i10 = i + 2;
        this.f8503b = i10;
        int i11 = ((bArr[i6] & 255) << 8) | i9;
        int i12 = i + 3;
        this.f8503b = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 16);
        this.f8503b = i + 4;
        int i14 = ((bArr[i12] & 255) << 24) | i13;
        if (i14 >= 0) {
            return i14;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(i14)));
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
        int i = this.f8503b;
        while (i < this.f8504c && !af.a((int) this.f8502a[i])) {
            i++;
        }
        int i6 = this.f8503b;
        if (i - i6 >= 3) {
            byte[] bArr = this.f8502a;
            if (bArr[i6] == -17 && bArr[i6 + 1] == -69 && bArr[i6 + 2] == -65) {
                this.f8503b = i6 + 3;
            }
        }
        byte[] bArr2 = this.f8502a;
        int i9 = this.f8503b;
        String a9 = af.a(bArr2, i9, i - i9);
        this.f8503b = i;
        int i10 = this.f8504c;
        if (i != i10) {
            byte[] bArr3 = this.f8502a;
            if (bArr3[i] == 13) {
                int i11 = i + 1;
                this.f8503b = i11;
            }
            int i12 = this.f8503b;
            if (bArr3[i12] == 10) {
                this.f8503b = i12 + 1;
            }
        }
        return a9;
    }

    private long G() {
        int i;
        int i6;
        long j6 = this.f8502a[this.f8503b];
        int i9 = 7;
        while (true) {
            if (i9 < 0) {
                break;
            }
            if (((1 << i9) & j6) != 0) {
                i9--;
            } else if (i9 < 6) {
                j6 &= r6 - 1;
                i6 = 7 - i9;
            } else if (i9 == 7) {
                i6 = 1;
            }
        }
        i6 = 0;
        if (i6 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: ".concat(String.valueOf(j6)));
        }
        for (i = 1; i < i6; i++) {
            if ((this.f8502a[this.f8503b + i] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: ".concat(String.valueOf(j6)));
            }
            j6 = (j6 << 6) | (r3 & com.anythink.core.common.s.a.c.f16318c);
        }
        this.f8503b += i6;
        return j6;
    }

    private void q() {
        this.f8503b = 0;
        this.f8504c = 0;
    }

    private int r() {
        byte[] bArr = this.f8502a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    private int s() {
        return this.f8502a[this.f8503b] & 255;
    }

    private char t() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    private int u() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        int i6 = i + 1;
        this.f8503b = i6;
        int i9 = bArr[i] & 255;
        this.f8503b = i + 2;
        return ((bArr[i6] & 255) << 8) | i9;
    }

    private short v() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        int i6 = i + 1;
        this.f8503b = i6;
        int i9 = bArr[i] & 255;
        this.f8503b = i + 2;
        return (short) (((bArr[i6] & 255) << 8) | i9);
    }

    private int w() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        int i6 = i + 1;
        this.f8503b = i6;
        int i9 = ((bArr[i] & 255) << 24) >> 8;
        int i10 = i + 2;
        this.f8503b = i10;
        int i11 = ((bArr[i6] & 255) << 8) | i9;
        this.f8503b = i + 3;
        return (bArr[i10] & 255) | i11;
    }

    private int x() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        int i6 = i + 1;
        this.f8503b = i6;
        int i9 = bArr[i] & 255;
        int i10 = i + 2;
        this.f8503b = i10;
        int i11 = ((bArr[i6] & 255) << 8) | i9;
        this.f8503b = i + 3;
        return ((bArr[i10] & 255) << 16) | i11;
    }

    private int y() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        int i6 = i + 1;
        this.f8503b = i6;
        int i9 = bArr[i] & 255;
        int i10 = i + 2;
        this.f8503b = i10;
        int i11 = ((bArr[i6] & 255) << 8) | i9;
        this.f8503b = i + 3;
        return ((bArr[i10] & 255) << 16) | i11;
    }

    private long z() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        this.f8503b = i + 1;
        this.f8503b = i + 2;
        this.f8503b = i + 3;
        long j6 = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f8503b = i + 4;
        return ((bArr[r4] & 255) << 24) | j6;
    }

    public final void a(byte[] bArr, int i) {
        this.f8502a = bArr;
        this.f8504c = i;
        this.f8503b = 0;
    }

    public final int b() {
        return this.f8504c;
    }

    public final int c() {
        return this.f8503b;
    }

    public final void d(int i) {
        c(this.f8503b + i);
    }

    public final int e() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        int i6 = i + 1;
        this.f8503b = i6;
        int i9 = (bArr[i] & 255) << 8;
        this.f8503b = i + 2;
        return (bArr[i6] & 255) | i9;
    }

    public final short f() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        int i6 = i + 1;
        this.f8503b = i6;
        int i9 = (bArr[i] & 255) << 8;
        this.f8503b = i + 2;
        return (short) ((bArr[i6] & 255) | i9);
    }

    public final int g() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        int i6 = i + 1;
        this.f8503b = i6;
        int i9 = (bArr[i] & 255) << 16;
        int i10 = i + 2;
        this.f8503b = i10;
        int i11 = ((bArr[i6] & 255) << 8) | i9;
        this.f8503b = i + 3;
        return (bArr[i10] & 255) | i11;
    }

    public final long h() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        this.f8503b = i + 1;
        this.f8503b = i + 2;
        this.f8503b = i + 3;
        long j6 = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f8503b = i + 4;
        return (bArr[r4] & 255) | j6;
    }

    public final int i() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        int i6 = i + 1;
        this.f8503b = i6;
        int i9 = (bArr[i] & 255) << 24;
        int i10 = i + 2;
        this.f8503b = i10;
        int i11 = ((bArr[i6] & 255) << 16) | i9;
        int i12 = i + 3;
        this.f8503b = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 8);
        this.f8503b = i + 4;
        return (bArr[i12] & 255) | i13;
    }

    public final long j() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        this.f8503b = i + 1;
        this.f8503b = i + 2;
        this.f8503b = i + 3;
        long j6 = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f8503b = i + 4;
        long j9 = j6 | ((bArr[r4] & 255) << 32);
        this.f8503b = i + 5;
        long j10 = j9 | ((bArr[r7] & 255) << 24);
        this.f8503b = i + 6;
        long j11 = j10 | ((bArr[r4] & 255) << 16);
        this.f8503b = i + 7;
        long j12 = j11 | ((bArr[r7] & 255) << 8);
        this.f8503b = i + 8;
        return (bArr[r4] & 255) | j12;
    }

    public final int k() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        int i6 = i + 1;
        this.f8503b = i6;
        int i9 = (bArr[i] & 255) << 8;
        this.f8503b = i + 2;
        int i10 = (bArr[i6] & 255) | i9;
        this.f8503b = i + 4;
        return i10;
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
        String str = new String(this.f8502a, this.f8503b, 4, Charset.forName("UTF-8"));
        this.f8503b += 4;
        return str;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i = this.f8503b;
        while (i < this.f8504c && this.f8502a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f8502a;
        int i6 = this.f8503b;
        String a9 = af.a(bArr, i6, i - i6);
        this.f8503b = i;
        if (i < this.f8504c) {
            this.f8503b = i + 1;
        }
        return a9;
    }

    public s(int i) {
        this.f8502a = new byte[i];
        this.f8504c = i;
    }

    public final void b(int i) {
        a.a(i >= 0 && i <= this.f8502a.length);
        this.f8504c = i;
    }

    public final void c(int i) {
        a.a(i >= 0 && i <= this.f8504c);
        this.f8503b = i;
    }

    public final int d() {
        byte[] bArr = this.f8502a;
        int i = this.f8503b;
        this.f8503b = i + 1;
        return bArr[i] & 255;
    }

    public final String e(int i) {
        if (i == 0) {
            return "";
        }
        int i6 = this.f8503b;
        int i9 = (i6 + i) - 1;
        String a9 = af.a(this.f8502a, i6, (i9 >= this.f8504c || this.f8502a[i9] != 0) ? i : i - 1);
        this.f8503b += i;
        return a9;
    }

    public final int a() {
        return this.f8504c - this.f8503b;
    }

    public s(byte[] bArr) {
        this.f8502a = bArr;
        this.f8504c = bArr.length;
    }

    private void a(r rVar, int i) {
        a(rVar.f8498a, 0, i);
        rVar.a(0);
    }

    public final void a(byte[] bArr, int i, int i6) {
        System.arraycopy(this.f8502a, this.f8503b, bArr, i, i6);
        this.f8503b += i6;
    }

    public s(byte[] bArr, int i) {
        this.f8502a = bArr;
        this.f8504c = i;
    }

    private void a(ByteBuffer byteBuffer, int i) {
        byteBuffer.put(this.f8502a, this.f8503b, i);
        this.f8503b += i;
    }

    private String a(Charset charset) {
        String str = new String(this.f8502a, this.f8503b, 4, charset);
        this.f8503b += 4;
        return str;
    }

    public final void a(int i) {
        byte[] bArr = this.f8502a;
        if ((bArr == null ? 0 : bArr.length) < i) {
            bArr = new byte[i];
        }
        a(bArr, i);
    }
}
