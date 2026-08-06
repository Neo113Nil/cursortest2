package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class dw0 {
    public final int JhCgjQRTAOCT;
    public final float QiMR8OkAhezm;
    public final int WDYagTQQm9ns;
    public final defpackage.m2 ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;
    public final float oh71FJcDz6S2;

    public dw0(defpackage.m2 m2Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.ZpBGe2uQfcn8 = m2Var;
        this.giKS3J6vZuNy = i;
        this.fWTAfUmVKrZq = i2;
        this.JhCgjQRTAOCT = i3;
        this.WDYagTQQm9ns = i4;
        this.oh71FJcDz6S2 = f;
        this.QiMR8OkAhezm = f2;
    }

    public final int JhCgjQRTAOCT(int i) {
        int i2 = this.fWTAfUmVKrZq;
        int i3 = this.giKS3J6vZuNy;
        return defpackage.j80.T1fB7bDYiVJQ(i, i3, i2) - i3;
    }

    public final defpackage.s31 ZpBGe2uQfcn8(defpackage.s31 s31Var) {
        return s31Var.e6mdH7fiFuta((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(this.oh71FJcDz6S2) & 4294967295L));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dw0) {
            defpackage.dw0 dw0Var = (defpackage.dw0) obj;
            if (this.ZpBGe2uQfcn8 == dw0Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == dw0Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == dw0Var.fWTAfUmVKrZq && this.JhCgjQRTAOCT == dw0Var.JhCgjQRTAOCT && this.WDYagTQQm9ns == dw0Var.WDYagTQQm9ns && java.lang.Float.compare(this.oh71FJcDz6S2, dw0Var.oh71FJcDz6S2) == 0 && java.lang.Float.compare(this.QiMR8OkAhezm, dw0Var.QiMR8OkAhezm) == 0) {
                return true;
            }
        }
        return false;
    }

    public final defpackage.s31 fWTAfUmVKrZq(defpackage.s31 s31Var) {
        float f = -this.oh71FJcDz6S2;
        return s31Var.e6mdH7fiFuta((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L));
    }

    public final long giKS3J6vZuNy(long j, boolean z) {
        if (z) {
            long j2 = defpackage.in1.giKS3J6vZuNy;
            if (defpackage.in1.giKS3J6vZuNy(j, j2)) {
                return j2;
            }
        }
        int i = defpackage.in1.fWTAfUmVKrZq;
        int i2 = this.giKS3J6vZuNy;
        return defpackage.j80.JhCgjQRTAOCT(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.QiMR8OkAhezm) + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.oh71FJcDz6S2, defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.WDYagTQQm9ns, defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.JhCgjQRTAOCT, defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.fWTAfUmVKrZq, defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.giKS3J6vZuNy, this.ZpBGe2uQfcn8.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", startIndex=");
        sb.append(this.giKS3J6vZuNy);
        sb.append(", endIndex=");
        sb.append(this.fWTAfUmVKrZq);
        sb.append(", startLineIndex=");
        sb.append(this.JhCgjQRTAOCT);
        sb.append(", endLineIndex=");
        sb.append(this.WDYagTQQm9ns);
        sb.append(", top=");
        sb.append(this.oh71FJcDz6S2);
        sb.append(", bottom=");
        return defpackage.pVQOaWB9QMo4.GE9mJIPrb8gP(sb, this.QiMR8OkAhezm, ')');
    }
}
