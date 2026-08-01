package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import n0.C0308a;
import n0.InterfaceC0309b;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0309b {
    @Override // n0.InterfaceC0309b
    public final List a() {
        return u1.o.f4473a;
    }

    @Override // n0.InterfaceC0309b
    public final Object b(Context context) {
        D1.i.e(context, "context");
        C0308a c2 = C0308a.c(context);
        D1.i.d(c2, "getInstance(context)");
        if (!c2.f4112b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0099p.f2043a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            D1.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0098o());
        }
        E e = E.i;
        e.getClass();
        e.e = new Handler();
        e.f1995f.d(EnumC0096m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        D1.i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new D(e));
        return e;
    }
}
