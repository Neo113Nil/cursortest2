package defpackage;

/* loaded from: classes3.dex */
public final class m5d {
    public static final m5d g;
    public final int[] a;
    public final int[] b;
    public final n5d c;
    public final int d;
    public final int e;
    public final int f;

    static {
        new m5d(4201, 4096, 1);
        new m5d(1033, 1024, 1);
        new m5d(67, 64, 1);
        new m5d(19, 16, 1);
        g = new m5d(285, 256, 0);
        new m5d(301, 256, 1);
    }

    public m5d(int i, int i2, int i3) {
        this.e = i;
        this.d = i2;
        this.f = i3;
        this.a = new int[i2];
        this.b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.a[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.b[this.a[i6]] = i6;
        }
        this.c = new n5d(this, new int[]{0});
    }

    public final int a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.a[(iArr[i] + iArr[i2]) % (this.d - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.e));
        sb.append(',');
        return vz1.r(sb, this.d, ')');
    }
}
