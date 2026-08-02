package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Ka implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0703up fromModel(Ja ja) {
        C0703up c0703up = new C0703up();
        if (ja != null) {
            c0703up.a = ja.a;
        }
        return c0703up;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Ja(((C0703up) obj).a);
    }

    @NotNull
    public final Ja a(@NotNull C0703up c0703up) {
        return new Ja(c0703up.a);
    }
}
