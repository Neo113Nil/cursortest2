package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.idsync.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259d implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0260e f4010a;

    public C0259d(C0260e c0260e) {
        this.f4010a = c0260e;
    }

    public final byte[] a(IdSyncConfig idSyncConfig) {
        return MessageNano.toByteArray(this.f4010a.fromModel(idSyncConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f4010a.fromModel((IdSyncConfig) obj));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(byte[] bArr) {
        return this.f4010a.toModel((m) MessageNano.mergeFrom(new m(), bArr));
    }
}
