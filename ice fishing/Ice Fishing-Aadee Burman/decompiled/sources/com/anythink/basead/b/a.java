package com.anythink.basead.b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    private static final int f5691d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f5692e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f5693f = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final int f5694g = 4;

    /* renamed from: a, reason: collision with root package name */
    int f5695a;

    /* renamed from: h, reason: collision with root package name */
    private int f5698h;

    /* renamed from: c, reason: collision with root package name */
    boolean f5697c = false;

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, Boolean> f5696b = new ConcurrentHashMap<>(3);

    private void a(int i, Activity activity) {
        if (i == 2) {
            int i6 = this.f5698h;
            this.f5698h = activity != null ? activity.hashCode() : i6;
            if (i6 == 0) {
                com.anythink.basead.c.a().a(true);
            }
            com.anythink.basead.c.a().a(activity);
            return;
        }
        if (i == 3) {
            if (this.f5698h != 0 || activity == null) {
                return;
            }
            this.f5698h = activity.hashCode();
            return;
        }
        if (i == 4 && activity != null && activity.hashCode() == this.f5698h) {
            this.f5698h = 0;
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
        com.anythink.basead.c.a().f6048c = true;
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
        this.f5695a++;
        this.f5696b.put(activity.toString(), Boolean.TRUE);
        a(1, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        com.anythink.basead.c.a().f6047b = true;
        this.f5695a--;
        boolean containsKey = this.f5696b.containsKey(activity.toString());
        if (!this.f5697c && !containsKey) {
            this.f5697c = true;
            this.f5695a++;
        }
        if (containsKey) {
            try {
                this.f5696b.remove(activity.toString());
            } catch (Throwable unused) {
            }
        }
        a(4, activity);
    }
}
