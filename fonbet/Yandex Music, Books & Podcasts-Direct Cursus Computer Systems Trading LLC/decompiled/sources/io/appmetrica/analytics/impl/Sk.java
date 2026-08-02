package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.PulseLibraryConfig;
import io.appmetrica.analytics.ReporterYandexConfig;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Sk implements L1 {
    public final C0230ee a;

    public Sk(@NotNull C0230ee c0230ee) {
        this.a = c0230ee;
    }

    @Override // io.appmetrica.analytics.impl.L1
    public final void a(PulseConfig pulseConfig) {
        C0230ee c0230ee = this.a;
        HashMap hashMap = AbstractC0552pi.a;
        ReporterYandexConfig from = ReporterYandexConfig.from(c0230ee.b);
        PulseLibraryConfig pulseLibraryConfig = from.getPulseLibraryConfig();
        if (pulseLibraryConfig != null) {
            AbstractC0552pi.a(pulseLibraryConfig);
            Context context = c0230ee.a;
            Ud ud = AbstractC0552pi.c;
            if (!AbstractC0552pi.b || ud == null) {
                AbstractC0552pi.e.add(from);
                return;
            }
            HashMap hashMap2 = AbstractC0552pi.a;
            Object obj = hashMap2.get(context);
            if (obj == null) {
                obj = new C0523oi(context, 0);
                hashMap2.put(context, obj);
            }
            ((C0523oi) obj).a(from, from.getPulseLibraryConfig(), ud.e, ud.b);
        }
    }
}
