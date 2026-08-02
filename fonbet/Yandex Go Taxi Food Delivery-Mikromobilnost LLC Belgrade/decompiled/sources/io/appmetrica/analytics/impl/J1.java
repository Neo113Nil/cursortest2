package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import defpackage.dhv;
import defpackage.r94;
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

/* loaded from: classes9.dex */
public final class J1 extends AbstractC0611p3 {
    public final Fo e;
    public final C0582o3 f;
    public final Bq g;
    public final C0747to h;

    public J1(F0 f0, ls lsVar) {
        this(f0, new C0582o3(f0), new Fo(f0), lsVar, new Bq(f0, lsVar), C0225bl.a(), V4.l().j(), V4.l().p());
    }

    public final void a(Context context, ReporterConfig reporterConfig) {
        C0582o3 c0582o3 = this.f;
        c0582o3.f.a(context);
        c0582o3.h.a(reporterConfig);
        Bq bq = this.g;
        bq.e.a(context.getApplicationContext());
        C0225bl c0225bl = this.c;
        Context applicationContext = context.getApplicationContext();
        if (((Tk) c0225bl.a.get(reporterConfig.apiKey)) == null) {
            synchronized (c0225bl.a) {
                try {
                    if (((Tk) c0225bl.a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor a = V4.l().c.a();
                        c0225bl.b.getClass();
                        if (E0.e == null) {
                            ((Pa) a).b.post(new Zk(c0225bl, applicationContext));
                        }
                        Tk tk = new Tk(applicationContext.getApplicationContext(), str, new F0());
                        c0225bl.a.put(str, tk);
                        tk.a(reporterConfig);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        F0 f0 = this.a;
        Context applicationContext = context.getApplicationContext();
        f0.getClass();
        E0 a = E0.a(applicationContext);
        a.d().b(this.d.d(appMetricaConfig));
        Context context2 = a.a;
        ((Pa) V4.l().c.a()).execute(new Q1(context2));
    }

    public final void c(String str) {
        if (this.e.a((Void) null).a && this.f.m.a(str).a) {
            this.g.getClass();
            IHandlerExecutor a = AbstractC0611p3.a();
            ((Pa) a).b.post(new RunnableC0753u1(this, str));
        }
    }

    public final void d(String str, String str2) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        if (c0582o3.n.a(str).a) {
            this.g.getClass();
            IHandlerExecutor a = AbstractC0611p3.a();
            ((Pa) a).b.post(new RunnableC0724t1(this, str, str2));
        }
    }

    public final void e() {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0522m1(this));
    }

    public final void d(String str) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0435j1(this, str));
    }

    public J1() {
        this(V4.l().d(), new ls());
    }

    public J1(F0 f0, C0582o3 c0582o3, Fo fo, ls lsVar, Bq bq, C0225bl c0225bl, B8 b8, C0747to c0747to) {
        super(f0, lsVar, c0225bl, b8);
        this.f = c0582o3;
        this.g = bq;
        this.e = fo;
        this.h = c0747to;
    }

    public final void d() {
        c().a.a(this.h.a());
    }

    public final void c(Activity activity) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0840x1(this, activity));
    }

    public final void b(String str) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.r.a(str);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new D1(this, str));
    }

    public final void c(String str, String str2) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.r.a(str);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new E1(this, str, str2));
    }

    public final void b(Activity activity) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.c.a(activity);
        this.g.getClass();
        Intent a = Bq.a(activity);
        IHandlerExecutor a2 = AbstractC0611p3.a();
        ((Pa) a2).b.post(new RunnableC0234c1(this, a));
    }

    public final void c(boolean z) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0349g1(this, z));
    }

    public final void b(boolean z) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0407i1(this, z));
    }

    public final C0189ae c() {
        this.a.getClass();
        return E0.e.d().g();
    }

    public final void b(String str, String str2) {
        this.f.k.a(str);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0666r1(this, str, str2));
    }

    public final void c(Context context) {
        this.f.f.a(context);
        this.g.e.a(context);
        this.a.getClass();
        E0.a(context);
    }

    public final IdentifiersResult b(Context context) {
        this.f.f.a(context);
        Bq bq = this.g;
        Context applicationContext = context.getApplicationContext();
        bq.e.a(applicationContext);
        bq.f.a(applicationContext);
        return V4.l().a(context.getApplicationContext()).a();
    }

    public final void b() {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0811w1(this));
    }

    public final void b(Object... objArr) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new dhv(11, objArr));
    }

    public final void a(Activity activity) {
        this.f.a.a(null);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new C1(this, activity));
    }

    public final void a(Application application) {
        this.f.e.a(application);
        this.g.c.a(application);
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new dhv(12, this));
    }

    public final void a(String str, Map<String, Object> map) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.r.a(str);
        this.g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new F1(this, str, listFromMap));
    }

    public final void a(String str, Throwable th) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.s.a(str);
        this.g.getClass();
        if (th == null) {
            th = new C0870y2();
            th.fillInStackTrace();
        }
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new G1(this, str, th));
    }

    public final void a(String str, String str2, Throwable th) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.t.a(str);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new H1(this, str, str2, th));
    }

    public final void a(Throwable th) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.u.a(th);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new I1(this, th));
    }

    public final void a(String str) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.i.a(str);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0263d1(this, str));
    }

    public final void a(Intent intent) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.d.a(intent);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0291e1(this, intent));
    }

    public final void a(Location location) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0320f1(this, location));
    }

    public final void a(boolean z) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0378h1(this, z));
    }

    public final void a(UserProfile userProfile) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.v.a(userProfile);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0464k1(this, userProfile));
    }

    public final void a(Revenue revenue) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.w.a(revenue);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0493l1(this, revenue));
    }

    public final void a(AdRevenue adRevenue) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.x.a(adRevenue);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0551n1(this, adRevenue));
    }

    public final void a(ECommerceEvent eCommerceEvent) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.y.a(eCommerceEvent);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0580o1(this, eCommerceEvent));
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.g.a(deferredDeeplinkParametersListener);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0609p1(this, deferredDeeplinkParametersListener));
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.g.a(deferredDeeplinkListener);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0638q1(this, deferredDeeplinkListener));
    }

    public final InterfaceC0620pc a(Context context, String str) {
        C0582o3 c0582o3 = this.f;
        c0582o3.f.a(context);
        c0582o3.j.a(str);
        Bq bq = this.g;
        bq.e.a(context.getApplicationContext());
        return this.c.a(context.getApplicationContext(), str);
    }

    public final void a(Context context, AppMetricaConfig appMetricaConfig) {
        C0582o3 c0582o3 = this.f;
        c0582o3.f.a(context);
        c0582o3.b.a(appMetricaConfig);
        Bq bq = this.g;
        Context applicationContext = context.getApplicationContext();
        bq.e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            bq.d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        bq.a.getClass();
        E0 a = E0.a(applicationContext);
        a.d.a(appMetricaConfig, a);
        IHandlerExecutor a2 = AbstractC0611p3.a();
        ((Pa) a2).b.post(new r94(8, this, context, appMetricaConfig));
        this.a.getClass();
        F0.b();
    }

    public final void a(WebView webView) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.l.a(webView);
        ls lsVar = this.g.b;
        lsVar.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), "AppMetrica");
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                is isVar = new is();
                synchronized (lsVar) {
                    try {
                        PublicLogger publicLogger = lsVar.b;
                        if (publicLogger == null) {
                            lsVar.a.add(isVar);
                        } else {
                            isVar.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                lsVar.a(new js());
            }
        } catch (Throwable th) {
            lsVar.a(new ks(th));
        }
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0695s1(this));
    }

    public final String a(Context context) {
        this.f.f.a(context);
        Bq bq = this.g;
        bq.e.a(context.getApplicationContext());
        IdentifiersResult identifiersResult = (IdentifiersResult) V4.l().d(context.getApplicationContext()).b.get("appmetrica_device_id");
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final void a(String str, String str2) {
        this.f.getClass();
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0782v1(this, str, str2));
    }

    public final void a(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        C0582o3 c0582o3 = this.f;
        c0582o3.f.a(context);
        c0582o3.o.a(startupParamsCallback);
        Bq bq = this.g;
        bq.e.a(context.getApplicationContext());
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0869y1(this, context, startupParamsCallback, list));
    }

    public final void a(AnrListener anrListener) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.p.a(anrListener);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new RunnableC0898z1(this, anrListener));
    }

    public final void a(ExternalAttribution externalAttribution) {
        C0582o3 c0582o3 = this.f;
        c0582o3.a.a(null);
        c0582o3.q.a(externalAttribution);
        this.g.getClass();
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new A1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor b = V4.l().m().b();
        if (b != null) {
            b.process(objArr);
        }
    }

    public final void a(Map<Thread, StackTraceElement[]> map) {
        this.f.z.a(map);
        this.g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor a = AbstractC0611p3.a();
        ((Pa) a).b.post(new B1(this, listFromMap));
    }

    public static InterfaceC0446jc a(J1 j1) {
        return j1.c().a;
    }
}
