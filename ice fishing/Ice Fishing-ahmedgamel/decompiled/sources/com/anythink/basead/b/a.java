package com.anythink.basead.b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    private static final int f6477d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f6478e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f6479f = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final int f6480g = 4;

    /* renamed from: a, reason: collision with root package name */
    int f6481a;

    /* renamed from: h, reason: collision with root package name */
    private int f6484h;

    /* renamed from: c, reason: collision with root package name */
    boolean f6483c = false;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, Boolean> f6482b = new ConcurrentHashMap<>(3);

    private void a(int i, Activity activity) {
        if (i == 2) {
            int i4 = this.f6484h;
            this.f6484h = activity != null ? activity.hashCode() : i4;
            if (i4 == 0) {
                com.anythink.basead.c.a().a(true);
            }
            com.anythink.basead.c.a().a(activity);
            return;
        }
        if (i == 3) {
            if (this.f6484h != 0 || activity == null) {
                return;
            }
            this.f6484h = activity.hashCode();
            return;
        }
        if (i == 4 && activity != null && activity.hashCode() == this.f6484h) {
            this.f6484h = 0;
            com.anythink.basead.c.a().a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        com.anythink.basead.c.a().f6834c = true;
        a(3, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        com.anythink.basead.c.a().c();
        a(2, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f6481a++;
        this.f6482b.put(activity.toString(), Boolean.TRUE);
        a(1, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        com.anythink.basead.c.a().f6833b = true;
        this.f6481a--;
        boolean containsKey = this.f6482b.containsKey(activity.toString());
        if (!this.f6483c && !containsKey) {
            this.f6483c = true;
            this.f6481a++;
        }
        if (containsKey) {
            try {
                this.f6482b.remove(activity.toString());
            } catch (Throwable unused) {
            }
        }
        a(4, activity);
    }
}
