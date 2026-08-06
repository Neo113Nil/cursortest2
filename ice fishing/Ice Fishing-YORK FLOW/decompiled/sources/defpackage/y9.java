package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class y9 {
    public final defpackage.dc0 JhCgjQRTAOCT;
    public final java.util.ArrayList WDYagTQQm9ns;
    public final defpackage.w21 ZpBGe2uQfcn8;
    public final defpackage.c20 fWTAfUmVKrZq;
    public final defpackage.ne giKS3J6vZuNy;

    public y9(defpackage.w21 w21Var, defpackage.ne neVar, defpackage.c20 c20Var, defpackage.dc0 dc0Var) {
        w21Var.getClass();
        this.ZpBGe2uQfcn8 = w21Var;
        this.giKS3J6vZuNy = neVar;
        this.fWTAfUmVKrZq = c20Var;
        this.JhCgjQRTAOCT = dc0Var;
        this.WDYagTQQm9ns = new java.util.ArrayList(defpackage.av.WDYagTQQm9ns);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        obj.getClass();
        defpackage.y9 y9Var = (defpackage.y9) obj;
        return this.giKS3J6vZuNy.equals(y9Var.giKS3J6vZuNy) && defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, y9Var.ZpBGe2uQfcn8);
    }

    public final int hashCode() {
        return this.ZpBGe2uQfcn8.hashCode() + (this.giKS3J6vZuNy.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('[');
        sb.append(this.JhCgjQRTAOCT);
        sb.append(": '");
        sb.append(defpackage.mb0.ZpBGe2uQfcn8(this.giKS3J6vZuNy));
        sb.append('\'');
        defpackage.rg1 rg1Var = defpackage.s81.e6mdH7fiFuta;
        defpackage.w21 w21Var = this.ZpBGe2uQfcn8;
        if (!defpackage.ma0.QiMR8OkAhezm(w21Var, rg1Var)) {
            sb.append(",scope:");
            sb.append(w21Var);
        }
        java.util.ArrayList arrayList = this.WDYagTQQm9ns;
        if (!arrayList.isEmpty()) {
            sb.append(",binds:");
            defpackage.hf.hwoZxnIesQBZ(arrayList, sb, ",", new defpackage.awuGf4qH8HFd(4), 60);
        }
        sb.append(']');
        return sb.toString();
    }
}
