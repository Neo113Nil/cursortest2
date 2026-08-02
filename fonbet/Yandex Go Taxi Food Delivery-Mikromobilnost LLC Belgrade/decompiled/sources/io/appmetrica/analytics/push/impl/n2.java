package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class n2 {
    public final m2 a;
    public final F0 b;
    public final CountDownLatch c;

    public n2(m2 m2Var, F0 f0) {
        this.a = m2Var;
        m2.a(m2Var, f0.a());
        this.b = f0;
        this.c = new CountDownLatch(1);
    }

    public final void a(long j, TimeUnit timeUnit) {
        if (this.c.getCount() != 0) {
            F0 f0 = this.b;
            f0.b.post(new l2(this));
        }
        try {
            this.c.await(j, timeUnit);
        } catch (InterruptedException e) {
            PublicLogger.INSTANCE.error(e, e.getMessage(), new Object[0]);
            Thread.currentThread().interrupt();
        }
    }
}
