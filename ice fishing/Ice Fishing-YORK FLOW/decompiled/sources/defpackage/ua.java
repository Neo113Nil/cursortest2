package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ua extends defpackage.zl0 {
    public final defpackage.lf1 ZpBGe2uQfcn8;
    public final defpackage.cd1 giKS3J6vZuNy;

    public ua(defpackage.lf1 lf1Var, defpackage.cd1 cd1Var) {
        this.ZpBGe2uQfcn8 = lf1Var;
        this.giKS3J6vZuNy = cd1Var;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        return new defpackage.ta(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ua)) {
            return false;
        }
        defpackage.ua uaVar = (defpackage.ua) obj;
        return defpackage.or.giKS3J6vZuNy(0.5f, 0.5f) && this.ZpBGe2uQfcn8.equals(uaVar.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, uaVar.giKS3J6vZuNy);
    }

    public final int hashCode() {
        return this.giKS3J6vZuNy.hashCode() + ((this.ZpBGe2uQfcn8.hashCode() + (java.lang.Float.hashCode(0.5f) * 31)) * 31);
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.ta taVar = (defpackage.ta) ul0Var;
        float f = taVar.maCixPsq4ml2;
        defpackage.lc lcVar = taVar.oCu53ZX2v4Ju;
        if (!defpackage.or.giKS3J6vZuNy(f, 0.5f)) {
            taVar.maCixPsq4ml2 = 0.5f;
            lcVar.YZh1E3mnTFwf();
        }
        defpackage.lf1 lf1Var = taVar.IJ0hOnjhPOri;
        defpackage.lf1 lf1Var2 = this.ZpBGe2uQfcn8;
        if (!defpackage.ma0.QiMR8OkAhezm(lf1Var, lf1Var2)) {
            taVar.IJ0hOnjhPOri = lf1Var2;
            lcVar.YZh1E3mnTFwf();
        }
        defpackage.cd1 cd1Var = taVar.VFeft99leXEK;
        defpackage.cd1 cd1Var2 = this.giKS3J6vZuNy;
        if (defpackage.ma0.QiMR8OkAhezm(cd1Var, cd1Var2)) {
            return;
        }
        taVar.VFeft99leXEK = cd1Var2;
        lcVar.YZh1E3mnTFwf();
        defpackage.wc1.GcLuU6pT9wO9(taVar);
    }

    public final java.lang.String toString() {
        return "BorderModifierNodeElement(width=" + ((java.lang.Object) defpackage.or.fWTAfUmVKrZq(0.5f)) + ", brush=" + this.ZpBGe2uQfcn8 + ", shape=" + this.giKS3J6vZuNy + ')';
    }
}
