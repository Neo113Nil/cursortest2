package io.appmetrica.analytics.networkquality.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.networkquality.internal.NetworkQualityConfigWrapper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes9.dex */
public final class k implements Converter {
    public final l a;

    public k(l lVar) {
        this.a = lVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final NetworkQualityConfigWrapper toModel(byte[] bArr) {
        return this.a.toModel((j) MessageNano.mergeFrom(new j(), bArr));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((NetworkQualityConfigWrapper) obj));
    }

    public final byte[] a(NetworkQualityConfigWrapper networkQualityConfigWrapper) {
        return MessageNano.toByteArray(this.a.fromModel(networkQualityConfigWrapper));
    }
}
