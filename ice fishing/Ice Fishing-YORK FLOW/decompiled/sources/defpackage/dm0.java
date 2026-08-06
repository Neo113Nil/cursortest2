package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class dm0 implements defpackage.cm0 {
    public defpackage.yf1 P05cfTpS5W5L;
    public final defpackage.lw0 QiMR8OkAhezm = new defpackage.lw0(1.0f);
    public final android.content.Context WDYagTQQm9ns;
    public defpackage.jl oh71FJcDz6S2;

    public dm0(android.content.Context context) {
        this.WDYagTQQm9ns = context;
    }

    @Override // defpackage.jm
    public final java.lang.Object BHfvd2J71qpO(defpackage.c20 c20Var, java.lang.Object obj) {
        return c20Var.QiMR8OkAhezm(obj, this);
    }

    @Override // defpackage.jm
    public final defpackage.hm XntWc4eZSQ8j(defpackage.im imVar) {
        return defpackage.h0.dG7RjM6DqYVL(this, imVar);
    }

    @Override // defpackage.jm
    public final defpackage.jm fNwYGHIYeJcR(defpackage.jm jmVar) {
        return defpackage.h0.zJPqDeoF0Os1(this, jmVar);
    }

    @Override // defpackage.cm0
    public final float maCixPsq4ml2() {
        defpackage.kl klVar;
        defpackage.eg1 eg1Var;
        if (this.P05cfTpS5W5L == null) {
            android.content.Context context = this.WDYagTQQm9ns;
            defpackage.yn0 yn0Var = defpackage.jx1.ZpBGe2uQfcn8;
            synchronized (yn0Var) {
                try {
                    java.lang.Object QiMR8OkAhezm = yn0Var.QiMR8OkAhezm(context);
                    klVar = null;
                    if (QiMR8OkAhezm == null) {
                        android.content.ContentResolver contentResolver = context.getContentResolver();
                        android.net.Uri uriFor = android.provider.Settings.Global.getUriFor("animator_duration_scale");
                        defpackage.dc giKS3J6vZuNy = defpackage.ok0.giKS3J6vZuNy(-1, 6, null);
                        defpackage.f71 f71Var = new defpackage.f71(new defpackage.hx1(contentResolver, uriFor, new defpackage.ix1(giKS3J6vZuNy, defpackage.ma0.T1fB7bDYiVJQ(android.os.Looper.getMainLooper())), giKS3J6vZuNy, context, null));
                        defpackage.wh1 wh1Var = new defpackage.wh1(null);
                        defpackage.jo joVar = defpackage.tq.ZpBGe2uQfcn8;
                        QiMR8OkAhezm = defpackage.nn.UmgHb6n58gfG(f71Var, new defpackage.jl(defpackage.h0.zJPqDeoF0Os1(wh1Var, defpackage.wj0.ZpBGe2uQfcn8)), new defpackage.cg1(), java.lang.Float.valueOf(android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        yn0Var.h3m55N1URyyK(context, QiMR8OkAhezm);
                    }
                    eg1Var = (defpackage.eg1) QiMR8OkAhezm;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            this.QiMR8OkAhezm.e6mdH7fiFuta(((java.lang.Number) eg1Var.getValue()).floatValue());
            defpackage.jl jlVar = this.oh71FJcDz6S2;
            if (jlVar == null) {
                defpackage.h7.P05cfTpS5W5L("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.P05cfTpS5W5L = defpackage.ok0.zJPqDeoF0Os1(jlVar, null, new defpackage.JhCgjQRTAOCT(eg1Var, this, klVar, 16), 3);
        }
        return this.QiMR8OkAhezm.P05cfTpS5W5L();
    }

    @Override // defpackage.jm
    public final defpackage.jm w7APNrr0aGRc(defpackage.im imVar) {
        return defpackage.h0.xahdJg25P1Bv(this, imVar);
    }
}
