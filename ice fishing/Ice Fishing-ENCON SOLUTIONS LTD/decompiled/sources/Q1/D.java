package Q1;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public int f1561a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1562b = new int[10];

    public final int a() {
        if ((this.f1561a & 128) != 0) {
            return this.f1562b[7];
        }
        return 65535;
    }

    public final void b(D other) {
        kotlin.jvm.internal.i.e(other, "other");
        int i2 = 0;
        while (i2 < 10) {
            int i3 = i2 + 1;
            if (((1 << i2) & other.f1561a) != 0) {
                c(i2, other.f1562b[i2]);
            }
            i2 = i3;
        }
    }

    public final void c(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.f1562b;
            if (i2 >= iArr.length) {
                return;
            }
            this.f1561a = (1 << i2) | this.f1561a;
            iArr[i2] = i3;
        }
    }
}
