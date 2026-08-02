package io.appmetrica.analytics.egress.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.egress.internal.config.EgressConfig;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes9.dex */
public final class c implements Converter {
    public final d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final EgressConfig toModel(byte[] bArr) {
        return this.a.toModel((b) MessageNano.mergeFrom(new b(), bArr));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((EgressConfig) obj));
    }

    public final byte[] a(EgressConfig egressConfig) {
        return MessageNano.toByteArray(this.a.fromModel(egressConfig));
    }
}
