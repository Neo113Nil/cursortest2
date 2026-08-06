package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.screenshot.impl.d0;
import io.appmetrica.analytics.screenshot.impl.g0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f7637a;

    public d0(g0 g0Var) {
        this.f7637a = g0Var;
    }

    public static final Boolean a(g0 g0Var, d0 d0Var, C0948n c0948n, ActivityManager activityManager) {
        Object obj;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = i1.r.f3416a;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
        }
        Iterator<T> it = runningServices.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.i.a(((ActivityManager.RunningServiceInfo) obj).process, "com.android.systemui:screenshot")) {
                break;
            }
        }
        if (((ActivityManager.RunningServiceInfo) obj) != null) {
            ((C0957x) g0Var.f7642b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(g0Var.f7643c.postDelayed(d0Var, TimeUnit.SECONDS.toMillis(c0948n.f7668b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C0948n c0948n = this.f7637a.f7645e;
        if (this.f7637a.f7644d || c0948n == null || !c0948n.f7667a) {
            return;
        }
        Context context = this.f7637a.f7641a.getContext();
        final g0 g0Var = this.f7637a;
        SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "running service screenshot captor", "ActivityManager", new FunctionWithThrowable() { // from class: N0.c
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return d0.a(g0.this, this, c0948n, (ActivityManager) obj);
            }
        });
    }
}
