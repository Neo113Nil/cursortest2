package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.gi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0437gi implements Ra {

    /* renamed from: a, reason: collision with root package name */
    public final C0911z0 f6082a;

    /* renamed from: b, reason: collision with root package name */
    public final Ah f6083b;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f6084c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f6085d;

    /* renamed from: e, reason: collision with root package name */
    public final ReporterConfig f6086e;

    /* renamed from: f, reason: collision with root package name */
    public final C0696qi f6087f;

    /* renamed from: g, reason: collision with root package name */
    public final Oe f6088g;

    public C0437gi(ICommonExecutor iCommonExecutor, Context context, String str) {
        this(context.getApplicationContext(), str, new C0911z0());
    }

    public static Ra a(C0911z0 c0911z0, Context context, ReporterConfig reporterConfig) {
        c0911z0.getClass();
        return C0885y0.a(context).f().c(reporterConfig);
    }

    public final void c(String str) {
        ReporterConfig build = ReporterConfig.newConfigBuilder(str).build();
        this.f6083b.getClass();
        this.f6087f.getClass();
        this.f6084c.execute(new Th(this, build));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.f6083b.getClass();
        this.f6087f.getClass();
        this.f6084c.execute(new RunnableC0360di(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this.f6088g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f6083b.getClass();
        this.f6087f.getClass();
        this.f6084c.execute(new Lh(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f6083b.getClass();
        this.f6087f.getClass();
        this.f6084c.execute(new RunnableC0334ci(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        this.f6083b.f4158h.a(adRevenue);
        this.f6087f.getClass();
        this.f6084c.execute(new Ph(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        this.f6083b.f4160j.a(map);
        this.f6087f.getClass();
        this.f6084c.execute(new Zh(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.f6083b.f4159i.a(eCommerceEvent);
        this.f6087f.getClass();
        this.f6084c.execute(new Rh(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        this.f6083b.f4152b.a(str);
        this.f6087f.getClass();
        if (th == null) {
            th = new N1();
            th.fillInStackTrace();
        }
        this.f6084c.execute(new Hh(this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f6083b.f4151a.a(str);
        this.f6087f.getClass();
        this.f6084c.execute(new RunnableC0385ei(this, str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        this.f6083b.f4157g.a(revenue);
        this.f6087f.getClass();
        this.f6084c.execute(new Oh(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        this.f6083b.f4155e.a(th);
        this.f6087f.getClass();
        this.f6084c.execute(new Jh(this, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        this.f6083b.f4156f.a(userProfile);
        this.f6087f.getClass();
        this.f6084c.execute(new Nh(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.f6083b.getClass();
        this.f6087f.getClass();
        this.f6084c.execute(new Kh(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f6083b.getClass();
        this.f6087f.getClass();
        this.f6084c.execute(new RunnableC0308bi(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z2) {
        this.f6083b.getClass();
        this.f6087f.getClass();
        this.f6084c.execute(new Sh(this, z2));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        this.f6083b.getClass();
        this.f6087f.getClass();
        this.f6084c.execute(new Wh(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.f6083b.getClass();
        this.f6087f.getClass();
        this.f6084c.execute(new Mh(this, str));
    }

    public C0437gi(Context context, String str, C0911z0 c0911z0) {
        this(context, new Ah(), c0911z0, new C0696qi(), ReporterConfig.newConfigBuilder(str).build());
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.Ua
    public final void a(Qn qn) {
        this.f6083b.f4154d.a(qn);
        this.f6087f.getClass();
        this.f6084c.execute(new Yh(this, qn));
    }

    public C0437gi(Context context, Ah ah, C0911z0 c0911z0, C0696qi c0696qi, ReporterConfig reporterConfig) {
        this(context, ah, c0911z0, c0696qi, reporterConfig, new Oe(new Qh(c0911z0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z2) {
        this.f6083b.f4158h.a(adRevenue);
        this.f6087f.getClass();
        this.f6084c.execute(new Xh(this, adRevenue, z2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.f6083b.f4151a.a(str);
        this.f6087f.getClass();
        this.f6084c.execute(new RunnableC0411fi(this, str, str2));
    }

    public C0437gi(Context context, Ah ah, C0911z0 c0911z0, C0696qi c0696qi, ReporterConfig reporterConfig, Oe oe) {
        this.f6084c = C0294b4.l().g().a();
        this.f6085d = context;
        this.f6083b = ah;
        this.f6082a = c0911z0;
        this.f6087f = c0696qi;
        this.f6086e = reporterConfig;
        this.f6088g = oe;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        this.f6083b.f4153c.a(str);
        this.f6087f.getClass();
        this.f6084c.execute(new Ih(this, str, str2, th));
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.InterfaceC0419g0
    public final void a(V v2) {
        this.f6083b.getClass();
        this.f6087f.getClass();
        this.f6084c.execute(new RunnableC0282ai(this, v2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        this.f6083b.f4151a.a(str);
        this.f6087f.getClass();
        this.f6084c.execute(new Gh(this, str, CollectionUtils.getListFromMap(map)));
    }

    public final void a(ReporterConfig reporterConfig) {
        this.f6083b.getClass();
        this.f6087f.getClass();
        this.f6084c.execute(new Uh(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        this.f6083b.getClass();
        this.f6087f.getClass();
        this.f6084c.execute(new Vh(this, moduleEvent));
    }
}
