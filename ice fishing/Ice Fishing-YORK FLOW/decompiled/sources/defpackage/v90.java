package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class v90 {
    public int[] ZpBGe2uQfcn8;
    public int giKS3J6vZuNy;

    public v90() {
        this.ZpBGe2uQfcn8 = new int[10];
    }

    public void JhCgjQRTAOCT(int i, int i2, int i3) {
        int i4 = this.giKS3J6vZuNy;
        int[] iArr = this.ZpBGe2uQfcn8;
        int i5 = i4 + 3;
        if (i5 >= iArr.length) {
            iArr = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            this.ZpBGe2uQfcn8 = iArr;
        }
        iArr[i4] = i + i3;
        iArr[i4 + 1] = i2 + i3;
        iArr[i4 + 2] = i3;
        this.giKS3J6vZuNy = i5;
    }

    public void QiMR8OkAhezm(int i, int i2) {
        int[] iArr = this.ZpBGe2uQfcn8;
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

    public void WDYagTQQm9ns(int i, int i2, int i3, int i4) {
        int i5 = this.giKS3J6vZuNy;
        int[] iArr = this.ZpBGe2uQfcn8;
        int i6 = i5 + 4;
        if (i6 >= iArr.length) {
            iArr = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            this.ZpBGe2uQfcn8 = iArr;
        }
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = i4;
        this.giKS3J6vZuNy = i6;
    }

    public int ZpBGe2uQfcn8(int i) {
        int i2 = this.giKS3J6vZuNy - 1;
        return i2 >= 0 ? this.ZpBGe2uQfcn8[i2] : i;
    }

    public void fWTAfUmVKrZq(int i) {
        int[] iArr = this.ZpBGe2uQfcn8;
        if (this.giKS3J6vZuNy >= iArr.length) {
            iArr = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            this.ZpBGe2uQfcn8 = iArr;
        }
        int i2 = this.giKS3J6vZuNy;
        this.giKS3J6vZuNy = i2 + 1;
        iArr[i2] = i;
    }

    public int giKS3J6vZuNy() {
        int[] iArr = this.ZpBGe2uQfcn8;
        int i = this.giKS3J6vZuNy - 1;
        this.giKS3J6vZuNy = i;
        return iArr[i];
    }

    public void oh71FJcDz6S2(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.ZpBGe2uQfcn8;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    QiMR8OkAhezm(i3, i4);
                }
            }
            QiMR8OkAhezm(i3 + 3, i2);
            oh71FJcDz6S2(i, i3);
            oh71FJcDz6S2(i3 + 6, i2);
        }
    }

    public v90(int i) {
        this.ZpBGe2uQfcn8 = new int[i];
    }
}
