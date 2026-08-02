package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.UserInfo;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes9.dex */
public final class Er implements Converter {
    public final Fr a = new Fr();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UserInfo toModel(byte[] bArr) {
        return this.a.toModel((C0376h) MessageNano.mergeFrom(new C0376h(), bArr));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((UserInfo) obj));
    }

    public final byte[] a(UserInfo userInfo) {
        return MessageNano.toByteArray(this.a.fromModel(userInfo));
    }
}
