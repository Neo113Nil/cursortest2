package io.flutter.plugins.camerax;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import defpackage.pey;

/* loaded from: classes4.dex */
public class ProxyLifecycleProvider implements Application.ActivityLifecycleCallbacks, pey {
    public t lifecycle = new t(this, true);
    private final int registrarActivityHashCode;

    public ProxyLifecycleProvider(Activity activity) {
        this.registrarActivityHashCode = activity.hashCode();
        activity.getApplication().registerActivityLifecycleCallbacks(this);
    }

    @Override // defpackage.pey
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.hashCode() != this.registrarActivityHashCode) {
            return;
        }
        this.lifecycle.g(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (activity.hashCode() != this.registrarActivityHashCode) {
            return;
        }
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        this.lifecycle.g(Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (activity.hashCode() != this.registrarActivityHashCode) {
            return;
        }
        this.lifecycle.g(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (activity.hashCode() != this.registrarActivityHashCode) {
            return;
        }
        this.lifecycle.g(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (activity.hashCode() != this.registrarActivityHashCode) {
            return;
        }
        this.lifecycle.g(Lifecycle.Event.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (activity.hashCode() != this.registrarActivityHashCode) {
            return;
        }
        this.lifecycle.g(Lifecycle.Event.ON_STOP);
    }
}
