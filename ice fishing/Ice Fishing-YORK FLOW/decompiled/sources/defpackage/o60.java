package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class o60 {
    public static final defpackage.o60 oh71FJcDz6S2 = new defpackage.o60(0, true, 1, 1, defpackage.oi0.QiMR8OkAhezm);
    public final int JhCgjQRTAOCT;
    public final defpackage.oi0 WDYagTQQm9ns;
    public final int ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final boolean giKS3J6vZuNy;

    public o60(int i, boolean z, int i2, int i3, defpackage.oi0 oi0Var) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = z;
        this.fWTAfUmVKrZq = i2;
        this.JhCgjQRTAOCT = i3;
        this.WDYagTQQm9ns = oi0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.o60)) {
            return false;
        }
        defpackage.o60 o60Var = (defpackage.o60) obj;
        return this.ZpBGe2uQfcn8 == o60Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == o60Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == o60Var.fWTAfUmVKrZq && this.JhCgjQRTAOCT == o60Var.JhCgjQRTAOCT && defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns, o60Var.WDYagTQQm9ns);
    }

    public final int hashCode() {
        return this.WDYagTQQm9ns.WDYagTQQm9ns.hashCode() + defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.JhCgjQRTAOCT, defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.fWTAfUmVKrZq, defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT(defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.ZpBGe2uQfcn8, java.lang.Boolean.hashCode(false) * 31, 31), 31, this.giKS3J6vZuNy), 31), 961);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImeOptions(singleLine=false, capitalization=");
        int i = this.ZpBGe2uQfcn8;
        sb.append((java.lang.Object) (i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid"));
        sb.append(", autoCorrect=");
        sb.append(this.giKS3J6vZuNy);
        sb.append(", keyboardType=");
        sb.append((java.lang.Object) defpackage.j80.zJPqDeoF0Os1(this.fWTAfUmVKrZq));
        sb.append(", imeAction=");
        sb.append((java.lang.Object) defpackage.n60.ZpBGe2uQfcn8(this.JhCgjQRTAOCT));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.WDYagTQQm9ns);
        sb.append(')');
        return sb.toString();
    }
}
