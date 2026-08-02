package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes5.dex */
public final class U3 implements ProtobufConverter {
    @NonNull
    public final C0645sp a(@NonNull S3 s3) {
        C0645sp c0645sp = new C0645sp();
        c0645sp.a = s3.a;
        return c0645sp;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C0645sp c0645sp = new C0645sp();
        c0645sp.a = ((S3) obj).a;
        return c0645sp;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new S3(((C0645sp) obj).a);
    }

    @NonNull
    public final S3 a(@NonNull C0645sp c0645sp) {
        return new S3(c0645sp.a);
    }
}
