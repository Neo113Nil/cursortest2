package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class c30 {
    public int[] GWasM1elztuh;
    public int Yi7zF1RB1;

    public c30() {
        this.GWasM1elztuh = new int[10];
    }

    public void AvO7iQsrTN(int i, int i2) {
        int[] iArr = this.GWasM1elztuh;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public void EljAMC1QTz(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.GWasM1elztuh;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    AvO7iQsrTN(i3, i4);
                }
            }
            AvO7iQsrTN(i3 + 3, i2);
            EljAMC1QTz(i, i3);
            EljAMC1QTz(i3 + 6, i2);
        }
    }

    public int GWasM1elztuh(int i) {
        int i2 = this.Yi7zF1RB1 - 1;
        return i2 >= 0 ? this.GWasM1elztuh[i2] : i;
    }

    public void OOA6hdeuvCS(int i, int i2, int i3, int i4) {
        int i5 = this.Yi7zF1RB1;
        int[] iArr = this.GWasM1elztuh;
        int i6 = i5 + 4;
        if (i6 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.GWasM1elztuh = iArr;
        }
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = i4;
        this.Yi7zF1RB1 = i6;
    }

    public void X1lG3V04pd(int i) {
        int[] iArr = this.GWasM1elztuh;
        if (this.Yi7zF1RB1 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.GWasM1elztuh = iArr;
        }
        int i2 = this.Yi7zF1RB1;
        this.Yi7zF1RB1 = i2 + 1;
        iArr[i2] = i;
    }

    public int Yi7zF1RB1() {
        int[] iArr = this.GWasM1elztuh;
        int i = this.Yi7zF1RB1 - 1;
        this.Yi7zF1RB1 = i;
        return iArr[i];
    }

    public void xqGvceK5x(int i, int i2, int i3) {
        int i4 = this.Yi7zF1RB1;
        int[] iArr = this.GWasM1elztuh;
        int i5 = i4 + 3;
        if (i5 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.GWasM1elztuh = iArr;
        }
        iArr[i4] = i + i3;
        iArr[i4 + 1] = i2 + i3;
        iArr[i4 + 2] = i3;
        this.Yi7zF1RB1 = i5;
    }

    public c30(int i) {
        this.GWasM1elztuh = new int[i];
    }
}
