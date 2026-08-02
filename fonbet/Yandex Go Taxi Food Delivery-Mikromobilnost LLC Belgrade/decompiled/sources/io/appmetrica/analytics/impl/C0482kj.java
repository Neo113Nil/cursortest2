package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.kj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0482kj implements InterfaceC0517lp, InterfaceC0389hc {
    public final Context a;
    public final K5 b;
    public final L5 c;
    public final Wp d;
    public final InterfaceC0562nc e;

    public C0482kj(Context context, K5 k5, C0468k5 c0468k5, T5 t5, L5 l5, C0258cp c0258cp) {
        this.a = context;
        this.b = k5;
        this.c = l5;
        Wp a = c0258cp.a(context, k5, c0468k5.a);
        this.d = a;
        this.e = t5.a(context, k5, c0468k5.b, a);
        c0258cp.a(k5, this);
    }

    public final void a(K6 k6, C0468k5 c0468k5) {
        if (!La.c.contains(Hc.a(k6.d))) {
            this.e.a(c0468k5.b);
        }
        this.e.a(k6);
    }

    public final void b(Z4 z4) {
        this.c.a.remove(z4);
        if (this.c.a.isEmpty()) {
            ((InterfaceC0302ec) this.e).b();
        }
    }

    public final Context b() {
        return this.a;
    }

    public final void a(Z4 z4) {
        this.c.a.add(z4);
    }

    public C0482kj(Context context, K5 k5, C0468k5 c0468k5, T5 t5) {
        this(context, k5, c0468k5, t5, new L5(), C0258cp.a());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0517lp
    public final void a(Bp bp) {
        this.e.a(bp);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0517lp
    public final void a(EnumC0315ep enumC0315ep, Bp bp) {
        this.e.a(enumC0315ep, bp);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0389hc
    public final void a(C0468k5 c0468k5) {
        this.d.a(c0468k5.a);
        this.e.a(c0468k5.b);
    }

    public final K5 a() {
        return this.b;
    }
}
