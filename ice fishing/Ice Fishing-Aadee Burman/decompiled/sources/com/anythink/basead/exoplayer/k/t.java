package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f8505a;

    /* renamed from: b, reason: collision with root package name */
    private int f8506b;

    /* renamed from: c, reason: collision with root package name */
    private int f8507c;

    /* renamed from: d, reason: collision with root package name */
    private int f8508d = 0;

    public t(byte[] bArr, int i, int i6) {
        this.f8505a = bArr;
        this.f8507c = i;
        this.f8506b = i6;
        g();
    }

    private void a(byte[] bArr, int i, int i6) {
        this.f8505a = bArr;
        this.f8507c = i;
        this.f8506b = i6;
        this.f8508d = 0;
        g();
    }

    private boolean c(int i) {
        int i6 = this.f8507c;
        int i9 = i / 8;
        int i10 = i6 + i9;
        int i11 = (this.f8508d + i) - (i9 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i6++;
            if (i6 > i10 || i10 >= this.f8506b) {
                break;
            }
            if (d(i6)) {
                i10++;
                i6 += 2;
            }
        }
        int i12 = this.f8506b;
        if (i10 >= i12) {
            return i10 == i12 && i11 == 0;
        }
        return true;
    }

    private boolean e() {
        int i = this.f8507c;
        int i6 = this.f8508d;
        int i9 = 0;
        while (this.f8507c < this.f8506b && !b()) {
            i9++;
        }
        boolean z3 = this.f8507c == this.f8506b;
        this.f8507c = i;
        this.f8508d = i6;
        if (!z3) {
            int i10 = (i9 * 2) + 1;
            int i11 = i10 / 8;
            int i12 = i + i11;
            int i13 = (i6 + i10) - (i11 * 8);
            if (i13 > 7) {
                i12++;
                i13 -= 8;
            }
            while (true) {
                i++;
                if (i > i12 || i12 >= this.f8506b) {
                    break;
                }
                if (d(i)) {
                    i12++;
                    i += 2;
                }
            }
            int i14 = this.f8506b;
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
        int i6 = this.f8507c;
        a.b(i6 >= 0 && (i6 < (i = this.f8506b) || (i6 == i && this.f8508d == 0)));
    }

    public final boolean b() {
        boolean z3 = (this.f8505a[this.f8507c] & (128 >> this.f8508d)) != 0;
        a();
        return z3;
    }

    public final int d() {
        int f3 = f();
        return ((f3 + 1) / 2) * (f3 % 2 == 0 ? -1 : 1);
    }

    private boolean d(int i) {
        if (2 > i || i >= this.f8506b) {
            return false;
        }
        byte[] bArr = this.f8505a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    public final int b(int i) {
        int i6;
        this.f8508d += i;
        int i9 = 0;
        while (true) {
            i6 = this.f8508d;
            if (i6 <= 8) {
                break;
            }
            int i10 = i6 - 8;
            this.f8508d = i10;
            byte[] bArr = this.f8505a;
            int i11 = this.f8507c;
            i9 |= (bArr[i11] & 255) << i10;
            if (!d(i11 + 1)) {
                r3 = 1;
            }
            this.f8507c = i11 + r3;
        }
        byte[] bArr2 = this.f8505a;
        int i12 = this.f8507c;
        int i13 = ((-1) >>> (32 - i)) & (i9 | ((bArr2[i12] & 255) >> (8 - i6)));
        if (i6 == 8) {
            this.f8508d = 0;
            this.f8507c = i12 + (d(i12 + 1) ? 2 : 1);
        }
        g();
        return i13;
    }

    public final void a() {
        int i = this.f8508d + 1;
        this.f8508d = i;
        if (i == 8) {
            this.f8508d = 0;
            int i6 = this.f8507c;
            this.f8507c = i6 + (d(i6 + 1) ? 2 : 1);
        }
        g();
    }

    public final int c() {
        return f();
    }

    public final void a(int i) {
        int i6 = this.f8507c;
        int i9 = i / 8;
        int i10 = i6 + i9;
        this.f8507c = i10;
        int i11 = (i - (i9 * 8)) + this.f8508d;
        this.f8508d = i11;
        if (i11 > 7) {
            this.f8507c = i10 + 1;
            this.f8508d = i11 - 8;
        }
        while (true) {
            i6++;
            if (i6 <= this.f8507c) {
                if (d(i6)) {
                    this.f8507c++;
                    i6 += 2;
                }
            } else {
                g();
                return;
            }
        }
    }
}
