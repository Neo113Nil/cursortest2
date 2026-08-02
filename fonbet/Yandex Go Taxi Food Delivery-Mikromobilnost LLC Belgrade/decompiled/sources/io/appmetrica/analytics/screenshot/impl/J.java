package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import defpackage.i3f;
import defpackage.jl40;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class J implements Runnable {
    public final /* synthetic */ M a;

    public J(M m) {
        this.a = m;
    }

    public static final Boolean a(M m, J j, C1107l c1107l, ActivityManager activityManager) {
        Object obj;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = EmptyList.a;
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
            if (jl40.l(((ActivityManager.RunningServiceInfo) obj).process, "com.android.systemui:screenshot")) {
                break;
            }
        }
        if (((ActivityManager.RunningServiceInfo) obj) != null) {
            ((C1115u) m.b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(m.c.postDelayed(j, TimeUnit.SECONDS.toMillis(c1107l.b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1107l c1107l = this.a.e;
        if (this.a.d || c1107l == null || !c1107l.a) {
            return;
        }
        SystemServiceUtils.accessSystemServiceByNameSafely(this.a.a.getContext(), "activity", "running service screenshot captor", "ActivityManager", new i3f(5, this.a, this, c1107l));
    }
}
