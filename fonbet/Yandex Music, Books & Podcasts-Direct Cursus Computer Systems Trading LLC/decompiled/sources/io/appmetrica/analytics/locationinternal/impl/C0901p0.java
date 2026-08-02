package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0901p0 implements Consumer {
    public final Consumer a;
    public final C0875g2 b;
    public final N c;

    public C0901p0(@NotNull Consumer<Object> consumer, @NotNull C0875g2 c0875g2, @NotNull N n, @NotNull String str) {
        this.a = consumer;
        this.b = c0875g2;
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
        C0887k1 c0887k1 = n.c;
        if (c0887k1 != null) {
            long j = n.a.e.get();
            int i = c0887k1.d;
            if (j > i) {
                n.a.b((int) (i * 0.1f));
            }
            long j2 = n.b.e.get();
            int i2 = c0887k1.d;
            if (j2 > i2) {
                n.b.b((int) (i2 * 0.1f));
            }
        }
    }
}
