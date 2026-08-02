package io.appmetrica.analytics.impl;

import defpackage.s59;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaYandexConfig;
import io.appmetrica.analytics.ReporterYandexConfig;
import io.appmetrica.analytics.RtmConfig;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.rtmwrapper.internal.IRtmClientWrapper;
import io.appmetrica.analytics.rtmwrapper.internal.RtmClientWrapper;

/* loaded from: classes9.dex */
public abstract class Pl {
    /* JADX WARN: Removed duplicated region for block: B:5:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Ql a(C0448je c0448je) {
        IRtmClientWrapper rtmClientWrapper;
        RtmConfig rtmConfig;
        new Ic();
        s59 s59Var = new s59(c0448je.f.c);
        String str = c0448je.a.apiKey;
        if (ReflectionUtils.detectClassExists("io.appmetrica.analytics.rtm.internal.client.ExceptionProcessor")) {
            try {
                rtmClientWrapper = new RtmClientWrapper(s59Var, str, true);
            } catch (Throwable unused) {
            }
            if (rtmClientWrapper == null) {
                rtmClientWrapper = new C0443j9();
            }
            AppMetricaConfig appMetricaConfig = c0448je.a;
            Ql ql = new Ql(rtmClientWrapper, new Nl(appMetricaConfig.appVersion, appMetricaConfig.deviceType), new Jl(), new Ll());
            rtmConfig = AppMetricaYandexConfig.from(c0448je.a).rtmConfig;
            if (rtmConfig != null) {
                ql.updateRtmConfig(rtmConfig);
            }
            return ql;
        }
        rtmClientWrapper = null;
        if (rtmClientWrapper == null) {
        }
        AppMetricaConfig appMetricaConfig2 = c0448je.a;
        Ql ql2 = new Ql(rtmClientWrapper, new Nl(appMetricaConfig2.appVersion, appMetricaConfig2.deviceType), new Jl(), new Ll());
        rtmConfig = AppMetricaYandexConfig.from(c0448je.a).rtmConfig;
        if (rtmConfig != null) {
        }
        return ql2;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Ql a(C0737te c0737te, String str) {
        IRtmClientWrapper rtmClientWrapper;
        RtmConfig rtmConfig;
        new Ic();
        s59 s59Var = new s59(c0737te.c.c);
        if (ReflectionUtils.detectClassExists("io.appmetrica.analytics.rtm.internal.client.ExceptionProcessor")) {
            try {
                rtmClientWrapper = new RtmClientWrapper(s59Var, str, false);
            } catch (Throwable unused) {
            }
            if (rtmClientWrapper == null) {
                rtmClientWrapper = new C0443j9();
            }
            Ql ql = new Ql(rtmClientWrapper, new Nl(null, null), new Jl(), new Ll());
            rtmConfig = ReporterYandexConfig.from(c0737te.b).rtmConfig;
            if (rtmConfig != null) {
                ql.updateRtmConfig(rtmConfig);
            }
            return ql;
        }
        rtmClientWrapper = null;
        if (rtmClientWrapper == null) {
        }
        Ql ql2 = new Ql(rtmClientWrapper, new Nl(null, null), new Jl(), new Ll());
        rtmConfig = ReporterYandexConfig.from(c0737te.b).rtmConfig;
        if (rtmConfig != null) {
        }
        return ql2;
    }
}
