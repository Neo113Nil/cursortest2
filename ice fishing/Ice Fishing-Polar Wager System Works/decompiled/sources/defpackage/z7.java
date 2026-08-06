package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class z7 implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ java.lang.Object EXtogiMhuM;
    public final /* synthetic */ java.lang.Object SH1y5HwkJhh;
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object riuEU0zW4;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ z7(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
        this.AARZUJiTa = obj2;
        this.EXtogiMhuM = obj3;
        this.riuEU0zW4 = obj4;
        this.SH1y5HwkJhh = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.rl0 nBH8hAHy;
        int i = this.adDC3e2L;
        java.lang.Object obj = this.SH1y5HwkJhh;
        java.lang.Object obj2 = this.riuEU0zW4;
        java.lang.Object obj3 = this.EXtogiMhuM;
        java.lang.Object obj4 = this.AARZUJiTa;
        java.lang.Object obj5 = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                defpackage.dg1 dg1Var = (defpackage.dg1) obj5;
                defpackage.w90 w90Var = (defpackage.w90) obj4;
                java.lang.String str = (java.lang.String) obj3;
                defpackage.qn qnVar = (defpackage.qn) obj2;
                defpackage.ny nyVar = (defpackage.ny) obj;
                android.os.Trace.beginSection("BackgroundTextMeasurement");
                try {
                    defpackage.oa1 SH1y5HwkJhh = defpackage.wa1.SH1y5HwkJhh();
                    defpackage.rl0 rl0Var = SH1y5HwkJhh instanceof defpackage.rl0 ? (defpackage.rl0) SH1y5HwkJhh : null;
                    if (rl0Var == null || (nBH8hAHy = rl0Var.nBH8hAHy(null, null)) == null) {
                        throw new java.lang.IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        defpackage.oa1 SH1y5HwkJhh2 = nBH8hAHy.SH1y5HwkJhh();
                        try {
                            defpackage.dg1 hyxIchWRW = defpackage.x80.hyxIchWRW(dg1Var, w90Var);
                            defpackage.nt ntVar = defpackage.nt.adDC3e2L;
                            new defpackage.x2(str, hyxIchWRW, ntVar, ntVar, nyVar, qnVar).r1MBDhnF();
                            defpackage.oa1.G3OKOH3wZRC(SH1y5HwkJhh2);
                            nBH8hAHy.PAEGRtP0bX().ez2rX8ReCYw();
                            nBH8hAHy.r1MBDhnF();
                            android.os.Trace.endSection();
                            return;
                        } catch (java.lang.Throwable th) {
                            defpackage.oa1.G3OKOH3wZRC(SH1y5HwkJhh2);
                            throw th;
                        }
                    } finally {
                    }
                } catch (java.lang.Throwable th2) {
                    android.os.Trace.endSection();
                    throw th2;
                }
            default:
                defpackage.ps psVar = (defpackage.ps) obj5;
                defpackage.me1 me1Var = (defpackage.me1) obj4;
                defpackage.me1 me1Var2 = (defpackage.me1) obj3;
                android.view.View view = (android.view.View) obj;
                android.view.Window window = ((com.corsair.ledger.MainActivity) obj2).getWindow();
                window.getClass();
                defpackage.g00 g00Var = me1Var.r1MBDhnF;
                android.content.res.Resources resources = view.getResources();
                resources.getClass();
                boolean booleanValue = ((java.lang.Boolean) g00Var.AARZUJiTa(resources)).booleanValue();
                defpackage.g00 g00Var2 = me1Var2.r1MBDhnF;
                android.content.res.Resources resources2 = view.getResources();
                resources2.getClass();
                psVar.oh6vYeIP(me1Var, me1Var2, window, view, booleanValue, ((java.lang.Boolean) g00Var2.AARZUJiTa(resources2)).booleanValue());
                return;
        }
    }
}
