package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ m0(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
        this.QiMR8OkAhezm = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.QiMR8OkAhezm;
        java.lang.Object obj2 = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.jr0.w7APNrr0aGRc((defpackage.p0) obj2, (android.util.LongSparseArray) obj);
                return;
            case 1:
                defpackage.gh ghVar = (defpackage.gh) obj2;
                ghVar.WDYagTQQm9ns.ZpBGe2uQfcn8(new defpackage.yg((defpackage.lt0) obj, ghVar));
                return;
            case 2:
                defpackage.vo1 vo1Var = (defpackage.vo1) obj;
                try {
                    ((java.lang.Runnable) obj2).run();
                    return;
                } finally {
                    vo1Var.ZpBGe2uQfcn8();
                }
            default:
                defpackage.qx1 qx1Var = (defpackage.qx1) obj2;
                defpackage.zg0 zg0Var = (defpackage.zg0) obj;
                if (qx1Var.QiMR8OkAhezm) {
                    return;
                }
                qx1Var.P05cfTpS5W5L = zg0Var;
                zg0Var.ZpBGe2uQfcn8(qx1Var);
                return;
        }
    }
}
