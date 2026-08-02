package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.consent_sdk.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4351i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n, reason: collision with root package name */
    public final Activity f36453n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4359k f36454u;

    public C4351i(C4359k c4359k, Activity activity) {
        Objects.requireNonNull(c4359k);
        this.f36454u = c4359k;
        this.f36453n = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C4359k c4359k = this.f36454u;
        Dialog dialog = c4359k.f36470g;
        if (dialog == null || !c4359k.f36475m) {
            return;
        }
        dialog.setOwnerActivity(activity);
        r rVar = c4359k.f36465b;
        if (rVar != null) {
            rVar.f36511a = activity;
        }
        AtomicReference atomicReference = c4359k.f36474l;
        C4351i c4351i = (C4351i) atomicReference.getAndSet(null);
        if (c4351i != null) {
            c4351i.f36454u.f36464a.unregisterActivityLifecycleCallbacks(c4351i);
            C4351i c4351i2 = new C4351i(c4359k, activity);
            c4359k.f36464a.registerActivityLifecycleCallbacks(c4351i2);
            atomicReference.set(c4351i2);
        }
        Dialog dialog2 = c4359k.f36470g;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        if (activity != this.f36453n) {
            return;
        }
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        C4359k c4359k = this.f36454u;
        if (isChangingConfigurations && c4359k.f36475m && (dialog = c4359k.f36470g) != null) {
            dialog.dismiss();
            return;
        }
        C4364l0 c4364l0 = new C4364l0(3, "Activity is destroyed.");
        Dialog dialog2 = c4359k.f36470g;
        if (dialog2 != null) {
            dialog2.dismiss();
            c4359k.f36470g = null;
        }
        c4359k.f36465b.f36511a = null;
        C4351i c4351i = (C4351i) c4359k.f36474l.getAndSet(null);
        if (c4351i != null) {
            c4351i.f36454u.f36464a.unregisterActivityLifecycleCallbacks(c4351i);
        }
        O3.b bVar = (O3.b) c4359k.f36473k.getAndSet(null);
        if (bVar == null) {
            return;
        }
        c4359k.d(c4364l0);
        bVar.onConsentFormDismissed(c4364l0.a());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
