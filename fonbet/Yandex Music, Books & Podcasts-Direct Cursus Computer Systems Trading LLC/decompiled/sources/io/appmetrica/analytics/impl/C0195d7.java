package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.d7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0195d7 implements InterfaceC0315hc {
    public final C0252f7 a;
    public final C0351ik b;

    public C0195d7(@NotNull C0252f7 c0252f7) {
        this.a = c0252f7;
        this.b = c0252f7.b();
        C0777xc o = R4.l().o();
        if (o != null) {
            o.a(C0252f7.a());
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0315hc
    public final void a(@NotNull Vq vq) {
        C0237el c0237el = this.a.a;
        Yj a = c0237el.a(vq, this.b);
        C0351ik c0351ik = a.e;
        So so = c0237el.e;
        if (so != null) {
            c0351ik.b.setUuid(((Ro) so).g());
        } else {
            c0351ik.getClass();
        }
        c0237el.c.b(a);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + vq, new Object[0]);
    }

    public final void a(@NotNull AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                C0351ik c0351ik = this.b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (c0351ik) {
                    L9 l9 = c0351ik.c;
                    l9.b.b(l9.a, key, value);
                }
            }
        }
    }
}
