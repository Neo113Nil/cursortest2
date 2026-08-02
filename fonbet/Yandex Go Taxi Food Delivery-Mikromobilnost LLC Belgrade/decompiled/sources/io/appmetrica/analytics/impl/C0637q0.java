package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0637q0 {
    public final HashMap a = new HashMap();

    public final synchronized C0608p0 a(K5 k5, PublicLogger publicLogger, Ih ih) {
        C0608p0 c0608p0;
        c0608p0 = (C0608p0) this.a.get(k5.toString());
        if (c0608p0 == null) {
            C0579o0 d = ih.d();
            c0608p0 = new C0608p0(d.a, d.b, new Po(publicLogger, "[App Environment]"));
            this.a.put(k5.toString(), c0608p0);
        }
        return c0608p0;
    }

    public final synchronized void a(C0579o0 c0579o0, Ih ih) {
        ih.a(c0579o0);
    }
}
