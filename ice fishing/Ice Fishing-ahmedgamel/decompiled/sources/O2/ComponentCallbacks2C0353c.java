package O2;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: O2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0353c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: x, reason: collision with root package name */
    public static final ComponentCallbacks2C0353c f2222x = new ComponentCallbacks2C0353c();

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f2223n = new AtomicBoolean();

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f2224u = new AtomicBoolean();

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f2225v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f2226w = false;

    public static void a(Application application) {
        ComponentCallbacks2C0353c componentCallbacks2C0353c = f2222x;
        synchronized (componentCallbacks2C0353c) {
            try {
                if (!componentCallbacks2C0353c.f2226w) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0353c);
                    application.registerComponentCallbacks(componentCallbacks2C0353c);
                    componentCallbacks2C0353c.f2226w = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z3) {
        synchronized (f2222x) {
            try {
                Iterator it = this.f2225v.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0352b) it.next()).a(z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f2224u;
        boolean compareAndSet = this.f2223n.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f2224u;
        boolean compareAndSet = this.f2223n.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f2223n.compareAndSet(false, true)) {
            this.f2224u.set(true);
            b(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
