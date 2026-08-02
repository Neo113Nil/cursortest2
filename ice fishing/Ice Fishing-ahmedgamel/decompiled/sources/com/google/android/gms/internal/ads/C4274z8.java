package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import r2.C4906k;
import w2.HandlerC5139A;

/* renamed from: com.google.android.gms.internal.ads.z8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4274z8 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: A, reason: collision with root package name */
    public RunnableC3134e f36078A;

    /* renamed from: C, reason: collision with root package name */
    public long f36080C;

    /* renamed from: n, reason: collision with root package name */
    public Activity f36081n;

    /* renamed from: u, reason: collision with root package name */
    public Application f36082u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f36083v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f36084w = new AtomicBoolean(true);

    /* renamed from: x, reason: collision with root package name */
    public boolean f36085x = false;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f36086y = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f36087z = new ArrayList();

    /* renamed from: B, reason: collision with root package name */
    public boolean f36079B = false;

    public final void a(Activity activity) {
        synchronized (this.f36083v) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f36081n = activity;
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
        synchronized (this.f36083v) {
            try {
                Activity activity2 = this.f36081n;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f36081n = null;
                }
                Iterator it = this.f36087z.iterator();
                while (it.hasNext()) {
                    try {
                        ((C2717Nn) it.next()).d();
                    } catch (Exception e9) {
                        C4906k.f40186C.f40196h.d("AppActivityTracker.ActivityListener.onActivityDestroyed", e9);
                        int i = w2.z.f41712b;
                        x2.i.d("", e9);
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
        synchronized (this.f36083v) {
            Iterator it = this.f36087z.iterator();
            while (it.hasNext()) {
                try {
                    ((C2717Nn) it.next()).c();
                } catch (Exception e9) {
                    C4906k.f40186C.f40196h.d("AppActivityTracker.ActivityListener.onActivityPaused", e9);
                    int i = w2.z.f41712b;
                    x2.i.d("", e9);
                }
            }
        }
        this.f36085x = true;
        RunnableC3134e runnableC3134e = this.f36078A;
        if (runnableC3134e != null) {
            w2.D.f41627l.removeCallbacks(runnableC3134e);
        }
        HandlerC5139A handlerC5139A = w2.D.f41627l;
        RunnableC3134e runnableC3134e2 = new RunnableC3134e(9, this);
        this.f36078A = runnableC3134e2;
        handlerC5139A.postDelayed(runnableC3134e2, this.f36080C);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity);
        this.f36085x = false;
        boolean andSet = this.f36084w.getAndSet(true);
        RunnableC3134e runnableC3134e = this.f36078A;
        if (runnableC3134e != null) {
            w2.D.f41627l.removeCallbacks(runnableC3134e);
        }
        synchronized (this.f36083v) {
            Iterator it = this.f36087z.iterator();
            while (it.hasNext()) {
                try {
                    ((C2717Nn) it.next()).b();
                } catch (Exception e9) {
                    C4906k.f40186C.f40196h.d("AppActivityTracker.ActivityListener.onActivityResumed", e9);
                    int i = w2.z.f41712b;
                    x2.i.d("", e9);
                }
            }
            if (andSet) {
                int i4 = w2.z.f41712b;
                x2.i.a("App is still foreground.");
            } else {
                Iterator it2 = this.f36086y.iterator();
                while (it2.hasNext()) {
                    try {
                        ((B8) it2.next()).e0(true);
                    } catch (Exception e10) {
                        int i6 = w2.z.f41712b;
                        x2.i.d("", e10);
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
