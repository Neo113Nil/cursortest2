package defpackage;

/* loaded from: classes.dex */
public final class pk1 {
    public static final defpackage.pk1 xiZrDbcSW0 = new defpackage.pk1(0, new int[0], new java.lang.Object[0], false);
    public int F7NU4MC0GW = -1;
    public int IHQe1A4L2xu;
    public boolean adDC3e2L;
    public int[] oh6vYeIP;
    public java.lang.Object[] r1MBDhnF;

    public pk1(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = iArr;
        this.r1MBDhnF = objArr;
        this.adDC3e2L = z;
    }

    public final void F7NU4MC0GW(defpackage.c1NqjJifC7 c1nqjjifc7) {
        if (this.IHQe1A4L2xu == 0) {
            return;
        }
        c1nqjjifc7.getClass();
        defpackage.rd rdVar = (defpackage.rd) c1nqjjifc7.xiZrDbcSW0;
        for (int i = 0; i < this.IHQe1A4L2xu; i++) {
            int i2 = this.oh6vYeIP[i];
            java.lang.Object obj = this.r1MBDhnF[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                rdVar.D2vUnMij(i3, ((java.lang.Long) obj).longValue());
            } else if (i4 == 1) {
                rdVar.fnWB2E7cs(i3, ((java.lang.Long) obj).longValue());
            } else if (i4 == 2) {
                rdVar.QoRHpC4k(i3, (defpackage.ra) obj);
            } else if (i4 == 3) {
                rdVar.UsuH8pd5P(i3, 3);
                ((defpackage.pk1) obj).F7NU4MC0GW(c1nqjjifc7);
                rdVar.UsuH8pd5P(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new java.lang.RuntimeException(defpackage.g80.oh6vYeIP());
                }
                rdVar.kd6TUFXn(i3, ((java.lang.Integer) obj).intValue());
            }
        }
    }

    public final void IHQe1A4L2xu(int i) {
        int[] iArr = this.oh6vYeIP;
        if (i > iArr.length) {
            int i2 = this.IHQe1A4L2xu;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.oh6vYeIP = java.util.Arrays.copyOf(iArr, i);
            this.r1MBDhnF = java.util.Arrays.copyOf(this.r1MBDhnF, i);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.pk1)) {
            return false;
        }
        defpackage.pk1 pk1Var = (defpackage.pk1) obj;
        int i = this.IHQe1A4L2xu;
        if (i == pk1Var.IHQe1A4L2xu) {
            int[] iArr = this.oh6vYeIP;
            int[] iArr2 = pk1Var.oh6vYeIP;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    java.lang.Object[] objArr = this.r1MBDhnF;
                    java.lang.Object[] objArr2 = pk1Var.r1MBDhnF;
                    int i3 = this.IHQe1A4L2xu;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.IHQe1A4L2xu;
        int i2 = (527 + i) * 31;
        int[] iArr = this.oh6vYeIP;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        java.lang.Object[] objArr = this.r1MBDhnF;
        int i7 = this.IHQe1A4L2xu;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int oh6vYeIP() {
        int EXtogiMhuM;
        int SH1y5HwkJhh;
        int EXtogiMhuM2;
        int i = this.F7NU4MC0GW;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.IHQe1A4L2xu; i3++) {
            int i4 = this.oh6vYeIP[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((java.lang.Long) this.r1MBDhnF[i3]).getClass();
                    EXtogiMhuM2 = defpackage.rd.EXtogiMhuM(i5) + 8;
                } else if (i6 == 2) {
                    EXtogiMhuM2 = defpackage.rd.xiZrDbcSW0(i5, (defpackage.ra) this.r1MBDhnF[i3]);
                } else if (i6 == 3) {
                    EXtogiMhuM = defpackage.rd.EXtogiMhuM(i5) * 2;
                    SH1y5HwkJhh = ((defpackage.pk1) this.r1MBDhnF[i3]).oh6vYeIP();
                } else {
                    if (i6 != 5) {
                        throw new java.lang.IllegalStateException(defpackage.g80.oh6vYeIP());
                    }
                    ((java.lang.Integer) this.r1MBDhnF[i3]).getClass();
                    EXtogiMhuM2 = defpackage.rd.EXtogiMhuM(i5) + 4;
                }
                i2 = EXtogiMhuM2 + i2;
            } else {
                long longValue = ((java.lang.Long) this.r1MBDhnF[i3]).longValue();
                EXtogiMhuM = defpackage.rd.EXtogiMhuM(i5);
                SH1y5HwkJhh = defpackage.rd.SH1y5HwkJhh(longValue);
            }
            i2 = SH1y5HwkJhh + EXtogiMhuM + i2;
        }
        this.F7NU4MC0GW = i2;
        return i2;
    }

    public final void r1MBDhnF(int i, java.lang.Object obj) {
        if (!this.adDC3e2L) {
            throw new java.lang.UnsupportedOperationException();
        }
        IHQe1A4L2xu(this.IHQe1A4L2xu + 1);
        int[] iArr = this.oh6vYeIP;
        int i2 = this.IHQe1A4L2xu;
        iArr[i2] = i;
        this.r1MBDhnF[i2] = obj;
        this.IHQe1A4L2xu = i2 + 1;
    }
}
