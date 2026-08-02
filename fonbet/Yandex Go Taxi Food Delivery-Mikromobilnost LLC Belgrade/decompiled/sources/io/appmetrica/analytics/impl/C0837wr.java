package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0837wr extends AbstractC0757u5 {
    public final C7 b;

    public C0837wr(C0670r5 c0670r5, C7 c7) {
        super(c0670r5);
        this.b = c7;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0757u5
    public final boolean a(K6 k6, C0613p5 c0613p5) {
        C0439j5 c0439j5 = c0613p5.b.d.a;
        this.b.a(c0439j5.i);
        Ad m = Jb.I.m();
        if (Boolean.TRUE.equals(c0439j5.b)) {
            m.a(true);
        } else {
            if (Boolean.FALSE.equals(c0439j5.b)) {
                m.a(false);
            }
        }
        m.a(c0439j5.c);
        Boolean bool = c0439j5.n;
        Jb.I.c().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}
