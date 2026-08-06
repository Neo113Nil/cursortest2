package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class d70 extends defpackage.zl0 {
    public final defpackage.in0 ZpBGe2uQfcn8;
    public final defpackage.cd1 fWTAfUmVKrZq;
    public final defpackage.vk1 giKS3J6vZuNy;

    public d70(defpackage.in0 in0Var, defpackage.vk1 vk1Var, defpackage.cd1 cd1Var) {
        this.ZpBGe2uQfcn8 = in0Var;
        this.giKS3J6vZuNy = vk1Var;
        this.fWTAfUmVKrZq = cd1Var;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        return new defpackage.f70(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, this.fWTAfUmVKrZq);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.d70)) {
            return false;
        }
        defpackage.d70 d70Var = (defpackage.d70) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, d70Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy.equals(d70Var.giKS3J6vZuNy) && defpackage.ma0.QiMR8OkAhezm(this.fWTAfUmVKrZq, d70Var.fWTAfUmVKrZq) && defpackage.or.giKS3J6vZuNy(2.0f, 2.0f) && defpackage.or.giKS3J6vZuNy(1.0f, 1.0f);
    }

    public final int hashCode() {
        int hashCode = (this.giKS3J6vZuNy.hashCode() + ((this.ZpBGe2uQfcn8.hashCode() + defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT(java.lang.Boolean.hashCode(true) * 31, 31, false)) * 31)) * 31;
        defpackage.cd1 cd1Var = this.fWTAfUmVKrZq;
        return java.lang.Float.hashCode(1.0f) + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(2.0f, (hashCode + (cd1Var != null ? cd1Var.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        boolean z;
        defpackage.f70 f70Var = (defpackage.f70) ul0Var;
        boolean z2 = true;
        if (!f70Var.w7APNrr0aGRc) {
            f70Var.w7APNrr0aGRc = true;
            z = true;
        } else {
            z = false;
        }
        defpackage.in0 in0Var = f70Var.maCixPsq4ml2;
        defpackage.in0 in0Var2 = this.ZpBGe2uQfcn8;
        if (in0Var != in0Var2) {
            f70Var.maCixPsq4ml2 = in0Var2;
            defpackage.yf1 yf1Var = f70Var.dG7RjM6DqYVL;
            defpackage.kl klVar = null;
            if (yf1Var != null) {
                yf1Var.JhCgjQRTAOCT(null);
            }
            f70Var.dG7RjM6DqYVL = defpackage.ok0.zJPqDeoF0Os1(f70Var.XuMcJunjB8iA(), null, new defpackage.e70(f70Var, klVar, 3), 3);
        }
        defpackage.vk1 vk1Var = f70Var.OcTWLQzke1i2;
        defpackage.vk1 vk1Var2 = this.giKS3J6vZuNy;
        if (!defpackage.ma0.QiMR8OkAhezm(vk1Var, vk1Var2)) {
            f70Var.OcTWLQzke1i2 = vk1Var2;
            z = true;
        }
        defpackage.cd1 cd1Var = f70Var.UmgHb6n58gfG;
        defpackage.cd1 cd1Var2 = this.fWTAfUmVKrZq;
        if (!defpackage.ma0.QiMR8OkAhezm(cd1Var, cd1Var2)) {
            if (!defpackage.ma0.QiMR8OkAhezm(f70Var.UmgHb6n58gfG, cd1Var2)) {
                f70Var.UmgHb6n58gfG = cd1Var2;
                f70Var.jjTN4uUnoyEn.YZh1E3mnTFwf();
            }
            z = true;
        }
        if (!defpackage.or.giKS3J6vZuNy(f70Var.IJ0hOnjhPOri, 2.0f)) {
            f70Var.IJ0hOnjhPOri = 2.0f;
            z = true;
        }
        if (defpackage.or.giKS3J6vZuNy(f70Var.VFeft99leXEK, 1.0f)) {
            z2 = z;
        } else {
            f70Var.VFeft99leXEK = 1.0f;
        }
        if (z2) {
            f70Var.KN4muQto0Nd5();
        }
    }

    public final java.lang.String toString() {
        return "IndicatorLineElement(enabled=true, isError=false, interactionSource=" + this.ZpBGe2uQfcn8 + ", colors=" + this.giKS3J6vZuNy + ", textFieldShape=" + this.fWTAfUmVKrZq + ", focusedIndicatorLineThickness=" + ((java.lang.Object) defpackage.or.fWTAfUmVKrZq(2.0f)) + ", unfocusedIndicatorLineThickness=" + ((java.lang.Object) defpackage.or.fWTAfUmVKrZq(1.0f)) + ')';
    }
}
