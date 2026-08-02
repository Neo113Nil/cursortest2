package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9284a;

    /* renamed from: b, reason: collision with root package name */
    private int f9285b;

    /* renamed from: c, reason: collision with root package name */
    private int f9286c;

    /* renamed from: d, reason: collision with root package name */
    private int f9287d;

    public r() {
    }

    private void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    private int f() {
        a.b(this.f9286c == 0);
        return this.f9285b;
    }

    private void g() {
        int i;
        int i4 = this.f9285b;
        a.b(i4 >= 0 && (i4 < (i = this.f9287d) || (i4 == i && this.f9286c == 0)));
    }

    public final int b() {
        return (this.f9285b * 8) + this.f9286c;
    }

    public final void c() {
        int i = this.f9286c + 1;
        this.f9286c = i;
        if (i == 8) {
            this.f9286c = 0;
            this.f9285b++;
        }
        g();
    }

    public final boolean d() {
        boolean z6 = (this.f9284a[this.f9285b] & (128 >> this.f9286c)) != 0;
        c();
        return z6;
    }

    public final void e() {
        if (this.f9286c == 0) {
            return;
        }
        this.f9286c = 0;
        this.f9285b++;
        g();
    }

    public r(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private void a(s sVar) {
        a(sVar.f9288a, sVar.b());
        a(sVar.c() * 8);
    }

    public final void b(int i) {
        int i4 = i / 8;
        int i6 = this.f9285b + i4;
        this.f9285b = i6;
        int i9 = (i - (i4 * 8)) + this.f9286c;
        this.f9286c = i9;
        if (i9 > 7) {
            this.f9285b = i6 + 1;
            this.f9286c = i9 - 8;
        }
        g();
    }

    private r(byte[] bArr, int i) {
        this.f9284a = bArr;
        this.f9287d = i;
    }

    public final void d(int i) {
        int i4 = i & 16383;
        int min = Math.min(8 - this.f9286c, 14);
        int i6 = this.f9286c;
        int i9 = (8 - i6) - min;
        byte[] bArr = this.f9284a;
        int i10 = this.f9285b;
        byte b9 = (byte) (((65280 >> i6) | ((1 << i9) - 1)) & bArr[i10]);
        bArr[i10] = b9;
        int i11 = 14 - min;
        bArr[i10] = (byte) (b9 | ((i4 >>> i11) << i9));
        int i12 = i10 + 1;
        while (i11 > 8) {
            this.f9284a[i12] = (byte) (i4 >>> (i11 - 8));
            i11 -= 8;
            i12++;
        }
        int i13 = 8 - i11;
        byte[] bArr2 = this.f9284a;
        byte b10 = (byte) (bArr2[i12] & ((1 << i13) - 1));
        bArr2[i12] = b10;
        bArr2[i12] = (byte) (((i4 & ((1 << i11) - 1)) << i13) | b10);
        b(14);
        g();
    }

    public final void a(byte[] bArr, int i) {
        this.f9284a = bArr;
        this.f9285b = 0;
        this.f9286c = 0;
        this.f9287d = i;
    }

    private void e(int i) {
        a.b(this.f9286c == 0);
        this.f9285b += i;
        g();
    }

    public final int c(int i) {
        int i4;
        if (i == 0) {
            return 0;
        }
        this.f9286c += i;
        int i6 = 0;
        while (true) {
            i4 = this.f9286c;
            if (i4 <= 8) {
                break;
            }
            int i9 = i4 - 8;
            this.f9286c = i9;
            byte[] bArr = this.f9284a;
            int i10 = this.f9285b;
            this.f9285b = i10 + 1;
            i6 |= (bArr[i10] & 255) << i9;
        }
        byte[] bArr2 = this.f9284a;
        int i11 = this.f9285b;
        int i12 = ((-1) >>> (32 - i)) & (i6 | ((bArr2[i11] & 255) >> (8 - i4)));
        if (i4 == 8) {
            this.f9286c = 0;
            this.f9285b = i11 + 1;
        }
        g();
        return i12;
    }

    private void b(byte[] bArr, int i, int i4) {
        a.b(this.f9286c == 0);
        System.arraycopy(this.f9284a, this.f9285b, bArr, i, i4);
        this.f9285b += i4;
        g();
    }

    public final int a() {
        return ((this.f9287d - this.f9285b) * 8) - this.f9286c;
    }

    public final void a(int i) {
        int i4 = i / 8;
        this.f9285b = i4;
        this.f9286c = i - (i4 * 8);
        g();
    }

    private void a(byte[] bArr, int i, int i4) {
        int i6 = (i4 >> 3) + i;
        while (i < i6) {
            byte[] bArr2 = this.f9284a;
            int i9 = this.f9285b;
            int i10 = i9 + 1;
            this.f9285b = i10;
            byte b9 = bArr2[i9];
            int i11 = this.f9286c;
            byte b10 = (byte) (b9 << i11);
            bArr[i] = b10;
            bArr[i] = (byte) (((255 & bArr2[i10]) >> (8 - i11)) | b10);
            i++;
        }
        int i12 = i4 & 7;
        if (i12 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i6] & (p.f9259b >> i12));
        bArr[i6] = b11;
        int i13 = this.f9286c;
        if (i13 + i12 > 8) {
            byte[] bArr3 = this.f9284a;
            int i14 = this.f9285b;
            this.f9285b = i14 + 1;
            bArr[i6] = (byte) (b11 | ((bArr3[i14] & 255) << i13));
            this.f9286c = i13 - 8;
        }
        int i15 = this.f9286c + i12;
        this.f9286c = i15;
        byte[] bArr4 = this.f9284a;
        int i16 = this.f9285b;
        bArr[i6] = (byte) (((byte) (((255 & bArr4[i16]) >> (8 - i15)) << (8 - i12))) | bArr[i6]);
        if (i15 == 8) {
            this.f9286c = 0;
            this.f9285b = i16 + 1;
        }
        g();
    }
}
