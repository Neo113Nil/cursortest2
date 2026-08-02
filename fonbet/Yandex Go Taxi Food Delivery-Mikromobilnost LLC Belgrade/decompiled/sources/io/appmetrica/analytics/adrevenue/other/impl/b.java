package io.appmetrica.analytics.adrevenue.other.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes9.dex */
public final class b implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c fromModel(j jVar) {
        c cVar = new c();
        cVar.a = jVar.a;
        cVar.b = jVar.b;
        return cVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        c cVar = (c) obj;
        return new j(cVar.a, cVar.b);
    }

    public final j a(c cVar) {
        return new j(cVar.a, cVar.b);
    }
}
