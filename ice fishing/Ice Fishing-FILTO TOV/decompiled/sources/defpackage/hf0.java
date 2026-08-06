package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hf0 {
    public int GWasM1elztuh;
    public Object OOA6hdeuvCS;
    public Object X1lG3V04pd;
    public int Yi7zF1RB1;
    public Object xqGvceK5x;

    public int GWasM1elztuh(long j) {
        int i = this.GWasM1elztuh + 1;
        long[] jArr = (long[]) this.X1lG3V04pd;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            d5.Uxq83abb04(jArr, jArr2, 0, 0, jArr.length);
            d5.c4eaifQP((int[]) this.xqGvceK5x, iArr, 0, 0, 14);
            this.X1lG3V04pd = jArr2;
            this.xqGvceK5x = iArr;
        }
        int i3 = this.GWasM1elztuh;
        this.GWasM1elztuh = i3 + 1;
        int length2 = ((int[]) this.OOA6hdeuvCS).length;
        if (this.Yi7zF1RB1 >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            d5.c4eaifQP((int[]) this.OOA6hdeuvCS, iArr2, 0, 0, 14);
            this.OOA6hdeuvCS = iArr2;
        }
        int i7 = this.Yi7zF1RB1;
        int[] iArr3 = (int[]) this.OOA6hdeuvCS;
        this.Yi7zF1RB1 = iArr3[i7];
        long[] jArr3 = (long[]) this.X1lG3V04pd;
        jArr3[i3] = j;
        ((int[]) this.xqGvceK5x)[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (o30.iwATDS1i01k(jArr3[i8], j) <= 0) {
                break;
            }
            X1lG3V04pd(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public void X1lG3V04pd(int i, int i2) {
        long[] jArr = (long[]) this.X1lG3V04pd;
        int[] iArr = (int[]) this.xqGvceK5x;
        int[] iArr2 = (int[]) this.OOA6hdeuvCS;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public void Yi7zF1RB1(int i) {
        int i2 = this.Yi7zF1RB1;
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        u10.GWasM1elztuh("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
