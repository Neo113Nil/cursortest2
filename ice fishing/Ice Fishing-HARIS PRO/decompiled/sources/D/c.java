package D;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f108a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f109b;

    /* renamed from: c, reason: collision with root package name */
    public final int f110c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f111d = false;
    public boolean e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f112f = false;

    public c(Activity activity) {
        this.f109b = activity;
        this.f110c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f109b == activity) {
            this.f109b = null;
            this.e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.e || this.f112f || this.f111d) {
            return;
        }
        Object obj = this.f108a;
        try {
            Object obj2 = d.f115c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f110c) {
                d.f118g.postAtFrontOfQueue(new b(d.f114b.get(activity), obj2, 2, false));
                this.f112f = true;
                this.f108a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f109b == activity) {
            this.f111d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
