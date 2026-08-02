package ru.yandex.taxi.logistics.sdk.ui;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import defpackage.bvf0;
import defpackage.i22;
import defpackage.i3y;
import defpackage.n4u0;
import defpackage.pz40;
import defpackage.y30;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR!\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/yandex/taxi/logistics/sdk/ui/AppVisibilitySubscriptionImpl;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Ly30;", "contextProvider", "<init>", "(Ly30;)V", "Lzy11;", "updateState", "()V", "Ln4u0;", "Lru/yandex/taxi/logistics/sdk/ui/AppVisibilitySubscription$State;", "observe", "()Ln4u0;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "p1", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityStopped", "onActivityResumed", "onActivityPaused", "bundle", "onActivitySaveInstanceState", "onActivityDestroyed", "Ly30;", "", "activityCounter", CA20Status.STATUS_USER_I, "Lpz40;", "state$delegate", "Li3y;", "getState", "()Lpz40;", ClidProvider.STATE, "sdk-core-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AppVisibilitySubscriptionImpl implements Application.ActivityLifecycleCallbacks {
    private int activityCounter;
    private final y30 contextProvider;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final i3y state = kotlin.a.a(new i22(24));

    public AppVisibilitySubscriptionImpl(y30 y30Var) {
        this.contextProvider = y30Var;
    }

    private final pz40 getState() {
        return (pz40) this.state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pz40 state_delegate$lambda$0() {
        return bvf0.c(AppVisibilitySubscription$State.FOREGROUND);
    }

    private final void updateState() {
        ((r0) getState()).l(this.activityCounter > 0 ? AppVisibilitySubscription$State.FOREGROUND : AppVisibilitySubscription$State.BACKGROUND);
    }

    public n4u0 observe() {
        return e.d(getState());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle p1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        y30 y30Var = this.contextProvider;
        if (y30Var != null) {
            y30Var.b = activity;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        int i = this.activityCounter + 1;
        if (i < 0) {
            i = 0;
        }
        this.activityCounter = i;
        updateState();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        y30 y30Var;
        int i = this.activityCounter - 1;
        if (i < 0) {
            i = 0;
        }
        this.activityCounter = i;
        updateState();
        if (this.activityCounter > 0 || (y30Var = this.contextProvider) == null) {
            return;
        }
        y30Var.b = null;
    }
}
