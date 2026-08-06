package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class nn1 {
    public final java.lang.String ZpBGe2uQfcn8;
    public java.lang.String giKS3J6vZuNy;
    public boolean fWTAfUmVKrZq = false;
    public defpackage.gw0 JhCgjQRTAOCT = null;

    public nn1(java.lang.String str, java.lang.String str2) {
        this.ZpBGe2uQfcn8 = str;
        this.giKS3J6vZuNy = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nn1)) {
            return false;
        }
        defpackage.nn1 nn1Var = (defpackage.nn1) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, nn1Var.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, nn1Var.giKS3J6vZuNy) && this.fWTAfUmVKrZq == nn1Var.fWTAfUmVKrZq && defpackage.ma0.QiMR8OkAhezm(this.JhCgjQRTAOCT, nn1Var.JhCgjQRTAOCT);
    }

    public final int hashCode() {
        int JhCgjQRTAOCT = defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT((this.giKS3J6vZuNy.hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31)) * 31, 31, this.fWTAfUmVKrZq);
        defpackage.gw0 gw0Var = this.JhCgjQRTAOCT;
        return JhCgjQRTAOCT + (gw0Var == null ? 0 : gw0Var.hashCode());
    }

    public final java.lang.String toString() {
        return "TextSubstitution(layoutCache=" + this.JhCgjQRTAOCT + ", isShowingSubstitution=" + this.fWTAfUmVKrZq + ')';
    }
}
