package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class n61 {
    public final float JhCgjQRTAOCT;
    public final long P05cfTpS5W5L;
    public final long QiMR8OkAhezm;
    public final long WDYagTQQm9ns;
    public final float ZpBGe2uQfcn8;
    public final float fWTAfUmVKrZq;
    public final float giKS3J6vZuNy;
    public final long oh71FJcDz6S2;

    static {
        defpackage.wc1.JhCgjQRTAOCT(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public n61(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = f2;
        this.fWTAfUmVKrZq = f3;
        this.JhCgjQRTAOCT = f4;
        this.WDYagTQQm9ns = j;
        this.oh71FJcDz6S2 = j2;
        this.QiMR8OkAhezm = j3;
        this.P05cfTpS5W5L = j4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.n61)) {
            return false;
        }
        defpackage.n61 n61Var = (defpackage.n61) obj;
        return java.lang.Float.compare(this.ZpBGe2uQfcn8, n61Var.ZpBGe2uQfcn8) == 0 && java.lang.Float.compare(this.giKS3J6vZuNy, n61Var.giKS3J6vZuNy) == 0 && java.lang.Float.compare(this.fWTAfUmVKrZq, n61Var.fWTAfUmVKrZq) == 0 && java.lang.Float.compare(this.JhCgjQRTAOCT, n61Var.JhCgjQRTAOCT) == 0 && defpackage.vx1.ZVVdXbWmyCSK(this.WDYagTQQm9ns, n61Var.WDYagTQQm9ns) && defpackage.vx1.ZVVdXbWmyCSK(this.oh71FJcDz6S2, n61Var.oh71FJcDz6S2) && defpackage.vx1.ZVVdXbWmyCSK(this.QiMR8OkAhezm, n61Var.QiMR8OkAhezm) && defpackage.vx1.ZVVdXbWmyCSK(this.P05cfTpS5W5L, n61Var.P05cfTpS5W5L);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.P05cfTpS5W5L) + defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.JhCgjQRTAOCT, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.fWTAfUmVKrZq, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.giKS3J6vZuNy, java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31, 31), 31), 31), 31, this.WDYagTQQm9ns), 31, this.oh71FJcDz6S2), 31, this.QiMR8OkAhezm);
    }

    public final java.lang.String toString() {
        java.lang.String str = defpackage.nq1.fhbmYuu9J3cT(this.ZpBGe2uQfcn8) + ", " + defpackage.nq1.fhbmYuu9J3cT(this.giKS3J6vZuNy) + ", " + defpackage.nq1.fhbmYuu9J3cT(this.fWTAfUmVKrZq) + ", " + defpackage.nq1.fhbmYuu9J3cT(this.JhCgjQRTAOCT);
        long j = this.WDYagTQQm9ns;
        long j2 = this.oh71FJcDz6S2;
        boolean ZVVdXbWmyCSK = defpackage.vx1.ZVVdXbWmyCSK(j, j2);
        long j3 = this.QiMR8OkAhezm;
        long j4 = this.P05cfTpS5W5L;
        if (!ZVVdXbWmyCSK || !defpackage.vx1.ZVVdXbWmyCSK(j2, j3) || !defpackage.vx1.ZVVdXbWmyCSK(j3, j4)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((java.lang.Object) defpackage.vx1.Wc0TdmRSwbbi(j)) + ", topRight=" + ((java.lang.Object) defpackage.vx1.Wc0TdmRSwbbi(j2)) + ", bottomRight=" + ((java.lang.Object) defpackage.vx1.Wc0TdmRSwbbi(j3)) + ", bottomLeft=" + ((java.lang.Object) defpackage.vx1.Wc0TdmRSwbbi(j4)) + ')';
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i) == java.lang.Float.intBitsToFloat(i2)) {
            return "RoundRect(rect=" + str + ", radius=" + defpackage.nq1.fhbmYuu9J3cT(java.lang.Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + defpackage.nq1.fhbmYuu9J3cT(java.lang.Float.intBitsToFloat(i)) + ", y=" + defpackage.nq1.fhbmYuu9J3cT(java.lang.Float.intBitsToFloat(i2)) + ')';
    }
}
