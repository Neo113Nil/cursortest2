package defpackage;

import java.util.Arrays;

/* loaded from: classes11.dex */
public final class vz5 implements Cloneable {
    public int a;
    public int b;
    public int c;
    public int[] w;

    public vz5(int i, int i2) {
        if (i < 1 || i2 < 1) {
            ny61.g("Both dimensions must be greater than 0");
            throw null;
        }
        this.a = i;
        this.b = i2;
        int i3 = (i + 31) / 32;
        this.c = i3;
        this.w = new int[i3 * i2];
    }

    public final void a(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.c);
        int[] iArr = this.w;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public final boolean b(int i, int i2) {
        return ((this.w[(i / 32) + (i2 * this.c)] >>> (i & 31)) & 1) != 0;
    }

    public final void c(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.c);
        int[] iArr = this.w;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public final Object clone() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int[] iArr = (int[]) this.w.clone();
        vz5 vz5Var = new vz5();
        vz5Var.a = i;
        vz5Var.b = i2;
        vz5Var.c = i3;
        vz5Var.w = iArr;
        return vz5Var;
    }

    public final void d(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            ny61.g("Left and top must be nonnegative");
            return;
        }
        if (i4 < 1 || i3 < 1) {
            ny61.g("Height and width must be at least 1");
            return;
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.b || i5 > this.a) {
            ny61.g("The region must fit inside the matrix");
            return;
        }
        while (i2 < i6) {
            int i7 = this.c * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.w;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vz5)) {
            return false;
        }
        vz5 vz5Var = (vz5) obj;
        return this.a == vz5Var.a && this.b == vz5Var.b && this.c == vz5Var.c && Arrays.equals(this.w, vz5Var.w);
    }

    public final int hashCode() {
        int i = this.a;
        return Arrays.hashCode(this.w) + (((((((i * 31) + i) * 31) + this.b) * 31) + this.c) * 31);
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.a;
        StringBuilder sb = new StringBuilder((i2 + 1) * i);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(b(i4, i3) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
