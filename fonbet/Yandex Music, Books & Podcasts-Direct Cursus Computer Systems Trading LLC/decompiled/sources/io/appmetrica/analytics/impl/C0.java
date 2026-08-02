package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import defpackage.b6e;
import defpackage.he0;
import defpackage.tn3;
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

/* loaded from: classes5.dex */
public final class C0 implements InterfaceC0286gc {
    public static volatile C0 e = null;
    public static volatile boolean f = false;
    public static volatile boolean g;
    public final Context a;
    public final C0707v0 b;
    public final FutureTask c;
    public final Mb d;

    public C0(@NonNull Context context) {
        this.a = context;
        C0707v0 c = R4.l().c();
        this.b = c;
        this.d = c.a(context, R4.l().g());
        this.c = new FutureTask(new tn3(0, this));
    }

    @NonNull
    public static C0 a(@NonNull Context context) {
        C0 c0;
        C0 c02 = e;
        if (c02 != null) {
            return c02;
        }
        synchronized (C0.class) {
            try {
                c0 = e;
                if (c0 == null) {
                    c0 = new C0(context);
                    c0.j();
                    R4.l().c.a().execute(new B0(c0));
                    e = c0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0;
    }

    public static InterfaceC0490ne c() {
        return m() ? e.d() : R4.l().b;
    }

    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    public static synchronized boolean k() {
        boolean z;
        synchronized (C0.class) {
            z = f;
        }
        return z;
    }

    public static boolean l() {
        return g;
    }

    public static synchronized boolean m() {
        boolean z;
        synchronized (C0.class) {
            C0 c0 = e;
            if (c0 != null && c0.c.isDone()) {
                z = c0.d().i() != null;
            }
        }
        return z;
    }

    public static synchronized void n() {
        synchronized (C0.class) {
            e = null;
            f = false;
            g = false;
        }
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    public static synchronized void q() {
        synchronized (C0.class) {
            f = true;
        }
    }

    public static void r() {
        g = true;
    }

    public static C0 s() {
        return e;
    }

    public static void setDataSendingEnabled(boolean z) {
        c().setDataSendingEnabled(z);
    }

    public static void setUserProfileID(String str) {
        c().setUserProfileID(str);
    }

    public final void b(@NonNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        d().a(appMetricaLibraryAdapterConfig);
        R4.l().c.a().execute(new Q1(this.a));
    }

    public final void d(@NonNull AppMetricaConfig appMetricaConfig) {
        d().b(appMetricaConfig);
        R4.l().c.a().execute(new Q1(this.a));
    }

    @NonNull
    public final C0256fb e() {
        return d().e();
    }

    public final String f() {
        return d().f();
    }

    public final Map<String, String> g() {
        return d().g();
    }

    @NonNull
    public final AdvIdentifiersResult h() {
        return d().h();
    }

    public final Kd i() {
        return d().i();
    }

    public final void j() {
        H4 h4 = R4.l().c;
        he0 he0Var = new he0(12, this);
        h4.a.getClass();
        new InterruptionSafeThread(he0Var, "IAA-INIT_CORE-" + Uf.a.incrementAndGet()).start();
    }

    public final void o() {
        R4.l().s.a(this.a);
        new L4(this.a).a(this.a);
        R4.l().a(this.a).a();
        this.c.run();
    }

    public final Nb p() {
        Nb nb;
        C0707v0 c0707v0 = this.b;
        Context context = this.a;
        Mb mb = this.d;
        synchronized (c0707v0) {
            try {
                if (c0707v0.d == null) {
                    if (c0707v0.a(context)) {
                        c0707v0.d = new I0();
                    } else {
                        c0707v0.d = new G0(context, mb);
                    }
                }
                nb = c0707v0.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nb;
    }

    @NonNull
    public final InterfaceC0228ec c(@NonNull ReporterConfig reporterConfig) {
        return d().c(reporterConfig);
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        this.d.a(appMetricaConfig, this);
    }

    public static void b(boolean z) {
        c().a(z, true);
    }

    public final Nb d() {
        try {
            return (Nb) this.c.get();
        } catch (Exception e2) {
            b6e.q(e2);
            return null;
        }
    }

    @NonNull
    public final U4 b() {
        return this.d.a();
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

    public static void a(@NonNull String str) {
        c().a(str);
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        d().a(deferredDeeplinkParametersListener);
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        d().a(deferredDeeplinkListener);
    }

    public final void a(@NonNull ReporterConfig reporterConfig) {
        d().a(reporterConfig);
    }

    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        d().a(startupParamsCallback, list);
    }

    public static synchronized void a(C0 c0) {
        synchronized (C0.class) {
            e = c0;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0286gc
    @NonNull
    public final InterfaceC0257fc a() {
        return d().a();
    }
}
