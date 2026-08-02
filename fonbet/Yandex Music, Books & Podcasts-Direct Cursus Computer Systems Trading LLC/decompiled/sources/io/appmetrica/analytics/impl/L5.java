package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class L5 extends K5 {
    public L5(@NotNull P5 p5) {
        super(p5);
    }

    @Override // io.appmetrica.analytics.impl.K5
    public final boolean b(int i) {
        return i < 113;
    }

    @Override // io.appmetrica.analytics.impl.K5
    public final void c() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C0637sh c0637sh = this.a.c;
        try {
            Wn wn = new Wn(c0637sh, C0479n3.g);
            Long a = wn.c.a(Wn.d);
            if (a != null) {
                wn.a(Wn.d, Long.valueOf(timeUnit.toMillis(a.longValue())));
            }
            Long a2 = wn.c.a(Wn.e);
            if (a2 != null) {
                wn.a(Wn.e, Long.valueOf(timeUnit.toMillis(a2.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            Wn wn2 = new Wn(c0637sh, C0574qb.g);
            Long a3 = wn2.c.a(Wn.d);
            if (a3 != null) {
                wn2.a(Wn.d, Long.valueOf(timeUnit.toMillis(a3.longValue())));
            }
            Long a4 = wn2.c.a(Wn.e);
            if (a4 != null) {
                wn2.a(Wn.e, Long.valueOf(timeUnit.toMillis(a4.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
