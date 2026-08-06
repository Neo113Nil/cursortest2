package defpackage;

/* loaded from: classes.dex */
public final class al0 {
    public long[] IHQe1A4L2xu;
    public int oh6vYeIP;

    public al0(int i) {
        this.IHQe1A4L2xu = i == 0 ? defpackage.uf0.IHQe1A4L2xu : new long[i];
    }

    public final void IHQe1A4L2xu(long j) {
        int i = this.oh6vYeIP + 1;
        long[] jArr = this.IHQe1A4L2xu;
        if (jArr.length < i) {
            this.IHQe1A4L2xu = java.util.Arrays.copyOf(jArr, java.lang.Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.IHQe1A4L2xu;
        int i2 = this.oh6vYeIP;
        jArr2[i2] = j;
        this.oh6vYeIP = i2 + 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.al0) {
            defpackage.al0 al0Var = (defpackage.al0) obj;
            int i = al0Var.oh6vYeIP;
            int i2 = this.oh6vYeIP;
            if (i == i2) {
                long[] jArr = this.IHQe1A4L2xu;
                long[] jArr2 = al0Var.IHQe1A4L2xu;
                defpackage.d70 QPwENk36pDC = defpackage.x80.QPwENk36pDC(0, i2);
                int i3 = QPwENk36pDC.adDC3e2L;
                int i4 = QPwENk36pDC.xiZrDbcSW0;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
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
        long[] jArr = this.IHQe1A4L2xu;
        int i = this.oh6vYeIP;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += java.lang.Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "[");
        long[] jArr = this.IHQe1A4L2xu;
        int i = this.oh6vYeIP;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((java.lang.CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((java.lang.CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((java.lang.CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }
}
