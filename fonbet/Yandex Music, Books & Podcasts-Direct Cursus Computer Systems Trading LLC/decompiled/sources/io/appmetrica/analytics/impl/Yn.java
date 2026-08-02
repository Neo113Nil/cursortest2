package io.appmetrica.analytics.impl;

import android.app.Activity;
import defpackage.obw;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.impl.Yn;

/* loaded from: classes5.dex */
public final class Yn {
    public final C0533p a;
    public final C0222e6 b;
    public final ActivityLifecycleListener c;
    public final ActivityLifecycleListener d;
    public final r e;
    public final C0475n f;
    public boolean g;

    public Yn(C0533p c0533p, C0475n c0475n, C0222e6 c0222e6, r rVar) {
        this.g = false;
        this.a = c0533p;
        this.f = c0475n;
        this.b = c0222e6;
        this.e = rVar;
        final int i = 0;
        this.c = new ActivityLifecycleListener(this) { // from class: pbw
            public final /* synthetic */ Yn b;

            {
                this.b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                switch (i) {
                    case 0:
                        this.b.a(activity, activityEvent);
                        break;
                    default:
                        this.b.b(activity, activityEvent);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.d = new ActivityLifecycleListener(this) { // from class: pbw
            public final /* synthetic */ Yn b;

            {
                this.b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                switch (i2) {
                    case 0:
                        this.b.a(activity, activityEvent);
                        break;
                    default:
                        this.b.b(activity, activityEvent);
                        break;
                }
            }
        };
    }

    public final synchronized EnumC0504o a() {
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
            C0222e6 c0222e6 = this.b;
            obw obwVar = new obw(this, activity, 0);
            c0222e6.getClass();
            R4.l().c.a().execute(new RunnableC0194d6(c0222e6, obwVar));
        }
    }

    public Yn(C0533p c0533p, C0475n c0475n) {
        this(c0533p, c0475n, new C0222e6(), new r());
    }

    public final void b(Activity activity, Id id) {
        if (this.g && this.e.a(activity, EnumC0562q.PAUSED)) {
            id.b(activity);
        }
    }

    public final void a(Activity activity, Id id) {
        if (this.g && this.e.a(activity, EnumC0562q.RESUMED)) {
            id.a(activity);
        }
    }

    public final void a(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C0222e6 c0222e6 = this.b;
            obw obwVar = new obw(this, activity, 1);
            c0222e6.getClass();
            R4.l().c.a().execute(new RunnableC0194d6(c0222e6, obwVar));
        }
    }
}
