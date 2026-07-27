package D;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.ads.LD;

/* renamed from: D.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289h implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n, reason: collision with root package name */
    public Object f467n;

    /* renamed from: u, reason: collision with root package name */
    public Activity f468u;

    /* renamed from: v, reason: collision with root package name */
    public final int f469v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f470w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f471x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f472y = false;

    public C0289h(Activity activity) {
        this.f468u = activity;
        this.f469v = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f468u == activity) {
            this.f468u = null;
            this.f471x = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f471x || this.f472y || this.f470w) {
            return;
        }
        Object obj = this.f467n;
        try {
            Object obj2 = AbstractC0290i.f475c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f469v) {
                AbstractC0290i.f479g.postAtFrontOfQueue(new LD(5, AbstractC0290i.f474b.get(activity), obj2));
                this.f472y = true;
                this.f467n = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f468u == activity) {
            this.f470w = true;
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
