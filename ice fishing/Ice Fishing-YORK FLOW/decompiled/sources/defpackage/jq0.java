package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class jq0 {
    public final boolean JhCgjQRTAOCT;
    public final int QiMR8OkAhezm;
    public final boolean WDYagTQQm9ns;
    public final boolean ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final boolean giKS3J6vZuNy;
    public final int oh71FJcDz6S2;

    public jq0(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3) {
        this.ZpBGe2uQfcn8 = z;
        this.giKS3J6vZuNy = z2;
        this.fWTAfUmVKrZq = i;
        this.JhCgjQRTAOCT = z3;
        this.WDYagTQQm9ns = z4;
        this.oh71FJcDz6S2 = i2;
        this.QiMR8OkAhezm = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.jq0)) {
            return false;
        }
        defpackage.jq0 jq0Var = (defpackage.jq0) obj;
        return this.ZpBGe2uQfcn8 == jq0Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == jq0Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == jq0Var.fWTAfUmVKrZq && this.JhCgjQRTAOCT == jq0Var.JhCgjQRTAOCT && this.WDYagTQQm9ns == jq0Var.WDYagTQQm9ns && this.oh71FJcDz6S2 == jq0Var.oh71FJcDz6S2 && this.QiMR8OkAhezm == jq0Var.QiMR8OkAhezm;
    }

    public final int hashCode() {
        return ((((((((((((((((this.ZpBGe2uQfcn8 ? 1 : 0) * 31) + (this.giKS3J6vZuNy ? 1 : 0)) * 31) + this.fWTAfUmVKrZq) * 923521) + (this.JhCgjQRTAOCT ? 1 : 0)) * 31) + (this.WDYagTQQm9ns ? 1 : 0)) * 31) + this.oh71FJcDz6S2) * 31) + this.QiMR8OkAhezm) * 31) - 1) * 31) - 1;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(defpackage.jq0.class.getSimpleName());
        sb.append("(");
        if (this.ZpBGe2uQfcn8) {
            sb.append("launchSingleTop ");
        }
        if (this.giKS3J6vZuNy) {
            sb.append("restoreState ");
        }
        int i = this.QiMR8OkAhezm;
        int i2 = this.oh71FJcDz6S2;
        if (i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(java.lang.Integer.toHexString(i2));
            sb.append(" exitAnim=0x");
            sb.append(java.lang.Integer.toHexString(i));
            sb.append(" popEnterAnim=0x");
            sb.append(java.lang.Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(java.lang.Integer.toHexString(-1));
            sb.append(")");
        }
        return sb.toString();
    }
}
