package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class h71 implements defpackage.j41 {
    public defpackage.a7 GE9mJIPrb8gP;
    public final defpackage.l3 Ns0WNyEWdPsk = new defpackage.l3(23, this);
    public java.lang.Object P05cfTpS5W5L;
    public java.lang.String QiMR8OkAhezm;
    public defpackage.e81 WDYagTQQm9ns;
    public java.lang.Object[] e6mdH7fiFuta;
    public defpackage.k71 oh71FJcDz6S2;

    public h71(defpackage.e81 e81Var, defpackage.k71 k71Var, java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) {
        this.WDYagTQQm9ns = e81Var;
        this.oh71FJcDz6S2 = k71Var;
        this.QiMR8OkAhezm = str;
        this.P05cfTpS5W5L = obj;
        this.e6mdH7fiFuta = objArr;
    }

    @Override // defpackage.j41
    public final void WDYagTQQm9ns() {
        defpackage.a7 a7Var = this.GE9mJIPrb8gP;
        if (a7Var != null) {
            a7Var.VFeft99leXEK();
        }
    }

    @Override // defpackage.j41
    public final void ZpBGe2uQfcn8() {
        giKS3J6vZuNy();
    }

    @Override // defpackage.j41
    public final void fWTAfUmVKrZq() {
        defpackage.a7 a7Var = this.GE9mJIPrb8gP;
        if (a7Var != null) {
            a7Var.VFeft99leXEK();
        }
    }

    public final void giKS3J6vZuNy() {
        java.lang.String WmetiUbpKU9I;
        defpackage.k71 k71Var = this.oh71FJcDz6S2;
        if (this.GE9mJIPrb8gP != null) {
            defpackage.p81.JhCgjQRTAOCT("entry(", this.GE9mJIPrb8gP, ") is not null");
            return;
        }
        if (k71Var != null) {
            defpackage.l3 l3Var = this.Ns0WNyEWdPsk;
            java.lang.Object ZpBGe2uQfcn8 = l3Var.ZpBGe2uQfcn8();
            if (ZpBGe2uQfcn8 == null || k71Var.JhCgjQRTAOCT(ZpBGe2uQfcn8)) {
                this.GE9mJIPrb8gP = k71Var.ZpBGe2uQfcn8(this.QiMR8OkAhezm, l3Var);
                return;
            }
            if (ZpBGe2uQfcn8 instanceof defpackage.xe1) {
                defpackage.xe1 xe1Var = (defpackage.xe1) ZpBGe2uQfcn8;
                if (xe1Var.WDYagTQQm9ns() == defpackage.jVUAPb5NnIYW.z16KqenTjq8o || xe1Var.WDYagTQQm9ns() == defpackage.pa1.Ns0WNyEWdPsk || xe1Var.WDYagTQQm9ns() == defpackage.jVUAPb5NnIYW.GoIRkIe1iwj6) {
                    WmetiUbpKU9I = "MutableState containing " + xe1Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    WmetiUbpKU9I = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                WmetiUbpKU9I = defpackage.v70.WmetiUbpKU9I(ZpBGe2uQfcn8);
            }
            throw new java.lang.IllegalArgumentException(WmetiUbpKU9I);
        }
    }
}
