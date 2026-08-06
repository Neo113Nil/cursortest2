package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class en1 {
    public final defpackage.pf1 JhCgjQRTAOCT;
    public final defpackage.pf1 ZpBGe2uQfcn8;
    public final defpackage.pf1 fWTAfUmVKrZq;
    public final defpackage.pf1 giKS3J6vZuNy;

    public en1(defpackage.pf1 pf1Var, defpackage.pf1 pf1Var2, defpackage.pf1 pf1Var3, defpackage.pf1 pf1Var4) {
        this.ZpBGe2uQfcn8 = pf1Var;
        this.giKS3J6vZuNy = pf1Var2;
        this.fWTAfUmVKrZq = pf1Var3;
        this.JhCgjQRTAOCT = pf1Var4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.en1)) {
            return false;
        }
        defpackage.en1 en1Var = (defpackage.en1) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, en1Var.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, en1Var.giKS3J6vZuNy) && defpackage.ma0.QiMR8OkAhezm(this.fWTAfUmVKrZq, en1Var.fWTAfUmVKrZq) && defpackage.ma0.QiMR8OkAhezm(this.JhCgjQRTAOCT, en1Var.JhCgjQRTAOCT);
    }

    public final int hashCode() {
        defpackage.pf1 pf1Var = this.ZpBGe2uQfcn8;
        int hashCode = (pf1Var != null ? pf1Var.hashCode() : 0) * 31;
        defpackage.pf1 pf1Var2 = this.giKS3J6vZuNy;
        int hashCode2 = (hashCode + (pf1Var2 != null ? pf1Var2.hashCode() : 0)) * 31;
        defpackage.pf1 pf1Var3 = this.fWTAfUmVKrZq;
        int hashCode3 = (hashCode2 + (pf1Var3 != null ? pf1Var3.hashCode() : 0)) * 31;
        defpackage.pf1 pf1Var4 = this.JhCgjQRTAOCT;
        return hashCode3 + (pf1Var4 != null ? pf1Var4.hashCode() : 0);
    }
}
