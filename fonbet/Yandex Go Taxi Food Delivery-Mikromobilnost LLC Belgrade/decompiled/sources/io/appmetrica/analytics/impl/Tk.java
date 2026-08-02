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

/* loaded from: classes9.dex */
public final class Tk implements InterfaceC0620pc {
    public final F0 a;
    public final C0570nk b;
    public final IHandlerExecutor c;
    public final Context d;
    public final ReporterConfig e;
    public final C0311el f;
    public final Bh g;

    public Tk(Context context, C0570nk c0570nk, F0 f0, C0311el c0311el, ReporterConfig reporterConfig, Bh bh) {
        this.c = V4.l().g().a();
        this.d = context;
        this.b = c0570nk;
        this.a = f0;
        this.f = c0311el;
        this.e = reporterConfig;
        this.g = bh;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0620pc, io.appmetrica.analytics.impl.InterfaceC0735tc
    public final void a(C0606or c0606or) {
        this.b.d.a(c0606or);
        this.f.getClass();
        this.c.execute(new Lk(this, c0606or));
    }

    public final void c(String str) {
        ReporterConfig build = ReporterConfig.newConfigBuilder(str).build();
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Gk(this, build));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Qk(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC0888yk(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Pk(this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        this.b.h.a(adRevenue);
        this.f.getClass();
        this.c.execute(new Ck(this, adRevenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        this.b.j.a(map);
        this.f.getClass();
        this.c.execute(new Mk(this, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.b.i.a(eCommerceEvent);
        this.f.getClass();
        this.c.execute(new Ek(this, eCommerceEvent));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        this.b.b.a(str);
        this.f.getClass();
        if (th == null) {
            th = new C0870y2();
            th.fillInStackTrace();
        }
        this.c.execute(new RunnableC0772uk(this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        this.b.a.a(str);
        this.f.getClass();
        this.c.execute(new RunnableC0743tk(this, str, CollectionUtils.getListFromMap(map)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        this.b.g.a(revenue);
        this.f.getClass();
        this.c.execute(new Bk(this, revenue));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        this.b.e.a(th);
        this.f.getClass();
        this.c.execute(new RunnableC0830wk(this, th));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        this.b.f.a(userProfile);
        this.f.getClass();
        this.c.execute(new Ak(this, userProfile));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC0859xk(this));
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Ok(this));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Fk(this, z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Jk(this, str, bArr));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new RunnableC0917zk(this, str));
    }

    public static InterfaceC0620pc a(F0 f0, Context context, ReporterConfig reporterConfig) {
        f0.getClass();
        return E0.a(context).d().c(reporterConfig);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
        this.b.h.a(adRevenue);
        this.f.getClass();
        this.c.execute(new Kk(this, adRevenue, z));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0620pc, io.appmetrica.analytics.impl.InterfaceC0521m0
    public final void a(C0204b0 c0204b0) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Nk(this, c0204b0));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.b.a.a(str);
        this.f.getClass();
        this.c.execute(new Sk(this, str, str2));
    }

    public Tk(Context context, String str, F0 f0) {
        this(context, new C0570nk(), f0, new C0311el(), ReporterConfig.newConfigBuilder(str).build());
    }

    public final void a(ReporterConfig reporterConfig) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Hk(this, reporterConfig));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.b.a.a(str);
        this.f.getClass();
        this.c.execute(new Rk(this, str));
    }

    public Tk(Context context, C0570nk c0570nk, F0 f0, C0311el c0311el, ReporterConfig reporterConfig) {
        this(context, c0570nk, f0, c0311el, reporterConfig, new Bh(new Dk(f0, context, reporterConfig)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, null);
    }

    public Tk(ICommonExecutor iCommonExecutor, Context context, String str) {
        this(context.getApplicationContext(), str, new F0());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        this.b.c.a(str);
        this.f.getClass();
        this.c.execute(new RunnableC0801vk(this, str, str2, th));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        this.b.getClass();
        this.f.getClass();
        this.c.execute(new Ik(this, moduleEvent));
    }
}
