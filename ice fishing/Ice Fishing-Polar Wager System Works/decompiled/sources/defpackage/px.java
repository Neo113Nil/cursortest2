package defpackage;

/* loaded from: classes.dex */
public final class px implements defpackage.b31 {
    public final defpackage.hk F7NU4MC0GW;
    public final defpackage.h6 IHQe1A4L2xu;
    public final float adDC3e2L;
    public final defpackage.j6 oh6vYeIP;
    public final float r1MBDhnF;
    public final defpackage.nx xiZrDbcSW0;

    public px(defpackage.h6 h6Var, defpackage.j6 j6Var, float f, defpackage.hk hkVar, float f2, defpackage.nx nxVar) {
        this.IHQe1A4L2xu = h6Var;
        this.oh6vYeIP = j6Var;
        this.r1MBDhnF = f;
        this.F7NU4MC0GW = hkVar;
        this.adDC3e2L = f2;
        this.xiZrDbcSW0 = nxVar;
    }

    public static int IHQe1A4L2xu(java.util.List list, int i, int i2, int i3, defpackage.nx nxVar) {
        boolean z;
        boolean z2;
        long IHQe1A4L2xu = defpackage.u60.IHQe1A4L2xu(0, 0);
        if (!list.isEmpty()) {
            int i4 = Integer.MAX_VALUE;
            defpackage.ix ixVar = new defpackage.ix(nxVar, defpackage.li.IHQe1A4L2xu(0, i, 0, Integer.MAX_VALUE), i2, i3);
            defpackage.di0 di0Var = (defpackage.di0) defpackage.td.sJNB7mCer5(0, list);
            int RmCzwkUxICV = di0Var != null ? di0Var.RmCzwkUxICV(i) : 0;
            int lpprD5VAS = di0Var != null ? di0Var.lpprD5VAS(RmCzwkUxICV) : 0;
            boolean z3 = true;
            if (list.size() > 1) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            int i5 = 0;
            if (ixVar.oh6vYeIP(z3, 0, defpackage.u60.IHQe1A4L2xu(i, Integer.MAX_VALUE), di0Var == null ? null : new defpackage.u60(defpackage.u60.IHQe1A4L2xu(lpprD5VAS, RmCzwkUxICV)), 0, 0, 0, false, false).oh6vYeIP) {
                nxVar.getClass();
                IHQe1A4L2xu = IHQe1A4L2xu;
            } else {
                int size = list.size();
                int i6 = i;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    int i12 = i6 - lpprD5VAS;
                    int i13 = i9 + 1;
                    int max = java.lang.Math.max(i8, RmCzwkUxICV);
                    defpackage.di0 di0Var2 = (defpackage.di0) defpackage.td.sJNB7mCer5(i13, list);
                    RmCzwkUxICV = di0Var2 != null ? di0Var2.RmCzwkUxICV(i) : 0;
                    int lpprD5VAS2 = di0Var2 != null ? di0Var2.lpprD5VAS(RmCzwkUxICV) + i2 : 0;
                    if (i9 + 2 < list.size()) {
                        i9 = i13;
                        z2 = z;
                    } else {
                        i9 = i13;
                        z2 = false;
                    }
                    int i14 = i9 - i11;
                    int i15 = i7;
                    int i16 = lpprD5VAS2;
                    defpackage.hx oh6vYeIP = ixVar.oh6vYeIP(z2, i14, defpackage.u60.IHQe1A4L2xu(i12, i4), di0Var2 == null ? null : new defpackage.u60(defpackage.u60.IHQe1A4L2xu(lpprD5VAS2, RmCzwkUxICV)), i15, i5, max, false, false);
                    if (oh6vYeIP.IHQe1A4L2xu) {
                        int i17 = max + i3 + i5;
                        ixVar.IHQe1A4L2xu(oh6vYeIP, di0Var2 != null, i15, i17, i12, i14);
                        int i18 = i16 - i2;
                        i7 = i15 + 1;
                        if (oh6vYeIP.oh6vYeIP) {
                            i10 = i9;
                            i5 = i17;
                            break;
                        }
                        i6 = i;
                        i11 = i9;
                        lpprD5VAS = i18;
                        i5 = i17;
                        i8 = 0;
                    } else {
                        lpprD5VAS = i16;
                        i6 = i12;
                        i7 = i15;
                        i8 = max;
                    }
                    i10 = i9;
                    i4 = Integer.MAX_VALUE;
                    z = true;
                }
                IHQe1A4L2xu = defpackage.u60.IHQe1A4L2xu(i5 - i3, i10);
            }
        }
        return (int) (IHQe1A4L2xu >> 32);
    }

    @Override // defpackage.b31
    public final int EXtogiMhuM(defpackage.bv0 bv0Var) {
        return bv0Var.nVhUznk1t();
    }

    @Override // defpackage.b31
    public final long F7NU4MC0GW(int i, int i2, int i3, boolean z) {
        defpackage.e31 e31Var = defpackage.d31.IHQe1A4L2xu;
        return !z ? defpackage.li.IHQe1A4L2xu(i, i2, 0, i3) : defpackage.fm.NHJTzaLwkd(i, i2, 0, i3);
    }

    @Override // defpackage.b31
    public final defpackage.ji0 SH1y5HwkJhh(final defpackage.bv0[] bv0VarArr, defpackage.ki0 ki0Var, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final defpackage.w90 w90Var = defpackage.w90.adDC3e2L;
        return ki0Var.EoOhNTTfIN7K(i, i2, defpackage.ot.adDC3e2L, new defpackage.g00() { // from class: ox
            @Override // defpackage.g00
            public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
                defpackage.w70 w70Var;
                defpackage.av0 av0Var = (defpackage.av0) obj;
                int[] iArr3 = iArr2;
                int i6 = iArr3 != null ? iArr3[i3] : 0;
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    defpackage.bv0 bv0Var = bv0VarArr[i8];
                    bv0Var.getClass();
                    java.lang.Object ez2rX8ReCYw = bv0Var.ez2rX8ReCYw();
                    defpackage.c31 c31Var = ez2rX8ReCYw instanceof defpackage.c31 ? (defpackage.c31) ez2rX8ReCYw : null;
                    if (c31Var == null || (w70Var = c31Var.r1MBDhnF) == null) {
                        w70Var = this.F7NU4MC0GW;
                    }
                    defpackage.av0.SH1y5HwkJhh(av0Var, bv0Var, iArr[i8 - i7], w70Var.ez2rX8ReCYw(i2, bv0Var.QUKZkWRtw6(), w90Var) + i6);
                }
                return defpackage.ok1.IHQe1A4L2xu;
            }
        });
    }

    @Override // defpackage.b31
    public final int adDC3e2L(defpackage.bv0 bv0Var) {
        return bv0Var.QUKZkWRtw6();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.px)) {
            return false;
        }
        defpackage.px pxVar = (defpackage.px) obj;
        return this.IHQe1A4L2xu.equals(pxVar.IHQe1A4L2xu) && this.oh6vYeIP.equals(pxVar.oh6vYeIP) && defpackage.uq.oh6vYeIP(this.r1MBDhnF, pxVar.r1MBDhnF) && this.F7NU4MC0GW.equals(pxVar.F7NU4MC0GW) && defpackage.uq.oh6vYeIP(this.adDC3e2L, pxVar.adDC3e2L) && defpackage.x70.QoRHpC4k(this.xiZrDbcSW0, pxVar.xiZrDbcSW0);
    }

    public final int hashCode() {
        return this.xiZrDbcSW0.hashCode() + defpackage.fx0.oh6vYeIP(Integer.MAX_VALUE, defpackage.fx0.oh6vYeIP(Integer.MAX_VALUE, defpackage.fx0.IHQe1A4L2xu(this.adDC3e2L, defpackage.fx0.IHQe1A4L2xu(-1.0f, defpackage.fx0.IHQe1A4L2xu(this.r1MBDhnF, (this.oh6vYeIP.hashCode() + ((this.IHQe1A4L2xu.hashCode() + (java.lang.Boolean.hashCode(true) * 31)) * 31)) * 31, 31), 31), 31), 31), 31);
    }

    @Override // defpackage.b31
    public final void oh6vYeIP(int i, defpackage.ki0 ki0Var, int[] iArr, int[] iArr2) {
        this.IHQe1A4L2xu.AARZUJiTa(ki0Var, i, iArr, ki0Var.getLayoutDirection(), iArr2);
    }

    public final java.lang.String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.IHQe1A4L2xu + ", verticalArrangement=" + this.oh6vYeIP + ", mainAxisSpacing=" + ((java.lang.Object) defpackage.uq.r1MBDhnF(this.r1MBDhnF)) + ", crossAxisAlignment=" + this.F7NU4MC0GW + ", crossAxisArrangementSpacing=" + ((java.lang.Object) defpackage.uq.r1MBDhnF(this.adDC3e2L)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.xiZrDbcSW0 + ')';
    }
}
