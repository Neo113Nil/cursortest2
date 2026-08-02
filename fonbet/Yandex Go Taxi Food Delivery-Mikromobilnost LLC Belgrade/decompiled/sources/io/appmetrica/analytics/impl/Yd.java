package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import defpackage.g8e;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.VMInspector.OpenList;

/* loaded from: classes9.dex */
public final class Yd extends AbstractC0842x3 implements InterfaceC0446jc {
    public static final Long r = 1000L;
    public final C0420ie p;
    public final Zd q;

    public Yd(C0420ie c0420ie) {
        super(c0420ie.c(), c0420ie.j(), c0420ie.i(), c0420ie.e(), c0420ie.g(), c0420ie.l(), c0420ie.h(), c0420ie.d(), c0420ie.a(), c0420ie.f());
        this.p = c0420ie;
        this.q = new Zd(this);
        l();
    }

    public final void a(AppMetricaConfig appMetricaConfig, C0665r0 c0665r0) {
        if (c0665r0.b) {
            clearAppEnvironment();
        }
        List<String> list = c0665r0.a;
        if (!CollectionUtils.isNullOrEmpty(list)) {
            this.b.b.addAutoCollectedDataSubscribers(list);
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        Boolean bool = (Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE);
        boolean booleanValue = bool.booleanValue();
        this.c.info("native crash reporting enabled: %b", bool);
        if (booleanValue) {
            C0508lg c0508lg = this.p.d;
            Context context = this.a;
            c0508lg.d = new X0(this.b.b.getApiKey(), c0508lg.a.a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, c0508lg.a.a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), c0508lg.a.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = c0508lg.b;
                Y0 y0 = c0508lg.c;
                X0 x0 = c0508lg.d;
                X0 x02 = x0 != null ? x0 : null;
                y0.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, Y0.a(x02)));
            }
        }
        Zd zd = this.q;
        synchronized (zd) {
            try {
                Integer num = appMetricaConfig.anrMonitoringTimeout;
                zd.a = num != null ? num.intValue() : 5;
                Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                boolean booleanValue2 = bool2.booleanValue();
                C0289e c0289e = zd.b;
                if (booleanValue2) {
                    c0289e.a(zd.a);
                } else {
                    c0289e.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void b(Activity activity) {
        if (this.p.j.a(activity, EnumC0636q.RESUMED)) {
            this.c.info("Resume session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            R2 r2 = this.p.h;
            synchronized (r2) {
                r2.b = false;
                for (Q2 q2 : r2.a) {
                    if (q2.d) {
                        q2.d = false;
                        q2.b.remove(q2.e);
                        q2.a.onResume();
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final List<String> c() {
        return this.b.a.b();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0842x3
    public final String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0842x3
    public final void k() {
        super.k();
        V4.l().m().c();
    }

    public final void l() {
        C0600ol c0600ol = this.h;
        c0600ol.c.a(this.b.a);
        R2 r2 = this.p.h;
        Xd xd = new Xd(this);
        long longValue = r.longValue();
        synchronized (r2) {
            r2.a(xd, longValue, false);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void b() {
        Zd zd = this.q;
        synchronized (zd) {
            zd.b.a(zd.a);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(String str, boolean z) {
        this.c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        C0600ol c0600ol = this.h;
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        HashMap u = g8e.u("type", OpenList.STR_OPEN, "link", str);
        u.put("auto", Boolean.valueOf(z));
        String c = Vc.c(u);
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4(c, "", 8208, 0, publicLogger);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(EnumC0578o enumC0578o) {
        EnumC0578o enumC0578o2 = EnumC0578o.b;
        PublicLogger publicLogger = this.c;
        if (enumC0578o == enumC0578o2) {
            publicLogger.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        publicLogger.warning("Could not enable activity auto tracking. " + enumC0578o.a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(Activity activity) {
        if (this.p.j.a(activity, EnumC0636q.PAUSED)) {
            this.c.info("Pause session", new Object[0]);
            c(activity != null ? activity.getClass().getSimpleName() : null);
            R2 r2 = this.p.h;
            synchronized (r2) {
                r2.b = true;
                for (Q2 q2 : r2.a) {
                    if (!q2.d) {
                        q2.d = true;
                        q2.b.executeDelayed(q2.e, q2.c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(Location location) {
        this.b.b.setManualLocation(location);
        this.c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(boolean z) {
        this.b.b.setLocationTracking(z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(boolean z, boolean z2) {
        this.c.info("Set advIdentifiersTracking to %s", Boolean.valueOf(z));
        this.b.b.setAdvIdentifiersTracking(z, z2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(ls lsVar) {
        PublicLogger publicLogger = this.c;
        synchronized (lsVar) {
            lsVar.b = publicLogger;
        }
        Iterator it = lsVar.a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        lsVar.a.clear();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(AnrListener anrListener) {
        this.q.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(ExternalAttribution externalAttribution) {
        this.c.info("External attribution received: %s", externalAttribution);
        C0600ol c0600ol = this.h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4(bytes, "", 42, publicLogger);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0842x3, io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(String str, String str2) {
        super.a(str, str2);
        C0508lg c0508lg = this.p.d;
        String d = this.b.d();
        X0 x0 = c0508lg.d;
        if (x0 != null) {
            X0 x02 = new X0(x0.a, x0.b, x0.c, x0.d, x0.e, d);
            c0508lg.d = x02;
            NativeCrashClientModule nativeCrashClientModule = c0508lg.b;
            c0508lg.c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(Y0.a(x02));
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(String str) {
        this.c.info("Add auto collected data subscriber: %s", str);
        this.b.b.addAutoCollectedDataSubscriber(str);
    }
}
