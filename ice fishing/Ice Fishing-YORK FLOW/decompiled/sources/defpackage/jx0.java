package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class jx0 extends defpackage.tx0 {
    public final float JhCgjQRTAOCT;
    public final float P05cfTpS5W5L;
    public final boolean QiMR8OkAhezm;
    public final float WDYagTQQm9ns;
    public final float e6mdH7fiFuta;
    public final float fWTAfUmVKrZq;
    public final boolean oh71FJcDz6S2;

    public jx0(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.fWTAfUmVKrZq = f;
        this.JhCgjQRTAOCT = f2;
        this.WDYagTQQm9ns = f3;
        this.oh71FJcDz6S2 = z;
        this.QiMR8OkAhezm = z2;
        this.P05cfTpS5W5L = f4;
        this.e6mdH7fiFuta = f5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.jx0)) {
            return false;
        }
        defpackage.jx0 jx0Var = (defpackage.jx0) obj;
        return java.lang.Float.compare(this.fWTAfUmVKrZq, jx0Var.fWTAfUmVKrZq) == 0 && java.lang.Float.compare(this.JhCgjQRTAOCT, jx0Var.JhCgjQRTAOCT) == 0 && java.lang.Float.compare(this.WDYagTQQm9ns, jx0Var.WDYagTQQm9ns) == 0 && this.oh71FJcDz6S2 == jx0Var.oh71FJcDz6S2 && this.QiMR8OkAhezm == jx0Var.QiMR8OkAhezm && java.lang.Float.compare(this.P05cfTpS5W5L, jx0Var.P05cfTpS5W5L) == 0 && java.lang.Float.compare(this.e6mdH7fiFuta, jx0Var.e6mdH7fiFuta) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.e6mdH7fiFuta) + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.P05cfTpS5W5L, defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT(defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT(defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.WDYagTQQm9ns, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.JhCgjQRTAOCT, java.lang.Float.hashCode(this.fWTAfUmVKrZq) * 31, 31), 31), 31, this.oh71FJcDz6S2), 31, this.QiMR8OkAhezm), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.fWTAfUmVKrZq);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.JhCgjQRTAOCT);
        sb.append(", theta=");
        sb.append(this.WDYagTQQm9ns);
        sb.append(", isMoreThanHalf=");
        sb.append(this.oh71FJcDz6S2);
        sb.append(", isPositiveArc=");
        sb.append(this.QiMR8OkAhezm);
        sb.append(", arcStartDx=");
        sb.append(this.P05cfTpS5W5L);
        sb.append(", arcStartDy=");
        return defpackage.pVQOaWB9QMo4.GE9mJIPrb8gP(sb, this.e6mdH7fiFuta, ')');
    }
}
