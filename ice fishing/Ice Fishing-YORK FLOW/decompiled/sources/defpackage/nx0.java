package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class nx0 extends defpackage.tx0 {
    public final float JhCgjQRTAOCT;
    public final float fWTAfUmVKrZq;

    public nx0(float f, float f2) {
        super(3);
        this.fWTAfUmVKrZq = f;
        this.JhCgjQRTAOCT = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nx0)) {
            return false;
        }
        defpackage.nx0 nx0Var = (defpackage.nx0) obj;
        return java.lang.Float.compare(this.fWTAfUmVKrZq, nx0Var.fWTAfUmVKrZq) == 0 && java.lang.Float.compare(this.JhCgjQRTAOCT, nx0Var.JhCgjQRTAOCT) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.JhCgjQRTAOCT) + (java.lang.Float.hashCode(this.fWTAfUmVKrZq) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.fWTAfUmVKrZq);
        sb.append(", dy=");
        return defpackage.pVQOaWB9QMo4.GE9mJIPrb8gP(sb, this.JhCgjQRTAOCT, ')');
    }
}
