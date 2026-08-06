package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
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
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0457hc extends I2 implements Ia {

    /* renamed from: r, reason: collision with root package name */
    public static final Long f6139r = Long.valueOf(TimeUnit.SECONDS.toMillis(1));

    /* renamed from: p, reason: collision with root package name */
    public final C0741sc f6140p;

    /* renamed from: q, reason: collision with root package name */
    public final C0483ic f6141q;

    public C0457hc(C0741sc c0741sc) {
        super(c0741sc.b(), c0741sc.i(), c0741sc.h(), c0741sc.d(), c0741sc.f(), c0741sc.j(), c0741sc.g(), c0741sc.c(), c0741sc.a(), c0741sc.e());
        this.f6140p = c0741sc;
        this.f6141q = new C0483ic(this);
        l();
    }

    public final void a(AppMetricaConfig appMetricaConfig, C0548l0 c0548l0) {
        if (c0548l0.f6409b) {
            clearAppEnvironment();
        }
        List<String> list = c0548l0.f6408a;
        if (!CollectionUtils.isNullOrEmpty(list)) {
            this.f4495b.f4459b.addAutoCollectedDataSubscribers(list);
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        Boolean bool = (Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE);
        boolean booleanValue = bool.booleanValue();
        this.f4496c.info("native crash reporting enabled: %b", bool);
        if (booleanValue) {
            Bd bd = this.f6140p.f6898c;
            Context context = this.f4494a;
            bd.f4209d = new H0(this.f4495b.f4459b.getApiKey(), bd.f4206a.f4214a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, bd.f4206a.f4214a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), bd.f4206a.f4214a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f4495b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = bd.f4207b;
                I0 i02 = bd.f4208c;
                H0 h02 = bd.f4209d;
                if (h02 == null) {
                    kotlin.jvm.internal.i.i("nativeCrashMetadata");
                    throw null;
                }
                i02.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, I0.a(h02)));
            }
        }
        C0483ic c0483ic = this.f6141q;
        synchronized (c0483ic) {
            try {
                Integer num = appMetricaConfig.anrMonitoringTimeout;
                c0483ic.f6185a = num != null ? num.intValue() : 5;
                Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                if (bool2.booleanValue()) {
                    c0483ic.f6186b.a(c0483ic.f6185a);
                } else {
                    c0483ic.f6186b.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void b(Activity activity) {
        if (this.f6140p.f6904i.a(activity, EnumC0651p.PAUSED)) {
            this.f4496c.info("Pause session", new Object[0]);
            c(activity != null ? activity.getClass().getSimpleName() : null);
            C0369e2 c0369e2 = this.f6140p.f6902g;
            synchronized (c0369e2) {
                for (C0344d2 c0344d2 : c0369e2.f5861a) {
                    if (!c0344d2.f5781d) {
                        c0344d2.f5781d = true;
                        c0344d2.f5779b.executeDelayed(c0344d2.f5782e, c0344d2.f5780c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void c() {
        C0483ic c0483ic = this.f6141q;
        synchronized (c0483ic) {
            c0483ic.f6186b.a(c0483ic.f6185a);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final List<String> f() {
        return this.f4495b.f4458a.b();
    }

    @Override // io.appmetrica.analytics.impl.I2
    public final String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.I2
    public final void k() {
        super.k();
        C0294b4.l().m().c();
    }

    public final void l() {
        C0851wi c0851wi = this.f4501h;
        c0851wi.f7118c.a(this.f4495b.f4458a);
        C0369e2 c0369e2 = this.f6140p.f6902g;
        C0431gc c0431gc = new C0431gc(this);
        long longValue = f6139r.longValue();
        synchronized (c0369e2) {
            c0369e2.a(c0431gc, longValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(String str, boolean z2) {
        this.f4496c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        C0851wi c0851wi = this.f4501h;
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        HashMap hashMap = new HashMap();
        hashMap.put("type", "open");
        hashMap.put("link", str);
        hashMap.put("auto", Boolean.valueOf(z2));
        String b2 = AbstractC0430gb.b(hashMap);
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3(b2, "", 8208, 0, publicLogger);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(EnumC0599n enumC0599n) {
        if (enumC0599n == EnumC0599n.f6540b) {
            this.f4496c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.f4496c.warning("Could not enable activity auto tracking. " + enumC0599n.f6544a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(Activity activity) {
        if (this.f6140p.f6904i.a(activity, EnumC0651p.RESUMED)) {
            this.f4496c.info("Resume session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            C0369e2 c0369e2 = this.f6140p.f6902g;
            synchronized (c0369e2) {
                for (C0344d2 c0344d2 : c0369e2.f5861a) {
                    if (c0344d2.f5781d) {
                        c0344d2.f5781d = false;
                        c0344d2.f5779b.remove(c0344d2.f5782e);
                        C0457hc c0457hc = c0344d2.f5778a.f6075a;
                        c0457hc.f4501h.f7118c.b(c0457hc.f4495b.f4458a);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(Location location) {
        this.f4495b.f4459b.setManualLocation(location);
        this.f4496c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z2) {
        this.f4495b.f4459b.setLocationTracking(z2);
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(boolean z2, boolean z3) {
        this.f4496c.info("Set advIdentifiersTracking to %s", Boolean.valueOf(z2));
        this.f4495b.f4459b.setAdvIdentifiersTracking(z2, z3);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(Ho ho) {
        PublicLogger publicLogger = this.f4496c;
        synchronized (ho) {
            ho.f4490b = publicLogger;
        }
        Iterator it = ho.f4489a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        ho.f4489a.clear();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(AnrListener anrListener) {
        this.f6141q.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(ExternalAttribution externalAttribution) {
        this.f4496c.info("External attribution received: %s", externalAttribution);
        C0851wi c0851wi = this.f4501h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3(bytes, "", 42, publicLogger);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.I2, io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(String str, String str2) {
        super.a(str, str2);
        Bd bd = this.f6140p.f6898c;
        String d2 = this.f4495b.d();
        H0 h02 = bd.f4209d;
        if (h02 != null) {
            H0 h03 = new H0(h02.f4451a, h02.f4452b, h02.f4453c, h02.f4454d, h02.f4455e, d2);
            bd.f4209d = h03;
            NativeCrashClientModule nativeCrashClientModule = bd.f4207b;
            bd.f4208c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(I0.a(h03));
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia, io.appmetrica.analytics.impl.Hc
    public final void a(String str) {
        this.f4496c.info("Add auto collected data subscriber: %s", str);
        this.f4495b.f4459b.addAutoCollectedDataSubscriber(str);
    }
}
