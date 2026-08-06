package defpackage;

/* loaded from: classes.dex */
public final class wk0 {
    public int[] IHQe1A4L2xu;
    public int oh6vYeIP;

    public wk0(int i) {
        this.IHQe1A4L2xu = i == 0 ? defpackage.h70.IHQe1A4L2xu : new int[i];
    }

    public final void F7NU4MC0GW(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.oh6vYeIP)) {
            defpackage.db.cnag84Bm("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.IHQe1A4L2xu;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            defpackage.t6.Ye0N2xE9Hc(iArr, iArr, i, i + 1, i2);
        }
        this.oh6vYeIP--;
    }

    public final void IHQe1A4L2xu(int i) {
        int i2 = this.oh6vYeIP + 1;
        int[] iArr = this.IHQe1A4L2xu;
        if (iArr.length < i2) {
            this.IHQe1A4L2xu = java.util.Arrays.copyOf(iArr, java.lang.Math.max(i2, (iArr.length * 3) / 2));
        }
        int[] iArr2 = this.IHQe1A4L2xu;
        int i3 = this.oh6vYeIP;
        iArr2[i3] = i;
        this.oh6vYeIP = i3 + 1;
    }

    public final void adDC3e2L(int i, int i2) {
        if (i < 0 || i >= this.oh6vYeIP) {
            defpackage.db.cnag84Bm("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.IHQe1A4L2xu;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.wk0) {
            defpackage.wk0 wk0Var = (defpackage.wk0) obj;
            int i = wk0Var.oh6vYeIP;
            int i2 = this.oh6vYeIP;
            if (i == i2) {
                int[] iArr = this.IHQe1A4L2xu;
                int[] iArr2 = wk0Var.IHQe1A4L2xu;
                defpackage.d70 QPwENk36pDC = defpackage.x80.QPwENk36pDC(0, i2);
                int i3 = QPwENk36pDC.adDC3e2L;
                int i4 = QPwENk36pDC.xiZrDbcSW0;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.IHQe1A4L2xu;
        int i = this.oh6vYeIP;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += java.lang.Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final int oh6vYeIP(int i) {
        if (i >= 0 && i < this.oh6vYeIP) {
            return this.IHQe1A4L2xu[i];
        }
        defpackage.db.cnag84Bm("Index must be between 0 and size");
        return 0;
    }

    public final int r1MBDhnF() {
        int i = this.oh6vYeIP;
        if (i != 0) {
            return this.IHQe1A4L2xu[i - 1];
        }
        throw new java.util.NoSuchElementException("IntList is empty.");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "[");
        int[] iArr = this.IHQe1A4L2xu;
        int i = this.oh6vYeIP;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((java.lang.CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((java.lang.CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((java.lang.CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ wk0() {
        this(16);
    }
}
