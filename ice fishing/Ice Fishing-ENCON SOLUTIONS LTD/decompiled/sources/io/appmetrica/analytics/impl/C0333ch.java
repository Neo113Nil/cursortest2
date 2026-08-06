package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ch, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333ch extends Rg {
    public C0333ch(X4 x4) {
        super(x4);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        Dk dk;
        Tk tk;
        C0531k9 c0531k9 = this.f4998a.f5359n;
        Rk rk = c0531k9.f6357c;
        if (rk.f5007g == 0) {
            dk = rk.f5004d.b();
            Dk b2 = rk.f5005e.b();
            if ((dk == null ? -1L : dk.f4313d) <= (b2 != null ? b2.f4313d : -1L)) {
                dk = b2;
            }
        } else {
            dk = rk.f5006f;
        }
        if (dk != null) {
            tk = new Tk();
            tk.f5123a = dk.f4313d;
            long andIncrement = dk.f4315f.getAndIncrement();
            Uk uk = dk.f4311b;
            uk.a(Uk.f5178g, Long.valueOf(dk.f4315f.get()));
            uk.b();
            tk.f5124b = andIncrement;
            tk.f5125c = TimeUnit.MILLISECONDS.toSeconds(dk.f4319j);
            tk.f5126d = dk.f4312c.f4434a;
        } else {
            long j2 = p5.f4913j;
            long a2 = rk.f5002b.a();
            L6 l6 = rk.f5001a.f5350e;
            Vk vk = Vk.BACKGROUND;
            l6.a(a2, vk, j2);
            Tk tk2 = new Tk();
            tk2.f5123a = a2;
            tk2.f5126d = vk;
            tk2.f5124b = 0L;
            tk2.f5125c = 0L;
            tk = tk2;
        }
        c0531k9.a(p5, tk);
        return false;
    }
}
