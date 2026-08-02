package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0890l1 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S0 fromModel(@NotNull C0887k1 c0887k1) {
        S0 s0 = new S0();
        s0.a = c0887k1.a;
        s0.b = c0887k1.b;
        s0.c = c0887k1.c;
        s0.d = c0887k1.d;
        return s0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0887k1 toModel(@NotNull S0 s0) {
        return new C0887k1(s0.a, s0.b, s0.c, s0.d);
    }
}
