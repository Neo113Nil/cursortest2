package com.yandex.passport.internal.ui.router;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import com.yandex.passport.R;
import com.yandex.passport.api.m2;
import com.yandex.passport.api.o2;
import com.yandex.passport.internal.properties.k0;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import defpackage.jyr;
import defpackage.ldg;
import defpackage.x6k;

/* loaded from: classes4.dex */
public final class c implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ GlobalRouterActivity a;

    public c(GlobalRouterActivity globalRouterActivity) {
        this.a = globalRouterActivity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        k0 k0Var;
        com.yandex.passport.internal.properties.v vVar;
        GlobalRouterActivity globalRouterActivity = this.a;
        x6k x6kVar = globalRouterActivity.g;
        activity.getClass();
        if (activity instanceof BouncerActivity) {
            int i = GlobalRouterActivity.i;
            if (globalRouterActivity.k()) {
                com.yandex.passport.internal.properties.l lVar = (com.yandex.passport.internal.properties.l) globalRouterActivity.d.getValue();
                o2 o2Var = (lVar == null || (k0Var = lVar.p) == null || (vVar = k0Var.n) == null) ? null : vVar.c;
                boolean z = o2Var instanceof m2;
                jyr jyrVar = globalRouterActivity.c;
                if (z) {
                    View e = ((k) jyrVar.getValue()).e();
                    int i2 = ((m2) o2Var).a;
                    ldg.I(i2, e);
                    x6kVar.setValue(new g(i2));
                } else {
                    ldg.H(R.color.passport_roundabout_background, ((k) jyrVar.getValue()).e());
                    x6kVar.setValue(h.a);
                }
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Set background for GlobalRouterActivity. BackgroundProperties is " + o2Var, 8);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        if (activity instanceof BouncerActivity) {
            int i = GlobalRouterActivity.i;
            GlobalRouterActivity globalRouterActivity = this.a;
            if (globalRouterActivity.k()) {
                View e = ((k) globalRouterActivity.c.getValue()).e();
                e.getClass();
                e.setBackgroundColor(0);
                globalRouterActivity.g.setValue(f.a);
            }
        }
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
