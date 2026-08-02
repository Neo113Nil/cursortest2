package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.locationinternal.internal.config.LocationConfig;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.c1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0935c1 implements Converter {
    public final M0 a = new M0();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final LocationConfig toModel(byte[] bArr) {
        return this.a.toModel((U0) MessageNano.mergeFrom(new U0(), bArr));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((LocationConfig) obj));
    }

    public final byte[] a(LocationConfig locationConfig) {
        return MessageNano.toByteArray(this.a.fromModel(locationConfig));
    }
}
