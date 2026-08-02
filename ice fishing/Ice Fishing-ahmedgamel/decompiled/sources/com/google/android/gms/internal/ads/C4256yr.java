package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4256yr {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f36016a;

    /* renamed from: b, reason: collision with root package name */
    public int f36017b;

    /* renamed from: c, reason: collision with root package name */
    public int f36018c;

    /* renamed from: d, reason: collision with root package name */
    public int f36019d;

    public C4256yr(byte[] bArr, int i) {
        this.f36016a = bArr;
        this.f36019d = i;
    }

    public final void a(Cr cr) {
        byte[] bArr = cr.f24997a;
        int i = cr.f24999c;
        this.f36016a = bArr;
        this.f36017b = 0;
        this.f36018c = 0;
        this.f36019d = i;
        d(cr.f24998b * 8);
    }

    public final int b() {
        return ((this.f36019d - this.f36017b) * 8) - this.f36018c;
    }

    public final int c() {
        AbstractC2792Sd.H(this.f36018c == 0);
        return this.f36017b;
    }

    public final void d(int i) {
        int i4 = i / 8;
        this.f36017b = i4;
        this.f36018c = i - (i4 * 8);
        m();
    }

    public final void e() {
        int i = this.f36018c + 1;
        this.f36018c = i;
        if (i == 8) {
            this.f36018c = 0;
            this.f36017b++;
        }
        m();
    }

    public final void f(int i) {
        int i4 = i / 8;
        int i6 = this.f36017b + i4;
        this.f36017b = i6;
        int i9 = (i - (i4 * 8)) + this.f36018c;
        this.f36018c = i9;
        if (i9 > 7) {
            this.f36017b = i6 + 1;
            this.f36018c = i9 - 8;
        }
        m();
    }

    public final boolean g() {
        int i = this.f36016a[this.f36017b] & (128 >> this.f36018c);
        e();
        return i != 0;
    }

    public final int h(int i) {
        int i4;
        if (i == 0) {
            return 0;
        }
        this.f36018c += i;
        int i6 = 0;
        while (true) {
            i4 = this.f36018c;
            if (i4 <= 8) {
                break;
            }
            int i9 = i4 - 8;
            this.f36018c = i9;
            byte[] bArr = this.f36016a;
            int i10 = this.f36017b;
            this.f36017b = i10 + 1;
            i6 |= (bArr[i10] & 255) << i9;
        }
        byte[] bArr2 = this.f36016a;
        int i11 = this.f36017b;
        int i12 = i6 | ((bArr2[i11] & 255) >> (8 - i4));
        int i13 = 32 - i;
        if (i4 == 8) {
            this.f36018c = 0;
            this.f36017b = i11 + 1;
        }
        int i14 = ((-1) >>> i13) & i12;
        m();
        return i14;
    }

    public final long i(int i) {
        if (i <= 32) {
            int h3 = h(i);
            String str = AbstractC3182eu.f30782a;
            return 4294967295L & h3;
        }
        int h9 = h(i - 32);
        int h10 = h(32);
        String str2 = AbstractC3182eu.f30782a;
        return (4294967295L & h10) | ((h9 & 4294967295L) << 32);
    }

    public final void j(int i, byte[] bArr) {
        int i4;
        int i6 = 0;
        while (true) {
            i4 = i >> 3;
            if (i6 >= i4) {
                break;
            }
            byte[] bArr2 = this.f36016a;
            int i9 = this.f36017b;
            int i10 = i9 + 1;
            this.f36017b = i10;
            byte b9 = bArr2[i9];
            int i11 = this.f36018c;
            byte b10 = (byte) (b9 << i11);
            bArr[i6] = b10;
            bArr[i6] = (byte) (((bArr2[i10] & 255) >> (8 - i11)) | b10);
            i6++;
        }
        int i12 = i & 7;
        if (i12 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i4] & (com.anythink.basead.exoplayer.k.p.f9259b >> i12));
        bArr[i4] = b11;
        int i13 = this.f36018c;
        if (i13 + i12 > 8) {
            byte[] bArr3 = this.f36016a;
            int i14 = this.f36017b;
            this.f36017b = i14 + 1;
            b11 = (byte) (b11 | ((bArr3[i14] & 255) << i13));
            bArr[i4] = b11;
            i13 -= 8;
        }
        int i15 = i13 + i12;
        this.f36018c = i15;
        byte[] bArr4 = this.f36016a;
        int i16 = this.f36017b;
        bArr[i4] = (byte) (((byte) (((255 & bArr4[i16]) >> (8 - i15)) << (8 - i12))) | b11);
        if (i15 == 8) {
            this.f36018c = 0;
            this.f36017b = i16 + 1;
        }
        m();
    }

    public final void k() {
        if (this.f36018c == 0) {
            return;
        }
        this.f36018c = 0;
        this.f36017b++;
        m();
    }

    public final void l(int i) {
        AbstractC2792Sd.H(this.f36018c == 0);
        this.f36017b += i;
        m();
    }

    public final void m() {
        int i;
        int i4 = this.f36017b;
        boolean z6 = false;
        if (i4 >= 0 && (i4 < (i = this.f36019d) || (i4 == i && this.f36018c == 0))) {
            z6 = true;
        }
        AbstractC2792Sd.H(z6);
    }

    public C4256yr() {
        this.f36016a = AbstractC3182eu.f30783b;
    }
}
