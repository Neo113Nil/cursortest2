package com.yandex.passport.internal.warm;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.yandex.passport.internal.report.rd;
import com.yandex.passport.internal.report.reporters.m1;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import defpackage.xqn;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ WarmUpWebViewActivity a;
    public final /* synthetic */ b b;
    public final /* synthetic */ xqn c;
    public final /* synthetic */ xqn d;
    public final /* synthetic */ Handler e;

    public e(WarmUpWebViewActivity warmUpWebViewActivity, b bVar, xqn xqnVar, xqn xqnVar2, Handler handler) {
        this.a = warmUpWebViewActivity;
        this.b = bVar;
        this.c = xqnVar;
        this.d = xqnVar2;
        this.e = handler;
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
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        if (activity instanceof BouncerActivity) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "WebView onDestroy due started login", 8);
            }
            WarmUpWebViewActivity warmUpWebViewActivity = this.a;
            m1 m1Var = warmUpWebViewActivity.a;
            if (m1Var == null) {
                Intrinsics.j("reporter");
                throw null;
            }
            m1Var.p(rd.d);
            this.b.getWarmWebView().destroy();
            Runnable runnable = (Runnable) this.c.a;
            if (runnable != null) {
                this.e.removeCallbacks(runnable);
            }
            warmUpWebViewActivity.getApplication().unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) this.d.a);
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
