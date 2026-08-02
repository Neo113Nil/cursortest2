package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Hp implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0818yp fromModel(@NotNull Gp gp) {
        C0818yp c0818yp = new C0818yp();
        c0818yp.a = gp.a;
        return c0818yp;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Gp(((C0818yp) obj).a);
    }

    @NotNull
    public final Gp a(@NotNull C0818yp c0818yp) {
        return new Gp(c0818yp.a);
    }
}
