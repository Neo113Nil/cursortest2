package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaYandexConfig;
import io.appmetrica.analytics.PulseConfig;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0593oe implements L1 {
    public final C0448je a;

    public C0593oe(C0448je c0448je) {
        this.a = c0448je;
    }

    @Override // io.appmetrica.analytics.impl.L1
    public final void a(PulseConfig pulseConfig) {
        C0448je c0448je = this.a;
        Gi.c = c0448je;
        AppMetricaYandexConfig from = AppMetricaYandexConfig.from(c0448je.a);
        if (pulseConfig == null) {
            pulseConfig = from.pulseConfig;
        }
        PulseConfig pulseConfig2 = pulseConfig;
        Gi.a(pulseConfig2);
        Context context = c0448je.c;
        if (!Gi.b) {
            Gi.d = pulseConfig2;
            return;
        }
        HashMap hashMap = Gi.a;
        Object obj = hashMap.get(context);
        if (obj == null) {
            obj = new Fi(context, 0);
            hashMap.put(context, obj);
        }
        ((Fi) obj).a(from, pulseConfig2, c0448je.e, c0448je.b, c0448je.g);
    }
}
