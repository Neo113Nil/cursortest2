package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import defpackage.ny61;
import defpackage.s2f;
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

/* loaded from: classes9.dex */
public final class E0 implements InterfaceC0677rc {
    public static volatile E0 e;
    public static volatile boolean f;
    public static volatile boolean g;
    public final Context a;
    public final C0839x0 b;
    public final FutureTask c;
    public final InterfaceC0216bc d;

    public E0(Context context) {
        this.a = context;
        C0839x0 c = V4.l().c();
        this.b = c;
        this.d = c.a(context, V4.l().g());
        this.c = new FutureTask(new s2f(1, this));
    }

    public static E0 a(Context context) {
        E0 e0;
        E0 e02 = e;
        if (e02 != null) {
            return e02;
        }
        synchronized (E0.class) {
            try {
                e0 = e;
                if (e0 == null) {
                    e0 = new E0(context);
                    e0.j();
                    V4.l().c.a().execute(new D0(e0));
                    e = e0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e0;
    }

    public static Ce c() {
        return m() ? e.d() : V4.l().b;
    }

    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    public static synchronized boolean k() {
        boolean z;
        synchronized (E0.class) {
            z = f;
        }
        return z;
    }

    public static boolean l() {
        return g;
    }

    public static synchronized boolean m() {
        boolean z;
        synchronized (E0.class) {
            E0 e0 = e;
            if (e0 != null && e0.c.isDone()) {
                z = e0.d().g() != null;
            }
        }
        return z;
    }

    public static synchronized void n() {
        synchronized (E0.class) {
            e = null;
            f = false;
            g = false;
        }
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    public static synchronized void q() {
        synchronized (E0.class) {
            f = true;
        }
    }

    public static void r() {
        g = true;
    }

    public static E0 s() {
        return e;
    }

    public static void setDataSendingEnabled(boolean z) {
        c().setDataSendingEnabled(z);
    }

    public static void setUserProfileID(String str) {
        c().setUserProfileID(str);
    }

    public final void b(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        d().a(appMetricaLibraryAdapterConfig);
        V4.l().c.a().execute(new Q1(this.a));
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        d().b(appMetricaConfig);
        V4.l().c.a().execute(new Q1(this.a));
    }

    public final String e() {
        return d().e();
    }

    public final AdvIdentifiersResult f() {
        return d().f();
    }

    public final C0189ae g() {
        return d().g();
    }

    public final C0561nb h() {
        return d().h();
    }

    public final Map<String, String> i() {
        return d().i();
    }

    public final void j() {
        L4 l4 = V4.l().c;
        defpackage.b7 b7Var = new defpackage.b7(25, this);
        l4.a.getClass();
        new InterruptionSafeThread(b7Var, "IAA-INIT_CORE-" + ThreadFactoryC0450jg.a.incrementAndGet()).start();
    }

    public final void o() {
        V4.l().t.a(this.a);
        V4.l().a(this.a).a();
        this.c.run();
    }

    public final InterfaceC0245cc p() {
        InterfaceC0245cc interfaceC0245cc;
        C0839x0 c0839x0 = this.b;
        Context context = this.a;
        InterfaceC0216bc interfaceC0216bc = this.d;
        synchronized (c0839x0) {
            try {
                if (c0839x0.d == null) {
                    if (c0839x0.a(context)) {
                        c0839x0.d = new K0();
                    } else {
                        c0839x0.d = new I0(context, interfaceC0216bc);
                    }
                }
                interfaceC0245cc = c0839x0.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0245cc;
    }

    public final InterfaceC0620pc c(ReporterConfig reporterConfig) {
        return d().c(reporterConfig);
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        this.d.a(appMetricaConfig, this);
    }

    public static void b(boolean z) {
        c().a(z, true);
    }

    public final InterfaceC0245cc d() {
        try {
            return (InterfaceC0245cc) this.c.get();
        } catch (Exception e2) {
            ny61.j(e2);
            return null;
        }
    }

    public final Y4 b() {
        return this.d.c();
    }

    public static void a(Location location) {
        c().a(location);
    }

    public static void a(boolean z) {
        c().a(z);
    }

    public static void a(String str, String str2) {
        c().a(str, str2);
    }

    public static void a(String str) {
        c().a(str);
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        d().a(deferredDeeplinkParametersListener);
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        d().a(deferredDeeplinkListener);
    }

    public final void a(ReporterConfig reporterConfig) {
        d().a(reporterConfig);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        d().a(startupParamsCallback, list);
    }

    public static synchronized void a(E0 e0) {
        synchronized (E0.class) {
            e = e0;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0677rc
    public final InterfaceC0649qc a() {
        return d().a();
    }
}
