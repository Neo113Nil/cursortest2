package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f9291a;

    /* renamed from: b, reason: collision with root package name */
    private int f9292b;

    /* renamed from: c, reason: collision with root package name */
    private int f9293c;

    /* renamed from: d, reason: collision with root package name */
    private int f9294d = 0;

    public t(byte[] bArr, int i, int i4) {
        this.f9291a = bArr;
        this.f9293c = i;
        this.f9292b = i4;
        g();
    }

    private void a(byte[] bArr, int i, int i4) {
        this.f9291a = bArr;
        this.f9293c = i;
        this.f9292b = i4;
        this.f9294d = 0;
        g();
    }

    private boolean c(int i) {
        int i4 = this.f9293c;
        int i6 = i / 8;
        int i9 = i4 + i6;
        int i10 = (this.f9294d + i) - (i6 * 8);
        if (i10 > 7) {
            i9++;
            i10 -= 8;
        }
        while (true) {
            i4++;
            if (i4 > i9 || i9 >= this.f9292b) {
                break;
            }
            if (d(i4)) {
                i9++;
                i4 += 2;
            }
        }
        int i11 = this.f9292b;
        if (i9 >= i11) {
            return i9 == i11 && i10 == 0;
        }
        return true;
    }

    private boolean e() {
        int i = this.f9293c;
        int i4 = this.f9294d;
        int i6 = 0;
        while (this.f9293c < this.f9292b && !b()) {
            i6++;
        }
        boolean z6 = this.f9293c == this.f9292b;
        this.f9293c = i;
        this.f9294d = i4;
        if (!z6) {
            int i9 = (i6 * 2) + 1;
            int i10 = i9 / 8;
            int i11 = i + i10;
            int i12 = (i4 + i9) - (i10 * 8);
            if (i12 > 7) {
                i11++;
                i12 -= 8;
            }
            while (true) {
                i++;
                if (i > i11 || i11 >= this.f9292b) {
                    break;
                }
                if (d(i)) {
                    i11++;
                    i += 2;
                }
            }
            int i13 = this.f9292b;
            if (i11 < i13 || (i11 == i13 && i12 == 0)) {
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
        int i4 = this.f9293c;
        a.b(i4 >= 0 && (i4 < (i = this.f9292b) || (i4 == i && this.f9294d == 0)));
    }

    public final boolean b() {
        boolean z6 = (this.f9291a[this.f9293c] & (128 >> this.f9294d)) != 0;
        a();
        return z6;
    }

    public final int d() {
        int f2 = f();
        return ((f2 + 1) / 2) * (f2 % 2 == 0 ? -1 : 1);
    }

    private boolean d(int i) {
        if (2 > i || i >= this.f9292b) {
            return false;
        }
        byte[] bArr = this.f9291a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    public final int b(int i) {
        int i4;
        this.f9294d += i;
        int i6 = 0;
        while (true) {
            i4 = this.f9294d;
            if (i4 <= 8) {
                break;
            }
            int i9 = i4 - 8;
            this.f9294d = i9;
            byte[] bArr = this.f9291a;
            int i10 = this.f9293c;
            i6 |= (bArr[i10] & 255) << i9;
            if (!d(i10 + 1)) {
                r3 = 1;
            }
            this.f9293c = i10 + r3;
        }
        byte[] bArr2 = this.f9291a;
        int i11 = this.f9293c;
        int i12 = ((-1) >>> (32 - i)) & (i6 | ((bArr2[i11] & 255) >> (8 - i4)));
        if (i4 == 8) {
            this.f9294d = 0;
            this.f9293c = i11 + (d(i11 + 1) ? 2 : 1);
        }
        g();
        return i12;
    }

    public final void a() {
        int i = this.f9294d + 1;
        this.f9294d = i;
        if (i == 8) {
            this.f9294d = 0;
            int i4 = this.f9293c;
            this.f9293c = i4 + (d(i4 + 1) ? 2 : 1);
        }
        g();
    }

    public final int c() {
        return f();
    }

    public final void a(int i) {
        int i4 = this.f9293c;
        int i6 = i / 8;
        int i9 = i4 + i6;
        this.f9293c = i9;
        int i10 = (i - (i6 * 8)) + this.f9294d;
        this.f9294d = i10;
        if (i10 > 7) {
            this.f9293c = i9 + 1;
            this.f9294d = i10 - 8;
        }
        while (true) {
            i4++;
            if (i4 <= this.f9293c) {
                if (d(i4)) {
                    this.f9293c++;
                    i4 += 2;
                }
            } else {
                g();
                return;
            }
        }
    }
}
