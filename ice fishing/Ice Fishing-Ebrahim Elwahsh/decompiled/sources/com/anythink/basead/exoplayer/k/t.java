package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f8662a;

    /* renamed from: b, reason: collision with root package name */
    private int f8663b;

    /* renamed from: c, reason: collision with root package name */
    private int f8664c;

    /* renamed from: d, reason: collision with root package name */
    private int f8665d = 0;

    public t(byte[] bArr, int i, int i4) {
        this.f8662a = bArr;
        this.f8664c = i;
        this.f8663b = i4;
        g();
    }

    private void a(byte[] bArr, int i, int i4) {
        this.f8662a = bArr;
        this.f8664c = i;
        this.f8663b = i4;
        this.f8665d = 0;
        g();
    }

    private boolean c(int i) {
        int i4 = this.f8664c;
        int i9 = i / 8;
        int i10 = i4 + i9;
        int i11 = (this.f8665d + i) - (i9 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i4++;
            if (i4 > i10 || i10 >= this.f8663b) {
                break;
            }
            if (d(i4)) {
                i10++;
                i4 += 2;
            }
        }
        int i12 = this.f8663b;
        if (i10 >= i12) {
            return i10 == i12 && i11 == 0;
        }
        return true;
    }

    private boolean e() {
        int i = this.f8664c;
        int i4 = this.f8665d;
        int i9 = 0;
        while (this.f8664c < this.f8663b && !b()) {
            i9++;
        }
        boolean z8 = this.f8664c == this.f8663b;
        this.f8664c = i;
        this.f8665d = i4;
        if (!z8) {
            int i10 = (i9 * 2) + 1;
            int i11 = i10 / 8;
            int i12 = i + i11;
            int i13 = (i4 + i10) - (i11 * 8);
            if (i13 > 7) {
                i12++;
                i13 -= 8;
            }
            while (true) {
                i++;
                if (i > i12 || i12 >= this.f8663b) {
                    break;
                }
                if (d(i)) {
                    i12++;
                    i += 2;
                }
            }
            int i14 = this.f8663b;
            if (i12 < i14 || (i12 == i14 && i13 == 0)) {
                return true;
            }
        }
        return false;
    }

    private int f() {
        int i = 0;
        while (!b()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? b(i) : 0);
    }

    private void g() {
        int i;
        int i4 = this.f8664c;
        C0544a.b(i4 >= 0 && (i4 < (i = this.f8663b) || (i4 == i && this.f8665d == 0)));
    }

    public final boolean b() {
        boolean z8 = (this.f8662a[this.f8664c] & (128 >> this.f8665d)) != 0;
        a();
        return z8;
    }

    public final int d() {
        int f6 = f();
        return ((f6 + 1) / 2) * (f6 % 2 == 0 ? -1 : 1);
    }

    private boolean d(int i) {
        if (2 > i || i >= this.f8663b) {
            return false;
        }
        byte[] bArr = this.f8662a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    public final int b(int i) {
        int i4;
        this.f8665d += i;
        int i9 = 0;
        while (true) {
            i4 = this.f8665d;
            if (i4 <= 8) {
                break;
            }
            int i10 = i4 - 8;
            this.f8665d = i10;
            byte[] bArr = this.f8662a;
            int i11 = this.f8664c;
            i9 |= (bArr[i11] & 255) << i10;
            if (!d(i11 + 1)) {
                r3 = 1;
            }
            this.f8664c = i11 + r3;
        }
        byte[] bArr2 = this.f8662a;
        int i12 = this.f8664c;
        int i13 = ((-1) >>> (32 - i)) & (i9 | ((bArr2[i12] & 255) >> (8 - i4)));
        if (i4 == 8) {
            this.f8665d = 0;
            this.f8664c = i12 + (d(i12 + 1) ? 2 : 1);
        }
        g();
        return i13;
    }

    public final void a() {
        int i = this.f8665d + 1;
        this.f8665d = i;
        if (i == 8) {
            this.f8665d = 0;
            int i4 = this.f8664c;
            this.f8664c = i4 + (d(i4 + 1) ? 2 : 1);
        }
        g();
    }

    public final int c() {
        return f();
    }

    public final void a(int i) {
        int i4 = this.f8664c;
        int i9 = i / 8;
        int i10 = i4 + i9;
        this.f8664c = i10;
        int i11 = (i - (i9 * 8)) + this.f8665d;
        this.f8665d = i11;
        if (i11 > 7) {
            this.f8664c = i10 + 1;
            this.f8665d = i11 - 8;
        }
        while (true) {
            i4++;
            if (i4 <= this.f8664c) {
                if (d(i4)) {
                    this.f8664c++;
                    i4 += 2;
                }
            } else {
                g();
                return;
            }
        }
    }
}
