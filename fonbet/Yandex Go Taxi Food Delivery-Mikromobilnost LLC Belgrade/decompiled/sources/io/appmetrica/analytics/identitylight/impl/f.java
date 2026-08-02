package io.appmetrica.analytics.identitylight.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.identitylight.internal.config.IdentityLightConfig;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes9.dex */
public final class f implements Converter {
    public final g a = new g();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdentityLightConfig toModel(byte[] bArr) {
        g gVar = this.a;
        e eVar = (e) MessageNano.mergeFrom(new e(), bArr);
        gVar.getClass();
        return new IdentityLightConfig(eVar.a, eVar.b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((IdentityLightConfig) obj));
    }

    public final byte[] a(IdentityLightConfig identityLightConfig) {
        return MessageNano.toByteArray(this.a.fromModel(identityLightConfig));
    }
}
