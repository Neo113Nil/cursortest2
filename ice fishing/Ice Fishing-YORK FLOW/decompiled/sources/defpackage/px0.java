package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class px0 extends defpackage.tx0 {
    public final float JhCgjQRTAOCT;
    public final float WDYagTQQm9ns;
    public final float fWTAfUmVKrZq;
    public final float oh71FJcDz6S2;

    public px0(float f, float f2, float f3, float f4) {
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
        if (!(obj instanceof defpackage.px0)) {
            return false;
        }
        defpackage.px0 px0Var = (defpackage.px0) obj;
        return java.lang.Float.compare(this.fWTAfUmVKrZq, px0Var.fWTAfUmVKrZq) == 0 && java.lang.Float.compare(this.JhCgjQRTAOCT, px0Var.JhCgjQRTAOCT) == 0 && java.lang.Float.compare(this.WDYagTQQm9ns, px0Var.WDYagTQQm9ns) == 0 && java.lang.Float.compare(this.oh71FJcDz6S2, px0Var.oh71FJcDz6S2) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.oh71FJcDz6S2) + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.WDYagTQQm9ns, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.JhCgjQRTAOCT, java.lang.Float.hashCode(this.fWTAfUmVKrZq) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.fWTAfUmVKrZq);
        sb.append(", dy1=");
        sb.append(this.JhCgjQRTAOCT);
        sb.append(", dx2=");
        sb.append(this.WDYagTQQm9ns);
        sb.append(", dy2=");
        return defpackage.pVQOaWB9QMo4.GE9mJIPrb8gP(sb, this.oh71FJcDz6S2, ')');
    }
}
