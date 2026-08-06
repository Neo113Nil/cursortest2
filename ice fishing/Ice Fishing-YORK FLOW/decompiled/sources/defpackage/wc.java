package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wc implements java.lang.Runnable {
    public final java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns = 1;
    public final int oh71FJcDz6S2;

    public wc(java.util.List list, int i, java.lang.Throwable th) {
        defpackage.w60.GE9mJIPrb8gP(list, "initCallbacks cannot be null");
        this.QiMR8OkAhezm = new java.util.ArrayList(list);
        this.oh71FJcDz6S2 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                break;
            default:
                java.util.ArrayList arrayList = (java.util.ArrayList) this.QiMR8OkAhezm;
                int size = arrayList.size();
                int i = 0;
                if (this.oh71FJcDz6S2 == 1) {
                    while (i < size) {
                        defpackage.ao aoVar = (defpackage.ao) arrayList.get(i);
                        aoVar.ZpBGe2uQfcn8.setValue(java.lang.Boolean.TRUE);
                        aoVar.giKS3J6vZuNy.oh71FJcDz6S2 = new defpackage.p60(true);
                        i++;
                    }
                    break;
                } else {
                    while (i < size) {
                        ((defpackage.ao) arrayList.get(i)).giKS3J6vZuNy.oh71FJcDz6S2 = defpackage.vx1.Ns0WNyEWdPsk;
                        i++;
                    }
                    break;
                }
        }
    }

    public wc(defpackage.l21 l21Var, int i) {
        this.QiMR8OkAhezm = l21Var;
        this.oh71FJcDz6S2 = i;
    }
}
