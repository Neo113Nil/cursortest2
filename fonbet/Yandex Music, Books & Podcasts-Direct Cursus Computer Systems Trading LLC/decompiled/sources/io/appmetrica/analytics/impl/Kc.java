package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes5.dex */
public final class Kc implements Converter {
    public final C0634se a;

    public Kc() {
        this(new C0634se(new Wq()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NonNull Vq vq) {
        return MessageNano.toByteArray((MessageNano) this.a.a.fromModel(vq));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Kc(C0634se c0634se) {
        this.a = c0634se;
    }

    @NonNull
    public final Vq a(@NonNull byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
