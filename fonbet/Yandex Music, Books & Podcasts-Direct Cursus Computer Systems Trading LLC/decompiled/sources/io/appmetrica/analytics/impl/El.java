package io.appmetrica.analytics.impl;

import defpackage.g3a;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaYandexConfig;
import io.appmetrica.analytics.ReporterYandexConfig;
import io.appmetrica.analytics.RtmConfig;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.rtmwrapper.internal.IRtmClientWrapper;
import io.appmetrica.analytics.rtmwrapper.internal.RtmClientWrapper;

/* loaded from: classes5.dex */
public abstract class El {
    /* JADX WARN: Removed duplicated region for block: B:5:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Fl a(Ud ud) {
        IRtmClientWrapper rtmClientWrapper;
        RtmConfig rtmConfig;
        new C0632sc();
        g3a g3aVar = new g3a(1, ud.f.c);
        String str = ud.a.apiKey;
        if (ReflectionUtils.detectClassExists("io.appmetrica.analytics.rtm.internal.client.ExceptionProcessor")) {
            try {
                rtmClientWrapper = new RtmClientWrapper(g3aVar, str, true);
            } catch (Throwable unused) {
            }
            if (rtmClientWrapper == null) {
                rtmClientWrapper = new C0197d9();
            }
            AppMetricaConfig appMetricaConfig = ud.a;
            Fl fl = new Fl(rtmClientWrapper, new Cl(appMetricaConfig.appVersion, appMetricaConfig.deviceType), new C0814yl(), new Al());
            rtmConfig = AppMetricaYandexConfig.from(ud.a).rtmConfig;
            if (rtmConfig != null) {
                fl.updateRtmConfig(rtmConfig);
            }
            return fl;
        }
        rtmClientWrapper = null;
        if (rtmClientWrapper == null) {
        }
        AppMetricaConfig appMetricaConfig2 = ud.a;
        Fl fl2 = new Fl(rtmClientWrapper, new Cl(appMetricaConfig2.appVersion, appMetricaConfig2.deviceType), new C0814yl(), new Al());
        rtmConfig = AppMetricaYandexConfig.from(ud.a).rtmConfig;
        if (rtmConfig != null) {
        }
        return fl2;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Fl a(C0230ee c0230ee, String str) {
        IRtmClientWrapper rtmClientWrapper;
        RtmConfig rtmConfig;
        new C0632sc();
        g3a g3aVar = new g3a(1, c0230ee.c.c);
        if (ReflectionUtils.detectClassExists("io.appmetrica.analytics.rtm.internal.client.ExceptionProcessor")) {
            try {
                rtmClientWrapper = new RtmClientWrapper(g3aVar, str, false);
            } catch (Throwable unused) {
            }
            if (rtmClientWrapper == null) {
                rtmClientWrapper = new C0197d9();
            }
            Fl fl = new Fl(rtmClientWrapper, new Cl(null, null), new C0814yl(), new Al());
            rtmConfig = ReporterYandexConfig.from(c0230ee.b).rtmConfig;
            if (rtmConfig != null) {
                fl.updateRtmConfig(rtmConfig);
            }
            return fl;
        }
        rtmClientWrapper = null;
        if (rtmClientWrapper == null) {
        }
        Fl fl2 = new Fl(rtmClientWrapper, new Cl(null, null), new C0814yl(), new Al());
        rtmConfig = ReporterYandexConfig.from(c0230ee.b).rtmConfig;
        if (rtmConfig != null) {
        }
        return fl2;
    }
}
