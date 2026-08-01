package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p2.C4835j;
import u2.HandlerC5068A;

/* renamed from: com.google.android.gms.internal.ads.z8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4251z8 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: A, reason: collision with root package name */
    public RunnableC3111e f35294A;

    /* renamed from: C, reason: collision with root package name */
    public long f35296C;

    /* renamed from: n, reason: collision with root package name */
    public Activity f35297n;

    /* renamed from: u, reason: collision with root package name */
    public Application f35298u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f35299v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f35300w = new AtomicBoolean(true);

    /* renamed from: x, reason: collision with root package name */
    public boolean f35301x = false;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f35302y = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f35303z = new ArrayList();

    /* renamed from: B, reason: collision with root package name */
    public boolean f35295B = false;

    public final void a(Activity activity) {
        synchronized (this.f35299v) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f35297n = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f35299v) {
            try {
                Activity activity2 = this.f35297n;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f35297n = null;
                }
                Iterator it = this.f35303z.iterator();
                while (it.hasNext()) {
                    try {
                        ((C2680Mn) it.next()).d();
                    } catch (Exception e9) {
                        C4835j.f39733C.f39743h.d("AppActivityTracker.ActivityListener.onActivityDestroyed", e9);
                        int i = u2.z.f41322b;
                        v2.i.d("", e9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.f35299v) {
            Iterator it = this.f35303z.iterator();
            while (it.hasNext()) {
                try {
                    ((C2680Mn) it.next()).c();
                } catch (Exception e9) {
                    C4835j.f39733C.f39743h.d("AppActivityTracker.ActivityListener.onActivityPaused", e9);
                    int i = u2.z.f41322b;
                    v2.i.d("", e9);
                }
            }
        }
        this.f35301x = true;
        RunnableC3111e runnableC3111e = this.f35294A;
        if (runnableC3111e != null) {
            u2.D.f41237l.removeCallbacks(runnableC3111e);
        }
        HandlerC5068A handlerC5068A = u2.D.f41237l;
        RunnableC3111e runnableC3111e2 = new RunnableC3111e(9, this);
        this.f35294A = runnableC3111e2;
        handlerC5068A.postDelayed(runnableC3111e2, this.f35296C);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity);
        this.f35301x = false;
        boolean andSet = this.f35300w.getAndSet(true);
        RunnableC3111e runnableC3111e = this.f35294A;
        if (runnableC3111e != null) {
            u2.D.f41237l.removeCallbacks(runnableC3111e);
        }
        synchronized (this.f35299v) {
            Iterator it = this.f35303z.iterator();
            while (it.hasNext()) {
                try {
                    ((C2680Mn) it.next()).b();
                } catch (Exception e9) {
                    C4835j.f39733C.f39743h.d("AppActivityTracker.ActivityListener.onActivityResumed", e9);
                    int i = u2.z.f41322b;
                    v2.i.d("", e9);
                }
            }
            if (andSet) {
                int i6 = u2.z.f41322b;
                v2.i.a("App is still foreground.");
            } else {
                Iterator it2 = this.f35302y.iterator();
                while (it2.hasNext()) {
                    try {
                        ((B8) it2.next()).e0(true);
                    } catch (Exception e10) {
                        int i9 = u2.z.f41322b;
                        v2.i.d("", e10);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
