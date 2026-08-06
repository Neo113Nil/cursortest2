package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.sc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0741sc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6896a;

    /* renamed from: b, reason: collision with root package name */
    public final C0851wi f6897b;

    /* renamed from: c, reason: collision with root package name */
    public final Bd f6898c;

    /* renamed from: d, reason: collision with root package name */
    public final M9 f6899d;

    /* renamed from: e, reason: collision with root package name */
    public final D8 f6900e;

    /* renamed from: f, reason: collision with root package name */
    public final Fh f6901f;

    /* renamed from: g, reason: collision with root package name */
    public final C0369e2 f6902g;

    /* renamed from: h, reason: collision with root package name */
    public final C0709r6 f6903h;

    /* renamed from: i, reason: collision with root package name */
    public final C0677q f6904i;

    /* renamed from: j, reason: collision with root package name */
    public final Je f6905j;

    /* renamed from: k, reason: collision with root package name */
    public final Rn f6906k;

    /* renamed from: l, reason: collision with root package name */
    public final Eg f6907l;

    /* renamed from: m, reason: collision with root package name */
    public final C0813v6 f6908m;

    /* renamed from: n, reason: collision with root package name */
    public final C0342d0 f6909n;

    public C0741sc(Context context, Bf bf, C0851wi c0851wi, Ol ol) {
        this.f6896a = context;
        this.f6897b = c0851wi;
        this.f6898c = new Bd(bf);
        M9 m9 = new M9(context);
        this.f6899d = m9;
        D8 d8 = new D8(new C0724rl(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.f6900e = d8;
        this.f6901f = new Fh(bf, new CounterConfiguration(CounterConfigurationReporterType.MAIN), d8);
        this.f6902g = new C0369e2();
        this.f6903h = C0294b4.l().n();
        this.f6904i = new C0677q();
        this.f6905j = new Je(m9);
        this.f6906k = new Rn();
        this.f6907l = new Eg();
        this.f6908m = new C0813v6();
        this.f6909n = new C0342d0();
    }

    public final C0342d0 a() {
        return this.f6909n;
    }

    public final Context b() {
        return this.f6896a;
    }

    public final C0813v6 c() {
        return this.f6908m;
    }

    public final M9 d() {
        return this.f6899d;
    }

    public final Je e() {
        return this.f6905j;
    }

    public final C0709r6 f() {
        return this.f6903h;
    }

    public final Eg g() {
        return this.f6907l;
    }

    public final Fh h() {
        return this.f6901f;
    }

    public final C0851wi i() {
        return this.f6897b;
    }

    public final Rn j() {
        return this.f6906k;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        publicLogger.info("Update config with value " + appMetricaConfig.toJson(), new Object[0]);
        this.f6901f.f4459b.applyFromConfig(appMetricaConfig);
        Fh fh = this.f6901f;
        String str = appMetricaConfig.userProfileID;
        synchronized (fh) {
            fh.f4387f = str;
        }
        Fh fh2 = this.f6901f;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        fh2.f4385d = new C0796uf(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb.append(num.intValue());
        publicLogger.info(sb.toString(), new Object[0]);
    }
}
