package io.appmetrica.analytics.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0405i extends Nb {
    public final K5 b;

    public C0405i(C0455jl c0455jl, K5 k5) {
        super(c0455jl);
        this.b = k5;
    }

    @Override // io.appmetrica.analytics.impl.Nb
    public final void a(List<Aj> list) {
        list.add(this.a.p);
        list.add(this.a.o);
        list.add(this.a.r);
        list.add(this.a.g);
        if (this.b.d()) {
            list.add(this.a.q);
        }
    }
}
