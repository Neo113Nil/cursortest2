package io.appmetrica.analytics.impl;

import defpackage.scc;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class H5 {
    public final C0700s6 a;
    public final C0911ze b;
    public final C0911ze c;

    public H5(I7 i7, C0916zj c0916zj) {
        C0365gh c0365gh = new C0365gh(i7);
        this.a = new C0700s6(i7);
        this.b = new C0911ze(c0365gh, new G5(c0916zj));
        this.c = new C0911ze(c0365gh, F5.a);
    }

    public final List<U9> a() {
        return scc.g(this.a, this.b);
    }

    public final List<U9> b() {
        return Collections.singletonList(this.c);
    }
}
