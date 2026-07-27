package D;

import B2.RunnableC0272f;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: D.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288h implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n, reason: collision with root package name */
    public Object f522n;

    /* renamed from: u, reason: collision with root package name */
    public Activity f523u;

    /* renamed from: v, reason: collision with root package name */
    public final int f524v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f525w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f526x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f527y = false;

    public C0288h(Activity activity) {
        this.f523u = activity;
        this.f524v = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f523u == activity) {
            this.f523u = null;
            this.f526x = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f526x || this.f527y || this.f525w) {
            return;
        }
        Object obj = this.f522n;
        try {
            Object obj2 = AbstractC0289i.f530c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f524v) {
                AbstractC0289i.f534g.postAtFrontOfQueue(new RunnableC0272f(4, AbstractC0289i.f529b.get(activity), obj2));
                this.f527y = true;
                this.f522n = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f523u == activity) {
            this.f525w = true;
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
