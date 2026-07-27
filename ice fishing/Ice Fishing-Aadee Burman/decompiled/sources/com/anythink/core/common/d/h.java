package com.anythink.core.common.d;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class h implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    private static final int f12345e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f12346f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f12347g = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final int f12348h = 4;

    /* renamed from: a, reason: collision with root package name */
    int f12349a;

    /* renamed from: d, reason: collision with root package name */
    boolean f12352d;
    private int i;

    /* renamed from: c, reason: collision with root package name */
    boolean f12351c = false;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, Boolean> f12350b = new ConcurrentHashMap<>(3);

    public h(boolean z3) {
        this.f12352d = false;
        if (z3) {
            this.f12352d = true;
            a();
            s c9 = t.b().c();
            if (c9 != null && c9.a()) {
                c9.onApplicationBoot();
            }
        }
        t.b().e(z3);
    }

    private static void a() {
        com.anythink.core.common.u.e.a();
        com.anythink.core.common.u.c.a(t.b().g()).a(21, new com.anythink.core.common.h.n());
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
        a(3, activity);
        if (this.f12352d) {
            return;
        }
        this.f12352d = true;
        a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        a(2, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        this.f12349a++;
        this.f12350b.put(activity.toString(), Boolean.TRUE);
        if (this.f12349a == 1 && !this.f12352d) {
            this.f12352d = true;
            a();
        }
        a(1, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        this.f12349a--;
        boolean containsKey = this.f12350b.containsKey(activity.toString());
        if (!this.f12351c && !containsKey) {
            this.f12351c = true;
            this.f12349a++;
        }
        if (containsKey) {
            try {
                this.f12350b.remove(activity.toString());
            } catch (Throwable unused) {
            }
        }
        if (this.f12349a == 0) {
            this.f12352d = false;
        }
        a(4, activity);
    }

    private void a(int i, Activity activity) {
        if (i == 1 || i == 2) {
            int i6 = this.i;
            this.i = activity != null ? activity.hashCode() : i6;
            if (i6 == 0) {
                s c9 = t.b().c();
                if (c9 != null && c9.a()) {
                    c9.onAppForegroundStatusChanged(true);
                }
                t.b().e(true);
                return;
            }
            return;
        }
        if (i != 3) {
            if (i == 4 && activity != null && activity.hashCode() == this.i) {
                this.i = 0;
                s c10 = t.b().c();
                if (c10 != null && c10.a()) {
                    c10.onAppForegroundStatusChanged(false);
                }
                t.b().e(false);
                return;
            }
            return;
        }
        if (this.i != 0 || activity == null) {
            return;
        }
        this.i = activity.hashCode();
    }
}
