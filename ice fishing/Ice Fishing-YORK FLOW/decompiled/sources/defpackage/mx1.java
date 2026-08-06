package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
final class mx1 extends defpackage.zl0 {
    public final defpackage.mq ZpBGe2uQfcn8;
    public final java.lang.Object fWTAfUmVKrZq;
    public final defpackage.c20 giKS3J6vZuNy;

    public mx1(defpackage.mq mqVar, defpackage.c20 c20Var, java.lang.Object obj) {
        this.ZpBGe2uQfcn8 = mqVar;
        this.giKS3J6vZuNy = c20Var;
        this.fWTAfUmVKrZq = obj;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        defpackage.ox1 ox1Var = new defpackage.ox1();
        ox1Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        ox1Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
        return ox1Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.mx1.class != obj.getClass()) {
            return false;
        }
        defpackage.mx1 mx1Var = (defpackage.mx1) obj;
        return this.ZpBGe2uQfcn8 == mx1Var.ZpBGe2uQfcn8 && this.fWTAfUmVKrZq.equals(mx1Var.fWTAfUmVKrZq);
    }

    public final int hashCode() {
        return this.fWTAfUmVKrZq.hashCode() + defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT(this.ZpBGe2uQfcn8.hashCode() * 31, 31, false);
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.ox1 ox1Var = (defpackage.ox1) ul0Var;
        ox1Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        ox1Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
    }
}
