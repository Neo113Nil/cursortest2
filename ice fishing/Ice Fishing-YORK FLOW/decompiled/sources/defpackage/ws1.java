package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ws1 implements defpackage.gv1 {
    public final java.lang.String ZpBGe2uQfcn8;
    public final defpackage.pw0 giKS3J6vZuNy;

    public ws1(defpackage.y80 y80Var, java.lang.String str) {
        this.ZpBGe2uQfcn8 = str;
        this.giKS3J6vZuNy = defpackage.w60.hH0RRJrNssvh(y80Var);
    }

    public final void JhCgjQRTAOCT(defpackage.y80 y80Var) {
        this.giKS3J6vZuNy.setValue(y80Var);
    }

    @Override // defpackage.gv1
    public final int ZpBGe2uQfcn8(defpackage.hp hpVar) {
        return fWTAfUmVKrZq().JhCgjQRTAOCT;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ws1) {
            return defpackage.ma0.QiMR8OkAhezm(fWTAfUmVKrZq(), ((defpackage.ws1) obj).fWTAfUmVKrZq());
        }
        return false;
    }

    public final defpackage.y80 fWTAfUmVKrZq() {
        return (defpackage.y80) this.giKS3J6vZuNy.getValue();
    }

    @Override // defpackage.gv1
    public final int giKS3J6vZuNy(defpackage.hp hpVar) {
        return fWTAfUmVKrZq().giKS3J6vZuNy;
    }

    public final int hashCode() {
        return this.ZpBGe2uQfcn8.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.ZpBGe2uQfcn8);
        sb.append("(left=");
        sb.append(fWTAfUmVKrZq().ZpBGe2uQfcn8);
        sb.append(", top=");
        sb.append(fWTAfUmVKrZq().giKS3J6vZuNy);
        sb.append(", right=");
        sb.append(fWTAfUmVKrZq().fWTAfUmVKrZq);
        sb.append(", bottom=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, fWTAfUmVKrZq().JhCgjQRTAOCT, ')');
    }
}
