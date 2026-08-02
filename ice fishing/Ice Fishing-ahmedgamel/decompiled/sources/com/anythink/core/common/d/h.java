package com.anythink.core.common.d;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class h implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    private static final int f13131e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f13132f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f13133g = 3;

    /* renamed from: h, reason: collision with root package name */
    private static final int f13134h = 4;

    /* renamed from: a, reason: collision with root package name */
    int f13135a;

    /* renamed from: d, reason: collision with root package name */
    boolean f13138d;
    private int i;

    /* renamed from: c, reason: collision with root package name */
    boolean f13137c = false;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, Boolean> f13136b = new ConcurrentHashMap<>(3);

    public h(boolean z6) {
        this.f13138d = false;
        if (z6) {
            this.f13138d = true;
            a();
            s c9 = t.b().c();
            if (c9 != null && c9.a()) {
                c9.onApplicationBoot();
            }
        }
        t.b().e(z6);
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
        if (this.f13138d) {
            return;
        }
        this.f13138d = true;
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
        this.f13135a++;
        this.f13136b.put(activity.toString(), Boolean.TRUE);
        if (this.f13135a == 1 && !this.f13138d) {
            this.f13138d = true;
            a();
        }
        a(1, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        this.f13135a--;
        boolean containsKey = this.f13136b.containsKey(activity.toString());
        if (!this.f13137c && !containsKey) {
            this.f13137c = true;
            this.f13135a++;
        }
        if (containsKey) {
            try {
                this.f13136b.remove(activity.toString());
            } catch (Throwable unused) {
            }
        }
        if (this.f13135a == 0) {
            this.f13138d = false;
        }
        a(4, activity);
    }

    private void a(int i, Activity activity) {
        if (i == 1 || i == 2) {
            int i4 = this.i;
            this.i = activity != null ? activity.hashCode() : i4;
            if (i4 == 0) {
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
