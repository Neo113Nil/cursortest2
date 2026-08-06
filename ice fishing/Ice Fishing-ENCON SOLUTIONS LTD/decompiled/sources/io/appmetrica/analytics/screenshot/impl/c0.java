package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class c0 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P fromModel(a0 a0Var) {
        P p2 = new P();
        p2.f7605a = a0Var.f7629a;
        p2.f7606b = a0Var.f7630b;
        return p2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        P p2 = (P) obj;
        return new a0(p2.f7605a, p2.f7606b);
    }

    public final a0 a(P p2) {
        return new a0(p2.f7605a, p2.f7606b);
    }
}
