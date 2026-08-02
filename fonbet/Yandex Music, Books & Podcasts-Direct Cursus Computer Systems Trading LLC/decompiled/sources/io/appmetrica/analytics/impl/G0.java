package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.AppMetricaYandexConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class G0 implements Nb {
    public final Context a;
    public final Mb b;
    public final C0608rh c;
    public final Ro d;
    public final Mi e;
    public final Xh f;
    public final Mk g;
    public final C0237el h;
    public final C0744w8 i;
    public final Yn j;
    public volatile Kd k;
    public final C0563q0 l;
    public boolean m;

    public G0(@NotNull Context context, @NotNull Mb mb) {
        this.a = context;
        this.b = mb;
        C0608rh b = R4.l().b(context);
        this.c = b;
        ArrayList a = Ye.a();
        R4 l = R4.l();
        l.m().a(new A4(context));
        H0.a(context).a(a);
        Xh a2 = H0.a(context, H0.a(mb.b(), this));
        this.f = a2;
        C0744w8 j = l.j();
        this.i = j;
        C0237el a3 = H0.a(a2, context, mb.getDefaultExecutor());
        this.h = a3;
        j.a(a3);
        Ro a4 = H0.a(context, a3, b, mb.b());
        this.d = a4;
        a3.a(a4);
        this.e = H0.a(a3, b, mb.b());
        this.g = H0.a(context, a2, a3, mb.b(), a4);
        this.j = l.p();
        this.l = new C0563q0(b);
    }

    public final void a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, boolean z) {
        Boolean bool = appMetricaConfig.logs;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            publicLogger.setEnabled(true);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(true);
        } else {
            publicLogger.setEnabled(false);
            PublicLogger.INSTANCE.getAnonymousInstance().setEnabled(false);
        }
        boolean booleanValue = ((Boolean) WrapUtils.getOrDefault(appMetricaConfig.crashReporting, bool2)).booleanValue();
        Mb mb = this.b;
        if (booleanValue) {
            mb.d().a(this.a, appMetricaConfig, this);
            this.b.d().a(this.a, this);
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            mb.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        boolean booleanValue2 = ((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue();
        Yn yn = this.j;
        if (booleanValue2) {
            yn.a();
        } else {
            synchronized (yn) {
                if (yn.g) {
                    yn.a.unregisterListener(yn.c, ActivityEvent.RESUMED);
                    yn.a.unregisterListener(yn.d, ActivityEvent.PAUSED);
                    yn.g = false;
                }
            }
        }
        this.f.d(appMetricaConfig);
        Ro ro = this.d;
        ro.e = publicLogger;
        ro.b(appMetricaConfig.customHosts);
        Ro ro2 = this.d;
        Object obj = appMetricaConfig.additionalConfig.get(AppMetricaYandexConfig.CLIDS_KEY);
        ro2.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get(AppMetricaYandexConfig.DISTRIBUTION_REFERRER_KEY);
        this.d.a(str);
        if (str != null) {
            this.d.b("api");
        }
        this.h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking, Boolean.valueOf(z));
        this.d.i();
    }

    @Override // io.appmetrica.analytics.impl.Nb
    public final void b(@NotNull AppMetricaConfig appMetricaConfig) {
        boolean z;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean a = a(orCreateMainPublicLogger, appMetricaConfig, new E0(this, appMetricaConfig, orCreateMainPublicLogger), true);
        if (a || this.m) {
            z = false;
        } else {
            a(orCreateMainPublicLogger, appMetricaConfig, true);
            z = true;
        }
        if (a || z) {
            this.c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (a) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.m = true;
    }

    @Override // io.appmetrica.analytics.impl.Nb
    @NotNull
    public final InterfaceC0228ec c(@NotNull ReporterConfig reporterConfig) {
        return this.g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Nb, io.appmetrica.analytics.impl.InterfaceC0490ne
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.Nb
    @NotNull
    public final C0256fb e() {
        return this.d.e();
    }

    @Override // io.appmetrica.analytics.impl.Nb
    public final String f() {
        return this.d.d();
    }

    @Override // io.appmetrica.analytics.impl.Nb
    public final Map<String, String> g() {
        return this.d.b();
    }

    @Override // io.appmetrica.analytics.impl.Nb
    @NotNull
    public final AdvIdentifiersResult h() {
        return this.d.a();
    }

    @Override // io.appmetrica.analytics.impl.Nb
    public final Kd i() {
        return this.k;
    }

    public final Ub j() {
        Kd kd = this.k;
        kd.getClass();
        return kd.a;
    }

    @NotNull
    public final Mk k() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.impl.Nb, io.appmetrica.analytics.impl.InterfaceC0490ne
    public final void putAppEnvironmentValue(@NotNull String str, @NotNull String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Nb, io.appmetrica.analytics.impl.InterfaceC0490ne
    public final void setDataSendingEnabled(boolean z) {
        j().setDataSendingEnabled(z);
    }

    @Override // io.appmetrica.analytics.impl.Nb, io.appmetrica.analytics.impl.InterfaceC0490ne
    public final void setUserProfileID(String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.Nb
    public final void a(@NotNull AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        Boolean bool;
        C0563q0 c0563q0 = this.l;
        A0 a0 = c0563q0.b;
        a0.getClass();
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
        if (a0.a.b() && Intrinsics.d(a0.b.a, Boolean.TRUE)) {
            newConfigBuilder.handleFirstActivationAsUpdate(true);
        }
        Boolean bool2 = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        newConfigBuilder.withAdvIdentifiersTracking(bool2.booleanValue());
        AppMetricaConfig build = newConfigBuilder.build();
        AppMetricaConfig.Builder f = c0563q0.a.f();
        if (f != null) {
            if (f.build().advIdentifiersTracking == null && (bool = build.advIdentifiersTracking) != null) {
                f.withAdvIdentifiersTracking(bool.booleanValue());
            }
            build = f.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, build, new F0(this, build, mainPublicOrAnonymousLogger), false)) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Nb, io.appmetrica.analytics.impl.InterfaceC0656t7
    public final void a(int i, @NotNull Bundle bundle) {
        this.d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.Nb
    public final void a(@NotNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.Nb
    public final void a(@NotNull DeferredDeeplinkListener deferredDeeplinkListener) {
        this.e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.Nb
    public final void a(@NotNull ReporterConfig reporterConfig) {
        this.g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Nb
    public final void a(@NotNull StartupParamsCallback startupParamsCallback, @NotNull List<String> list) {
        this.d.a(startupParamsCallback, list, Fc.d(this.f.a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, Yd yd, boolean z) {
        if (this.k == null) {
            a(publicLogger, appMetricaConfig, z);
            this.e.a();
            Id a = yd.a();
            C0599r8 c0599r8 = new C0599r8(a);
            Kd kd = new Kd(a, c0599r8);
            this.b.c().a(c0599r8);
            this.k = kd;
            C0222e6 c0222e6 = this.j.b;
            synchronized (c0222e6) {
                try {
                    c0222e6.a = a;
                    Iterator it = c0222e6.b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0781xg) it.next()).consume(a);
                    }
                    c0222e6.b.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        yd.a();
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Nb, io.appmetrica.analytics.impl.InterfaceC0490ne
    public final void a(Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.Nb, io.appmetrica.analytics.impl.InterfaceC0490ne
    public final void a(boolean z) {
        j().a(z);
    }

    @Override // io.appmetrica.analytics.impl.Nb, io.appmetrica.analytics.impl.InterfaceC0490ne
    public final void a(boolean z, boolean z2) {
        j().a(z, z2);
    }

    @Override // io.appmetrica.analytics.impl.Nb, io.appmetrica.analytics.impl.InterfaceC0490ne
    public final void a(@NotNull String str, @NotNull String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Nb, io.appmetrica.analytics.impl.InterfaceC0490ne
    public final void a(@NotNull String str) {
        j().a(str);
    }

    @Override // io.appmetrica.analytics.impl.Nb, io.appmetrica.analytics.impl.InterfaceC0286gc
    public final InterfaceC0257fc a() {
        return this.g;
    }
}
