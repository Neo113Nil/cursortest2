package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gt0 extends defpackage.v70 {
    public final defpackage.wg0 JhCgjQRTAOCT;
    public final defpackage.a9 fWTAfUmVKrZq;

    public gt0(defpackage.a9 a9Var, defpackage.wg0 wg0Var) {
        a9Var.getClass();
        this.fWTAfUmVKrZq = a9Var;
        this.JhCgjQRTAOCT = wg0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.gt0)) {
            return false;
        }
        defpackage.gt0 gt0Var = (defpackage.gt0) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.fWTAfUmVKrZq, gt0Var.fWTAfUmVKrZq) && defpackage.ma0.QiMR8OkAhezm(this.JhCgjQRTAOCT, gt0Var.JhCgjQRTAOCT);
    }

    public final int hashCode() {
        int hashCode = this.fWTAfUmVKrZq.hashCode() * 31;
        defpackage.wg0 wg0Var = this.JhCgjQRTAOCT;
        return hashCode + (wg0Var == null ? 0 : wg0Var.hashCode());
    }

    public final java.lang.String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.fWTAfUmVKrZq + ", owner=" + this.JhCgjQRTAOCT + ')';
    }
}
