package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class v4 implements defpackage.gv1 {
    public final int ZpBGe2uQfcn8;
    public final java.lang.String giKS3J6vZuNy;
    public final defpackage.pw0 fWTAfUmVKrZq = defpackage.w60.hH0RRJrNssvh(defpackage.v80.WDYagTQQm9ns);
    public final defpackage.pw0 JhCgjQRTAOCT = defpackage.w60.hH0RRJrNssvh(java.lang.Boolean.TRUE);

    public v4(java.lang.String str, int i) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = str;
    }

    public final void JhCgjQRTAOCT(boolean z) {
        this.JhCgjQRTAOCT.setValue(java.lang.Boolean.valueOf(z));
    }

    public final void WDYagTQQm9ns(defpackage.mw1 mw1Var, int i) {
        int i2 = this.ZpBGe2uQfcn8;
        if (i == 0 || (i & i2) != 0) {
            this.fWTAfUmVKrZq.setValue(mw1Var.ZpBGe2uQfcn8.P05cfTpS5W5L(i2));
            JhCgjQRTAOCT(mw1Var.ZpBGe2uQfcn8.ZVVdXbWmyCSK(i2));
        }
    }

    @Override // defpackage.gv1
    public final int ZpBGe2uQfcn8(defpackage.hp hpVar) {
        return fWTAfUmVKrZq().JhCgjQRTAOCT;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.v4) {
            return this.ZpBGe2uQfcn8 == ((defpackage.v4) obj).ZpBGe2uQfcn8;
        }
        return false;
    }

    public final defpackage.v80 fWTAfUmVKrZq() {
        return (defpackage.v80) this.fWTAfUmVKrZq.getValue();
    }

    @Override // defpackage.gv1
    public final int giKS3J6vZuNy(defpackage.hp hpVar) {
        return fWTAfUmVKrZq().giKS3J6vZuNy;
    }

    public final int hashCode() {
        return this.ZpBGe2uQfcn8;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.giKS3J6vZuNy);
        sb.append('(');
        sb.append(fWTAfUmVKrZq().ZpBGe2uQfcn8);
        sb.append(", ");
        sb.append(fWTAfUmVKrZq().giKS3J6vZuNy);
        sb.append(", ");
        sb.append(fWTAfUmVKrZq().fWTAfUmVKrZq);
        sb.append(", ");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, fWTAfUmVKrZq().JhCgjQRTAOCT, ')');
    }
}
