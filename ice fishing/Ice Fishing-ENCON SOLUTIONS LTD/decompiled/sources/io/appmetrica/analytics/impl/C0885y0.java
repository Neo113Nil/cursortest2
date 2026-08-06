package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

/* renamed from: io.appmetrica.analytics.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0885y0 implements Ta {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0885y0 f7216e = null;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f7217f = false;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f7218g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f7219a;

    /* renamed from: b, reason: collision with root package name */
    public final C0703r0 f7220b;

    /* renamed from: c, reason: collision with root package name */
    public final FutureTask f7221c;

    /* renamed from: d, reason: collision with root package name */
    public final Ba f7222d;

    public C0885y0(Context context) {
        this.f7219a = context;
        C0703r0 c2 = C0294b4.l().c();
        this.f7220b = c2;
        this.f7222d = c2.a(context, C0294b4.l().g());
        this.f7221c = new FutureTask(new Ro(1, this));
    }

    public static C0885y0 a(Context context) {
        C0885y0 c0885y0 = f7216e;
        if (c0885y0 == null) {
            synchronized (C0885y0.class) {
                try {
                    c0885y0 = f7216e;
                    if (c0885y0 == null) {
                        c0885y0 = new C0885y0(context);
                        c0885y0.j();
                        C0294b4.l().f5584c.a().execute(new RunnableC0859x0(c0885y0));
                        f7216e = c0885y0;
                    }
                } finally {
                }
            }
        }
        return c0885y0;
    }

    public static void b(boolean z2) {
        c().a(z2, true);
    }

    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    public static synchronized boolean k() {
        boolean z2;
        synchronized (C0885y0.class) {
            z2 = f7217f;
        }
        return z2;
    }

    public static boolean l() {
        return f7218g;
    }

    public static synchronized boolean m() {
        boolean z2;
        synchronized (C0885y0.class) {
            C0885y0 c0885y0 = f7216e;
            if (c0885y0 != null && c0885y0.f7221c.isDone()) {
                z2 = c0885y0.f().i() != null;
            }
        }
        return z2;
    }

    public static synchronized void n() {
        synchronized (C0885y0.class) {
            f7216e = null;
            f7217f = false;
            f7218g = false;
        }
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    public static synchronized void q() {
        synchronized (C0885y0.class) {
            f7217f = true;
        }
    }

    public static void r() {
        f7218g = true;
    }

    public static C0885y0 s() {
        return f7216e;
    }

    public static void setDataSendingEnabled(boolean z2) {
        c().setDataSendingEnabled(z2);
    }

    public static void setUserProfileID(String str) {
        c().setUserProfileID(str);
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        this.f7222d.a(appMetricaConfig, this);
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        f().b(appMetricaConfig);
        C0294b4.l().f5584c.a().execute(new RunnableC0834w1(this.f7219a));
    }

    public final String e() {
        return f().e();
    }

    public final Ca f() {
        try {
            return (Ca) this.f7221c.get();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public final Map<String, String> g() {
        return f().g();
    }

    public final AdvIdentifiersResult h() {
        return f().h();
    }

    public final C0508jc i() {
        return f().i();
    }

    public final void j() {
        R3 r3 = C0294b4.l().f5584c;
        F0.a aVar = new F0.a(9, this);
        r3.f4979a.getClass();
        new InterruptionSafeThread(aVar, "IAA-INIT_CORE-" + ThreadFactoryC0924zd.f7275a.incrementAndGet()).start();
    }

    public final void o() {
        C0294b4.l().f5599r.a(this.f7219a);
        new V3(this.f7219a).a(this.f7219a);
        C0294b4.l().a(this.f7219a).a();
        this.f7221c.run();
    }

    public final Ca p() {
        Ca ca;
        C0703r0 c0703r0 = this.f7220b;
        Context context = this.f7219a;
        Ba ba = this.f7222d;
        synchronized (c0703r0) {
            try {
                if (c0703r0.f6800d == null) {
                    if (c0703r0.a(context)) {
                        c0703r0.f6800d = new E0();
                    } else {
                        c0703r0.f6800d = new C0(context, ba);
                    }
                }
                ca = c0703r0.f6800d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ca;
    }

    public final void b(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        f().a(appMetricaLibraryAdapterConfig);
        C0294b4.l().f5584c.a().execute(new RunnableC0834w1(this.f7219a));
    }

    public final Ra c(ReporterConfig reporterConfig) {
        return f().c(reporterConfig);
    }

    public static Hc c() {
        if (m()) {
            return f7216e.f();
        }
        return C0294b4.l().f5583b;
    }

    public final X9 d() {
        return f().d();
    }

    public final C0371e4 b() {
        return this.f7222d.a();
    }

    public static void a(Location location) {
        c().a(location);
    }

    public static void a(boolean z2) {
        c().a(z2);
    }

    public static void a(String str, String str2) {
        c().a(str, str2);
    }

    public static void a(String str) {
        c().a(str);
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        f().a(deferredDeeplinkParametersListener);
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        f().a(deferredDeeplinkListener);
    }

    public final void a(ReporterConfig reporterConfig) {
        f().a(reporterConfig);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        f().a(startupParamsCallback, list);
    }

    public static synchronized void a(C0885y0 c0885y0) {
        synchronized (C0885y0.class) {
            f7216e = c0885y0;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final Sa a() {
        return f().a();
    }
}
