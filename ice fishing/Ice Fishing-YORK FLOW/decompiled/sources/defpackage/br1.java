package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class br1 {
    public final int JhCgjQRTAOCT;
    public final java.lang.Object WDYagTQQm9ns;
    public final defpackage.vz ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final defpackage.w00 giKS3J6vZuNy;

    public br1(defpackage.vz vzVar, defpackage.w00 w00Var, int i, int i2, java.lang.Object obj) {
        this.ZpBGe2uQfcn8 = vzVar;
        this.giKS3J6vZuNy = w00Var;
        this.fWTAfUmVKrZq = i;
        this.JhCgjQRTAOCT = i2;
        this.WDYagTQQm9ns = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.br1)) {
            return false;
        }
        defpackage.br1 br1Var = (defpackage.br1) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, br1Var.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, br1Var.giKS3J6vZuNy) && this.fWTAfUmVKrZq == br1Var.fWTAfUmVKrZq && this.JhCgjQRTAOCT == br1Var.JhCgjQRTAOCT && defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns, br1Var.WDYagTQQm9ns);
    }

    public final int hashCode() {
        defpackage.vz vzVar = this.ZpBGe2uQfcn8;
        int giKS3J6vZuNy = defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.JhCgjQRTAOCT, defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.fWTAfUmVKrZq, (((vzVar == null ? 0 : vzVar.hashCode()) * 31) + this.giKS3J6vZuNy.WDYagTQQm9ns) * 31, 31), 31);
        java.lang.Object obj = this.WDYagTQQm9ns;
        return giKS3J6vZuNy + (obj != null ? obj.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", fontWeight=");
        sb.append(this.giKS3J6vZuNy);
        sb.append(", fontStyle=");
        java.lang.String str = "Invalid";
        int i = this.fWTAfUmVKrZq;
        sb.append((java.lang.Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i2 = this.JhCgjQRTAOCT;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        sb.append((java.lang.Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.WDYagTQQm9ns);
        sb.append(')');
        return sb.toString();
    }
}
