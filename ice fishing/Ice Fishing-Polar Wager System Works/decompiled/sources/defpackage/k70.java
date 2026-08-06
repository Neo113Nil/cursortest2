package defpackage;

/* loaded from: classes.dex */
public final class k70 {
    public int[] IHQe1A4L2xu;
    public int oh6vYeIP;

    public k70() {
        this.IHQe1A4L2xu = new int[10];
    }

    public void AARZUJiTa(int i, int i2) {
        int[] iArr = this.IHQe1A4L2xu;
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

    public void F7NU4MC0GW(int i, int i2, int i3) {
        int i4 = this.oh6vYeIP;
        int[] iArr = this.IHQe1A4L2xu;
        int i5 = i4 + 3;
        if (i5 >= iArr.length) {
            iArr = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            this.IHQe1A4L2xu = iArr;
        }
        iArr[i4] = i + i3;
        iArr[i4 + 1] = i2 + i3;
        iArr[i4 + 2] = i3;
        this.oh6vYeIP = i5;
    }

    public int IHQe1A4L2xu(int i) {
        int i2 = this.oh6vYeIP - 1;
        return i2 >= 0 ? this.IHQe1A4L2xu[i2] : i;
    }

    public void adDC3e2L(int i, int i2, int i3, int i4) {
        int i5 = this.oh6vYeIP;
        int[] iArr = this.IHQe1A4L2xu;
        int i6 = i5 + 4;
        if (i6 >= iArr.length) {
            iArr = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            this.IHQe1A4L2xu = iArr;
        }
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = i4;
        this.oh6vYeIP = i6;
    }

    public int oh6vYeIP() {
        int[] iArr = this.IHQe1A4L2xu;
        int i = this.oh6vYeIP - 1;
        this.oh6vYeIP = i;
        return iArr[i];
    }

    public void r1MBDhnF(int i) {
        int[] iArr = this.IHQe1A4L2xu;
        if (this.oh6vYeIP >= iArr.length) {
            iArr = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            this.IHQe1A4L2xu = iArr;
        }
        int i2 = this.oh6vYeIP;
        this.oh6vYeIP = i2 + 1;
        iArr[i2] = i;
    }

    public void xiZrDbcSW0(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.IHQe1A4L2xu;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    AARZUJiTa(i3, i4);
                }
            }
            AARZUJiTa(i3 + 3, i2);
            xiZrDbcSW0(i, i3);
            xiZrDbcSW0(i3 + 6, i2);
        }
    }

    public k70(int i) {
        this.IHQe1A4L2xu = new int[i];
    }
}
