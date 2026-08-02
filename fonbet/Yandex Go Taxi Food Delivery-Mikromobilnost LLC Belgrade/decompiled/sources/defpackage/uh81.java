package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes7.dex */
public final class uh81 {
    public byte[] a;
    public int b;
    public int c;
    public int d;

    public uh81(byte[] bArr) {
        int length = bArr.length;
        this.a = bArr;
        this.d = length;
    }

    public final int a(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.a;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.a;
        int i6 = this.b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.c = 0;
            this.b = i6 + 1;
        }
        c();
        return i7;
    }

    public final String b(int i, Charset charset) {
        byte[] bArr = new byte[i];
        if (this.c != 0) {
            ny61.k();
            return null;
        }
        System.arraycopy(this.a, this.b, bArr, 0, i);
        this.b += i;
        c();
        return new String(bArr, charset);
    }

    public final void c() {
        int i = this.b;
        if (i >= 0) {
            int i2 = this.d;
            if (i < i2) {
                return;
            }
            if (i == i2 && this.c == 0) {
                return;
            }
        }
        ny61.k();
    }

    public final void d(int i, byte[] bArr) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.a;
            int i4 = this.b;
            int i5 = i4 + 1;
            this.b = i5;
            byte b = bArr2[i4];
            int i6 = this.c;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.a;
            int i9 = this.b;
            this.b = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.c = i8 - 8;
        }
        int i10 = this.c + i7;
        this.c = i10;
        byte[] bArr4 = this.a;
        int i11 = this.b;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.c = 0;
            this.b = i11 + 1;
        }
        c();
    }

    public final int e() {
        return ((this.d - this.b) * 8) - this.c;
    }

    public final void f(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        c();
    }

    public final int g() {
        if (this.c == 0) {
            return this.b;
        }
        ny61.k();
        return 0;
    }

    public final void h(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = (i - (i2 * 8)) + this.c;
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        c();
    }

    public final int i() {
        return (this.b * 8) + this.c;
    }

    public final void j(int i) {
        if (this.c != 0) {
            ny61.k();
        } else {
            this.b += i;
            c();
        }
    }

    public final boolean k() {
        boolean z = (this.a[this.b] & (128 >> this.c)) != 0;
        l();
        return z;
    }

    public final void l() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        c();
    }

    public uh81() {
        this.a = rf71.f;
    }

    public uh81(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }
}
