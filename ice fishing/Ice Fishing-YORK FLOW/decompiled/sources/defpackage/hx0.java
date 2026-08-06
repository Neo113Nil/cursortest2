package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class hx0 extends defpackage.tx0 {
    public final float JhCgjQRTAOCT;
    public final float WDYagTQQm9ns;
    public final float fWTAfUmVKrZq;
    public final float oh71FJcDz6S2;

    public hx0(float f, float f2, float f3, float f4) {
        super(2);
        this.fWTAfUmVKrZq = f;
        this.JhCgjQRTAOCT = f2;
        this.WDYagTQQm9ns = f3;
        this.oh71FJcDz6S2 = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hx0)) {
            return false;
        }
        defpackage.hx0 hx0Var = (defpackage.hx0) obj;
        return java.lang.Float.compare(this.fWTAfUmVKrZq, hx0Var.fWTAfUmVKrZq) == 0 && java.lang.Float.compare(this.JhCgjQRTAOCT, hx0Var.JhCgjQRTAOCT) == 0 && java.lang.Float.compare(this.WDYagTQQm9ns, hx0Var.WDYagTQQm9ns) == 0 && java.lang.Float.compare(this.oh71FJcDz6S2, hx0Var.oh71FJcDz6S2) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.oh71FJcDz6S2) + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.WDYagTQQm9ns, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.JhCgjQRTAOCT, java.lang.Float.hashCode(this.fWTAfUmVKrZq) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.fWTAfUmVKrZq);
        sb.append(", y1=");
        sb.append(this.JhCgjQRTAOCT);
        sb.append(", x2=");
        sb.append(this.WDYagTQQm9ns);
        sb.append(", y2=");
        return defpackage.pVQOaWB9QMo4.GE9mJIPrb8gP(sb, this.oh71FJcDz6S2, ')');
    }
}
