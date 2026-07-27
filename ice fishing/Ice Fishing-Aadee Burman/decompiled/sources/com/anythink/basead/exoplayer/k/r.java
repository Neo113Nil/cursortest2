package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8498a;

    /* renamed from: b, reason: collision with root package name */
    private int f8499b;

    /* renamed from: c, reason: collision with root package name */
    private int f8500c;

    /* renamed from: d, reason: collision with root package name */
    private int f8501d;

    public r() {
    }

    private void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    private int f() {
        a.b(this.f8500c == 0);
        return this.f8499b;
    }

    private void g() {
        int i;
        int i6 = this.f8499b;
        a.b(i6 >= 0 && (i6 < (i = this.f8501d) || (i6 == i && this.f8500c == 0)));
    }

    public final int b() {
        return (this.f8499b * 8) + this.f8500c;
    }

    public final void c() {
        int i = this.f8500c + 1;
        this.f8500c = i;
        if (i == 8) {
            this.f8500c = 0;
            this.f8499b++;
        }
        g();
    }

    public final boolean d() {
        boolean z3 = (this.f8498a[this.f8499b] & (128 >> this.f8500c)) != 0;
        c();
        return z3;
    }

    public final void e() {
        if (this.f8500c == 0) {
            return;
        }
        this.f8500c = 0;
        this.f8499b++;
        g();
    }

    public r(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private void a(s sVar) {
        a(sVar.f8502a, sVar.b());
        a(sVar.c() * 8);
    }

    public final void b(int i) {
        int i6 = i / 8;
        int i9 = this.f8499b + i6;
        this.f8499b = i9;
        int i10 = (i - (i6 * 8)) + this.f8500c;
        this.f8500c = i10;
        if (i10 > 7) {
            this.f8499b = i9 + 1;
            this.f8500c = i10 - 8;
        }
        g();
    }

    private r(byte[] bArr, int i) {
        this.f8498a = bArr;
        this.f8501d = i;
    }

    public final void d(int i) {
        int i6 = i & 16383;
        int min = Math.min(8 - this.f8500c, 14);
        int i9 = this.f8500c;
        int i10 = (8 - i9) - min;
        byte[] bArr = this.f8498a;
        int i11 = this.f8499b;
        byte b9 = (byte) (((65280 >> i9) | ((1 << i10) - 1)) & bArr[i11]);
        bArr[i11] = b9;
        int i12 = 14 - min;
        bArr[i11] = (byte) (b9 | ((i6 >>> i12) << i10));
        int i13 = i11 + 1;
        while (i12 > 8) {
            this.f8498a[i13] = (byte) (i6 >>> (i12 - 8));
            i12 -= 8;
            i13++;
        }
        int i14 = 8 - i12;
        byte[] bArr2 = this.f8498a;
        byte b10 = (byte) (bArr2[i13] & ((1 << i14) - 1));
        bArr2[i13] = b10;
        bArr2[i13] = (byte) (((i6 & ((1 << i12) - 1)) << i14) | b10);
        b(14);
        g();
    }

    public final void a(byte[] bArr, int i) {
        this.f8498a = bArr;
        this.f8499b = 0;
        this.f8500c = 0;
        this.f8501d = i;
    }

    private void e(int i) {
        a.b(this.f8500c == 0);
        this.f8499b += i;
        g();
    }

    public final int c(int i) {
        int i6;
        if (i == 0) {
            return 0;
        }
        this.f8500c += i;
        int i9 = 0;
        while (true) {
            i6 = this.f8500c;
            if (i6 <= 8) {
                break;
            }
            int i10 = i6 - 8;
            this.f8500c = i10;
            byte[] bArr = this.f8498a;
            int i11 = this.f8499b;
            this.f8499b = i11 + 1;
            i9 |= (bArr[i11] & 255) << i10;
        }
        byte[] bArr2 = this.f8498a;
        int i12 = this.f8499b;
        int i13 = ((-1) >>> (32 - i)) & (i9 | ((bArr2[i12] & 255) >> (8 - i6)));
        if (i6 == 8) {
            this.f8500c = 0;
            this.f8499b = i12 + 1;
        }
        g();
        return i13;
    }

    private void b(byte[] bArr, int i, int i6) {
        a.b(this.f8500c == 0);
        System.arraycopy(this.f8498a, this.f8499b, bArr, i, i6);
        this.f8499b += i6;
        g();
    }

    public final int a() {
        return ((this.f8501d - this.f8499b) * 8) - this.f8500c;
    }

    public final void a(int i) {
        int i6 = i / 8;
        this.f8499b = i6;
        this.f8500c = i - (i6 * 8);
        g();
    }

    private void a(byte[] bArr, int i, int i6) {
        int i9 = (i6 >> 3) + i;
        while (i < i9) {
            byte[] bArr2 = this.f8498a;
            int i10 = this.f8499b;
            int i11 = i10 + 1;
            this.f8499b = i11;
            byte b9 = bArr2[i10];
            int i12 = this.f8500c;
            byte b10 = (byte) (b9 << i12);
            bArr[i] = b10;
            bArr[i] = (byte) (((255 & bArr2[i11]) >> (8 - i12)) | b10);
            i++;
        }
        int i13 = i6 & 7;
        if (i13 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i9] & (p.f8473b >> i13));
        bArr[i9] = b11;
        int i14 = this.f8500c;
        if (i14 + i13 > 8) {
            byte[] bArr3 = this.f8498a;
            int i15 = this.f8499b;
            this.f8499b = i15 + 1;
            bArr[i9] = (byte) (b11 | ((bArr3[i15] & 255) << i14));
            this.f8500c = i14 - 8;
        }
        int i16 = this.f8500c + i13;
        this.f8500c = i16;
        byte[] bArr4 = this.f8498a;
        int i17 = this.f8499b;
        bArr[i9] = (byte) (((byte) (((255 & bArr4[i17]) >> (8 - i16)) << (8 - i13))) | bArr[i9]);
        if (i16 == 8) {
            this.f8500c = 0;
            this.f8499b = i17 + 1;
        }
        g();
    }
}
