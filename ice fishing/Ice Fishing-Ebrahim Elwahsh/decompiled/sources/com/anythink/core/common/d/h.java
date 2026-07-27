package com.anythink.core.common.d;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class h implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    private static final int f12502e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f12503f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f12504g = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final int f12505h = 4;

    /* renamed from: a, reason: collision with root package name */
    int f12506a;

    /* renamed from: d, reason: collision with root package name */
    boolean f12509d;
    private int i;

    /* renamed from: c, reason: collision with root package name */
    boolean f12508c = false;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, Boolean> f12507b = new ConcurrentHashMap<>(3);

    public h(boolean z8) {
        this.f12509d = false;
        if (z8) {
            this.f12509d = true;
            a();
            s c4 = t.b().c();
            if (c4 != null && c4.a()) {
                c4.onApplicationBoot();
            }
        }
        t.b().e(z8);
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
        if (this.f12509d) {
            return;
        }
        this.f12509d = true;
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
        this.f12506a++;
        this.f12507b.put(activity.toString(), Boolean.TRUE);
        if (this.f12506a == 1 && !this.f12509d) {
            this.f12509d = true;
            a();
        }
        a(1, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        this.f12506a--;
        boolean containsKey = this.f12507b.containsKey(activity.toString());
        if (!this.f12508c && !containsKey) {
            this.f12508c = true;
            this.f12506a++;
        }
        if (containsKey) {
            try {
                this.f12507b.remove(activity.toString());
            } catch (Throwable unused) {
            }
        }
        if (this.f12506a == 0) {
            this.f12509d = false;
        }
        a(4, activity);
    }

    private void a(int i, Activity activity) {
        if (i == 1 || i == 2) {
            int i4 = this.i;
            this.i = activity != null ? activity.hashCode() : i4;
            if (i4 == 0) {
                s c4 = t.b().c();
                if (c4 != null && c4.a()) {
                    c4.onAppForegroundStatusChanged(true);
                }
                t.b().e(true);
                return;
            }
            return;
        }
        if (i != 3) {
            if (i == 4 && activity != null && activity.hashCode() == this.i) {
                this.i = 0;
                s c9 = t.b().c();
                if (c9 != null && c9.a()) {
                    c9.onAppForegroundStatusChanged(false);
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
