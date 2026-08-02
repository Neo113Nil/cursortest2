package io.appmetrica.analytics.impl;

import defpackage.i3y;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class Sd {
    public final C0916zj a;
    public final Ga b;
    public final C0439j5 c;
    public final Ih d;
    public final H5 e;
    public final C0535me f = new C0535me();
    public final i3y g = kotlin.a.a(new Rd(this));

    public Sd(I7 i7, C0916zj c0916zj, Ga ga, C0439j5 c0439j5, Ih ih) {
        this.a = c0916zj;
        this.b = ga;
        this.c = c0439j5;
        this.d = ih;
        this.e = new H5(i7, c0916zj);
    }

    public final List<U9> a() {
        return this.e.a();
    }

    public final List<U9> b() {
        return kotlin.collections.a.m0(Collections.singletonList((U9) this.g.getValue()), Collections.singletonList(this.e.c));
    }
}
