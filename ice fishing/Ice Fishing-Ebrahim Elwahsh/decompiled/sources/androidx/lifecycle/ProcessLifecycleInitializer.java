package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import r7.C4985p;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements B0.b {
    @Override // B0.b
    public final Object create(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        B0.a c4 = B0.a.c(context);
        kotlin.jvm.internal.h.d(c4, "getInstance(context)");
        if (!c4.f67b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0510s.f5285a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
        }
        G g9 = G.f5215B;
        g9.getClass();
        g9.f5221x = new Handler();
        g9.f5222y.e(EnumC0506n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.h.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new F(g9));
        return g9;
    }

    @Override // B0.b
    public final List dependencies() {
        return C4985p.f40358n;
    }
}
