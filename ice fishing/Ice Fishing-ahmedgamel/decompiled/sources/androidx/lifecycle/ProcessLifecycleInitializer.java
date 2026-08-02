package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import v7.C5125p;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements B0.b {
    @Override // B0.b
    public final Object create(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        B0.a c9 = B0.a.c(context);
        kotlin.jvm.internal.h.d(c9, "getInstance(context)");
        if (!c9.f251b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0504s.f5140a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        G g9 = G.f5070B;
        g9.getClass();
        g9.f5076x = new Handler();
        g9.f5077y.e(EnumC0500n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.h.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new F(g9));
        return g9;
    }

    @Override // B0.b
    public final List dependencies() {
        return C5125p.f41221n;
    }
}
