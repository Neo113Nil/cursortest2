package androidx.lifecycle;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements defpackage.t50 {
    @Override // defpackage.t50
    public final java.util.List IHQe1A4L2xu() {
        return defpackage.nt.adDC3e2L;
    }

    @Override // defpackage.t50
    public final java.lang.Object oh6vYeIP(android.content.Context context) {
        context.getClass();
        defpackage.v5 AARZUJiTa = defpackage.v5.AARZUJiTa(context);
        AARZUJiTa.getClass();
        if (!((java.util.HashSet) AARZUJiTa.r1MBDhnF).contains(androidx.lifecycle.ProcessLifecycleInitializer.class)) {
            defpackage.db.AARZUJiTa("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!defpackage.pd0.IHQe1A4L2xu.getAndSet(true)) {
            android.content.Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new defpackage.od0());
        }
        defpackage.vx0 vx0Var = defpackage.vx0.DFo87pBq1E5;
        vx0Var.getClass();
        vx0Var.riuEU0zW4 = new android.os.Handler();
        vx0Var.SH1y5HwkJhh.F7NU4MC0GW(defpackage.md0.ON_CREATE);
        android.content.Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((android.app.Application) applicationContext2).registerActivityLifecycleCallbacks(new defpackage.ux0(vx0Var));
        return vx0Var;
    }
}
