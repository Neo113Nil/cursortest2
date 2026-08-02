package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.s0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0909s0 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T0 fromModel(@NotNull C0906r0 c0906r0) {
        T0 t0 = new T0();
        t0.a = c0906r0.a;
        t0.c = c0906r0.b;
        t0.d = c0906r0.c;
        t0.e = c0906r0.d;
        t0.f = c0906r0.e;
        t0.g = c0906r0.f;
        t0.h = c0906r0.g;
        t0.b = c0906r0.h;
        return t0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0906r0 toModel(@NotNull T0 t0) {
        return new C0906r0(t0.a, t0.c, t0.d, t0.e, t0.f, t0.g, t0.h, t0.b);
    }
}
