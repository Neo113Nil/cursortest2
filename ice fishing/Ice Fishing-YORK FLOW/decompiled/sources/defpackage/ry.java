package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ry implements defpackage.s61 {
    public final defpackage.zm JhCgjQRTAOCT;
    public final float WDYagTQQm9ns;
    public final defpackage.k7 ZpBGe2uQfcn8;
    public final float fWTAfUmVKrZq;
    public final defpackage.m7 giKS3J6vZuNy;
    public final defpackage.py oh71FJcDz6S2;

    public ry(defpackage.k7 k7Var, defpackage.m7 m7Var, float f, defpackage.zm zmVar, float f2, defpackage.py pyVar) {
        this.ZpBGe2uQfcn8 = k7Var;
        this.giKS3J6vZuNy = m7Var;
        this.fWTAfUmVKrZq = f;
        this.JhCgjQRTAOCT = zmVar;
        this.WDYagTQQm9ns = f2;
        this.oh71FJcDz6S2 = pyVar;
    }

    public static int ZpBGe2uQfcn8(java.util.List list, int i, int i2, int i3, defpackage.py pyVar) {
        boolean z;
        boolean z2;
        long ZpBGe2uQfcn8 = defpackage.g90.ZpBGe2uQfcn8(0, 0);
        if (!list.isEmpty()) {
            int i4 = Integer.MAX_VALUE;
            defpackage.ly lyVar = new defpackage.ly(pyVar, defpackage.nk.ZpBGe2uQfcn8(0, i, 0, Integer.MAX_VALUE), i2, i3);
            defpackage.qk0 qk0Var = (defpackage.qk0) defpackage.hf.Rl68HURFBtL3(0, list);
            int FhgBoOud6zyW = qk0Var != null ? qk0Var.FhgBoOud6zyW(i) : 0;
            int Jkfc0NcwyPL8 = qk0Var != null ? qk0Var.Jkfc0NcwyPL8(FhgBoOud6zyW) : 0;
            boolean z3 = true;
            if (list.size() > 1) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            int i5 = 0;
            if (lyVar.giKS3J6vZuNy(z3, 0, defpackage.g90.ZpBGe2uQfcn8(i, Integer.MAX_VALUE), qk0Var == null ? null : new defpackage.g90(defpackage.g90.ZpBGe2uQfcn8(Jkfc0NcwyPL8, FhgBoOud6zyW)), 0, 0, 0, false, false).giKS3J6vZuNy) {
                pyVar.getClass();
                ZpBGe2uQfcn8 = ZpBGe2uQfcn8;
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
                    int i12 = i6 - Jkfc0NcwyPL8;
                    int i13 = i9 + 1;
                    int max = java.lang.Math.max(i8, FhgBoOud6zyW);
                    defpackage.qk0 qk0Var2 = (defpackage.qk0) defpackage.hf.Rl68HURFBtL3(i13, list);
                    FhgBoOud6zyW = qk0Var2 != null ? qk0Var2.FhgBoOud6zyW(i) : 0;
                    int Jkfc0NcwyPL82 = qk0Var2 != null ? qk0Var2.Jkfc0NcwyPL8(FhgBoOud6zyW) + i2 : 0;
                    if (i9 + 2 < list.size()) {
                        i9 = i13;
                        z2 = z;
                    } else {
                        i9 = i13;
                        z2 = false;
                    }
                    int i14 = i9 - i11;
                    int i15 = i7;
                    int i16 = Jkfc0NcwyPL82;
                    defpackage.ky giKS3J6vZuNy = lyVar.giKS3J6vZuNy(z2, i14, defpackage.g90.ZpBGe2uQfcn8(i12, i4), qk0Var2 == null ? null : new defpackage.g90(defpackage.g90.ZpBGe2uQfcn8(Jkfc0NcwyPL82, FhgBoOud6zyW)), i15, i5, max, false, false);
                    if (giKS3J6vZuNy.ZpBGe2uQfcn8) {
                        int i17 = max + i3 + i5;
                        lyVar.ZpBGe2uQfcn8(giKS3J6vZuNy, qk0Var2 != null, i15, i17, i12, i14);
                        int i18 = i16 - i2;
                        i7 = i15 + 1;
                        if (giKS3J6vZuNy.giKS3J6vZuNy) {
                            i10 = i9;
                            i5 = i17;
                            break;
                        }
                        i6 = i;
                        i11 = i9;
                        Jkfc0NcwyPL8 = i18;
                        i5 = i17;
                        i8 = 0;
                    } else {
                        Jkfc0NcwyPL8 = i16;
                        i6 = i12;
                        i7 = i15;
                        i8 = max;
                    }
                    i10 = i9;
                    i4 = Integer.MAX_VALUE;
                    z = true;
                }
                ZpBGe2uQfcn8 = defpackage.g90.ZpBGe2uQfcn8(i5 - i3, i10);
            }
        }
        return (int) (ZpBGe2uQfcn8 >> 32);
    }

    @Override // defpackage.s61
    public final defpackage.wk0 GE9mJIPrb8gP(final defpackage.ry0[] ry0VarArr, defpackage.xk0 xk0Var, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final defpackage.sc0 sc0Var = defpackage.sc0.WDYagTQQm9ns;
        return xk0Var.hwoZxnIesQBZ(i, i2, defpackage.bv.WDYagTQQm9ns, new defpackage.y10() { // from class: qy
            @Override // defpackage.y10
            public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
                defpackage.qy0 qy0Var = (defpackage.qy0) obj;
                int[] iArr3 = iArr2;
                int i6 = iArr3 != null ? iArr3[i3] : 0;
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    defpackage.ry0 ry0Var = ry0VarArr[i8];
                    ry0Var.getClass();
                    ry0Var.GE9mJIPrb8gP();
                    defpackage.zm zmVar = this.JhCgjQRTAOCT;
                    defpackage.qy0.QiMR8OkAhezm(qy0Var, ry0Var, iArr[i8 - i7], java.lang.Math.round((1.0f - 1.0f) * ((i2 - ry0Var.Rl68HURFBtL3()) / 2.0f)) + i6);
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
            }
        });
    }

    @Override // defpackage.s61
    public final long JhCgjQRTAOCT(int i, int i2, int i3, boolean z) {
        defpackage.v61 v61Var = defpackage.u61.ZpBGe2uQfcn8;
        return !z ? defpackage.nk.ZpBGe2uQfcn8(i, i2, 0, i3) : defpackage.nn.WmetiUbpKU9I(i, i2, 0, i3);
    }

    @Override // defpackage.s61
    public final int P05cfTpS5W5L(defpackage.ry0 ry0Var) {
        return ry0Var.m6iZQUu7XjoL();
    }

    @Override // defpackage.s61
    public final int WDYagTQQm9ns(defpackage.ry0 ry0Var) {
        return ry0Var.Rl68HURFBtL3();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ry)) {
            return false;
        }
        defpackage.ry ryVar = (defpackage.ry) obj;
        return this.ZpBGe2uQfcn8.equals(ryVar.ZpBGe2uQfcn8) && this.giKS3J6vZuNy.equals(ryVar.giKS3J6vZuNy) && defpackage.or.giKS3J6vZuNy(this.fWTAfUmVKrZq, ryVar.fWTAfUmVKrZq) && this.JhCgjQRTAOCT.equals(ryVar.JhCgjQRTAOCT) && defpackage.or.giKS3J6vZuNy(this.WDYagTQQm9ns, ryVar.WDYagTQQm9ns) && defpackage.ma0.QiMR8OkAhezm(this.oh71FJcDz6S2, ryVar.oh71FJcDz6S2);
    }

    @Override // defpackage.s61
    public final void giKS3J6vZuNy(int i, defpackage.xk0 xk0Var, int[] iArr, int[] iArr2) {
        this.ZpBGe2uQfcn8.JhCgjQRTAOCT(xk0Var, i, iArr, xk0Var.getLayoutDirection(), iArr2);
    }

    public final int hashCode() {
        return this.oh71FJcDz6S2.hashCode() + defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(Integer.MAX_VALUE, defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(Integer.MAX_VALUE, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.WDYagTQQm9ns, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(-1.0f, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.fWTAfUmVKrZq, (this.giKS3J6vZuNy.hashCode() + ((this.ZpBGe2uQfcn8.hashCode() + (java.lang.Boolean.hashCode(true) * 31)) * 31)) * 31, 31), 31), 31), 31), 31);
    }

    public final java.lang.String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.ZpBGe2uQfcn8 + ", verticalArrangement=" + this.giKS3J6vZuNy + ", mainAxisSpacing=" + ((java.lang.Object) defpackage.or.fWTAfUmVKrZq(this.fWTAfUmVKrZq)) + ", crossAxisAlignment=" + this.JhCgjQRTAOCT + ", crossAxisArrangementSpacing=" + ((java.lang.Object) defpackage.or.fWTAfUmVKrZq(this.WDYagTQQm9ns)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.oh71FJcDz6S2 + ')';
    }
}
