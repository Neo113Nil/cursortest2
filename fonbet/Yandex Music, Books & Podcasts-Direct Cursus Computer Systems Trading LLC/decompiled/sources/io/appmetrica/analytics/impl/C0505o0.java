package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0505o0 {
    public final HashMap a = new HashMap();

    public final synchronized C0476n0 a(H5 h5, PublicLogger publicLogger, C0637sh c0637sh) {
        C0476n0 c0476n0;
        c0476n0 = (C0476n0) this.a.get(h5.toString());
        if (c0476n0 == null) {
            C0447m0 d = c0637sh.d();
            c0476n0 = new C0476n0(d.a, d.b, new C0702uo(publicLogger, "[App Environment]"));
            this.a.put(h5.toString(), c0476n0);
        }
        return c0476n0;
    }

    public final synchronized void a(C0447m0 c0447m0, C0637sh c0637sh) {
        c0637sh.a(c0447m0).b();
    }
}
