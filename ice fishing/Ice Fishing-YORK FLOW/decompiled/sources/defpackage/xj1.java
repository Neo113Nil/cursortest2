package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class xj1 {
    public final java.lang.CharSequence ZpBGe2uQfcn8;
    public final android.view.textclassifier.TextClassification fWTAfUmVKrZq;
    public final long giKS3J6vZuNy;

    public xj1(java.lang.CharSequence charSequence, long j, android.view.textclassifier.TextClassification textClassification) {
        this.ZpBGe2uQfcn8 = charSequence;
        this.giKS3J6vZuNy = j;
        this.fWTAfUmVKrZq = textClassification;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.xj1)) {
            return false;
        }
        defpackage.xj1 xj1Var = (defpackage.xj1) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, xj1Var.ZpBGe2uQfcn8) && defpackage.in1.giKS3J6vZuNy(this.giKS3J6vZuNy, xj1Var.giKS3J6vZuNy) && defpackage.ma0.QiMR8OkAhezm(this.fWTAfUmVKrZq, xj1Var.fWTAfUmVKrZq);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.ZpBGe2uQfcn8.hashCode() * 31;
        int i = defpackage.in1.fWTAfUmVKrZq;
        int fWTAfUmVKrZq = defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(hashCode2, 31, this.giKS3J6vZuNy);
        hashCode = this.fWTAfUmVKrZq.hashCode();
        return hashCode + fWTAfUmVKrZq;
    }

    public final java.lang.String toString() {
        return "TextClassificationResult(text=" + ((java.lang.Object) this.ZpBGe2uQfcn8) + ", selection=" + ((java.lang.Object) defpackage.in1.P05cfTpS5W5L(this.giKS3J6vZuNy)) + ", textClassification=" + this.fWTAfUmVKrZq + ')';
    }
}
