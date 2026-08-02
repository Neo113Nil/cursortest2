package io.appmetrica.analytics.push.impl;

import android.content.Context;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.push.TokenUpdateListener;
import io.appmetrica.analytics.push.coreutils.internal.PushServiceFacade;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import io.appmetrica.analytics.push.provider.api.PushServiceControllerProvider;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class r {
    public static volatile r i;
    public static final Object j = new Object();
    public final Context a;
    public final Object b = new Object();
    public boolean c = false;
    public C1018c2 d;
    public y2 e;
    public final C1080v f;
    public final V0 g;
    public TokenUpdateListener h;

    public r(Context context) {
        this.a = context;
        C1080v c1080v = new C1080v(context, this);
        this.f = c1080v;
        b(context);
        this.g = new V0(new C1089y(c1080v.c()));
    }

    public final void a(PushServiceControllerProvider... pushServiceControllerProviderArr) {
        C1041i1 a = a();
        a.getClass();
        try {
            if (!CoreUtils.isEmpty(a.a())) {
                if (!a.a().contains(":")) {
                    synchronized (this.b) {
                        try {
                            if (this.c) {
                                PublicLogger.INSTANCE.warning("AppMetrica Push SDK has already been initialized.", new Object[0]);
                            } else {
                                PublicLogger.INSTANCE.info("Initializing AppMetrica Push SDK", new Object[0]);
                                TrackersHub.getInstance().resumeSession();
                                TrackersHub.getInstance().pauseSession();
                                if (!ModulesFacade.isActivatedForApp()) {
                                    throw new IllegalStateException("AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate. See more at https://appmetrica.io/docs/mobile-sdk-dg/push/android-initialize.html");
                                }
                                ArrayList arrayList = new ArrayList(pushServiceControllerProviderArr.length);
                                for (PushServiceControllerProvider pushServiceControllerProvider : pushServiceControllerProviderArr) {
                                    arrayList.add(pushServiceControllerProvider.getPushServiceController());
                                }
                                C1018c2 c1018c2 = new C1018c2(this.a, arrayList);
                                this.d = c1018c2;
                                this.e = new y2(this.a, c1018c2.b.keySet());
                                PushServiceFacade pushServiceFacade = PushServiceFacade.INSTANCE;
                                PushServiceFacade.initPushService(this.a);
                                this.c = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
            }
        } catch (Exception unused) {
        }
        PublicLogger.INSTANCE.info("Ignore AppMetrica Push SDK initialization from non main process", new Object[0]);
    }

    public final void b(Context context) {
        TrackersHub.getInstance().registerTracker(new C1083w(context, this.f.c()));
        Y1 y1 = Y1.b;
        y1.a.add(this.f.d());
    }

    public final L1 c() {
        C1080v c1080v = this.f;
        if (c1080v.n == null) {
            synchronized (c1080v.a) {
                try {
                    if (c1080v.n == null) {
                        c1080v.n = new L1(c1080v.p, c1080v.q, new Q1());
                    }
                } finally {
                }
            }
        }
        return c1080v.n;
    }

    public final M1 d() {
        return this.f.c();
    }

    public final R1 e() {
        C1080v c1080v = this.f;
        if (c1080v.m == null) {
            synchronized (c1080v.a) {
                try {
                    if (c1080v.m == null) {
                        c1080v.m = new R1(c1080v.p, c1080v.q, new Q1());
                    }
                } finally {
                }
            }
        }
        return c1080v.m;
    }

    public final X1 f() {
        C1080v c1080v = this.f;
        if (c1080v.i == null) {
            M1 c = c1080v.c();
            synchronized (c1080v.a) {
                try {
                    if (c1080v.i == null) {
                        c1080v.i = new X1(c);
                    }
                } finally {
                }
            }
        }
        return c1080v.i;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.b) {
            z = this.c;
        }
        return z;
    }

    public final C1056m1 b() {
        C1080v c1080v = this.f;
        if (c1080v.k == null) {
            synchronized (c1080v.a) {
                try {
                    if (c1080v.k == null) {
                        c1080v.k = new C1056m1(c1080v.p);
                    }
                } finally {
                }
            }
        }
        return c1080v.k;
    }

    public static r a(Context context) {
        if (i == null) {
            synchronized (j) {
                try {
                    if (i == null) {
                        i = new r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public final C1041i1 a() {
        C1080v c1080v = this.f;
        if (c1080v.l == null) {
            synchronized (c1080v.a) {
                try {
                    if (c1080v.l == null) {
                        c1080v.l = new C1041i1();
                    }
                } finally {
                }
            }
        }
        return c1080v.l;
    }
}
