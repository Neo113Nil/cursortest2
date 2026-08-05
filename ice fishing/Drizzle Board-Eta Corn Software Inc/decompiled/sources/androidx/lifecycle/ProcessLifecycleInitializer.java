package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.f0;
import defpackage.f00;
import defpackage.g00;
import defpackage.m1;
import defpackage.oo;
import defpackage.ro;
import defpackage.so;
import defpackage.um;
import defpackage.wf;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements um {
    @Override // defpackage.um
    public final Object NCTxEWno(Context context) {
        context.getClass();
        f0 Ey6iv0m0 = f0.Ey6iv0m0(context);
        Ey6iv0m0.getClass();
        if (!((HashSet) Ey6iv0m0.wxUZMvaN).contains(ProcessLifecycleInitializer.class)) {
            m1.Ey6iv0m0("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!so.qoPGr6Ce.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new ro());
        }
        g00 g00Var = g00.eVhOlqcC;
        g00Var.getClass();
        g00Var.P7K7Inc8 = new Handler();
        g00Var.b2ZJblxo.wxUZMvaN(oo.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new f00(g00Var));
        return g00Var;
    }

    @Override // defpackage.um
    public final List qoPGr6Ce() {
        return wf.NCTxEWno;
    }
}
