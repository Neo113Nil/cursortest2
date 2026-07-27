package com.anythink.basead.exoplayer.k;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8659a;

    /* renamed from: b, reason: collision with root package name */
    private int f8660b;

    /* renamed from: c, reason: collision with root package name */
    private int f8661c;

    public s() {
    }

    private int A() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        int i4 = i + 1;
        this.f8660b = i4;
        int i9 = bArr[i] & 255;
        int i10 = i + 2;
        this.f8660b = i10;
        int i11 = ((bArr[i4] & 255) << 8) | i9;
        int i12 = i + 3;
        this.f8660b = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 16);
        this.f8660b = i + 4;
        return ((bArr[i12] & 255) << 24) | i13;
    }

    private long B() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        this.f8660b = i + 1;
        this.f8660b = i + 2;
        this.f8660b = i + 3;
        long j9 = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f8660b = i + 4;
        long j10 = j9 | ((bArr[r8] & 255) << 24);
        this.f8660b = i + 5;
        long j11 = j10 | ((bArr[r7] & 255) << 32);
        this.f8660b = i + 6;
        long j12 = j11 | ((bArr[r8] & 255) << 40);
        this.f8660b = i + 7;
        long j13 = j12 | ((bArr[r7] & 255) << 48);
        this.f8660b = i + 8;
        return ((bArr[r8] & 255) << 56) | j13;
    }

    private int C() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        int i4 = i + 1;
        this.f8660b = i4;
        int i9 = bArr[i] & 255;
        int i10 = i + 2;
        this.f8660b = i10;
        int i11 = ((bArr[i4] & 255) << 8) | i9;
        int i12 = i + 3;
        this.f8660b = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 16);
        this.f8660b = i + 4;
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
        int i = this.f8660b;
        while (i < this.f8661c && !af.a((int) this.f8659a[i])) {
            i++;
        }
        int i4 = this.f8660b;
        if (i - i4 >= 3) {
            byte[] bArr = this.f8659a;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.f8660b = i4 + 3;
            }
        }
        byte[] bArr2 = this.f8659a;
        int i9 = this.f8660b;
        String a9 = af.a(bArr2, i9, i - i9);
        this.f8660b = i;
        int i10 = this.f8661c;
        if (i != i10) {
            byte[] bArr3 = this.f8659a;
            if (bArr3[i] == 13) {
                int i11 = i + 1;
                this.f8660b = i11;
            }
            int i12 = this.f8660b;
            if (bArr3[i12] == 10) {
                this.f8660b = i12 + 1;
            }
        }
        return a9;
    }

    private long G() {
        int i;
        int i4;
        long j9 = this.f8659a[this.f8660b];
        int i9 = 7;
        while (true) {
            if (i9 < 0) {
                break;
            }
            if (((1 << i9) & j9) != 0) {
                i9--;
            } else if (i9 < 6) {
                j9 &= r6 - 1;
                i4 = 7 - i9;
            } else if (i9 == 7) {
                i4 = 1;
            }
        }
        i4 = 0;
        if (i4 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: ".concat(String.valueOf(j9)));
        }
        for (i = 1; i < i4; i++) {
            if ((this.f8659a[this.f8660b + i] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: ".concat(String.valueOf(j9)));
            }
            j9 = (j9 << 6) | (r3 & com.anythink.core.common.s.a.c.f16476c);
        }
        this.f8660b += i4;
        return j9;
    }

    private void q() {
        this.f8660b = 0;
        this.f8661c = 0;
    }

    private int r() {
        byte[] bArr = this.f8659a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    private int s() {
        return this.f8659a[this.f8660b] & 255;
    }

    private char t() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    private int u() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        int i4 = i + 1;
        this.f8660b = i4;
        int i9 = bArr[i] & 255;
        this.f8660b = i + 2;
        return ((bArr[i4] & 255) << 8) | i9;
    }

    private short v() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        int i4 = i + 1;
        this.f8660b = i4;
        int i9 = bArr[i] & 255;
        this.f8660b = i + 2;
        return (short) (((bArr[i4] & 255) << 8) | i9);
    }

    private int w() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        int i4 = i + 1;
        this.f8660b = i4;
        int i9 = ((bArr[i] & 255) << 24) >> 8;
        int i10 = i + 2;
        this.f8660b = i10;
        int i11 = ((bArr[i4] & 255) << 8) | i9;
        this.f8660b = i + 3;
        return (bArr[i10] & 255) | i11;
    }

    private int x() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        int i4 = i + 1;
        this.f8660b = i4;
        int i9 = bArr[i] & 255;
        int i10 = i + 2;
        this.f8660b = i10;
        int i11 = ((bArr[i4] & 255) << 8) | i9;
        this.f8660b = i + 3;
        return ((bArr[i10] & 255) << 16) | i11;
    }

    private int y() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        int i4 = i + 1;
        this.f8660b = i4;
        int i9 = bArr[i] & 255;
        int i10 = i + 2;
        this.f8660b = i10;
        int i11 = ((bArr[i4] & 255) << 8) | i9;
        this.f8660b = i + 3;
        return ((bArr[i10] & 255) << 16) | i11;
    }

    private long z() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        this.f8660b = i + 1;
        this.f8660b = i + 2;
        this.f8660b = i + 3;
        long j9 = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.f8660b = i + 4;
        return ((bArr[r4] & 255) << 24) | j9;
    }

    public final void a(byte[] bArr, int i) {
        this.f8659a = bArr;
        this.f8661c = i;
        this.f8660b = 0;
    }

    public final int b() {
        return this.f8661c;
    }

    public final int c() {
        return this.f8660b;
    }

    public final void d(int i) {
        c(this.f8660b + i);
    }

    public final int e() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        int i4 = i + 1;
        this.f8660b = i4;
        int i9 = (bArr[i] & 255) << 8;
        this.f8660b = i + 2;
        return (bArr[i4] & 255) | i9;
    }

    public final short f() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        int i4 = i + 1;
        this.f8660b = i4;
        int i9 = (bArr[i] & 255) << 8;
        this.f8660b = i + 2;
        return (short) ((bArr[i4] & 255) | i9);
    }

    public final int g() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        int i4 = i + 1;
        this.f8660b = i4;
        int i9 = (bArr[i] & 255) << 16;
        int i10 = i + 2;
        this.f8660b = i10;
        int i11 = ((bArr[i4] & 255) << 8) | i9;
        this.f8660b = i + 3;
        return (bArr[i10] & 255) | i11;
    }

    public final long h() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        this.f8660b = i + 1;
        this.f8660b = i + 2;
        this.f8660b = i + 3;
        long j9 = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.f8660b = i + 4;
        return (bArr[r4] & 255) | j9;
    }

    public final int i() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        int i4 = i + 1;
        this.f8660b = i4;
        int i9 = (bArr[i] & 255) << 24;
        int i10 = i + 2;
        this.f8660b = i10;
        int i11 = ((bArr[i4] & 255) << 16) | i9;
        int i12 = i + 3;
        this.f8660b = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 8);
        this.f8660b = i + 4;
        return (bArr[i12] & 255) | i13;
    }

    public final long j() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        this.f8660b = i + 1;
        this.f8660b = i + 2;
        this.f8660b = i + 3;
        long j9 = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.f8660b = i + 4;
        long j10 = j9 | ((bArr[r4] & 255) << 32);
        this.f8660b = i + 5;
        long j11 = j10 | ((bArr[r7] & 255) << 24);
        this.f8660b = i + 6;
        long j12 = j11 | ((bArr[r4] & 255) << 16);
        this.f8660b = i + 7;
        long j13 = j12 | ((bArr[r7] & 255) << 8);
        this.f8660b = i + 8;
        return (bArr[r4] & 255) | j13;
    }

    public final int k() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        int i4 = i + 1;
        this.f8660b = i4;
        int i9 = (bArr[i] & 255) << 8;
        this.f8660b = i + 2;
        int i10 = (bArr[i4] & 255) | i9;
        this.f8660b = i + 4;
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
        long j9 = j();
        if (j9 >= 0) {
            return j9;
        }
        throw new IllegalStateException("Top bit not zero: ".concat(String.valueOf(j9)));
    }

    public final String o() {
        String str = new String(this.f8659a, this.f8660b, 4, Charset.forName("UTF-8"));
        this.f8660b += 4;
        return str;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i = this.f8660b;
        while (i < this.f8661c && this.f8659a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f8659a;
        int i4 = this.f8660b;
        String a9 = af.a(bArr, i4, i - i4);
        this.f8660b = i;
        if (i < this.f8661c) {
            this.f8660b = i + 1;
        }
        return a9;
    }

    public s(int i) {
        this.f8659a = new byte[i];
        this.f8661c = i;
    }

    public final void b(int i) {
        C0544a.a(i >= 0 && i <= this.f8659a.length);
        this.f8661c = i;
    }

    public final void c(int i) {
        C0544a.a(i >= 0 && i <= this.f8661c);
        this.f8660b = i;
    }

    public final int d() {
        byte[] bArr = this.f8659a;
        int i = this.f8660b;
        this.f8660b = i + 1;
        return bArr[i] & 255;
    }

    public final String e(int i) {
        if (i == 0) {
            return "";
        }
        int i4 = this.f8660b;
        int i9 = (i4 + i) - 1;
        String a9 = af.a(this.f8659a, i4, (i9 >= this.f8661c || this.f8659a[i9] != 0) ? i : i - 1);
        this.f8660b += i;
        return a9;
    }

    public final int a() {
        return this.f8661c - this.f8660b;
    }

    public s(byte[] bArr) {
        this.f8659a = bArr;
        this.f8661c = bArr.length;
    }

    private void a(r rVar, int i) {
        a(rVar.f8655a, 0, i);
        rVar.a(0);
    }

    public final void a(byte[] bArr, int i, int i4) {
        System.arraycopy(this.f8659a, this.f8660b, bArr, i, i4);
        this.f8660b += i4;
    }

    public s(byte[] bArr, int i) {
        this.f8659a = bArr;
        this.f8661c = i;
    }

    private void a(ByteBuffer byteBuffer, int i) {
        byteBuffer.put(this.f8659a, this.f8660b, i);
        this.f8660b += i;
    }

    private String a(Charset charset) {
        String str = new String(this.f8659a, this.f8660b, 4, charset);
        this.f8660b += 4;
        return str;
    }

    public final void a(int i) {
        byte[] bArr = this.f8659a;
        if ((bArr == null ? 0 : bArr.length) < i) {
            bArr = new byte[i];
        }
        a(bArr, i);
    }
}
