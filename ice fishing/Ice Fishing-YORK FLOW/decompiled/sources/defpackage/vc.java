package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class vc implements java.lang.Runnable {
    public final java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public java.lang.Object oh71FJcDz6S2;

    public vc(defpackage.fh0 fh0Var, java.lang.Runnable runnable) {
        this.WDYagTQQm9ns = 2;
        this.QiMR8OkAhezm = fh0Var;
        this.oh71FJcDz6S2 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.QiMR8OkAhezm;
        switch (i) {
            case 0:
                break;
            case 1:
                ((defpackage.dd) this.oh71FJcDz6S2).KrtOTfE6jiS2((defpackage.s40) obj);
                break;
            case 2:
                defpackage.fh0 fh0Var = (defpackage.fh0) obj;
                defpackage.lm lmVar = fh0Var.P05cfTpS5W5L;
                int i2 = 0;
                while (true) {
                    try {
                        ((java.lang.Runnable) this.oh71FJcDz6S2).run();
                    } catch (java.lang.Throwable th) {
                        defpackage.ma0.ZVVdXbWmyCSK(defpackage.xu.WDYagTQQm9ns, th);
                    }
                    java.lang.Runnable IBvW5fLsPuHy = fh0Var.IBvW5fLsPuHy();
                    if (IBvW5fLsPuHy != null) {
                        this.oh71FJcDz6S2 = IBvW5fLsPuHy;
                        i2++;
                        if (i2 >= 16 && lmVar.frSwwKIlbUhK(fh0Var)) {
                            lmVar.jjTN4uUnoyEn(fh0Var, this);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
            case 3:
                ((defpackage.h00) this.oh71FJcDz6S2).ZpBGe2uQfcn8(obj);
                break;
            default:
                ((defpackage.dd) obj).KrtOTfE6jiS2((defpackage.dw) this.oh71FJcDz6S2);
                break;
        }
    }

    public /* synthetic */ vc(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
        this.QiMR8OkAhezm = obj2;
    }
}
