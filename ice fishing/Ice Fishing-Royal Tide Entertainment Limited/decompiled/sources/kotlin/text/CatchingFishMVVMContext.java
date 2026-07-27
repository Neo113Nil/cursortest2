package kotlin.text;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class CatchingFishMVVMContext implements Application.ActivityLifecycleCallbacks {
    public Activity CatchingFishDaggerWebsocket;
    public Object CatchingFishReduxKtor;
    public final int CatchingFishWorkManager;
    public boolean CatchingFishViewModelScope = false;
    public boolean CatchingFishViewModelFAB = false;
    public boolean CatchingFishLayout = false;

    public CatchingFishMVVMContext(Activity activity) {
        this.CatchingFishDaggerWebsocket = activity;
        this.CatchingFishWorkManager = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.CatchingFishDaggerWebsocket == activity) {
            this.CatchingFishDaggerWebsocket = null;
            this.CatchingFishViewModelFAB = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.CatchingFishViewModelFAB || this.CatchingFishLayout || this.CatchingFishViewModelScope) {
            return;
        }
        Object obj = this.CatchingFishReduxKtor;
        try {
            Object obj2 = CatchingFishKtorFragment.CatchingFishCoroutine.get(activity);
            if (obj2 == obj && activity.hashCode() == this.CatchingFishWorkManager) {
                CatchingFishKtorFragment.CatchingFishViewModelScope.postAtFrontOfQueue(new CatchingFishService(12, CatchingFishKtorFragment.CatchingFishSnackbar.get(activity), obj2, false));
                this.CatchingFishLayout = true;
                this.CatchingFishReduxKtor = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.CatchingFishDaggerWebsocket == activity) {
            this.CatchingFishViewModelScope = true;
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
