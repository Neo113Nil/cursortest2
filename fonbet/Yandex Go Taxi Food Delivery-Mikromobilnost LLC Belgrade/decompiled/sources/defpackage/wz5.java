package defpackage;

/* loaded from: classes11.dex */
public final class wz5 {
    public int a;
    public int b;
    public byte[] c;

    public int a() {
        return ((this.c.length - this.a) * 8) - this.b;
    }

    public int b(int i) {
        byte[] bArr = this.c;
        int i2 = 0;
        if (i < 1 || i > 32 || i > a()) {
            ny61.g(String.valueOf(i));
            return 0;
        }
        int i3 = this.b;
        if (i3 > 0) {
            int i4 = 8 - i3;
            int min = Math.min(i, i4);
            int i5 = i4 - min;
            int i6 = this.a;
            int i7 = (((255 >> (8 - min)) << i5) & bArr[i6]) >> i5;
            i -= min;
            int i8 = this.b + min;
            this.b = i8;
            if (i8 == 8) {
                this.b = 0;
                this.a = i6 + 1;
            }
            i2 = i7;
        }
        if (i > 0) {
            while (i >= 8) {
                int i9 = this.a;
                i2 = (i2 << 8) | (bArr[i9] & 255);
                this.a = i9 + 1;
                i -= 8;
            }
            if (i > 0) {
                int i10 = 8 - i;
                int i11 = ((bArr[this.a] & ((255 >> i10) << i10)) >> i10) | (i2 << i);
                this.b += i;
                return i11;
            }
        }
        return i2;
    }
}
