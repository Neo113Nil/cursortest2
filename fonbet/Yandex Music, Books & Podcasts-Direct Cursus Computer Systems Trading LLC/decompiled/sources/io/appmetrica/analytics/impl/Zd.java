package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaYandexConfig;
import io.appmetrica.analytics.PulseConfig;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Zd implements L1 {
    public final Ud a;

    public Zd(@NotNull Ud ud) {
        this.a = ud;
    }

    @Override // io.appmetrica.analytics.impl.L1
    public final void a(PulseConfig pulseConfig) {
        Ud ud = this.a;
        AbstractC0552pi.c = ud;
        AppMetricaYandexConfig from = AppMetricaYandexConfig.from(ud.a);
        if (pulseConfig == null) {
            pulseConfig = from.pulseConfig;
        }
        PulseConfig pulseConfig2 = pulseConfig;
        AbstractC0552pi.a(pulseConfig2);
        Context context = ud.c;
        if (!AbstractC0552pi.b) {
            AbstractC0552pi.d = pulseConfig2;
            return;
        }
        HashMap hashMap = AbstractC0552pi.a;
        Object obj = hashMap.get(context);
        if (obj == null) {
            obj = new C0523oi(context, 0);
            hashMap.put(context, obj);
        }
        ((C0523oi) obj).a(from, pulseConfig2, ud.e, ud.b, ud.g);
    }
}
