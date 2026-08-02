package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.g7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0355g7 implements InterfaceC0735tc {
    public final C0413i7 a;
    public final C0714sk b;

    public C0355g7(C0413i7 c0413i7) {
        this.a = c0413i7;
        this.b = c0413i7.b();
        Nc o = V4.l().o();
        if (o != null) {
            o.a(C0413i7.a());
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0735tc
    public final void a(C0606or c0606or) {
        C0600ol c0600ol = this.a.a;
        C0425ik a = c0600ol.a(c0606or, this.b);
        C0714sk c0714sk = a.e;
        InterfaceC0488kp interfaceC0488kp = c0600ol.e;
        if (interfaceC0488kp != null) {
            c0714sk.b.setUuid(((C0459jp) interfaceC0488kp).g());
        } else {
            c0714sk.getClass();
        }
        c0600ol.c.b(a);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + c0606or, new Object[0]);
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                C0714sk c0714sk = this.b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (c0714sk) {
                    R9 r9 = c0714sk.c;
                    r9.b.b(r9.a, key, value);
                }
            }
        }
    }
}
