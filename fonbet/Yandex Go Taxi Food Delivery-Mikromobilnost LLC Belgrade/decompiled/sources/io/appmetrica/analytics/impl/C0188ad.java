package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.ad, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0188ad implements Converter {
    public final He a;

    public C0188ad() {
        this(new He(new C0635pr()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(C0606or c0606or) {
        return MessageNano.toByteArray((MessageNano) this.a.a.fromModel(c0606or));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0188ad(He he) {
        this.a = he;
    }

    public final C0606or a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
