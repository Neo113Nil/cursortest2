package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class mnkwqFSfsWTC implements defpackage.ug0 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ mnkwqFSfsWTC(int i, java.lang.Object obj) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
    }

    @Override // defpackage.ug0
    public final void e6mdH7fiFuta(defpackage.wg0 wg0Var, defpackage.og0 og0Var) {
        int i = this.WDYagTQQm9ns;
        int i2 = 0;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                ((defpackage.y10) obj).P05cfTpS5W5L(og0Var);
                break;
            case 1:
                defpackage.ep0 ep0Var = (defpackage.ep0) obj;
                ep0Var.WmetiUbpKU9I = og0Var.ZpBGe2uQfcn8();
                if (ep0Var.fWTAfUmVKrZq != null) {
                    java.util.ArrayList awu2ulftxHsa = defpackage.hf.awu2ulftxHsa(ep0Var.oh71FJcDz6S2);
                    int size = awu2ulftxHsa.size();
                    while (i2 < size) {
                        java.lang.Object obj2 = awu2ulftxHsa.get(i2);
                        i2++;
                        defpackage.xo0 xo0Var = (defpackage.xo0) obj2;
                        xo0Var.getClass();
                        defpackage.zo0 zo0Var = xo0Var.fNwYGHIYeJcR;
                        zo0Var.getClass();
                        zo0Var.ZpBGe2uQfcn8.P05cfTpS5W5L = og0Var.ZpBGe2uQfcn8();
                        zo0Var.JhCgjQRTAOCT = og0Var.ZpBGe2uQfcn8();
                        zo0Var.giKS3J6vZuNy();
                    }
                    break;
                }
                break;
            default:
                defpackage.a81 a81Var = (defpackage.a81) obj;
                if (og0Var != defpackage.og0.ON_START) {
                    if (og0Var == defpackage.og0.ON_STOP) {
                        a81Var.P05cfTpS5W5L = false;
                        break;
                    }
                } else {
                    a81Var.P05cfTpS5W5L = true;
                    break;
                }
                break;
        }
    }
}
