package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.l6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0554l6 implements Ua {

    /* renamed from: a, reason: collision with root package name */
    public final C0580m6 f6422a;

    /* renamed from: b, reason: collision with root package name */
    public final Fh f6423b;

    public C0554l6(C0580m6 c0580m6) {
        this.f6422a = c0580m6;
        this.f6423b = c0580m6.a();
        C0294b4.l().getClass();
    }

    @Override // io.appmetrica.analytics.impl.Ua
    public final void a(Qn qn) {
        C0851wi c0851wi = this.f6422a.f6482a;
        C0824vh a2 = c0851wi.a(qn, this.f6423b);
        Fh fh = a2.f7069e;
        Pl pl = c0851wi.f7120e;
        if (pl != null) {
            fh.f4459b.setUuid(((Ol) pl).g());
        } else {
            fh.getClass();
        }
        c0851wi.f7118c.b(a2);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + qn, new Object[0]);
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Fh fh = this.f6423b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (fh) {
                    D8 d8 = fh.f4384c;
                    d8.f4294b.b(d8.f4293a, key, value);
                }
            }
        }
    }
}
