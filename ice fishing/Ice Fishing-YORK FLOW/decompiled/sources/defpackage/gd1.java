package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gd1 {
    public final defpackage.p61 JhCgjQRTAOCT;
    public final defpackage.p61 P05cfTpS5W5L;
    public final defpackage.p61 QiMR8OkAhezm;
    public final defpackage.p61 WDYagTQQm9ns;
    public final defpackage.p61 ZpBGe2uQfcn8;
    public final defpackage.p61 fWTAfUmVKrZq;
    public final defpackage.p61 giKS3J6vZuNy;
    public final defpackage.p61 oh71FJcDz6S2;

    public gd1(defpackage.p61 p61Var, defpackage.p61 p61Var2, defpackage.p61 p61Var3, int i) {
        defpackage.p61 p61Var4 = defpackage.dd1.ZpBGe2uQfcn8;
        p61Var = (i & 2) != 0 ? defpackage.dd1.giKS3J6vZuNy : p61Var;
        p61Var2 = (i & 4) != 0 ? defpackage.dd1.fWTAfUmVKrZq : p61Var2;
        p61Var3 = (i & 8) != 0 ? defpackage.dd1.JhCgjQRTAOCT : p61Var3;
        defpackage.p61 p61Var5 = defpackage.dd1.oh71FJcDz6S2;
        defpackage.p61 p61Var6 = defpackage.dd1.WDYagTQQm9ns;
        defpackage.p61 p61Var7 = defpackage.dd1.QiMR8OkAhezm;
        defpackage.p61 p61Var8 = defpackage.dd1.P05cfTpS5W5L;
        this.ZpBGe2uQfcn8 = p61Var4;
        this.giKS3J6vZuNy = p61Var;
        this.fWTAfUmVKrZq = p61Var2;
        this.JhCgjQRTAOCT = p61Var3;
        this.WDYagTQQm9ns = p61Var5;
        this.oh71FJcDz6S2 = p61Var6;
        this.QiMR8OkAhezm = p61Var7;
        this.P05cfTpS5W5L = p61Var8;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.gd1)) {
            return false;
        }
        defpackage.gd1 gd1Var = (defpackage.gd1) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, gd1Var.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, gd1Var.giKS3J6vZuNy) && defpackage.ma0.QiMR8OkAhezm(this.fWTAfUmVKrZq, gd1Var.fWTAfUmVKrZq) && defpackage.ma0.QiMR8OkAhezm(this.JhCgjQRTAOCT, gd1Var.JhCgjQRTAOCT) && defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns, gd1Var.WDYagTQQm9ns) && defpackage.ma0.QiMR8OkAhezm(this.oh71FJcDz6S2, gd1Var.oh71FJcDz6S2) && defpackage.ma0.QiMR8OkAhezm(this.QiMR8OkAhezm, gd1Var.QiMR8OkAhezm) && defpackage.ma0.QiMR8OkAhezm(this.P05cfTpS5W5L, gd1Var.P05cfTpS5W5L);
    }

    public final int hashCode() {
        return this.P05cfTpS5W5L.hashCode() + ((this.QiMR8OkAhezm.hashCode() + ((this.oh71FJcDz6S2.hashCode() + ((this.WDYagTQQm9ns.hashCode() + ((this.JhCgjQRTAOCT.hashCode() + ((this.fWTAfUmVKrZq.hashCode() + ((this.giKS3J6vZuNy.hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "Shapes(extraSmall=" + this.ZpBGe2uQfcn8 + ", small=" + this.giKS3J6vZuNy + ", medium=" + this.fWTAfUmVKrZq + ", large=" + this.JhCgjQRTAOCT + ", largeIncreased=" + this.oh71FJcDz6S2 + ", extraLarge=" + this.WDYagTQQm9ns + ", extralargeIncreased=" + this.QiMR8OkAhezm + ", extraExtraLarge=" + this.P05cfTpS5W5L + ')';
    }
}
