package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0879i implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q0 fromModel(@NotNull C0876h c0876h) {
        Q0 q0 = new Q0();
        q0.a = c0876h.a;
        q0.b = c0876h.b;
        return q0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        Q0 q0 = (Q0) obj;
        return new C0876h(q0.a, q0.b);
    }

    @NotNull
    public final C0876h a(@NotNull Q0 q0) {
        return new C0876h(q0.a, q0.b);
    }
}
