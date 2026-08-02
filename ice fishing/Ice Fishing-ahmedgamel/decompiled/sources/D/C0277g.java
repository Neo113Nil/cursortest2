package D;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.ads.LD;

/* renamed from: D.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277g implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n, reason: collision with root package name */
    public Object f362n;

    /* renamed from: u, reason: collision with root package name */
    public Activity f363u;

    /* renamed from: v, reason: collision with root package name */
    public final int f364v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f365w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f366x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f367y = false;

    public C0277g(Activity activity) {
        this.f363u = activity;
        this.f364v = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f363u == activity) {
            this.f363u = null;
            this.f366x = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f366x || this.f367y || this.f365w) {
            return;
        }
        Object obj = this.f362n;
        try {
            Object obj2 = AbstractC0278h.f370c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f364v) {
                AbstractC0278h.f374g.postAtFrontOfQueue(new LD(3, AbstractC0278h.f369b.get(activity), obj2));
                this.f367y = true;
                this.f362n = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f363u == activity) {
            this.f365w = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
