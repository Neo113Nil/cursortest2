package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes9.dex */
public final class I implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y fromModel(U u) {
        y yVar = new y();
        yVar.a = u.a;
        yVar.b = u.b;
        return yVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        y yVar = (y) obj;
        return new U(yVar.a, yVar.b);
    }

    public final U a(y yVar) {
        return new U(yVar.a, yVar.b);
    }
}
