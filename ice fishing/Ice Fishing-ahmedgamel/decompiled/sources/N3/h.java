package N3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class h implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Activity f1975n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f1976u;

    public h(m mVar, Activity activity) {
        this.f1975n = activity;
        Objects.requireNonNull(mVar);
        this.f1976u = mVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.f1975n) {
            this.f1976u.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity == this.f1975n) {
            this.f1976u.c();
        }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
