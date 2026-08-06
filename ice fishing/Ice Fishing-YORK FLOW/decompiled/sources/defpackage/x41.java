package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class x41 implements java.lang.Runnable {
    public java.lang.Object P05cfTpS5W5L;
    public java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns = 1;
    public java.lang.Object oh71FJcDz6S2;

    public x41(defpackage.dd ddVar, defpackage.h61 h61Var, defpackage.JhCgjQRTAOCT jhCgjQRTAOCT) {
        this.oh71FJcDz6S2 = ddVar;
        this.QiMR8OkAhezm = h61Var;
        this.P05cfTpS5W5L = jhCgjQRTAOCT;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        switch (this.WDYagTQQm9ns) {
            case 0:
                try {
                    obj = ((defpackage.i00) this.oh71FJcDz6S2).call();
                } catch (java.lang.Exception unused) {
                    obj = null;
                }
                ((android.os.Handler) this.P05cfTpS5W5L).post(new defpackage.vc(3, (defpackage.h00) this.QiMR8OkAhezm, obj));
                break;
            default:
                defpackage.dd ddVar = (defpackage.dd) this.oh71FJcDz6S2;
                try {
                    defpackage.ok0.z16KqenTjq8o(ddVar.e6mdH7fiFuta.w7APNrr0aGRc(defpackage.jVUAPb5NnIYW.OcTWLQzke1i2), new defpackage.e2((defpackage.h61) this.QiMR8OkAhezm, ddVar, (defpackage.JhCgjQRTAOCT) this.P05cfTpS5W5L, null, 7));
                    break;
                } catch (java.lang.Throwable th) {
                    ddVar.T1fB7bDYiVJQ(th);
                }
        }
    }
}
