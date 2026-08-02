package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class Td implements Ga {
    public final C0325f6 a;

    public Td(Ka ka, I7 i7, C0916zj c0916zj, C0439j5 c0439j5, K5 k5, Ih ih) {
        Sd sd = new Sd(i7, c0916zj, this, c0439j5, ih);
        this.a = new C0325f6(ka, sd.a(), sd.b(), k5);
    }

    @Override // io.appmetrica.analytics.impl.Ga
    public final Fa a() {
        return this.a;
    }

    public final C0325f6 b() {
        return this.a;
    }
}
