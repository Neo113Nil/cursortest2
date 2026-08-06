package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class an1 {
    public final long GE9mJIPrb8gP;
    public final int JhCgjQRTAOCT;
    public final defpackage.sc0 P05cfTpS5W5L;
    public final defpackage.hp QiMR8OkAhezm;
    public final boolean WDYagTQQm9ns;
    public final defpackage.l6 ZpBGe2uQfcn8;
    public final defpackage.uz e6mdH7fiFuta;
    public final java.util.List fWTAfUmVKrZq;
    public final defpackage.pn1 giKS3J6vZuNy;
    public final int oh71FJcDz6S2;

    public an1(defpackage.l6 l6Var, defpackage.pn1 pn1Var, java.util.List list, int i, boolean z, int i2, defpackage.hp hpVar, defpackage.sc0 sc0Var, defpackage.uz uzVar, long j) {
        this.ZpBGe2uQfcn8 = l6Var;
        this.giKS3J6vZuNy = pn1Var;
        this.fWTAfUmVKrZq = list;
        this.JhCgjQRTAOCT = i;
        this.WDYagTQQm9ns = z;
        this.oh71FJcDz6S2 = i2;
        this.QiMR8OkAhezm = hpVar;
        this.P05cfTpS5W5L = sc0Var;
        this.e6mdH7fiFuta = uzVar;
        this.GE9mJIPrb8gP = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.an1)) {
            return false;
        }
        defpackage.an1 an1Var = (defpackage.an1) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, an1Var.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, an1Var.giKS3J6vZuNy) && defpackage.ma0.QiMR8OkAhezm(this.fWTAfUmVKrZq, an1Var.fWTAfUmVKrZq) && this.JhCgjQRTAOCT == an1Var.JhCgjQRTAOCT && this.WDYagTQQm9ns == an1Var.WDYagTQQm9ns && this.oh71FJcDz6S2 == an1Var.oh71FJcDz6S2 && defpackage.ma0.QiMR8OkAhezm(this.QiMR8OkAhezm, an1Var.QiMR8OkAhezm) && this.P05cfTpS5W5L == an1Var.P05cfTpS5W5L && defpackage.ma0.QiMR8OkAhezm(this.e6mdH7fiFuta, an1Var.e6mdH7fiFuta) && defpackage.mk.giKS3J6vZuNy(this.GE9mJIPrb8gP, an1Var.GE9mJIPrb8gP);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.GE9mJIPrb8gP) + ((this.e6mdH7fiFuta.hashCode() + ((this.P05cfTpS5W5L.hashCode() + ((this.QiMR8OkAhezm.hashCode() + defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.oh71FJcDz6S2, defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT((((this.fWTAfUmVKrZq.hashCode() + defpackage.pVQOaWB9QMo4.WDYagTQQm9ns(this.giKS3J6vZuNy, this.ZpBGe2uQfcn8.hashCode() * 31, 31)) * 31) + this.JhCgjQRTAOCT) * 31, 31, this.WDYagTQQm9ns), 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextLayoutInput(text=");
        sb.append((java.lang.Object) this.ZpBGe2uQfcn8);
        sb.append(", style=");
        sb.append(this.giKS3J6vZuNy);
        sb.append(", placeholders=");
        sb.append(this.fWTAfUmVKrZq);
        sb.append(", maxLines=");
        sb.append(this.JhCgjQRTAOCT);
        sb.append(", softWrap=");
        sb.append(this.WDYagTQQm9ns);
        sb.append(", overflow=");
        int i = this.oh71FJcDz6S2;
        sb.append((java.lang.Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.QiMR8OkAhezm);
        sb.append(", layoutDirection=");
        sb.append(this.P05cfTpS5W5L);
        sb.append(", fontFamilyResolver=");
        sb.append(this.e6mdH7fiFuta);
        sb.append(", constraints=");
        sb.append((java.lang.Object) defpackage.mk.Ns0WNyEWdPsk(this.GE9mJIPrb8gP));
        sb.append(')');
        return sb.toString();
    }
}
