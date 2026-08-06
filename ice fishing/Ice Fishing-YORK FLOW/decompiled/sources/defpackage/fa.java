package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class fa extends defpackage.yv0 {
    public defpackage.ga GE9mJIPrb8gP;
    public final long P05cfTpS5W5L;
    public final int QiMR8OkAhezm = 1;
    public final defpackage.w1 WDYagTQQm9ns;
    public float e6mdH7fiFuta;
    public final long oh71FJcDz6S2;

    public fa(defpackage.w1 w1Var) {
        int i;
        long width = (w1Var.ZpBGe2uQfcn8.getWidth() << 32) | (w1Var.ZpBGe2uQfcn8.getHeight() & 4294967295L);
        this.WDYagTQQm9ns = w1Var;
        this.oh71FJcDz6S2 = width;
        int i2 = (int) (width >> 32);
        if (i2 < 0 || (i = (int) (width & 4294967295L)) < 0 || i2 > w1Var.ZpBGe2uQfcn8.getWidth() || i > w1Var.ZpBGe2uQfcn8.getHeight()) {
            defpackage.h7.w7APNrr0aGRc("Failed requirement.");
            throw null;
        }
        this.P05cfTpS5W5L = width;
        this.e6mdH7fiFuta = 1.0f;
    }

    @Override // defpackage.yv0
    public final long JhCgjQRTAOCT() {
        return defpackage.w60.EPEWHACkMcF1(this.P05cfTpS5W5L);
    }

    @Override // defpackage.yv0
    public final void WDYagTQQm9ns(defpackage.ld0 ld0Var) {
        defpackage.ld ldVar = ld0Var.WDYagTQQm9ns;
        defpackage.ct.Fu5WBEia9jBo(ld0Var, this.WDYagTQQm9ns, this.oh71FJcDz6S2, (java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (ldVar.JhCgjQRTAOCT() >> 32))) << 32) | (java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (ldVar.JhCgjQRTAOCT() & 4294967295L))) & 4294967295L), this.e6mdH7fiFuta, this.GE9mJIPrb8gP, this.QiMR8OkAhezm, 328);
    }

    @Override // defpackage.yv0
    public final void ZpBGe2uQfcn8(float f) {
        this.e6mdH7fiFuta = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.fa)) {
            return false;
        }
        defpackage.fa faVar = (defpackage.fa) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns, faVar.WDYagTQQm9ns) && defpackage.l90.ZpBGe2uQfcn8(0L, 0L) && defpackage.u90.ZpBGe2uQfcn8(this.oh71FJcDz6S2, faVar.oh71FJcDz6S2) && this.QiMR8OkAhezm == faVar.QiMR8OkAhezm;
    }

    @Override // defpackage.yv0
    public final void giKS3J6vZuNy(defpackage.ga gaVar) {
        this.GE9mJIPrb8gP = gaVar;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.QiMR8OkAhezm) + defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(this.WDYagTQQm9ns.hashCode() * 31, 31, 0L), 31, this.oh71FJcDz6S2);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BitmapPainter(image=");
        sb.append(this.WDYagTQQm9ns);
        sb.append(", srcOffset=");
        sb.append((java.lang.Object) defpackage.l90.JhCgjQRTAOCT(0L));
        sb.append(", srcSize=");
        sb.append((java.lang.Object) defpackage.u90.giKS3J6vZuNy(this.oh71FJcDz6S2));
        sb.append(", filterQuality=");
        int i = this.QiMR8OkAhezm;
        sb.append((java.lang.Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
