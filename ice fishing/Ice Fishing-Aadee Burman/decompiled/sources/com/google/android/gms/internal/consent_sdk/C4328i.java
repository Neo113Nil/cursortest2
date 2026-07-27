package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.consent_sdk.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4328i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n, reason: collision with root package name */
    public final Activity f35684n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4336k f35685u;

    public C4328i(C4336k c4336k, Activity activity) {
        Objects.requireNonNull(c4336k);
        this.f35685u = c4336k;
        this.f35684n = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C4336k c4336k = this.f35685u;
        Dialog dialog = c4336k.f35701g;
        if (dialog == null || !c4336k.f35706m) {
            return;
        }
        dialog.setOwnerActivity(activity);
        r rVar = c4336k.f35696b;
        if (rVar != null) {
            rVar.f35742a = activity;
        }
        AtomicReference atomicReference = c4336k.f35705l;
        C4328i c4328i = (C4328i) atomicReference.getAndSet(null);
        if (c4328i != null) {
            c4328i.f35685u.f35695a.unregisterActivityLifecycleCallbacks(c4328i);
            C4328i c4328i2 = new C4328i(c4336k, activity);
            c4336k.f35695a.registerActivityLifecycleCallbacks(c4328i2);
            atomicReference.set(c4328i2);
        }
        Dialog dialog2 = c4336k.f35701g;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        if (activity != this.f35684n) {
            return;
        }
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        C4336k c4336k = this.f35685u;
        if (isChangingConfigurations && c4336k.f35706m && (dialog = c4336k.f35701g) != null) {
            dialog.dismiss();
            return;
        }
        C4341l0 c4341l0 = new C4341l0(3, "Activity is destroyed.");
        Dialog dialog2 = c4336k.f35701g;
        if (dialog2 != null) {
            dialog2.dismiss();
            c4336k.f35701g = null;
        }
        c4336k.f35696b.f35742a = null;
        C4328i c4328i = (C4328i) c4336k.f35705l.getAndSet(null);
        if (c4328i != null) {
            c4328i.f35685u.f35695a.unregisterActivityLifecycleCallbacks(c4328i);
        }
        M3.b bVar = (M3.b) c4336k.f35704k.getAndSet(null);
        if (bVar == null) {
            return;
        }
        c4336k.d(c4341l0);
        bVar.onConsentFormDismissed(c4341l0.a());
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
