package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ad1 extends defpackage.zl0 {
    public final long JhCgjQRTAOCT;
    public final defpackage.cd1 ZpBGe2uQfcn8;
    public final long fWTAfUmVKrZq;
    public final boolean giKS3J6vZuNy;

    public ad1(defpackage.cd1 cd1Var, boolean z, long j, long j2) {
        this.ZpBGe2uQfcn8 = cd1Var;
        this.giKS3J6vZuNy = z;
        this.fWTAfUmVKrZq = j;
        this.JhCgjQRTAOCT = j2;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        return new defpackage.ia(new defpackage.YjS0G3zEDWNX(20, this));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ad1)) {
            return false;
        }
        defpackage.ad1 ad1Var = (defpackage.ad1) obj;
        return defpackage.or.giKS3J6vZuNy(3.0f, 3.0f) && defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, ad1Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == ad1Var.giKS3J6vZuNy && defpackage.pf.fWTAfUmVKrZq(this.fWTAfUmVKrZq, ad1Var.fWTAfUmVKrZq) && defpackage.pf.fWTAfUmVKrZq(this.JhCgjQRTAOCT, ad1Var.JhCgjQRTAOCT);
    }

    public final int hashCode() {
        int JhCgjQRTAOCT = defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT((this.ZpBGe2uQfcn8.hashCode() + (java.lang.Float.hashCode(3.0f) * 31)) * 31, 31, this.giKS3J6vZuNy);
        int i = defpackage.pf.P05cfTpS5W5L;
        return java.lang.Long.hashCode(this.JhCgjQRTAOCT) + defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(JhCgjQRTAOCT, 31, this.fWTAfUmVKrZq);
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.sr0 sr0Var;
        defpackage.ia iaVar = (defpackage.ia) ul0Var;
        defpackage.YjS0G3zEDWNX yjS0G3zEDWNX = new defpackage.YjS0G3zEDWNX(20, this);
        iaVar.BHfvd2J71qpO = yjS0G3zEDWNX;
        if (iaVar.WDYagTQQm9ns.s0TASMVLSWD5 && (sr0Var = defpackage.la0.OcTWLQzke1i2(iaVar, 2).ZVVdXbWmyCSK) != null) {
            sr0Var.o(yjS0G3zEDWNX, true);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((java.lang.Object) defpackage.or.fWTAfUmVKrZq(3.0f));
        sb.append(", shape=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", clip=");
        sb.append(this.giKS3J6vZuNy);
        sb.append(", ambientColor=");
        defpackage.pVQOaWB9QMo4.WmetiUbpKU9I(this.fWTAfUmVKrZq, sb, ", spotColor=");
        sb.append((java.lang.Object) defpackage.pf.e6mdH7fiFuta(this.JhCgjQRTAOCT));
        sb.append(')');
        return sb.toString();
    }
}
