package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
final class f91 extends defpackage.zl0 {
    public final boolean JhCgjQRTAOCT;
    public final defpackage.in0 WDYagTQQm9ns;
    public final defpackage.r91 ZpBGe2uQfcn8;
    public final boolean fWTAfUmVKrZq;
    public final defpackage.fv0 giKS3J6vZuNy;

    public f91(defpackage.r91 r91Var, defpackage.fv0 fv0Var, boolean z, boolean z2, defpackage.in0 in0Var) {
        this.ZpBGe2uQfcn8 = r91Var;
        this.giKS3J6vZuNy = fv0Var;
        this.fWTAfUmVKrZq = z;
        this.JhCgjQRTAOCT = z2;
        this.WDYagTQQm9ns = in0Var;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        return new defpackage.q91(null, null, this.WDYagTQQm9ns, this.giKS3J6vZuNy, this.ZpBGe2uQfcn8, this.fWTAfUmVKrZq, this.JhCgjQRTAOCT);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.f91)) {
            return false;
        }
        defpackage.f91 f91Var = (defpackage.f91) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, f91Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == f91Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == f91Var.fWTAfUmVKrZq && this.JhCgjQRTAOCT == f91Var.JhCgjQRTAOCT && defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns, f91Var.WDYagTQQm9ns);
    }

    public final int hashCode() {
        int JhCgjQRTAOCT = defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT(defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT((this.giKS3J6vZuNy.hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31)) * 961, 31, this.fWTAfUmVKrZq), 961, this.JhCgjQRTAOCT);
        defpackage.in0 in0Var = this.WDYagTQQm9ns;
        return (JhCgjQRTAOCT + (in0Var != null ? in0Var.hashCode() : 0)) * 31;
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        ((defpackage.q91) ul0Var).DXtOZGT8vVUK(null, null, this.WDYagTQQm9ns, this.giKS3J6vZuNy, this.ZpBGe2uQfcn8, this.fWTAfUmVKrZq, this.JhCgjQRTAOCT);
    }
}
