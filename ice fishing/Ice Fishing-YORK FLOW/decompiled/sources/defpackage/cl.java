package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class cl implements defpackage.hc1 {
    public final defpackage.kc1 ZpBGe2uQfcn8;
    public final java.lang.String fWTAfUmVKrZq;
    public final defpackage.ne giKS3J6vZuNy;

    public cl(defpackage.kc1 kc1Var, defpackage.ne neVar) {
        neVar.getClass();
        this.ZpBGe2uQfcn8 = kc1Var;
        this.giKS3J6vZuNy = neVar;
        this.fWTAfUmVKrZq = kc1Var.ZpBGe2uQfcn8 + '<' + neVar.fWTAfUmVKrZq() + '>';
    }

    @Override // defpackage.hc1
    public final java.lang.String JhCgjQRTAOCT(int i) {
        return this.ZpBGe2uQfcn8.WDYagTQQm9ns[i];
    }

    @Override // defpackage.hc1
    public final boolean P05cfTpS5W5L(int i) {
        return this.ZpBGe2uQfcn8.QiMR8OkAhezm[i];
    }

    @Override // defpackage.hc1
    public final defpackage.hc1 QiMR8OkAhezm(int i) {
        return this.ZpBGe2uQfcn8.oh71FJcDz6S2[i];
    }

    @Override // defpackage.hc1
    public final java.lang.String ZpBGe2uQfcn8() {
        return this.fWTAfUmVKrZq;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.cl clVar = obj instanceof defpackage.cl ? (defpackage.cl) obj : null;
        return clVar != null && this.ZpBGe2uQfcn8.equals(clVar.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(clVar.giKS3J6vZuNy, this.giKS3J6vZuNy);
    }

    @Override // defpackage.hc1
    public final int fWTAfUmVKrZq() {
        return this.ZpBGe2uQfcn8.fWTAfUmVKrZq;
    }

    @Override // defpackage.hc1
    public final defpackage.j80 giKS3J6vZuNy() {
        return this.ZpBGe2uQfcn8.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return this.fWTAfUmVKrZq.hashCode() + (this.giKS3J6vZuNy.hashCode() * 31);
    }

    @Override // defpackage.hc1
    public final boolean oh71FJcDz6S2() {
        return false;
    }

    public final java.lang.String toString() {
        return "ContextDescriptor(kClass: " + this.giKS3J6vZuNy + ", original: " + this.ZpBGe2uQfcn8 + ')';
    }
}
