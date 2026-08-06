package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
final class bg0 extends defpackage.zl0 {
    public final defpackage.f2 ZpBGe2uQfcn8;
    public final defpackage.em1 fWTAfUmVKrZq;
    public final defpackage.hg0 giKS3J6vZuNy;

    public bg0(defpackage.f2 f2Var, defpackage.hg0 hg0Var, defpackage.em1 em1Var) {
        this.ZpBGe2uQfcn8 = f2Var;
        this.giKS3J6vZuNy = hg0Var;
        this.fWTAfUmVKrZq = em1Var;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        return new defpackage.cg0(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, this.fWTAfUmVKrZq);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bg0) {
            defpackage.bg0 bg0Var = (defpackage.bg0) obj;
            return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, bg0Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == bg0Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == bg0Var.fWTAfUmVKrZq;
        }
        return false;
    }

    public final int hashCode() {
        return this.fWTAfUmVKrZq.hashCode() + ((this.giKS3J6vZuNy.hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31)) * 31);
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.cg0 cg0Var = (defpackage.cg0) ul0Var;
        if (cg0Var.s0TASMVLSWD5) {
            cg0Var.BHfvd2J71qpO.QiMR8OkAhezm();
            cg0Var.BHfvd2J71qpO.Ns0WNyEWdPsk(cg0Var);
        }
        defpackage.f2 f2Var = this.ZpBGe2uQfcn8;
        cg0Var.BHfvd2J71qpO = f2Var;
        if (cg0Var.s0TASMVLSWD5) {
            if (f2Var.ZpBGe2uQfcn8 != null) {
                defpackage.h80.fWTAfUmVKrZq("Expected textInputModifierNode to be null");
            }
            f2Var.ZpBGe2uQfcn8 = cg0Var;
        }
        cg0Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
        cg0Var.w7APNrr0aGRc = this.fWTAfUmVKrZq;
    }

    public final java.lang.String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.ZpBGe2uQfcn8 + ", legacyTextFieldState=" + this.giKS3J6vZuNy + ", textFieldSelectionManager=" + this.fWTAfUmVKrZq + ')';
    }
}
