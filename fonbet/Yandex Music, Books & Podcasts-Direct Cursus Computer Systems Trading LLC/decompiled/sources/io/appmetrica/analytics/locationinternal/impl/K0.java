package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class K0 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final I0 toModel(@NotNull U0 u0) {
        boolean z;
        boolean z2 = u0.a;
        boolean z3 = u0.b;
        boolean z4 = false;
        if (u0.c && z2) {
            z = false;
            z4 = true;
        } else {
            z = false;
        }
        return new I0(z2, z3, z4, (u0.e && z2) ? true : z, (u0.d && z2) ? true : z);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U0 fromModel(@NotNull I0 i0) {
        U0 u0 = new U0();
        u0.a = i0.a;
        u0.b = i0.b;
        u0.c = i0.c;
        u0.d = i0.e;
        u0.e = i0.d;
        return u0;
    }
}
