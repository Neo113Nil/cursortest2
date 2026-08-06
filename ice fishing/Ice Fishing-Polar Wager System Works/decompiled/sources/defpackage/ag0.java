package defpackage;

/* loaded from: classes.dex */
public final class ag0 extends defpackage.av0 {
    public final java.lang.Object AARZUJiTa;
    public final /* synthetic */ int xiZrDbcSW0;

    public /* synthetic */ ag0(int i, java.lang.Object obj) {
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = obj;
    }

    @Override // defpackage.av0
    public final int AARZUJiTa() {
        int i = this.xiZrDbcSW0;
        java.lang.Object obj = this.AARZUJiTa;
        switch (i) {
            case 0:
                return ((defpackage.zf0) obj).nVhUznk1t();
            default:
                return ((defpackage.v0) obj).getRoot().wll2JLbTBC2.QoRHpC4k.adDC3e2L;
        }
    }

    @Override // defpackage.qn
    public final float EXtogiMhuM() {
        int i = this.xiZrDbcSW0;
        java.lang.Object obj = this.AARZUJiTa;
        switch (i) {
            case 0:
                return ((defpackage.zf0) obj).EXtogiMhuM();
            default:
                return ((defpackage.v0) obj).getDensity().EXtogiMhuM();
        }
    }

    @Override // defpackage.av0
    public float F7NU4MC0GW(defpackage.i40 i40Var) {
        float intBitsToFloat;
        int JcqDrWrgMf;
        switch (this.xiZrDbcSW0) {
            case 0:
                defpackage.k00 k00Var = i40Var.IHQe1A4L2xu;
                if (k00Var != null) {
                    return ((java.lang.Number) k00Var.adDC3e2L(this, java.lang.Float.valueOf(Float.NaN))).floatValue();
                }
                defpackage.zf0 zf0Var = (defpackage.zf0) this.AARZUJiTa;
                if (zf0Var.cnag84Bm) {
                    return Float.NaN;
                }
                defpackage.zf0 zf0Var2 = zf0Var;
                while (true) {
                    defpackage.jn0 jn0Var = zf0Var2.G3OKOH3wZRC;
                    if (!java.lang.Float.isNaN((jn0Var == null || (JcqDrWrgMf = defpackage.t6.JcqDrWrgMf((defpackage.i40[]) jn0Var.oh6vYeIP, i40Var)) < 0) ? Float.NaN : ((float[]) jn0Var.r1MBDhnF)[JcqDrWrgMf])) {
                        zf0Var2.OtkytngK3Mr(zf0Var.boH8X4DXyc4(), i40Var);
                        defpackage.v90 yUiIS9dG7NYk = zf0Var2.yUiIS9dG7NYk();
                        defpackage.v90 yUiIS9dG7NYk2 = zf0Var.yUiIS9dG7NYk();
                        switch (i40Var.oh6vYeIP) {
                            case 0:
                                intBitsToFloat = java.lang.Float.intBitsToFloat((int) (yUiIS9dG7NYk2.C0U8sNJm(yUiIS9dG7NYk, (java.lang.Float.floatToRawIntBits(r2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(((int) (yUiIS9dG7NYk.mAr5m2L7gYDP() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = java.lang.Float.intBitsToFloat((int) (yUiIS9dG7NYk2.C0U8sNJm(yUiIS9dG7NYk, (java.lang.Float.floatToRawIntBits(r2) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(((int) (yUiIS9dG7NYk.mAr5m2L7gYDP() & 4294967295L)) / 2.0f))) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    defpackage.zf0 Ay906ovssqgN = zf0Var2.Ay906ovssqgN();
                    if (Ay906ovssqgN == null) {
                        zf0Var2.OtkytngK3Mr(zf0Var.boH8X4DXyc4(), i40Var);
                        return Float.NaN;
                    }
                    zf0Var2 = Ay906ovssqgN;
                }
                break;
            default:
                return super.F7NU4MC0GW(i40Var);
        }
    }

    @Override // defpackage.qn
    public final float oh6vYeIP() {
        int i = this.xiZrDbcSW0;
        java.lang.Object obj = this.AARZUJiTa;
        switch (i) {
            case 0:
                return ((defpackage.zf0) obj).oh6vYeIP();
            default:
                return ((defpackage.v0) obj).getDensity().oh6vYeIP();
        }
    }

    @Override // defpackage.av0
    public final defpackage.w90 xiZrDbcSW0() {
        int i = this.xiZrDbcSW0;
        java.lang.Object obj = this.AARZUJiTa;
        switch (i) {
            case 0:
                return ((defpackage.zf0) obj).getLayoutDirection();
            default:
                return ((defpackage.v0) obj).getLayoutDirection();
        }
    }
}
