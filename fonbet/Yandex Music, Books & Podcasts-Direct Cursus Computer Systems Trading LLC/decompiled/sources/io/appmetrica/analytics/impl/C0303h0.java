package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0303h0 implements ProtobufConverter {
    public final C0101a0 a;
    public final Z6 b;

    public C0303h0() {
        this(new C0101a0(new Cq()), new Z6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K6 fromModel(@NonNull C0274g0 c0274g0) {
        K6 k6 = new K6();
        k6.a = this.a.fromModel(c0274g0.a);
        String str = c0274g0.b;
        if (str != null) {
            k6.b = str;
        }
        k6.c = this.b.a(c0274g0.c);
        return k6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0303h0(C0101a0 c0101a0, Z6 z6) {
        this.a = c0101a0;
        this.b = z6;
    }

    @NonNull
    public final C0274g0 a(@NonNull K6 k6) {
        throw new UnsupportedOperationException();
    }
}
