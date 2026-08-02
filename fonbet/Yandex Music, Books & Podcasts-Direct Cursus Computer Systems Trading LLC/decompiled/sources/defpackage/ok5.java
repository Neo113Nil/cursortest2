package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes5.dex */
public final class ok5 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ mh5 a;
    public final /* synthetic */ nnk b;
    public final /* synthetic */ Application c;

    public ok5(mh5 mh5Var, nnk nnkVar, Application application) {
        this.a = mh5Var;
        this.b = nnkVar;
        this.c = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        String stringExtra;
        activity.getClass();
        if (activity.isChangingConfigurations() || (stringExtra = activity.getIntent().getStringExtra("screen_id")) == null || !stringExtra.equals(this.a.a)) {
            return;
        }
        this.b.d();
        this.c.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }
}
