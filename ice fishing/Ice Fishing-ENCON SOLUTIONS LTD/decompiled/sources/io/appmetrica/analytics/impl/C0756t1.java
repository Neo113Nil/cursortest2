package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
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

/* renamed from: io.appmetrica.analytics.impl.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0756t1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0911z0 f6922a;

    /* renamed from: b, reason: collision with root package name */
    public final Ho f6923b;

    /* renamed from: c, reason: collision with root package name */
    public final C0644oi f6924c;

    /* renamed from: d, reason: collision with root package name */
    public final D7 f6925d;

    /* renamed from: e, reason: collision with root package name */
    public final C0466hl f6926e;

    /* renamed from: f, reason: collision with root package name */
    public final A2 f6927f;

    /* renamed from: g, reason: collision with root package name */
    public final C0442gn f6928g;

    /* renamed from: h, reason: collision with root package name */
    public final Wk f6929h;

    public C0756t1(C0911z0 c0911z0, A2 a2, C0466hl c0466hl, Ho ho, C0442gn c0442gn, C0644oi c0644oi, D7 d7, Wk wk) {
        this.f6922a = c0911z0;
        this.f6923b = ho;
        this.f6924c = c0644oi;
        this.f6925d = d7;
        this.f6927f = a2;
        this.f6928g = c0442gn;
        this.f6926e = c0466hl;
        this.f6929h = wk;
    }

    public static IHandlerExecutor c() {
        return C0294b4.l().f5584c.a();
    }

    public final void a(Context context, AppMetricaConfig appMetricaConfig) {
        A2 a2 = this.f6927f;
        a2.f4102f.a(context);
        a2.f4098b.a(appMetricaConfig);
        C0442gn c0442gn = this.f6928g;
        Context applicationContext = context.getApplicationContext();
        c0442gn.f6103e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c0442gn.f6102d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c0442gn.f6099a.getClass();
        C0885y0 a3 = C0885y0.a(applicationContext);
        a3.f7222d.a(appMetricaConfig, a3);
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new F0.b(this, context, appMetricaConfig, 4));
        this.f6922a.getClass();
        C0911z0.b();
    }

    public final String b() {
        this.f6922a.getClass();
        C0885y0 c0885y0 = C0885y0.f7216e;
        if (c0885y0 == null) {
            return null;
        }
        return c0885y0.f().e();
    }

    public final C0508jc d() {
        this.f6922a.getClass();
        return C0885y0.f7216e.f().i();
    }

    public final void e() {
        d().f6277a.a(this.f6929h.a());
    }

    public final void f() {
        this.f6927f.f4097a.a(null);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new W0(this));
    }

    public final void c(Activity activity) {
        this.f6927f.f4097a.a(null);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0446h1(this, activity));
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        C0911z0 c0911z0 = this.f6922a;
        Context applicationContext = context.getApplicationContext();
        c0911z0.getClass();
        C0885y0 a2 = C0885y0.a(applicationContext);
        a2.f().b(this.f6925d.a(appMetricaConfig));
        Context context2 = a2.f7219a;
        ((C0920z9) C0294b4.l().f5584c.a()).execute(new RunnableC0834w1(context2));
    }

    public final void d(String str) {
        this.f6927f.getClass();
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new T0(this, str));
    }

    public C0756t1() {
        this(C0294b4.l().d(), new Ho());
    }

    public final void c(String str, String str2) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4114r.a(str);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0627o1(this, str, str2));
    }

    public final void d(String str, String str2) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        if (a2.f4110n.a(str).f6792a) {
            this.f6928g.getClass();
            IHandlerExecutor c2 = c();
            ((C0920z9) c2).f7271b.post(new RunnableC0343d1(this, str, str2));
        }
    }

    public C0756t1(C0911z0 c0911z0, Ho ho) {
        this(c0911z0, new A2(c0911z0), new C0466hl(c0911z0), ho, new C0442gn(c0911z0, ho), C0644oi.a(), C0294b4.l().j(), C0294b4.l().o());
    }

    public final void b(String str) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4114r.a(str);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0601n1(this, str));
    }

    public final void c(boolean z2) {
        this.f6927f.getClass();
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new Q0(this, z2));
    }

    public final void a(Activity activity) {
        this.f6927f.f4097a.a(null);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0575m1(this, activity));
    }

    public final void b(Activity activity) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4099c.a(activity);
        this.f6928g.getClass();
        Intent a3 = C0442gn.a(activity);
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new M0(this, a3));
    }

    public final void c(String str) {
        if (this.f6926e.a((Void) null).f6792a && this.f6927f.f4109m.a(str).f6792a) {
            this.f6928g.getClass();
            IHandlerExecutor c2 = c();
            ((C0920z9) c2).f7271b.post(new RunnableC0368e1(this, str));
        }
    }

    public final void a(Application application) {
        this.f6927f.f4101e.a(application);
        this.f6928g.f6101c.a(application);
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new F0.a(7, this));
    }

    public final void b(boolean z2) {
        this.f6927f.getClass();
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new S0(this, z2));
    }

    public final void b(String str, String str2) {
        this.f6927f.f4107k.a(str);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0291b1(this, str, str2));
    }

    public final void a(String str, Map<String, Object> map) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4114r.a(str);
        this.f6928g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0653p1(this, str, listFromMap));
    }

    public final void b(Object... objArr) {
        this.f6927f.f4097a.a(null);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new F0.a(8, objArr));
    }

    public final void a(String str, Throwable th) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4115s.a(str);
        this.f6928g.getClass();
        if (th == null) {
            th = new N1();
            th.fillInStackTrace();
        }
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0679q1(this, str, th));
    }

    public final void b(Context context) {
        this.f6927f.f4102f.a(context);
        this.f6928g.f6103e.a(context);
        this.f6922a.getClass();
        C0885y0.a(context);
    }

    public final void a(String str, String str2, Throwable th) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.t.a(str);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0704r1(this, str, str2, th));
    }

    public final void a(Throwable th) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4116u.a(th);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0730s1(this, th));
    }

    public final void a(String str) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4105i.a(str);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new N0(this, str));
    }

    public final void a(Intent intent) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4100d.a(intent);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new O0(this, intent));
    }

    public final void a(Location location) {
        this.f6927f.getClass();
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new P0(this, location));
    }

    public final void a(boolean z2) {
        this.f6927f.getClass();
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new R0(this, z2));
    }

    public final void a(UserProfile userProfile) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4117v.a(userProfile);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new U0(this, userProfile));
    }

    public final void a(Revenue revenue) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4118w.a(revenue);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new V0(this, revenue));
    }

    public final void a(AdRevenue adRevenue) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4119x.a(adRevenue);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new X0(this, adRevenue));
    }

    public final void a(ECommerceEvent eCommerceEvent) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4120y.a(eCommerceEvent);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new Y0(this, eCommerceEvent));
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4103g.a(deferredDeeplinkParametersListener);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new Z0(this, deferredDeeplinkParametersListener));
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4103g.a(deferredDeeplinkListener);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0265a1(this, deferredDeeplinkListener));
    }

    public final Ra a(Context context, String str) {
        A2 a2 = this.f6927f;
        a2.f4102f.a(context);
        a2.f4106j.a(str);
        C0442gn c0442gn = this.f6928g;
        c0442gn.f6103e.a(context.getApplicationContext());
        return this.f6924c.a(context.getApplicationContext(), str);
    }

    public final void a(Context context, ReporterConfig reporterConfig) {
        A2 a2 = this.f6927f;
        a2.f4102f.a(context);
        a2.f4104h.a(reporterConfig);
        C0442gn c0442gn = this.f6928g;
        c0442gn.f6103e.a(context.getApplicationContext());
        C0644oi c0644oi = this.f6924c;
        Context applicationContext = context.getApplicationContext();
        if (((C0437gi) c0644oi.f6687a.get(reporterConfig.apiKey)) == null) {
            synchronized (c0644oi.f6687a) {
                try {
                    if (((C0437gi) c0644oi.f6687a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor a3 = C0294b4.l().f5584c.a();
                        c0644oi.f6688b.getClass();
                        if (C0885y0.f7216e == null) {
                            ((C0920z9) a3).f7271b.post(new RunnableC0592mi(c0644oi, applicationContext));
                        }
                        C0437gi c0437gi = new C0437gi(applicationContext.getApplicationContext(), str, new C0911z0());
                        c0644oi.f6687a.put(str, c0437gi);
                        c0437gi.a(reporterConfig);
                    }
                } finally {
                }
            }
        }
    }

    public final void a(WebView webView) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4108l.a(webView);
        Ho ho = this.f6928g.f6100b;
        ho.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), "AppMetrica");
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                Eo eo = new Eo();
                synchronized (ho) {
                    try {
                        PublicLogger publicLogger = ho.f4490b;
                        if (publicLogger == null) {
                            ho.f4489a.add(eo);
                        } else {
                            eo.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                ho.a(new Fo());
            }
        } catch (Throwable th) {
            ho.a(new Go(th));
        }
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0317c1(this));
    }

    public final IdentifiersResult a(Context context) {
        this.f6927f.f4102f.a(context);
        C0442gn c0442gn = this.f6928g;
        Context applicationContext = context.getApplicationContext();
        c0442gn.f6103e.a(applicationContext);
        c0442gn.f6104f.a(applicationContext);
        return C0294b4.l().a(context.getApplicationContext()).a();
    }

    public final void a(String str, String str2) {
        this.f6927f.getClass();
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0394f1(this, str, str2));
    }

    public final void a() {
        this.f6927f.getClass();
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0420g1(this));
    }

    public final void a(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        A2 a2 = this.f6927f;
        a2.f4102f.a(context);
        a2.f4111o.a(startupParamsCallback);
        C0442gn c0442gn = this.f6928g;
        c0442gn.f6103e.a(context.getApplicationContext());
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0472i1(this, context, startupParamsCallback, list));
    }

    public final void a(AnrListener anrListener) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4112p.a(anrListener);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0497j1(this, anrListener));
    }

    public final void a(ExternalAttribution externalAttribution) {
        A2 a2 = this.f6927f;
        a2.f4097a.a(null);
        a2.f4113q.a(externalAttribution);
        this.f6928g.getClass();
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0523k1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor b2 = C0294b4.l().m().b();
        if (b2 != null) {
            b2.process(objArr);
        }
    }

    public final void a(Map<Thread, StackTraceElement[]> map) {
        this.f6927f.f4121z.a(map);
        this.f6928g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor c2 = c();
        ((C0920z9) c2).f7271b.post(new RunnableC0549l1(this, listFromMap));
    }

    public static Ia a(C0756t1 c0756t1) {
        return c0756t1.d().f6277a;
    }
}
