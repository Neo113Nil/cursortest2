package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class p30 implements defpackage.y10 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ defpackage.y10 oh71FJcDz6S2;

    public /* synthetic */ p30(defpackage.y10 y10Var, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = y10Var;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        int i = this.WDYagTQQm9ns;
        defpackage.y10 y10Var = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.rp1 rp1Var = (defpackage.rp1) obj;
                if (!(rp1Var instanceof defpackage.o30)) {
                    defpackage.h7.P05cfTpS5W5L("Node is not a GestureNode instance");
                    return null;
                }
                java.lang.Boolean bool = (java.lang.Boolean) y10Var.P05cfTpS5W5L(((defpackage.o30) rp1Var).BHfvd2J71qpO);
                bool.getClass();
                return bool;
            case 1:
                defpackage.me1 me1Var = (defpackage.me1) y10Var.P05cfTpS5W5L((defpackage.re1) obj);
                synchronized (defpackage.te1.fWTAfUmVKrZq) {
                    defpackage.te1.JhCgjQRTAOCT = defpackage.te1.JhCgjQRTAOCT.WDYagTQQm9ns(me1Var.QiMR8OkAhezm());
                }
                return me1Var;
            default:
                java.lang.Long l = (java.lang.Long) obj;
                l.getClass();
                return y10Var.P05cfTpS5W5L(l);
        }
    }
}
