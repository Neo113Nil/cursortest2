package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.lb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0559lb implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Mc f6444a;

    public C0559lb() {
        this(new Mc(new Rn()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Qn qn) {
        return MessageNano.toByteArray((MessageNano) this.f6444a.f4751a.fromModel(qn));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0559lb(Mc mc) {
        this.f6444a = mc;
    }

    public final Qn a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
