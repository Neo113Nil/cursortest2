package Q2;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Q2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0358c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: x, reason: collision with root package name */
    public static final ComponentCallbacks2C0358c f2540x = new ComponentCallbacks2C0358c();

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f2541n = new AtomicBoolean();

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f2542u = new AtomicBoolean();

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f2543v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f2544w = false;

    public static void a(Application application) {
        ComponentCallbacks2C0358c componentCallbacks2C0358c = f2540x;
        synchronized (componentCallbacks2C0358c) {
            try {
                if (!componentCallbacks2C0358c.f2544w) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0358c);
                    application.registerComponentCallbacks(componentCallbacks2C0358c);
                    componentCallbacks2C0358c.f2544w = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z6) {
        synchronized (f2540x) {
            try {
                Iterator it = this.f2543v.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0357b) it.next()).a(z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f2542u;
        boolean compareAndSet = this.f2541n.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f2542u;
        boolean compareAndSet = this.f2541n.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f2541n.compareAndSet(false, true)) {
            this.f2542u.set(true);
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
