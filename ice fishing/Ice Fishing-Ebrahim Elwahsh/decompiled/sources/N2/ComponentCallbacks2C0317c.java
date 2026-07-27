package N2;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: N2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0317c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: x, reason: collision with root package name */
    public static final ComponentCallbacks2C0317c f2039x = new ComponentCallbacks2C0317c();

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f2040n = new AtomicBoolean();

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f2041u = new AtomicBoolean();

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f2042v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f2043w = false;

    public static void a(Application application) {
        ComponentCallbacks2C0317c componentCallbacks2C0317c = f2039x;
        synchronized (componentCallbacks2C0317c) {
            try {
                if (!componentCallbacks2C0317c.f2043w) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0317c);
                    application.registerComponentCallbacks(componentCallbacks2C0317c);
                    componentCallbacks2C0317c.f2043w = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z8) {
        synchronized (f2039x) {
            try {
                Iterator it = this.f2042v.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0316b) it.next()).a(z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f2041u;
        boolean compareAndSet = this.f2040n.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f2041u;
        boolean compareAndSet = this.f2040n.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f2040n.compareAndSet(false, true)) {
            this.f2041u.set(true);
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
