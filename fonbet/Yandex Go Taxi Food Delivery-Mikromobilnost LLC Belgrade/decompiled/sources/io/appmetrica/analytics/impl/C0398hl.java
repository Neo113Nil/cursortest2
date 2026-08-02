package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.bo31;
import defpackage.bsq0;
import defpackage.gw00;
import defpackage.nk61;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.IModuleReporter;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.ReporterYandexExtension;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.RtmClientEvent;
import io.appmetrica.analytics.RtmConfig;
import io.appmetrica.analytics.RtmErrorEvent;
import io.appmetrica.analytics.UserInfo;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0398hl implements IReporter, IReporterYandex {
    public final Context a;
    public final String b;
    public final IReporter c;
    public final ICommonExecutor d;
    public final boolean e;
    public C0340fl f;
    public final os g = new os();
    public final Ne h = new Ne();

    public C0398hl(Context context, String str, IReporter iReporter, ICommonExecutor iCommonExecutor) {
        this.a = context;
        this.b = str;
        this.c = iReporter;
        this.d = iCommonExecutor;
        this.e = V4.l().c().a(context);
    }

    public final synchronized ReporterYandexExtension a() {
        ReporterYandexExtension reporterYandexExtension;
        try {
            reporterYandexExtension = this.f;
            if (reporterYandexExtension == null) {
                if (this.e) {
                    reporterYandexExtension = new C0426il();
                } else {
                    String str = "Not found reporter  apiKey = " + ApiKeyUtils.createPartialApiKey(this.b);
                    IllegalStateException illegalStateException = new IllegalStateException(str);
                    C0313en c0313en = Cm.a;
                    String message = illegalStateException.getMessage();
                    if (message != null) {
                        str = message;
                    }
                    c0313en.getClass();
                    c0313en.a(new Dm(str, illegalStateException));
                    reporterYandexExtension = new C0426il();
                }
            }
        } finally {
        }
        return reporterYandexExtension;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.c.clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this.c.getPluginExtension();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.c.pauseSession();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        this.c.putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        this.c.reportAdRevenue(adRevenue);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        this.c.reportAnr(map);
    }

    @Override // io.appmetrica.analytics.IReporterYandex
    public final void reportDiagnosticEvent(String str, Map<String, ? extends Object> map) {
        this.g.b.a(str);
        IModuleReporter moduleReporter = ModulesFacade.getModuleReporter(this.a, this.b);
        this.h.getClass();
        Gc[] gcArr = Gc.a;
        moduleReporter.reportEvent(ModuleEvent.newBuilder(22).withName(str).withServiceDataReporterType(3).withAttributes(map).build());
    }

    @Override // io.appmetrica.analytics.IReporterYandex
    public final void reportDiagnosticStatboxEvent(String str, String str2) {
        os osVar = this.g;
        osVar.b.a(str);
        osVar.f.a(str2);
        IModuleReporter moduleReporter = ModulesFacade.getModuleReporter(this.a, this.b);
        this.h.getClass();
        Gc[] gcArr = Gc.a;
        moduleReporter.reportEvent(ModuleEvent.newBuilder(23).withName(str).withValue(str2).withServiceDataReporterType(3).build());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.c.reportECommerce(eCommerceEvent);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        this.c.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.c.reportEvent(str);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        this.c.reportRevenue(revenue);
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmError(RtmErrorEvent rtmErrorEvent) {
        this.g.c.a(rtmErrorEvent != null ? rtmErrorEvent.message : null);
        this.d.execute(new bsq0(10, this, rtmErrorEvent));
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmEvent(RtmClientEvent rtmClientEvent) {
        this.g.b.a(rtmClientEvent != null ? rtmClientEvent.name : null);
        this.d.execute(new bo31(27, this, rtmClientEvent));
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmException(String str, Throwable th) {
        os osVar = this.g;
        osVar.c.a(str);
        osVar.d.a(th);
        this.d.execute(new nk61(3, (Object) this, (Object) th, str));
    }

    @Override // io.appmetrica.analytics.IReporterYandex
    public final void reportStatboxEvent(String str, Map<String, ? extends Object> map) {
        this.g.getClass();
        IModuleReporter moduleReporter = ModulesFacade.getModuleReporter(this.a, this.b);
        this.h.getClass();
        Gc[] gcArr = Gc.a;
        moduleReporter.reportEvent(ModuleEvent.newBuilder(11).withName(str).withValue(Vc.c(map)).build());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        this.c.reportUnhandledException(th);
    }

    @Override // io.appmetrica.analytics.IReporterYandex
    public final void reportUserInfoEvent(UserInfo userInfo) {
        this.g.a.a(userInfo);
        IModuleReporter moduleReporter = ModulesFacade.getModuleReporter(this.a, this.b);
        Ne ne = this.h;
        ne.getClass();
        Gc[] gcArr = Gc.a;
        moduleReporter.reportEvent(ModuleEvent.newBuilder(12).withExtras(gw00.e(new Pair("ai", MessageNano.toByteArray(ne.a.a.a.fromModel(userInfo))))).build());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        this.c.reportUserProfile(userProfile);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.c.resumeSession();
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.c.sendEventsBuffer();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.c.setDataSendingEnabled(z);
    }

    @Override // io.appmetrica.analytics.IReporterYandex
    public final void setUserInfo(UserInfo userInfo) {
        this.g.getClass();
        IModuleReporter moduleReporter = ModulesFacade.getModuleReporter(this.a, this.b);
        Ne ne = this.h;
        ne.getClass();
        Gc[] gcArr = Gc.a;
        moduleReporter.reportEvent(ModuleEvent.newBuilder(9).withExtras(userInfo != null ? gw00.e(new Pair("ai", MessageNano.toByteArray(ne.a.a.a.fromModel(userInfo)))) : kotlin.collections.b.f()).build());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.c.setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void updateRtmConfig(RtmConfig rtmConfig) {
        this.g.getClass();
        this.d.execute(new bsq0(9, this, rtmConfig));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        this.c.reportError(str, str2, th);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.c.reportEvent(str, str2);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        this.c.reportError(str, th);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        this.c.reportEvent(str, map);
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmException(String str, String str2) {
        os osVar = this.g;
        osVar.c.a(str);
        osVar.e.a(str2);
        this.d.execute(new nk61(2, (Object) this, (Object) str2, str));
    }

    @Override // io.appmetrica.analytics.IReporterYandex
    public final void reportStatboxEvent(String str, String str2) {
        this.g.getClass();
        IModuleReporter moduleReporter = ModulesFacade.getModuleReporter(this.a, this.b);
        this.h.getClass();
        Gc[] gcArr = Gc.a;
        moduleReporter.reportEvent(ModuleEvent.newBuilder(11).withName(str).withValue(str2).build());
    }

    @Override // io.appmetrica.analytics.IReporterYandex
    public final void reportDiagnosticEvent(String str, String str2) {
        this.g.b.a(str);
        IModuleReporter moduleReporter = ModulesFacade.getModuleReporter(this.a, this.b);
        this.h.getClass();
        Gc[] gcArr = Gc.a;
        moduleReporter.reportEvent(ModuleEvent.newBuilder(22).withName(str).withValue(str2).withServiceDataReporterType(3).build());
    }

    public static final void a(C0398hl c0398hl, RtmConfig rtmConfig) {
        c0398hl.a().updateRtmConfig(rtmConfig);
    }

    public static final void a(C0398hl c0398hl, String str, Throwable th) {
        c0398hl.a().reportRtmException(str, th);
    }

    public static final void a(C0398hl c0398hl, String str, String str2) {
        c0398hl.a().reportRtmException(str, str2);
    }

    public static final void a(C0398hl c0398hl, RtmClientEvent rtmClientEvent) {
        c0398hl.a().reportRtmEvent(rtmClientEvent);
    }

    public static final void a(C0398hl c0398hl, RtmErrorEvent rtmErrorEvent) {
        c0398hl.a().reportRtmError(rtmErrorEvent);
    }

    public final synchronized void a(Ol ol, L1 l1) {
        if (this.f == null) {
            this.f = new C0340fl(ol, l1);
        }
    }
}
