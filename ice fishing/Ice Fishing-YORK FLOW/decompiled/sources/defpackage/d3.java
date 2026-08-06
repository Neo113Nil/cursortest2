package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class d3 extends defpackage.lc0 implements defpackage.y10 {
    public final /* synthetic */ defpackage.a11 QiMR8OkAhezm;
    public final /* synthetic */ int oh71FJcDz6S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(defpackage.a11 a11Var, int i) {
        super(1);
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = a11Var;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        int i = this.oh71FJcDz6S2;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.a11 a11Var = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                defpackage.rc0 Ns0WNyEWdPsk = ((defpackage.rc0) obj).Ns0WNyEWdPsk();
                Ns0WNyEWdPsk.getClass();
                a11Var.WmetiUbpKU9I(Ns0WNyEWdPsk);
                break;
            case 1:
                a11Var.m3setPopupContentSizefhxjrPA(new defpackage.u90(((defpackage.u90) obj).ZpBGe2uQfcn8));
                a11Var.s0TASMVLSWD5();
                break;
            default:
                defpackage.n10 n10Var = (defpackage.n10) obj;
                android.os.Handler handler = a11Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != android.os.Looper.myLooper()) {
                    android.os.Handler handler2 = a11Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new defpackage.e(3, n10Var));
                        break;
                    }
                } else {
                    n10Var.ZpBGe2uQfcn8();
                    break;
                }
                break;
        }
        return gs1Var;
    }
}
