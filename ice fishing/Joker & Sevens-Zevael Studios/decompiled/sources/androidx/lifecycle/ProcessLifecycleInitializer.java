package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements k4.b {
    @Override // k4.b
    public final List a() {
        return bc.v.f1067g;
    }

    @Override // k4.b
    public final Object b(Context context) {
        pc.j.e(context, "context");
        k4.a c3 = k4.a.c(context);
        pc.j.d(c3, "getInstance(...)");
        if (!c3.f3630b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!r.f709a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            pc.j.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new q());
        }
        f0 f0Var = f0.f667o;
        f0Var.getClass();
        f0Var.f672k = new Handler();
        f0Var.f673l.d(o.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        pc.j.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new e0(f0Var));
        return f0Var;
    }
}
