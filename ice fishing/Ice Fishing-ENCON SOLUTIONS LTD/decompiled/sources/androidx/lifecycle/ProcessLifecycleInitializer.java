package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements R.b {
    @Override // R.b
    public final List a() {
        return i1.r.f3416a;
    }

    @Override // R.b
    public final Object create(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        R.a c2 = R.a.c(context);
        kotlin.jvm.internal.i.d(c2, "getInstance(context)");
        if (!c2.f1702b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!h.f2471a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new g());
        }
        r rVar = r.f2488i;
        rVar.getClass();
        rVar.f2493e = new Handler();
        rVar.f2494f.d(d.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new q(rVar));
        return rVar;
    }
}
