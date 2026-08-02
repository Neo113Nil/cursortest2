package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class O5 extends N5 {
    public O5(S5 s5) {
        super(s5);
    }

    @Override // io.appmetrica.analytics.impl.N5
    public final boolean b(int i) {
        return i < 113;
    }

    @Override // io.appmetrica.analytics.impl.N5
    public final void c() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Ih ih = this.a.c;
        try {
            C0689ro c0689ro = new C0689ro(ih, C0553n3.g);
            Long b = c0689ro.c.b(C0689ro.d);
            if (b != null) {
                c0689ro.a(C0689ro.d, Long.valueOf(timeUnit.toMillis(b.longValue())));
            }
            Long b2 = c0689ro.c.b(C0689ro.e);
            if (b2 != null) {
                c0689ro.a(C0689ro.e, Long.valueOf(timeUnit.toMillis(b2.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            C0689ro c0689ro2 = new C0689ro(ih, "foreground");
            Long b3 = c0689ro2.c.b(C0689ro.d);
            if (b3 != null) {
                c0689ro2.a(C0689ro.d, Long.valueOf(timeUnit.toMillis(b3.longValue())));
            }
            Long b4 = c0689ro2.c.b(C0689ro.e);
            if (b4 != null) {
                c0689ro2.a(C0689ro.e, Long.valueOf(timeUnit.toMillis(b4.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
