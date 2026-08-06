package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class hw0 implements defpackage.h6 {
    public final defpackage.rm1 JhCgjQRTAOCT;
    public final int P05cfTpS5W5L;
    public final int QiMR8OkAhezm;
    public final defpackage.fz0 WDYagTQQm9ns;
    public final int ZpBGe2uQfcn8;
    public final defpackage.gn1 e6mdH7fiFuta;
    public final long fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;
    public final defpackage.lh0 oh71FJcDz6S2;

    public hw0(int i, int i2, long j, defpackage.rm1 rm1Var, defpackage.fz0 fz0Var, defpackage.lh0 lh0Var, int i3, int i4, defpackage.gn1 gn1Var) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = i2;
        this.fWTAfUmVKrZq = j;
        this.JhCgjQRTAOCT = rm1Var;
        this.WDYagTQQm9ns = fz0Var;
        this.oh71FJcDz6S2 = lh0Var;
        this.QiMR8OkAhezm = i3;
        this.P05cfTpS5W5L = i4;
        this.e6mdH7fiFuta = gn1Var;
        if (defpackage.tn1.ZpBGe2uQfcn8(j, defpackage.tn1.fWTAfUmVKrZq) || defpackage.tn1.fWTAfUmVKrZq(j) >= 0.0f) {
            return;
        }
        defpackage.f80.giKS3J6vZuNy("lineHeight can't be negative (" + defpackage.tn1.fWTAfUmVKrZq(j) + ')');
    }

    public final defpackage.hw0 ZpBGe2uQfcn8(defpackage.hw0 hw0Var) {
        return hw0Var == null ? this : defpackage.iw0.ZpBGe2uQfcn8(this, hw0Var.ZpBGe2uQfcn8, hw0Var.giKS3J6vZuNy, hw0Var.fWTAfUmVKrZq, hw0Var.JhCgjQRTAOCT, hw0Var.WDYagTQQm9ns, hw0Var.oh71FJcDz6S2, hw0Var.QiMR8OkAhezm, hw0Var.P05cfTpS5W5L, hw0Var.e6mdH7fiFuta);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.hw0)) {
            return false;
        }
        defpackage.hw0 hw0Var = (defpackage.hw0) obj;
        return this.ZpBGe2uQfcn8 == hw0Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == hw0Var.giKS3J6vZuNy && defpackage.tn1.ZpBGe2uQfcn8(this.fWTAfUmVKrZq, hw0Var.fWTAfUmVKrZq) && defpackage.ma0.QiMR8OkAhezm(this.JhCgjQRTAOCT, hw0Var.JhCgjQRTAOCT) && defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns, hw0Var.WDYagTQQm9ns) && defpackage.ma0.QiMR8OkAhezm(this.oh71FJcDz6S2, hw0Var.oh71FJcDz6S2) && this.QiMR8OkAhezm == hw0Var.QiMR8OkAhezm && this.P05cfTpS5W5L == hw0Var.P05cfTpS5W5L && defpackage.ma0.QiMR8OkAhezm(this.e6mdH7fiFuta, hw0Var.e6mdH7fiFuta);
    }

    public final int hashCode() {
        int giKS3J6vZuNy = defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.giKS3J6vZuNy, java.lang.Integer.hashCode(this.ZpBGe2uQfcn8) * 31, 31);
        defpackage.un1[] un1VarArr = defpackage.tn1.giKS3J6vZuNy;
        int fWTAfUmVKrZq = defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(giKS3J6vZuNy, 31, this.fWTAfUmVKrZq);
        defpackage.rm1 rm1Var = this.JhCgjQRTAOCT;
        int hashCode = (fWTAfUmVKrZq + (rm1Var != null ? rm1Var.hashCode() : 0)) * 31;
        defpackage.fz0 fz0Var = this.WDYagTQQm9ns;
        int hashCode2 = (hashCode + (fz0Var != null ? fz0Var.hashCode() : 0)) * 31;
        defpackage.lh0 lh0Var = this.oh71FJcDz6S2;
        int giKS3J6vZuNy2 = defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.P05cfTpS5W5L, defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.QiMR8OkAhezm, (hashCode2 + (lh0Var != null ? lh0Var.hashCode() : 0)) * 31, 31), 31);
        defpackage.gn1 gn1Var = this.e6mdH7fiFuta;
        return giKS3J6vZuNy2 + (gn1Var != null ? gn1Var.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ParagraphStyle(textAlign=" + ((java.lang.Object) defpackage.tj1.ZpBGe2uQfcn8(this.ZpBGe2uQfcn8)) + ", textDirection=" + ((java.lang.Object) defpackage.tk1.ZpBGe2uQfcn8(this.giKS3J6vZuNy)) + ", lineHeight=" + ((java.lang.Object) defpackage.tn1.JhCgjQRTAOCT(this.fWTAfUmVKrZq)) + ", textIndent=" + this.JhCgjQRTAOCT + ", platformStyle=" + this.WDYagTQQm9ns + ", lineHeightStyle=" + this.oh71FJcDz6S2 + ", lineBreak=" + ((java.lang.Object) defpackage.gh0.ZpBGe2uQfcn8(this.QiMR8OkAhezm)) + ", hyphens=" + ((java.lang.Object) defpackage.a60.ZpBGe2uQfcn8(this.P05cfTpS5W5L)) + ", textMotion=" + this.e6mdH7fiFuta + ')';
    }
}
