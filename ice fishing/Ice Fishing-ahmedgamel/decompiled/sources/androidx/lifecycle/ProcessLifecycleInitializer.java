package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import v7.C5135p;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements B0.b {
    @Override // B0.b
    public final Object create(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        B0.a c9 = B0.a.c(context);
        kotlin.jvm.internal.h.d(c9, "getInstance(context)");
        if (!c9.f95b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0500s.f5173a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        G g4 = G.f5103B;
        g4.getClass();
        g4.f5109x = new Handler();
        g4.f5110y.e(EnumC0496n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.h.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new F(g4));
        return g4;
    }

    @Override // B0.b
    public final List dependencies() {
        return C5135p.f41442n;
    }
}
