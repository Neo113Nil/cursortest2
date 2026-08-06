package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class U4 extends T4 {
    public U4(X4 x4) {
        super(x4);
    }

    @Override // io.appmetrica.analytics.impl.T4
    public final boolean b(int i2) {
        return i2 < 113;
    }

    @Override // io.appmetrica.analytics.impl.T4
    public final void c() {
        We we = this.f5089a.f5348c;
        try {
            Uk uk = new Uk(we, C0913z2.f7266g);
            Long a2 = uk.f5183c.a(Uk.f5175d);
            if (a2 != null) {
                uk.a(Uk.f5175d, Long.valueOf(TimeUnit.SECONDS.toMillis(a2.longValue())));
            }
            Long a3 = uk.f5183c.a(Uk.f5176e);
            if (a3 != null) {
                uk.a(Uk.f5176e, Long.valueOf(TimeUnit.SECONDS.toMillis(a3.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            Uk uk2 = new Uk(we, C0455ha.f6138g);
            Long a4 = uk2.f5183c.a(Uk.f5175d);
            if (a4 != null) {
                uk2.a(Uk.f5175d, Long.valueOf(TimeUnit.SECONDS.toMillis(a4.longValue())));
            }
            Long a5 = uk2.f5183c.a(Uk.f5176e);
            if (a5 != null) {
                uk2.a(Uk.f5176e, Long.valueOf(TimeUnit.SECONDS.toMillis(a5.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
