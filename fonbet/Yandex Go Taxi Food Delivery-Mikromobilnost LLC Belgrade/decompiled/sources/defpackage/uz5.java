package defpackage;

import java.util.Arrays;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes11.dex */
public final class uz5 implements Cloneable {
    public static final int[] c = new int[0];
    public int b = 0;
    public int[] a = c;

    public final void a(boolean z) {
        c(this.b + 1);
        if (z) {
            int[] iArr = this.a;
            int i = this.b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.b++;
    }

    public final void b(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            ny61.g("Num bits must be between 0 and 32");
            return;
        }
        int i3 = this.b;
        c(i3 + i2);
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (((1 << i4) & i) != 0) {
                int[] iArr = this.a;
                int i5 = i3 / 32;
                iArr[i5] = iArr[i5] | (1 << (i3 & 31));
            }
            i3++;
        }
        this.b = i3;
    }

    public final void c(int i) {
        if (i > this.a.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i / 0.75f)) + 31) / 32];
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.a = iArr;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.a.clone();
        int i = this.b;
        uz5 uz5Var = new uz5();
        uz5Var.a = iArr;
        uz5Var.b = i;
        return uz5Var;
    }

    public final boolean d(int i) {
        return (this.a[i / 32] & (1 << (i & 31))) != 0;
    }

    public final int e() {
        return (this.b + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uz5)) {
            return false;
        }
        uz5 uz5Var = (uz5) obj;
        return this.b == uz5Var.b && Arrays.equals(this.a, uz5Var.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + (this.b * 31);
    }

    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(HexString.CHAR_SPACE);
            }
            sb.append(d(i2) ? 'X' : '.');
        }
        return sb.toString();
    }
}
