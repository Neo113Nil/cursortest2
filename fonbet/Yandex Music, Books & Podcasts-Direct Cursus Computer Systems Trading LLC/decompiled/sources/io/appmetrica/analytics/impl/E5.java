package io.appmetrica.analytics.impl;

import defpackage.t75;
import defpackage.u75;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class E5 {
    public final C0540p6 a;
    public final C0403ke b;
    public final C0403ke c;

    public E5(@NotNull E7 e7, @NotNull C0668tj c0668tj) {
        Qg qg = new Qg(e7);
        this.a = new C0540p6(e7);
        this.b = new C0403ke(qg, new D5(c0668tj));
        this.c = new C0403ke(qg, C5.a);
    }

    @NotNull
    public final List<N9> a() {
        return u75.h(this.a, this.b);
    }

    @NotNull
    public final List<N9> b() {
        return t75.c(this.c);
    }
}
