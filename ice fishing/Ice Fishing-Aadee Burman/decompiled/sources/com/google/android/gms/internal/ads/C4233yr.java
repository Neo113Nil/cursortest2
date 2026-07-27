package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4233yr {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f35232a;

    /* renamed from: b, reason: collision with root package name */
    public int f35233b;

    /* renamed from: c, reason: collision with root package name */
    public int f35234c;

    /* renamed from: d, reason: collision with root package name */
    public int f35235d;

    public C4233yr(byte[] bArr, int i) {
        this.f35232a = bArr;
        this.f35235d = i;
    }

    public final void a(Cr cr) {
        byte[] bArr = cr.f24252a;
        int i = cr.f24254c;
        this.f35232a = bArr;
        this.f35233b = 0;
        this.f35234c = 0;
        this.f35235d = i;
        d(cr.f24253b * 8);
    }

    public final int b() {
        return ((this.f35235d - this.f35233b) * 8) - this.f35234c;
    }

    public final int c() {
        AbstractC2772Sd.H(this.f35234c == 0);
        return this.f35233b;
    }

    public final void d(int i) {
        int i6 = i / 8;
        this.f35233b = i6;
        this.f35234c = i - (i6 * 8);
        m();
    }

    public final void e() {
        int i = this.f35234c + 1;
        this.f35234c = i;
        if (i == 8) {
            this.f35234c = 0;
            this.f35233b++;
        }
        m();
    }

    public final void f(int i) {
        int i6 = i / 8;
        int i9 = this.f35233b + i6;
        this.f35233b = i9;
        int i10 = (i - (i6 * 8)) + this.f35234c;
        this.f35234c = i10;
        if (i10 > 7) {
            this.f35233b = i9 + 1;
            this.f35234c = i10 - 8;
        }
        m();
    }

    public final boolean g() {
        int i = this.f35232a[this.f35233b] & (128 >> this.f35234c);
        e();
        return i != 0;
    }

    public final int h(int i) {
        int i6;
        if (i == 0) {
            return 0;
        }
        this.f35234c += i;
        int i9 = 0;
        while (true) {
            i6 = this.f35234c;
            if (i6 <= 8) {
                break;
            }
            int i10 = i6 - 8;
            this.f35234c = i10;
            byte[] bArr = this.f35232a;
            int i11 = this.f35233b;
            this.f35233b = i11 + 1;
            i9 |= (bArr[i11] & 255) << i10;
        }
        byte[] bArr2 = this.f35232a;
        int i12 = this.f35233b;
        int i13 = i9 | ((bArr2[i12] & 255) >> (8 - i6));
        int i14 = 32 - i;
        if (i6 == 8) {
            this.f35234c = 0;
            this.f35233b = i12 + 1;
        }
        int i15 = ((-1) >>> i14) & i13;
        m();
        return i15;
    }

    public final long i(int i) {
        if (i <= 32) {
            int h9 = h(i);
            String str = AbstractC3159eu.f29993a;
            return 4294967295L & h9;
        }
        int h10 = h(i - 32);
        int h11 = h(32);
        String str2 = AbstractC3159eu.f29993a;
        return (4294967295L & h11) | ((h10 & 4294967295L) << 32);
    }

    public final void j(int i, byte[] bArr) {
        int i6;
        int i9 = 0;
        while (true) {
            i6 = i >> 3;
            if (i9 >= i6) {
                break;
            }
            byte[] bArr2 = this.f35232a;
            int i10 = this.f35233b;
            int i11 = i10 + 1;
            this.f35233b = i11;
            byte b9 = bArr2[i10];
            int i12 = this.f35234c;
            byte b10 = (byte) (b9 << i12);
            bArr[i9] = b10;
            bArr[i9] = (byte) (((bArr2[i11] & 255) >> (8 - i12)) | b10);
            i9++;
        }
        int i13 = i & 7;
        if (i13 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i6] & (com.anythink.basead.exoplayer.k.p.f8473b >> i13));
        bArr[i6] = b11;
        int i14 = this.f35234c;
        if (i14 + i13 > 8) {
            byte[] bArr3 = this.f35232a;
            int i15 = this.f35233b;
            this.f35233b = i15 + 1;
            b11 = (byte) (b11 | ((bArr3[i15] & 255) << i14));
            bArr[i6] = b11;
            i14 -= 8;
        }
        int i16 = i14 + i13;
        this.f35234c = i16;
        byte[] bArr4 = this.f35232a;
        int i17 = this.f35233b;
        bArr[i6] = (byte) (((byte) (((255 & bArr4[i17]) >> (8 - i16)) << (8 - i13))) | b11);
        if (i16 == 8) {
            this.f35234c = 0;
            this.f35233b = i17 + 1;
        }
        m();
    }

    public final void k() {
        if (this.f35234c == 0) {
            return;
        }
        this.f35234c = 0;
        this.f35233b++;
        m();
    }

    public final void l(int i) {
        AbstractC2772Sd.H(this.f35234c == 0);
        this.f35233b += i;
        m();
    }

    public final void m() {
        int i;
        int i6 = this.f35233b;
        boolean z3 = false;
        if (i6 >= 0 && (i6 < (i = this.f35235d) || (i6 == i && this.f35234c == 0))) {
            z3 = true;
        }
        AbstractC2772Sd.H(z3);
    }

    public C4233yr() {
        this.f35232a = AbstractC3159eu.f29994b;
    }
}
