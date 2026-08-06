package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ww1 {
    public final defpackage.wa ZpBGe2uQfcn8;
    public final float giKS3J6vZuNy;

    public ww1(android.graphics.Rect rect, float f) {
        this.ZpBGe2uQfcn8 = new defpackage.wa(rect);
        this.giKS3J6vZuNy = f;
    }

    public final android.graphics.Rect ZpBGe2uQfcn8() {
        defpackage.wa waVar = this.ZpBGe2uQfcn8;
        waVar.getClass();
        return new android.graphics.Rect(waVar.ZpBGe2uQfcn8, waVar.giKS3J6vZuNy, waVar.fWTAfUmVKrZq, waVar.JhCgjQRTAOCT);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!defpackage.ww1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        defpackage.ww1 ww1Var = (defpackage.ww1) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, ww1Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == ww1Var.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.giKS3J6vZuNy) + (this.ZpBGe2uQfcn8.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", density=");
        return defpackage.pVQOaWB9QMo4.GE9mJIPrb8gP(sb, this.giKS3J6vZuNy, ')');
    }

    public ww1(defpackage.wa waVar, float f) {
        this.ZpBGe2uQfcn8 = waVar;
        this.giKS3J6vZuNy = f;
    }
}
