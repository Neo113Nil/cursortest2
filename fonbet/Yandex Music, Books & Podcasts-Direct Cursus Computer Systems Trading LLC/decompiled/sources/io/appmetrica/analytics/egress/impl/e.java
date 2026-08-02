package io.appmetrica.analytics.egress.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class e implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c fromModel(@NotNull a aVar) {
        c cVar = new c();
        cVar.a = aVar.a;
        cVar.b = aVar.b;
        cVar.c = aVar.c;
        cVar.d = aVar.d;
        cVar.f = aVar.f;
        cVar.e = aVar.e;
        return cVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a toModel(@NotNull c cVar) {
        return new a(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f);
    }
}
