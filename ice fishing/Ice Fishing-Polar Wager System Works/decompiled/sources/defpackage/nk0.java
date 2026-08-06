package defpackage;

/* loaded from: classes.dex */
public final class nk0 {
    public java.lang.Object F7NU4MC0GW;
    public int IHQe1A4L2xu;
    public java.lang.Object adDC3e2L;
    public int oh6vYeIP;
    public java.lang.Object r1MBDhnF;

    public int IHQe1A4L2xu(long j) {
        int i = this.IHQe1A4L2xu + 1;
        long[] jArr = (long[]) this.r1MBDhnF;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            defpackage.t6.EoOhNTTfIN7K(jArr, jArr2, 0, 0, jArr.length);
            defpackage.t6.AsxAYCCkb3Hi((int[]) this.F7NU4MC0GW, iArr, 0, 0, 14);
            this.r1MBDhnF = jArr2;
            this.F7NU4MC0GW = iArr;
        }
        int i3 = this.IHQe1A4L2xu;
        this.IHQe1A4L2xu = i3 + 1;
        int length2 = ((int[]) this.adDC3e2L).length;
        if (this.oh6vYeIP >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            defpackage.t6.AsxAYCCkb3Hi((int[]) this.adDC3e2L, iArr2, 0, 0, 14);
            this.adDC3e2L = iArr2;
        }
        int i7 = this.oh6vYeIP;
        int[] iArr3 = (int[]) this.adDC3e2L;
        this.oh6vYeIP = iArr3[i7];
        long[] jArr3 = (long[]) this.r1MBDhnF;
        jArr3[i3] = j;
        ((int[]) this.F7NU4MC0GW)[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (defpackage.x70.V7bD7b8KA(jArr3[i8], j) <= 0) {
                break;
            }
            r1MBDhnF(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public void oh6vYeIP(int i) {
        int i2 = this.oh6vYeIP;
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        defpackage.y50.IHQe1A4L2xu("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }

    public void r1MBDhnF(int i, int i2) {
        long[] jArr = (long[]) this.r1MBDhnF;
        int[] iArr = (int[]) this.F7NU4MC0GW;
        int[] iArr2 = (int[]) this.adDC3e2L;
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
}
