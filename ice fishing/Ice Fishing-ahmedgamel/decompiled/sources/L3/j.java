package L3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class j implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Activity f1700n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f1701u;

    public j(p pVar, Activity activity) {
        this.f1700n = activity;
        Objects.requireNonNull(pVar);
        this.f1701u = pVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.f1700n) {
            this.f1701u.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity == this.f1700n) {
            this.f1701u.c();
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
