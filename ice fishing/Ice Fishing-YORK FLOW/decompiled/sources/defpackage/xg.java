package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class xg implements defpackage.n10 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ defpackage.gh oh71FJcDz6S2;

    public /* synthetic */ xg(defpackage.gh ghVar, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = ghVar;
    }

    @Override // defpackage.n10
    public final java.lang.Object ZpBGe2uQfcn8() {
        int i = this.WDYagTQQm9ns;
        defpackage.gh ghVar = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                ghVar.reportFullyDrawn();
                return defpackage.gs1.ZpBGe2uQfcn8;
            case 1:
                return new defpackage.m10(ghVar.GE9mJIPrb8gP, new defpackage.xg(ghVar, 0));
            case 2:
                defpackage.lq lqVar = new defpackage.lq();
                ghVar.ZpBGe2uQfcn8().JhCgjQRTAOCT(lqVar);
                return lqVar;
            case 3:
                return new defpackage.c81(ghVar.getApplication(), ghVar, ghVar.getIntent() != null ? ghVar.getIntent().getExtras() : null);
            default:
                defpackage.lt0 lt0Var = new defpackage.lt0(new defpackage.gUjdnLbkVAaA(4, ghVar));
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    if (defpackage.ma0.QiMR8OkAhezm(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                        ghVar.WDYagTQQm9ns.ZpBGe2uQfcn8(new defpackage.yg(lt0Var, ghVar));
                    } else {
                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new defpackage.m0(1, ghVar, lt0Var));
                    }
                }
                return lt0Var;
        }
    }
}
