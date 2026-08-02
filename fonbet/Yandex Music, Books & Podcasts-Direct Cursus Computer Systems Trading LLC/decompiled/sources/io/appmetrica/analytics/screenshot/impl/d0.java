package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import defpackage.c5b;
import defpackage.u13;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements Runnable {
    public final /* synthetic */ g0 a;

    public d0(g0 g0Var) {
        this.a = g0Var;
    }

    public static final Boolean a(g0 g0Var, d0 d0Var, C0946n c0946n, ActivityManager activityManager) {
        Object obj;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = c5b.a;
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
            if (Intrinsics.d(((ActivityManager.RunningServiceInfo) obj).process, "com.android.systemui:screenshot")) {
                break;
            }
        }
        if (((ActivityManager.RunningServiceInfo) obj) != null) {
            ((C0955x) g0Var.b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(g0Var.c.postDelayed(d0Var, TimeUnit.SECONDS.toMillis(c0946n.b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0946n c0946n = this.a.e;
        if (this.a.d || c0946n == null || !c0946n.a) {
            return;
        }
        SystemServiceUtils.accessSystemServiceByNameSafely(this.a.a.getContext(), "activity", "running service screenshot captor", "ActivityManager", new u13(26, this.a, this, c0946n));
    }
}
