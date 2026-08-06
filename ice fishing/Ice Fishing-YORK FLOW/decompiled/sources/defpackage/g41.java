package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class g41 {
    public final long JhCgjQRTAOCT;
    public final defpackage.t8 QiMR8OkAhezm;
    public final long WDYagTQQm9ns;
    public final long ZpBGe2uQfcn8;
    public final long fWTAfUmVKrZq;
    public final long giKS3J6vZuNy;
    public final float[] oh71FJcDz6S2;

    public g41(long j, long j2, long j3, long j4, long j5, float[] fArr, defpackage.t8 t8Var) {
        this.ZpBGe2uQfcn8 = j;
        this.giKS3J6vZuNy = j2;
        this.fWTAfUmVKrZq = j3;
        this.JhCgjQRTAOCT = j4;
        this.WDYagTQQm9ns = j5;
        this.oh71FJcDz6S2 = fArr;
        this.QiMR8OkAhezm = t8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(java.lang.Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        if (obj != null && defpackage.g41.class == obj.getClass()) {
            defpackage.g41 g41Var = (defpackage.g41) obj;
            if (this.ZpBGe2uQfcn8 == g41Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == g41Var.giKS3J6vZuNy && this.WDYagTQQm9ns == g41Var.WDYagTQQm9ns && defpackage.l90.ZpBGe2uQfcn8(this.fWTAfUmVKrZq, g41Var.fWTAfUmVKrZq) && defpackage.l90.ZpBGe2uQfcn8(this.JhCgjQRTAOCT, g41Var.JhCgjQRTAOCT)) {
                float[] fArr = g41Var.oh71FJcDz6S2;
                float[] fArr2 = this.oh71FJcDz6S2;
                if (fArr2 == null) {
                    if (fArr == null) {
                        equals = true;
                        return equals && this.QiMR8OkAhezm == g41Var.QiMR8OkAhezm;
                    }
                    equals = false;
                    if (equals) {
                    }
                } else {
                    if (fArr != null) {
                        equals = fArr2.equals(fArr);
                        if (equals) {
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int fWTAfUmVKrZq = defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(java.lang.Long.hashCode(this.ZpBGe2uQfcn8) * 31, 31, this.giKS3J6vZuNy), 31, this.WDYagTQQm9ns), 31, this.fWTAfUmVKrZq), 31, this.JhCgjQRTAOCT);
        float[] fArr = this.oh71FJcDz6S2;
        return this.QiMR8OkAhezm.hashCode() + ((fWTAfUmVKrZq + (fArr != null ? java.util.Arrays.hashCode(fArr) : 0)) * 31);
    }
}
