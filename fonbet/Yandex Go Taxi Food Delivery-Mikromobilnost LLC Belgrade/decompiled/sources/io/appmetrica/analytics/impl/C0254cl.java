package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.PulseLibraryConfig;
import io.appmetrica.analytics.ReporterYandexConfig;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.cl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0254cl implements L1 {
    public final C0737te a;

    public C0254cl(C0737te c0737te) {
        this.a = c0737te;
    }

    @Override // io.appmetrica.analytics.impl.L1
    public final void a(PulseConfig pulseConfig) {
        C0737te c0737te = this.a;
        HashMap hashMap = Gi.a;
        ReporterYandexConfig from = ReporterYandexConfig.from(c0737te.b);
        PulseLibraryConfig pulseLibraryConfig = from.getPulseLibraryConfig();
        if (pulseLibraryConfig != null) {
            Gi.a(pulseLibraryConfig);
            Context context = c0737te.a;
            C0448je c0448je = Gi.c;
            if (!Gi.b || c0448je == null) {
                Gi.e.add(from);
                return;
            }
            HashMap hashMap2 = Gi.a;
            Object obj = hashMap2.get(context);
            if (obj == null) {
                obj = new Fi(context, 0);
                hashMap2.put(context, obj);
            }
            ((Fi) obj).a(from, from.getPulseLibraryConfig(), c0448je.e, c0448je.b);
        }
    }
}
