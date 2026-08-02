package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import defpackage.cy1;
import defpackage.sr7;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.internal.js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.js.AppMetricaJsInterface;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class J1 extends AbstractC0537p3 {
    public final C0413ko e;
    public final C0508o3 f;
    public final C0415kq g;
    public final Yn h;

    public J1(D0 d0, Rr rr) {
        this(d0, new C0508o3(d0), new C0413ko(d0), rr, new C0415kq(d0, rr), Rk.a(), R4.l().j(), R4.l().p());
    }

    public final void a(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        C0508o3 c0508o3 = this.f;
        c0508o3.f.a(context);
        c0508o3.h.a(reporterConfig);
        C0415kq c0415kq = this.g;
        c0415kq.e.a(context.getApplicationContext());
        Rk rk = this.c;
        Context applicationContext = context.getApplicationContext();
        if (((Jk) rk.a.get(reporterConfig.apiKey)) == null) {
            synchronized (rk.a) {
                try {
                    if (((Jk) rk.a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor a = R4.l().c.a();
                        rk.b.getClass();
                        if (C0.e == null) {
                            ((Ha) a).b.post(new Pk(rk, applicationContext));
                        }
                        Jk jk = new Jk(applicationContext.getApplicationContext(), str, new D0());
                        rk.a.put(str, jk);
                        jk.a(reporterConfig);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        D0 d0 = this.a;
        Context applicationContext = context.getApplicationContext();
        d0.getClass();
        C0 a = C0.a(applicationContext);
        a.d().b(this.d.a(appMetricaConfig));
        Context context2 = a.a;
        ((Ha) R4.l().c.a()).execute(new Q1(context2));
    }

    public final void c(@NonNull String str) {
        if (this.e.a((Void) null).a && this.f.n.a(str).a) {
            this.g.getClass();
            IHandlerExecutor a = AbstractC0537p3.a();
            ((Ha) a).b.post(new RunnableC0679u1(this, str));
        }
    }

    public final void d(@NonNull String str, String str2) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        if (c0508o3.o.a(str).a) {
            this.g.getClass();
            IHandlerExecutor a = AbstractC0537p3.a();
            ((Ha) a).b.post(new RunnableC0650t1(this, str, str2));
        }
    }

    public final void e(String str) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0361j1(this, str));
    }

    public final void f() {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0419l1(this));
    }

    public final void e() {
        d().a.a(this.h.a());
    }

    public final void d(@NonNull String str) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.j.a(str);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0217e1(this, str));
    }

    public J1() {
        this(R4.l().d(), new Rr());
    }

    public J1(D0 d0, C0508o3 c0508o3, C0413ko c0413ko, Rr rr, C0415kq c0415kq, Rk rk, C0744w8 c0744w8, Yn yn) {
        super(d0, rr, rk, c0744w8);
        this.f = c0508o3;
        this.g = c0415kq;
        this.e = c0413ko;
        this.h = yn;
    }

    public final void c(Activity activity) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0737w1(this, activity));
    }

    public final void b(@NonNull String str) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.s.a(str);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new D1(this, str));
    }

    public final Kd d() {
        this.a.getClass();
        return C0.e.d().i();
    }

    public final void c(@NonNull String str, String str2) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.s.a(str);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new E1(this, str, str2));
    }

    public final void b(@NonNull Activity activity) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.c.a(activity);
        this.g.getClass();
        Intent a = C0415kq.a(activity);
        IHandlerExecutor a2 = AbstractC0537p3.a();
        ((Ha) a2).b.post(new RunnableC0131b1(this, a));
    }

    public final void c(boolean z) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0275g1(this, z));
    }

    public final void b(boolean z) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0333i1(this, z));
    }

    public final String c() {
        this.a.getClass();
        C0 c0 = C0.e;
        if (c0 == null) {
            return null;
        }
        return c0.d().f();
    }

    public final void b(@NonNull String str, String str2) {
        this.f.l.a(str);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0592r1(this, str, str2));
    }

    public final void b() {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0766x1(this));
    }

    public final void b(@NonNull Object... objArr) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new sr7(23, objArr));
    }

    public final void b(@NonNull Context context) {
        this.f.f.a(context);
        this.g.e.a(context);
        this.a.getClass();
        C0.a(context);
    }

    public final void a(Activity activity) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new C1(this, activity));
    }

    public final void a(@NonNull Application application) {
        this.f.e.a(application);
        this.g.c.a(application);
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new sr7(24, this));
    }

    public final void a(@NonNull String str, Map<String, Object> map) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.s.a(str);
        this.g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new F1(this, str, listFromMap));
    }

    public final void a(@NonNull String str, Throwable th) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.t.a(str);
        this.g.getClass();
        if (th == null) {
            th = new C0795y2();
            th.fillInStackTrace();
        }
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new G1(this, str, th));
    }

    public final void a(@NonNull String str, String str2, Throwable th) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.u.a(str);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new H1(this, str, str2, th));
    }

    public final void a(@NonNull Throwable th) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.v.a(th);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new I1(this, th));
    }

    public final void a(@NonNull String str) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.i.a(str);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0160c1(this, str));
    }

    public final void a(@NonNull Intent intent) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.d.a(intent);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0189d1(this, intent));
    }

    public final void a(Location location) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0246f1(this, location));
    }

    public final void a(boolean z) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0304h1(this, z));
    }

    public final void a(@NonNull UserProfile userProfile) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.w.a(userProfile);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0390k1(this, userProfile));
    }

    public final void a(@NonNull Revenue revenue) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.x.a(revenue);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0448m1(this, revenue));
    }

    public final void a(@NonNull AdRevenue adRevenue) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.y.a(adRevenue);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0477n1(this, adRevenue));
    }

    public final void a(@NonNull ECommerceEvent eCommerceEvent) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.z.a(eCommerceEvent);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0506o1(this, eCommerceEvent));
    }

    public final void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.g.a(deferredDeeplinkParametersListener);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0535p1(this, deferredDeeplinkParametersListener));
    }

    public final void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.g.a(deferredDeeplinkListener);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0564q1(this, deferredDeeplinkListener));
    }

    @NonNull
    public final InterfaceC0228ec a(@NonNull Context context, @NonNull String str) {
        C0508o3 c0508o3 = this.f;
        c0508o3.f.a(context);
        c0508o3.k.a(str);
        C0415kq c0415kq = this.g;
        c0415kq.e.a(context.getApplicationContext());
        return this.c.a(context.getApplicationContext(), str);
    }

    public final void a(@NonNull Context context, @NonNull AppMetricaConfig appMetricaConfig) {
        C0508o3 c0508o3 = this.f;
        c0508o3.f.a(context);
        c0508o3.b.a(appMetricaConfig);
        C0415kq c0415kq = this.g;
        Context applicationContext = context.getApplicationContext();
        c0415kq.e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c0415kq.d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c0415kq.a.getClass();
        C0 a = C0.a(applicationContext);
        a.d.a(appMetricaConfig, a);
        IHandlerExecutor a2 = AbstractC0537p3.a();
        ((Ha) a2).b.post(new cy1(19, this, context, appMetricaConfig));
        this.a.getClass();
        D0.b();
    }

    public final void a(@NonNull WebView webView) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.m.a(webView);
        Rr rr = this.g.b;
        rr.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), "AppMetrica");
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                Or or = new Or();
                synchronized (rr) {
                    try {
                        PublicLogger publicLogger = rr.b;
                        if (publicLogger == null) {
                            rr.a.add(or);
                        } else {
                            or.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                rr.a(new Pr());
            }
        } catch (Throwable th) {
            rr.a(new Qr(th));
        }
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0621s1(this));
    }

    @NonNull
    public final IdentifiersResult a(@NonNull Context context) {
        this.f.f.a(context);
        C0415kq c0415kq = this.g;
        Context applicationContext = context.getApplicationContext();
        c0415kq.e.a(applicationContext);
        c0415kq.f.a(applicationContext);
        return R4.l().a(context.getApplicationContext()).a();
    }

    public final void a(@NonNull String str, String str2) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0708v1(this, str, str2));
    }

    public final void a(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        C0508o3 c0508o3 = this.f;
        c0508o3.f.a(context);
        c0508o3.p.a(startupParamsCallback);
        C0415kq c0415kq = this.g;
        c0415kq.e.a(context.getApplicationContext());
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0794y1(this, context, startupParamsCallback, list));
    }

    public final void a(@NonNull AnrListener anrListener) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.q.a(anrListener);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new RunnableC0822z1(this, anrListener));
    }

    public final void a(@NonNull ExternalAttribution externalAttribution) {
        C0508o3 c0508o3 = this.f;
        c0508o3.a.a(null);
        c0508o3.r.a(externalAttribution);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new A1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor b = R4.l().m().b();
        if (b != null) {
            b.process(objArr);
        }
    }

    public final void a(@NonNull Map<Thread, StackTraceElement[]> map) {
        this.f.A.a(map);
        this.g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor a = AbstractC0537p3.a();
        ((Ha) a).b.post(new B1(this, listFromMap));
    }

    public static Ub a(J1 j1) {
        return j1.d().a;
    }
}
