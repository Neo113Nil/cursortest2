package defpackage;

/* loaded from: classes7.dex */
public final class vt81 {
    public final dl81 a = new dl81(8);
    public int b;

    public final long a(w971 w971Var) {
        dl81 dl81Var = this.a;
        int i = 0;
        w971Var.I(dl81Var.a, 0, 1, false);
        int i2 = dl81Var.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        w971Var.I(dl81Var.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (dl81Var.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }
}
