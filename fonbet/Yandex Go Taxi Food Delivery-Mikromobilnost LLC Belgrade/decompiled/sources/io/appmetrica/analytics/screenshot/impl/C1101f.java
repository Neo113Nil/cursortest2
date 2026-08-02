package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.screenshot.impl.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1101f implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w fromModel(N n) {
        w wVar = new w();
        wVar.a = n.a;
        return wVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new N(((w) obj).a);
    }

    public final N a(w wVar) {
        return new N(wVar.a);
    }
}
