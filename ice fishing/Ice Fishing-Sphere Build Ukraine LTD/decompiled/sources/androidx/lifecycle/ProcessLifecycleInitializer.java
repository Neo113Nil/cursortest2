package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements M.b {
    @Override // M.b
    public final List a() {
        return u0.l.f3006e;
    }

    @Override // M.b
    public final Object b(Context context) {
        E0.i.e(context, "context");
        M.a c2 = M.a.c(context);
        E0.i.d(c2, "getInstance(context)");
        if (!c2.f698b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!h.f1519a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            E0.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new g());
        }
        o oVar = o.f1528m;
        oVar.getClass();
        oVar.f1533i = new Handler();
        oVar.f1534j.a(d.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        E0.i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new n(oVar));
        return oVar;
    }
}
