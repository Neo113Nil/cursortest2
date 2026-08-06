package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class kp1 {
    public final defpackage.vw ZpBGe2uQfcn8;
    public final java.util.Map fWTAfUmVKrZq;
    public final boolean giKS3J6vZuNy;

    public /* synthetic */ kp1(defpackage.vw vwVar, defpackage.q70 q70Var, java.util.LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : vwVar, (i & 8) != 0 ? null : q70Var, (i & 32) == 0, (i & 64) != 0 ? defpackage.bv.WDYagTQQm9ns : linkedHashMap);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kp1)) {
            return false;
        }
        defpackage.kp1 kp1Var = (defpackage.kp1) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, kp1Var.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(null, null) && this.giKS3J6vZuNy == kp1Var.giKS3J6vZuNy && defpackage.ma0.QiMR8OkAhezm(this.fWTAfUmVKrZq, kp1Var.fWTAfUmVKrZq);
    }

    public final int hashCode() {
        defpackage.vw vwVar = this.ZpBGe2uQfcn8;
        return this.fWTAfUmVKrZq.hashCode() + defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT((((vwVar == null ? 0 : vwVar.hashCode()) * 29791) + 0) * 961, 31, this.giKS3J6vZuNy);
    }

    public final java.lang.String toString() {
        return "TransitionData(fade=" + this.ZpBGe2uQfcn8 + ", slide=null, changeSize=null, scale=" + ((java.lang.Object) null) + ", veil=null, hold=" + this.giKS3J6vZuNy + ", effectsMap=" + this.fWTAfUmVKrZq + ')';
    }

    public kp1(defpackage.vw vwVar, defpackage.q70 q70Var, boolean z, java.util.Map map) {
        this.ZpBGe2uQfcn8 = vwVar;
        this.giKS3J6vZuNy = z;
        this.fWTAfUmVKrZq = map;
    }
}
