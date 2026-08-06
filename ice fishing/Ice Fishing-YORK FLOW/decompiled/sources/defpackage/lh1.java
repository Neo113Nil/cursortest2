package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class lh1 extends defpackage.zl0 {
    public final defpackage.sr ZpBGe2uQfcn8;

    public lh1(defpackage.sr srVar) {
        this.ZpBGe2uQfcn8 = srVar;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        return new defpackage.mh1(defpackage.i61.fNwYGHIYeJcR, this.ZpBGe2uQfcn8);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.lh1)) {
            return false;
        }
        defpackage.lh1 lh1Var = (defpackage.lh1) obj;
        defpackage.z2 z2Var = defpackage.i61.fNwYGHIYeJcR;
        return z2Var.equals(z2Var) && defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, lh1Var.ZpBGe2uQfcn8);
    }

    public final int hashCode() {
        int JhCgjQRTAOCT = defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT(1022 * 31, 31, false);
        defpackage.sr srVar = this.ZpBGe2uQfcn8;
        return JhCgjQRTAOCT + (srVar != null ? srVar.hashCode() : 0);
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.mh1 mh1Var = (defpackage.mh1) ul0Var;
        defpackage.z2 z2Var = defpackage.i61.fNwYGHIYeJcR;
        if (!defpackage.ma0.QiMR8OkAhezm(mh1Var.ZVVdXbWmyCSK, z2Var)) {
            mh1Var.ZVVdXbWmyCSK = z2Var;
            if (mh1Var.w7APNrr0aGRc) {
                mh1Var.I9id0xDxCgYV();
            }
        }
        mh1Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
    }

    public final java.lang.String toString() {
        return "StylusHoverIconModifierElement(icon=" + defpackage.i61.fNwYGHIYeJcR + ", overrideDescendants=false, touchBoundsExpansion=" + this.ZpBGe2uQfcn8 + ')';
    }
}
