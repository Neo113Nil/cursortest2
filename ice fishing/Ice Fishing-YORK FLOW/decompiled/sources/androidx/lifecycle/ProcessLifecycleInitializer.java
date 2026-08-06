package androidx.lifecycle;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements defpackage.w70 {
    @Override // defpackage.w70
    public final java.util.List ZpBGe2uQfcn8() {
        return defpackage.av.WDYagTQQm9ns;
    }

    @Override // defpackage.w70
    public final java.lang.Object giKS3J6vZuNy(android.content.Context context) {
        context.getClass();
        defpackage.a7 P05cfTpS5W5L = defpackage.a7.P05cfTpS5W5L(context);
        P05cfTpS5W5L.getClass();
        if (!((java.util.HashSet) P05cfTpS5W5L.fWTAfUmVKrZq).contains(androidx.lifecycle.ProcessLifecycleInitializer.class)) {
            defpackage.h7.P05cfTpS5W5L("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!defpackage.rg0.ZpBGe2uQfcn8.getAndSet(true)) {
            android.content.Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new defpackage.qg0());
        }
        defpackage.f21 f21Var = defpackage.f21.h3m55N1URyyK;
        f21Var.getClass();
        f21Var.e6mdH7fiFuta = new android.os.Handler();
        f21Var.GE9mJIPrb8gP.JhCgjQRTAOCT(defpackage.og0.ON_CREATE);
        android.content.Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((android.app.Application) applicationContext2).registerActivityLifecycleCallbacks(new defpackage.e21(f21Var));
        return f21Var;
    }
}
