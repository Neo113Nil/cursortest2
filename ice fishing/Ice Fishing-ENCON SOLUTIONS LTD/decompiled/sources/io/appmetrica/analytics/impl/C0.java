package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
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

/* loaded from: classes.dex */
public final class C0 implements Ca {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4240a;

    /* renamed from: b, reason: collision with root package name */
    public final Ba f4241b;

    /* renamed from: c, reason: collision with root package name */
    public final Ve f4242c;

    /* renamed from: d, reason: collision with root package name */
    public final Ol f4243d;

    /* renamed from: e, reason: collision with root package name */
    public final C0512jg f4244e;

    /* renamed from: f, reason: collision with root package name */
    public final Bf f4245f;

    /* renamed from: g, reason: collision with root package name */
    public final C0514ji f4246g;

    /* renamed from: h, reason: collision with root package name */
    public final C0851wi f4247h;

    /* renamed from: i, reason: collision with root package name */
    public final D7 f4248i;

    /* renamed from: j, reason: collision with root package name */
    public final Wk f4249j;

    /* renamed from: k, reason: collision with root package name */
    public volatile C0508jc f4250k;

    /* renamed from: l, reason: collision with root package name */
    public final C0574m0 f4251l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4252m;

    public C0(Context context, Ba ba) {
        this.f4240a = context;
        this.f4241b = ba;
        Ve b2 = C0294b4.l().b(context);
        this.f4242c = b2;
        ArrayList a2 = C0742sd.a();
        C0294b4 l2 = C0294b4.l();
        l2.m().a(new K3(context));
        D0.a(context).a(a2);
        Bf a3 = D0.a(context, D0.a(ba.b(), this));
        this.f4245f = a3;
        D7 j2 = l2.j();
        this.f4248i = j2;
        C0851wi a4 = D0.a(a3, context, ba.getDefaultExecutor());
        this.f4247h = a4;
        j2.a(a4);
        Ol a5 = D0.a(context, a4, b2, ba.b());
        this.f4243d = a5;
        a4.a(a5);
        this.f4244e = D0.a(a4, b2, ba.b());
        this.f4246g = D0.a(context, a3, a4, ba.b(), a5);
        this.f4249j = l2.o();
        this.f4251l = new C0574m0(b2);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final Ra c(ReporterConfig reporterConfig) {
        return this.f4246g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final X9 d() {
        return this.f4243d.e();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final String e() {
        return this.f4243d.d();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final Map<String, String> g() {
        return this.f4243d.b();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final AdvIdentifiersResult h() {
        return this.f4243d.a();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final C0508jc i() {
        return this.f4250k;
    }

    public final Ia j() {
        C0508jc c0508jc = this.f4250k;
        kotlin.jvm.internal.i.b(c0508jc);
        return c0508jc.f6277a;
    }

    public final C0514ji k() {
        return this.f4246g;
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void putAppEnvironmentValue(String str, String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void setDataSendingEnabled(boolean z2) {
        j().setDataSendingEnabled(z2);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void setUserProfileID(String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        Boolean bool;
        C0574m0 c0574m0 = this.f4251l;
        C0833w0 c0833w0 = c0574m0.f6471b;
        c0833w0.getClass();
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
        if (c0833w0.f7078a.b() && kotlin.jvm.internal.i.a(c0833w0.f7079b.f5734a, Boolean.TRUE)) {
            newConfigBuilder.handleFirstActivationAsUpdate(true);
        }
        Boolean bool2 = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        newConfigBuilder.withAdvIdentifiersTracking(bool2.booleanValue());
        AppMetricaConfig build = newConfigBuilder.build();
        AppMetricaConfig.Builder f2 = c0574m0.f6470a.f();
        if (f2 != null) {
            if (f2.build().advIdentifiersTracking == null && (bool = build.advIdentifiersTracking) != null) {
                f2.withAdvIdentifiersTracking(bool.booleanValue());
            }
            build = f2.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, build, new B0(this, build, mainPublicOrAnonymousLogger), false)) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void b(AppMetricaConfig appMetricaConfig) {
        boolean z2;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean a2 = a(orCreateMainPublicLogger, appMetricaConfig, new A0(this, appMetricaConfig, orCreateMainPublicLogger), true);
        if (a2 || this.f4252m) {
            z2 = false;
        } else {
            a(orCreateMainPublicLogger, appMetricaConfig, true);
            z2 = true;
        }
        if (a2 || z2) {
            this.f4242c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (a2) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z2) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.f4252m = true;
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.A6
    public final void a(int i2, Bundle bundle) {
        this.f4243d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f4244e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f4244e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(ReporterConfig reporterConfig) {
        this.f4246g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        this.f4243d.a(startupParamsCallback, list, AbstractC0430gb.c(this.f4245f.f4214a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, InterfaceC0845wc interfaceC0845wc, boolean z2) {
        if (this.f4250k == null) {
            a(publicLogger, appMetricaConfig, z2);
            this.f4244e.a();
            C0457hc a2 = interfaceC0845wc.a();
            C0892y7 c0892y7 = new C0892y7(a2);
            C0508jc c0508jc = new C0508jc(a2, c0892y7);
            this.f4241b.c().a(c0892y7);
            this.f4250k = c0508jc;
            C0579m5 c0579m5 = this.f4249j.f5315b;
            synchronized (c0579m5) {
                try {
                    c0579m5.f6480a = a2;
                    Iterator it = c0579m5.f6481b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0278ae) it.next()).consume(a2);
                    }
                    c0579m5.f6481b.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        interfaceC0845wc.a();
        return false;
    }

    public final void a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, boolean z2) {
        Boolean bool = appMetricaConfig.logs;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            publicLogger.setEnabled(true);
            PublicLogger.Companion.getAnonymousInstance().setEnabled(true);
        } else {
            publicLogger.setEnabled(false);
            PublicLogger.Companion.getAnonymousInstance().setEnabled(false);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.crashReporting, bool2)).booleanValue()) {
            this.f4241b.d().a(this.f4240a, appMetricaConfig, this);
            this.f4241b.d().b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.f4241b.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.f4249j.a();
        } else {
            Wk wk = this.f4249j;
            synchronized (wk) {
                if (wk.f5320g) {
                    wk.f5314a.unregisterListener(wk.f5316c, ActivityEvent.RESUMED);
                    wk.f5314a.unregisterListener(wk.f5317d, ActivityEvent.PAUSED);
                    wk.f5320g = false;
                }
            }
        }
        this.f4245f.d(appMetricaConfig);
        Ol ol = this.f4243d;
        ol.f4882e = publicLogger;
        ol.b(appMetricaConfig.customHosts);
        Ol ol2 = this.f4243d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        ol2.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.f4243d.a(str);
        if (str != null) {
            this.f4243d.b("api");
        }
        this.f4247h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking, Boolean.valueOf(z2));
        this.f4243d.i();
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z2) {
        j().a(z2);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z2, boolean z3) {
        j().a(z2, z3);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(String str, String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Hc
    public final void a(String str) {
        j().a(str);
    }

    @Override // io.appmetrica.analytics.impl.Ca, io.appmetrica.analytics.impl.Ta
    public final Sa a() {
        return this.f4246g;
    }
}
