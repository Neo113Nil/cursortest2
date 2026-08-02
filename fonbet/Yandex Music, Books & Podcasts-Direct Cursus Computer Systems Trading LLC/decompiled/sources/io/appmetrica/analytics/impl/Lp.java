package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes5.dex */
public final class Lp implements ProtobufConverter {
    @NonNull
    public final C0846zp a(@NonNull Kp kp) {
        C0846zp c0846zp = new C0846zp();
        c0846zp.a = kp.a;
        return c0846zp;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C0846zp c0846zp = new C0846zp();
        c0846zp.a = ((Kp) obj).a;
        return c0846zp;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new Kp(((C0846zp) obj).a);
    }

    @NonNull
    public final Kp a(@NonNull C0846zp c0846zp) {
        return new Kp(c0846zp.a);
    }
}
