package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0976p0 implements Consumer {
    public final Consumer a;
    public final g2 b;
    public final N c;

    public C0976p0(Consumer<Object> consumer, g2 g2Var, N n, String str) {
        this.a = consumer;
        this.b = g2Var;
        this.c = n;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        if (obj == null) {
            return;
        }
        this.a.consume(obj);
        this.b.b();
        N n = this.c;
        C0962k1 c0962k1 = n.c;
        if (c0962k1 != null) {
            long j = n.a.e.get();
            int i = c0962k1.d;
            if (j > i) {
                n.a.b((int) (i * 0.1f));
            }
            long j2 = n.b.e.get();
            int i2 = c0962k1.d;
            if (j2 > i2) {
                n.b.b((int) (i2 * 0.1f));
            }
        }
    }
}
