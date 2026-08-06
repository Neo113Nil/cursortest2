package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class w9 implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object GE9mJIPrb8gP;
    public final /* synthetic */ java.lang.Object P05cfTpS5W5L;
    public final /* synthetic */ java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object e6mdH7fiFuta;
    public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ w9(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
        this.QiMR8OkAhezm = obj2;
        this.P05cfTpS5W5L = obj3;
        this.e6mdH7fiFuta = obj4;
        this.GE9mJIPrb8gP = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.do0 UmgHb6n58gfG;
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = this.GE9mJIPrb8gP;
        java.lang.Object obj2 = this.e6mdH7fiFuta;
        java.lang.Object obj3 = this.P05cfTpS5W5L;
        java.lang.Object obj4 = this.QiMR8OkAhezm;
        java.lang.Object obj5 = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.pn1 pn1Var = (defpackage.pn1) obj5;
                defpackage.sc0 sc0Var = (defpackage.sc0) obj4;
                java.lang.String str = (java.lang.String) obj3;
                defpackage.hp hpVar = (defpackage.hp) obj2;
                defpackage.uz uzVar = (defpackage.uz) obj;
                android.os.Trace.beginSection("BackgroundTextMeasurement");
                try {
                    defpackage.me1 GE9mJIPrb8gP = defpackage.te1.GE9mJIPrb8gP();
                    defpackage.do0 do0Var = GE9mJIPrb8gP instanceof defpackage.do0 ? (defpackage.do0) GE9mJIPrb8gP : null;
                    if (do0Var == null || (UmgHb6n58gfG = do0Var.UmgHb6n58gfG(null, null)) == null) {
                        throw new java.lang.IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        defpackage.me1 GE9mJIPrb8gP2 = UmgHb6n58gfG.GE9mJIPrb8gP();
                        try {
                            defpackage.pn1 KrtOTfE6jiS2 = defpackage.t80.KrtOTfE6jiS2(pn1Var, sc0Var);
                            defpackage.av avVar = defpackage.av.WDYagTQQm9ns;
                            defpackage.q2 q2Var = new defpackage.q2(str, KrtOTfE6jiS2, avVar, avVar, uzVar, hpVar);
                            q2Var.fWTAfUmVKrZq();
                            q2Var.ZpBGe2uQfcn8();
                            defpackage.me1.WmetiUbpKU9I(GE9mJIPrb8gP2);
                            UmgHb6n58gfG.IJ0hOnjhPOri().T1fB7bDYiVJQ();
                            UmgHb6n58gfG.fWTAfUmVKrZq();
                            android.os.Trace.endSection();
                            return;
                        } catch (java.lang.Throwable th) {
                            defpackage.me1.WmetiUbpKU9I(GE9mJIPrb8gP2);
                            throw th;
                        }
                    } finally {
                    }
                } catch (java.lang.Throwable th2) {
                    android.os.Trace.endSection();
                    throw th2;
                }
            default:
                defpackage.au auVar = (defpackage.au) obj5;
                defpackage.vi1 vi1Var = (defpackage.vi1) obj4;
                defpackage.vi1 vi1Var2 = (defpackage.vi1) obj3;
                android.view.View view = (android.view.View) obj;
                android.view.Window window = ((com.ice.fishing.wolberta.MainActivity) obj2).getWindow();
                window.getClass();
                defpackage.ui1 ui1Var = vi1Var.ZpBGe2uQfcn8;
                android.content.res.Resources resources = view.getResources();
                resources.getClass();
                ui1Var.P05cfTpS5W5L(resources);
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                boolean booleanValue = bool.booleanValue();
                defpackage.ui1 ui1Var2 = vi1Var2.ZpBGe2uQfcn8;
                android.content.res.Resources resources2 = view.getResources();
                resources2.getClass();
                ui1Var2.P05cfTpS5W5L(resources2);
                auVar.giKS3J6vZuNy(vi1Var, vi1Var2, window, view, booleanValue, bool.booleanValue());
                return;
        }
    }
}
