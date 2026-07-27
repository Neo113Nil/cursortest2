package kotlin.text;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class CatchingFishRetrofitAdMob implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
        CatchingFishFirebaseDagger.CatchingFishNavigation(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
    }
}
