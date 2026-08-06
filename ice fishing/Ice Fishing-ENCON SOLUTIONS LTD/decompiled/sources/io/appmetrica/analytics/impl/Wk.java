package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* loaded from: classes.dex */
public final class Wk {

    /* renamed from: a, reason: collision with root package name */
    public final C0625o f5314a;

    /* renamed from: b, reason: collision with root package name */
    public final C0579m5 f5315b;

    /* renamed from: c, reason: collision with root package name */
    public final ActivityLifecycleListener f5316c;

    /* renamed from: d, reason: collision with root package name */
    public final ActivityLifecycleListener f5317d;

    /* renamed from: e, reason: collision with root package name */
    public final C0677q f5318e;

    /* renamed from: f, reason: collision with root package name */
    public final C0573m f5319f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5320g;

    public Wk(C0625o c0625o, C0573m c0573m) {
        this(c0625o, c0573m, new C0579m5(), new C0677q());
    }

    public final void a(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C0579m5 c0579m5 = this.f5315b;
            Vo vo = new Vo(this, activity, 0);
            c0579m5.getClass();
            C0294b4.l().f5584c.a().execute(new RunnableC0553l5(c0579m5, vo));
        }
    }

    public final void b(Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C0579m5 c0579m5 = this.f5315b;
            Vo vo = new Vo(this, activity, 1);
            c0579m5.getClass();
            C0294b4.l().f5584c.a().execute(new RunnableC0553l5(c0579m5, vo));
        }
    }

    public Wk(C0625o c0625o, C0573m c0573m, C0579m5 c0579m5, C0677q c0677q) {
        this.f5320g = false;
        this.f5314a = c0625o;
        this.f5319f = c0573m;
        this.f5315b = c0579m5;
        this.f5318e = c0677q;
        final int i2 = 0;
        this.f5316c = new ActivityLifecycleListener(this) { // from class: io.appmetrica.analytics.impl.Uo

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Wk f5186b;

            {
                this.f5186b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                switch (i2) {
                    case 0:
                        this.f5186b.a(activity, activityEvent);
                        break;
                    default:
                        this.f5186b.b(activity, activityEvent);
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f5317d = new ActivityLifecycleListener(this) { // from class: io.appmetrica.analytics.impl.Uo

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Wk f5186b;

            {
                this.f5186b = this;
            }

            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                switch (i3) {
                    case 0:
                        this.f5186b.a(activity, activityEvent);
                        break;
                    default:
                        this.f5186b.b(activity, activityEvent);
                        break;
                }
            }
        };
    }

    public final void a(Activity activity, C0457hc c0457hc) {
        if (this.f5320g && this.f5318e.a(activity, EnumC0651p.RESUMED)) {
            c0457hc.a(activity);
        }
    }

    public final void b(Activity activity, C0457hc c0457hc) {
        if (this.f5320g && this.f5318e.a(activity, EnumC0651p.PAUSED)) {
            c0457hc.b(activity);
        }
    }

    public final synchronized EnumC0599n a() {
        try {
            if (!this.f5320g) {
                this.f5314a.registerListener(this.f5316c, ActivityEvent.RESUMED);
                this.f5314a.registerListener(this.f5317d, ActivityEvent.PAUSED);
                this.f5320g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f5314a.f6638b;
    }
}
