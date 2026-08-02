package io.appmetrica.analytics.impl;

import android.app.Activity;
import defpackage.yf81;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.impl.C0747to;

/* renamed from: io.appmetrica.analytics.impl.to, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0747to {
    public final C0607p a;
    public final C0383h6 b;
    public final ActivityLifecycleListener c;
    public final ActivityLifecycleListener d;
    public final r e;
    public final C0549n f;
    public boolean g;

    public C0747to(C0607p c0607p, C0549n c0549n, C0383h6 c0383h6, r rVar) {
        this.g = false;
        this.a = c0607p;
        this.f = c0549n;
        this.b = c0383h6;
        this.e = rVar;
        final int i = 0;
        this.c = new ActivityLifecycleListener(this) { // from class: zf81
            public final /* synthetic */ C0747to b;

            {
                this.b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                int i2 = i;
                C0747to c0747to = this.b;
                switch (i2) {
                    case 0:
                        c0747to.a(activity, activityEvent);
                        break;
                    default:
                        c0747to.b(activity, activityEvent);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.d = new ActivityLifecycleListener(this) { // from class: zf81
            public final /* synthetic */ C0747to b;

            {
                this.b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                int i22 = i2;
                C0747to c0747to = this.b;
                switch (i22) {
                    case 0:
                        c0747to.a(activity, activityEvent);
                        break;
                    default:
                        c0747to.b(activity, activityEvent);
                        break;
                }
            }
        };
    }

    public final synchronized EnumC0578o a() {
        try {
            if (!this.g) {
                this.a.registerListener(this.c, ActivityEvent.RESUMED);
                this.a.registerListener(this.d, ActivityEvent.PAUSED);
                this.g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a.b;
    }

    public final void b(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C0383h6 c0383h6 = this.b;
            yf81 yf81Var = new yf81(this, activity, 1);
            c0383h6.getClass();
            V4.l().c.a().execute(new RunnableC0354g6(c0383h6, yf81Var));
        }
    }

    public C0747to(C0607p c0607p, C0549n c0549n) {
        this(c0607p, c0549n, new C0383h6(), new r());
    }

    public final void b(Activity activity, Yd yd) {
        if (this.g && this.e.a(activity, EnumC0636q.PAUSED)) {
            yd.a(activity);
        }
    }

    public final void a(Activity activity, Yd yd) {
        if (this.g && this.e.a(activity, EnumC0636q.RESUMED)) {
            yd.b(activity);
        }
    }

    public final void a(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C0383h6 c0383h6 = this.b;
            yf81 yf81Var = new yf81(this, activity, 0);
            c0383h6.getClass();
            V4.l().c.a().execute(new RunnableC0354g6(c0383h6, yf81Var));
        }
    }
}
