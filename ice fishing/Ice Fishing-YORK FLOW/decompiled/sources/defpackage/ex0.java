package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ex0 extends defpackage.tx0 {
    public final float JhCgjQRTAOCT;
    public final float fWTAfUmVKrZq;

    public ex0(float f, float f2) {
        super(3);
        this.fWTAfUmVKrZq = f;
        this.JhCgjQRTAOCT = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ex0)) {
            return false;
        }
        defpackage.ex0 ex0Var = (defpackage.ex0) obj;
        return java.lang.Float.compare(this.fWTAfUmVKrZq, ex0Var.fWTAfUmVKrZq) == 0 && java.lang.Float.compare(this.JhCgjQRTAOCT, ex0Var.JhCgjQRTAOCT) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.JhCgjQRTAOCT) + (java.lang.Float.hashCode(this.fWTAfUmVKrZq) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LineTo(x=");
        sb.append(this.fWTAfUmVKrZq);
        sb.append(", y=");
        return defpackage.pVQOaWB9QMo4.GE9mJIPrb8gP(sb, this.JhCgjQRTAOCT, ')');
    }
}
