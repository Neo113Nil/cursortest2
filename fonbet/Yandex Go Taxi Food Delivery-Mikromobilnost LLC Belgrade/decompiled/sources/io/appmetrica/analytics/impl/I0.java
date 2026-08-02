package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import defpackage.jl40;
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

/* loaded from: classes9.dex */
public final class I0 implements InterfaceC0245cc {
    public final Context a;
    public final InterfaceC0216bc b;
    public final Hh c;
    public final C0459jp d;
    public final Si e;
    public final C0597oi f;
    public final Wk g;
    public final C0600ol h;
    public final B8 i;
    public final C0747to j;
    public volatile C0189ae k;
    public final C0694s0 l;
    public boolean m;

    public I0(Context context, InterfaceC0216bc interfaceC0216bc) {
        this.a = context;
        this.b = interfaceC0216bc;
        Hh b = V4.l().b(context);
        this.c = b;
        ArrayList a = C0565nf.a();
        V4 l = V4.l();
        l.m().a(new E4(context));
        J0.a(context).a(a);
        C0597oi a2 = J0.a(context, J0.a(interfaceC0216bc.d(), this));
        this.f = a2;
        B8 j = l.j();
        this.i = j;
        C0600ol a3 = J0.a(a2, context, interfaceC0216bc.getDefaultExecutor());
        this.h = a3;
        j.a(a3);
        C0459jp a4 = J0.a(context, a3, interfaceC0216bc.d());
        this.d = a4;
        a3.a(a4);
        this.e = J0.a(a3, b, interfaceC0216bc.d());
        this.g = J0.a(context, a2, a3, interfaceC0216bc.d(), a4);
        this.j = l.p();
        this.l = new C0694s0(b);
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
        InterfaceC0216bc interfaceC0216bc = this.b;
        if (booleanValue) {
            interfaceC0216bc.b().a(this.a, appMetricaConfig, this);
            this.b.b().a(this.a, this);
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            interfaceC0216bc.b().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        boolean booleanValue2 = ((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue();
        C0747to c0747to = this.j;
        if (booleanValue2) {
            c0747to.a();
        } else {
            synchronized (c0747to) {
                if (c0747to.g) {
                    c0747to.a.unregisterListener(c0747to.c, ActivityEvent.RESUMED);
                    c0747to.a.unregisterListener(c0747to.d, ActivityEvent.PAUSED);
                    c0747to.g = false;
                }
            }
        }
        this.f.d(appMetricaConfig);
        C0459jp c0459jp = this.d;
        c0459jp.e = publicLogger;
        c0459jp.b(appMetricaConfig.customHosts);
        C0459jp c0459jp2 = this.d;
        Object obj = appMetricaConfig.additionalConfig.get(AppMetricaYandexConfig.CLIDS_KEY);
        c0459jp2.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get(AppMetricaYandexConfig.DISTRIBUTION_REFERRER_KEY);
        this.d.a(str);
        if (str != null) {
            this.d.b("api");
        }
        this.h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking, Boolean.valueOf(z));
        this.d.i();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final void b(AppMetricaConfig appMetricaConfig) {
        boolean z;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean a = a(orCreateMainPublicLogger, appMetricaConfig, new G0(this, appMetricaConfig, orCreateMainPublicLogger), true);
        if (a || this.m) {
            z = false;
        } else {
            a(orCreateMainPublicLogger, appMetricaConfig, true);
            if (appMetricaConfig.userProfileID != null) {
                j().setUserProfileID(appMetricaConfig.userProfileID);
            }
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

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final InterfaceC0620pc c(ReporterConfig reporterConfig) {
        return this.g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final String e() {
        return this.d.d();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final AdvIdentifiersResult f() {
        return this.d.a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final C0189ae g() {
        return this.k;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final C0561nb h() {
        return this.d.e();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final Map<String, String> i() {
        return this.d.b();
    }

    public final InterfaceC0446jc j() {
        return this.k.a;
    }

    public final Wk k() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void putAppEnvironmentValue(String str, String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void setDataSendingEnabled(boolean z) {
        j().setDataSendingEnabled(z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void setUserProfileID(String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final void a(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        Boolean bool;
        B8 b8 = this.i;
        C0694s0 c0694s0 = this.l;
        C0 c0 = c0694s0.b;
        c0.getClass();
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
        if (c0.a.b() && jl40.l(c0.b.a, Boolean.TRUE)) {
            newConfigBuilder.handleFirstActivationAsUpdate(true);
        }
        Boolean bool2 = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        newConfigBuilder.withAdvIdentifiersTracking(bool2.booleanValue());
        AppMetricaConfig build = newConfigBuilder.build();
        AppMetricaConfig.Builder f = c0694s0.a.f();
        if (f != null) {
            if (f.build().advIdentifiersTracking == null && (bool = build.advIdentifiersTracking) != null) {
                f.withAdvIdentifiersTracking(bool.booleanValue());
            }
            build = f.build();
        }
        AppMetricaConfig.Builder a = b8.a(build);
        b8.a(a, build);
        AppMetricaConfig build2 = a.build();
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, build2, new H0(this, build2, mainPublicOrAnonymousLogger), false)) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.InterfaceC0875y7
    public final void a(int i, Bundle bundle) {
        this.d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final void a(ReporterConfig reporterConfig) {
        this.g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        this.d.a(startupParamsCallback, list, Vc.d(this.f.a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, InterfaceC0564ne interfaceC0564ne, boolean z) {
        if (this.k == null) {
            a(publicLogger, appMetricaConfig, z);
            this.e.a();
            Yd a = interfaceC0564ne.a();
            C0818w8 c0818w8 = new C0818w8(a);
            C0189ae c0189ae = new C0189ae(a, c0818w8);
            this.b.a().a(c0818w8);
            this.k = c0189ae;
            C0383h6 c0383h6 = this.j.b;
            synchronized (c0383h6) {
                try {
                    c0383h6.a = a;
                    Iterator it = c0383h6.b.iterator();
                    while (it.hasNext()) {
                        ((Ng) it.next()).consume(a);
                    }
                    c0383h6.b.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        interfaceC0564ne.a();
        return false;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void a(Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void a(boolean z) {
        j().a(z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void a(boolean z, boolean z2) {
        j().a(z, z2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void a(String str, String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void a(String str) {
        j().a(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.InterfaceC0677rc
    public final InterfaceC0649qc a() {
        return this.g;
    }
}
