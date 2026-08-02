package defpackage;

/* loaded from: classes10.dex */
public final class s3t0 {
    public final ef90 a = new ef90(8);
    public int b;

    public final long a(kbh kbhVar) {
        ef90 ef90Var = this.a;
        int i = 0;
        kbhVar.H(ef90Var.a, 0, 1, false);
        int i2 = ef90Var.a[0] & 255;
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
        kbhVar.H(ef90Var.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (ef90Var.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }
}
