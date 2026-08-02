package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import defpackage.e5b;
import defpackage.gtm;
import defpackage.tah;
import defpackage.xlr;
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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Xk implements IReporter, IReporterYandex {
    public final Context a;
    public final String b;
    public final IReporter c;
    public final ICommonExecutor d;
    public final boolean e;
    public Vk f;
    public final Ur g = new Ur();
    public final C0807ye h = new C0807ye();

    public Xk(@NotNull Context context, @NotNull String str, @NotNull IReporter iReporter, @NotNull ICommonExecutor iCommonExecutor) {
        this.a = context;
        this.b = str;
        this.c = iReporter;
        this.d = iCommonExecutor;
        this.e = R4.l().c().a(context);
    }

    public final synchronized ReporterYandexExtension a() {
        ReporterYandexExtension reporterYandexExtension;
        try {
            reporterYandexExtension = this.f;
            if (reporterYandexExtension == null) {
                if (this.e) {
                    reporterYandexExtension = new Yk();
                } else {
                    String str = "Not found reporter  apiKey = " + ApiKeyUtils.createPartialApiKey(this.b);
                    IllegalStateException illegalStateException = new IllegalStateException(str);
                    Om om = AbstractC0469mm.a;
                    String message = illegalStateException.getMessage();
                    if (message != null) {
                        str = message;
                    }
                    om.getClass();
                    om.a(new C0498nm(str, illegalStateException));
                    reporterYandexExtension = new Yk();
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
    @NonNull
    @NotNull
    public final IPluginReporter getPluginExtension() {
        return this.c.getPluginExtension();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.c.pauseSession();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(@NonNull @NotNull String str, String str2) {
        this.c.putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull @NotNull AdRevenue adRevenue) {
        this.c.reportAdRevenue(adRevenue);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull @NotNull Map<Thread, StackTraceElement[]> map) {
        this.c.reportAnr(map);
    }

    @Override // io.appmetrica.analytics.IReporterYandex
    public final void reportDiagnosticEvent(@NotNull String str, Map<String, ? extends Object> map) {
        this.g.b.a(str);
        IModuleReporter moduleReporter = ModulesFacade.getModuleReporter(this.a, this.b);
        this.h.getClass();
        moduleReporter.reportEvent(ModuleEvent.newBuilder(22).withName(str).withServiceDataReporterType(3).withAttributes(map).build());
    }

    @Override // io.appmetrica.analytics.IReporterYandex
    public final void reportDiagnosticStatboxEvent(@NotNull String str, String str2) {
        Ur ur = this.g;
        ur.b.a(str);
        ur.f.a(str2);
        IModuleReporter moduleReporter = ModulesFacade.getModuleReporter(this.a, this.b);
        this.h.getClass();
        moduleReporter.reportEvent(ModuleEvent.newBuilder(23).withName(str).withValue(str2).withServiceDataReporterType(3).build());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull @NotNull ECommerceEvent eCommerceEvent) {
        this.c.reportECommerce(eCommerceEvent);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull @NotNull String str, String str2) {
        this.c.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull @NotNull String str) {
        this.c.reportEvent(str);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull @NotNull Revenue revenue) {
        this.c.reportRevenue(revenue);
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmError(@NotNull RtmErrorEvent rtmErrorEvent) {
        this.g.c.a(rtmErrorEvent != null ? rtmErrorEvent.message : null);
        this.d.execute(new xlr(25, this, rtmErrorEvent));
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmEvent(@NotNull RtmClientEvent rtmClientEvent) {
        this.g.b.a(rtmClientEvent != null ? rtmClientEvent.name : null);
        this.d.execute(new xlr(23, this, rtmClientEvent));
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmException(@NotNull String str, @NotNull Throwable th) {
        Ur ur = this.g;
        ur.c.a(str);
        ur.d.a(th);
        this.d.execute(new gtm(9, this, str, th));
    }

    @Override // io.appmetrica.analytics.IReporterYandex
    public final void reportStatboxEvent(String str, Map<String, ? extends Object> map) {
        this.g.getClass();
        IModuleReporter moduleReporter = ModulesFacade.getModuleReporter(this.a, this.b);
        this.h.getClass();
        moduleReporter.reportEvent(ModuleEvent.newBuilder(11).withName(str).withValue(Fc.c(map)).build());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull @NotNull Throwable th) {
        this.c.reportUnhandledException(th);
    }

    @Override // io.appmetrica.analytics.IReporterYandex
    public final void reportUserInfoEvent(@NotNull UserInfo userInfo) {
        this.g.a.a(userInfo);
        IModuleReporter moduleReporter = ModulesFacade.getModuleReporter(this.a, this.b);
        C0807ye c0807ye = this.h;
        c0807ye.getClass();
        moduleReporter.reportEvent(ModuleEvent.newBuilder(12).withExtras(tah.b(new Pair("ai", MessageNano.toByteArray(c0807ye.a.a.a.fromModel(userInfo))))).build());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull @NotNull UserProfile userProfile) {
        this.c.reportUserProfile(userProfile);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.c.resumeSession();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void sendEventsBuffer() {
        this.c.sendEventsBuffer();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.c.setDataSendingEnabled(z);
    }

    @Override // io.appmetrica.analytics.IReporterYandex
    public final void setUserInfo(UserInfo userInfo) {
        Map<String, byte[]> map;
        this.g.getClass();
        IModuleReporter moduleReporter = ModulesFacade.getModuleReporter(this.a, this.b);
        C0807ye c0807ye = this.h;
        c0807ye.getClass();
        ModuleEvent.Builder newBuilder = ModuleEvent.newBuilder(9);
        if (userInfo == null || (map = tah.b(new Pair("ai", MessageNano.toByteArray(c0807ye.a.a.a.fromModel(userInfo))))) == null) {
            map = e5b.a;
            map.getClass();
        }
        moduleReporter.reportEvent(newBuilder.withExtras(map).build());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.c.setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void updateRtmConfig(@NotNull RtmConfig rtmConfig) {
        this.g.getClass();
        this.d.execute(new xlr(24, this, rtmConfig));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull @NotNull String str, String str2, Throwable th) {
        this.c.reportError(str, str2, th);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull @NotNull String str, String str2) {
        this.c.reportEvent(str, str2);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull @NotNull String str, Throwable th) {
        this.c.reportError(str, th);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull @NotNull String str, Map<String, Object> map) {
        this.c.reportEvent(str, map);
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmException(@NotNull String str, @NotNull String str2) {
        Ur ur = this.g;
        ur.c.a(str);
        ur.e.a(str2);
        this.d.execute(new gtm(10, this, str, str2));
    }

    @Override // io.appmetrica.analytics.IReporterYandex
    public final void reportStatboxEvent(String str, String str2) {
        this.g.getClass();
        IModuleReporter moduleReporter = ModulesFacade.getModuleReporter(this.a, this.b);
        this.h.getClass();
        moduleReporter.reportEvent(ModuleEvent.newBuilder(11).withName(str).withValue(str2).build());
    }

    @Override // io.appmetrica.analytics.IReporterYandex
    public final void reportDiagnosticEvent(@NotNull String str, String str2) {
        this.g.b.a(str);
        IModuleReporter moduleReporter = ModulesFacade.getModuleReporter(this.a, this.b);
        this.h.getClass();
        moduleReporter.reportEvent(ModuleEvent.newBuilder(22).withName(str).withValue(str2).withServiceDataReporterType(3).build());
    }

    public static final void a(Xk xk, RtmConfig rtmConfig) {
        xk.a().updateRtmConfig(rtmConfig);
    }

    public static final void a(Xk xk, String str, Throwable th) {
        xk.a().reportRtmException(str, th);
    }

    public static final void a(Xk xk, String str, String str2) {
        xk.a().reportRtmException(str, str2);
    }

    public static final void a(Xk xk, RtmClientEvent rtmClientEvent) {
        xk.a().reportRtmEvent(rtmClientEvent);
    }

    public static final void a(Xk xk, RtmErrorEvent rtmErrorEvent) {
        xk.a().reportRtmError(rtmErrorEvent);
    }

    public final synchronized void a(@NotNull Dl dl, @NotNull L1 l1) {
        if (this.f == null) {
            this.f = new Vk(dl, l1);
        }
    }
}
