package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaYandexConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.ie, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0420ie {
    public final Context a;
    public final C0600ol b;
    public final C0459jp c;
    public final C0508lg d;
    public final C0244cb e;
    public final R9 f;
    public final C0714sk g;
    public final R2 h;
    public final C0615p7 i;
    public final r j;
    public final C0827wh k;
    public final C0635pr l;
    public final C0569nj m;
    public final C0730t7 n;
    public final C0434j0 o;

    public C0420ie(Context context, C0597oi c0597oi, C0600ol c0600ol, C0459jp c0459jp) {
        this.a = context;
        this.b = c0600ol;
        this.c = c0459jp;
        this.d = new C0508lg(c0597oi);
        C0244cb c0244cb = new C0244cb(context);
        this.e = c0244cb;
        R9 r9 = new R9(new Po(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.f = r9;
        this.g = new C0714sk(c0597oi, new CounterConfiguration(CounterConfigurationReporterType.MAIN), r9);
        this.h = new R2();
        this.i = V4.l().n();
        this.j = new r();
        this.k = new C0827wh(c0244cb);
        this.l = new C0635pr();
        this.m = new C0569nj();
        this.n = new C0730t7();
        this.o = new C0434j0();
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
        this.g.b.applyFromAnonymousConfig(appMetricaConfig);
        C0714sk c0714sk = this.g;
        String str = appMetricaConfig.userProfileID;
        synchronized (c0714sk) {
            c0714sk.f = str;
        }
        C0714sk c0714sk2 = this.g;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get(AppMetricaYandexConfig.PRELOAD_INFO_AUTO_TRACKING_KEY);
        c0714sk2.d = new C0366gi(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
    }

    public final void b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        publicLogger.info("Update config with value " + appMetricaConfig.toJson(), new Object[0]);
        this.g.b.applyFromConfig(appMetricaConfig);
        C0714sk c0714sk = this.g;
        String str = appMetricaConfig.userProfileID;
        synchronized (c0714sk) {
            c0714sk.f = str;
        }
        C0714sk c0714sk2 = this.g;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get(AppMetricaYandexConfig.PRELOAD_INFO_AUTO_TRACKING_KEY);
        c0714sk2.d = new C0366gi(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb.append(num.intValue());
        publicLogger.info(sb.toString(), new Object[0]);
    }

    public final Context c() {
        return this.a;
    }

    public final C0730t7 d() {
        return this.n;
    }

    public final C0244cb e() {
        return this.e;
    }

    public final C0827wh f() {
        return this.k;
    }

    public final C0615p7 g() {
        return this.i;
    }

    public final C0569nj h() {
        return this.m;
    }

    public final C0714sk i() {
        return this.g;
    }

    public final C0600ol j() {
        return this.b;
    }

    public final C0459jp k() {
        return this.c;
    }

    public final C0635pr l() {
        return this.l;
    }

    public final C0434j0 a() {
        return this.o;
    }

    public final R2 b() {
        return this.h;
    }
}
