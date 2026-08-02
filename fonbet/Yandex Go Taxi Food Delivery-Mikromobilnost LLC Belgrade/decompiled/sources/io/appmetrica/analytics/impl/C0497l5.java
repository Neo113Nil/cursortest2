package io.appmetrica.analytics.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.l5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0497l5 extends AbstractC0526m5 {
    public C0497l5(C0455jl c0455jl) {
        super(c0455jl);
    }

    public final void a(Hc hc, List<Aj> list) {
        if (!La.h.contains(hc)) {
            list.add(this.a.s);
        }
        if (La.b.contains(hc)) {
            return;
        }
        list.add(this.a.c);
    }
}
