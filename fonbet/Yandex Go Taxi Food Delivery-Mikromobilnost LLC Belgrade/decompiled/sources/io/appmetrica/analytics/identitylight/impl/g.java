package io.appmetrica.analytics.identitylight.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.identitylight.internal.config.IdentityLightConfig;

/* loaded from: classes9.dex */
public final class g implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final e fromModel(IdentityLightConfig identityLightConfig) {
        e eVar = new e();
        eVar.a = identityLightConfig.getCom.yandex.messaging.core.net.entities.BackendConfig.Restrictions.ENABLED java.lang.String();
        eVar.b = identityLightConfig.getMinInterval();
        return eVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        e eVar = (e) obj;
        return new IdentityLightConfig(eVar.a, eVar.b);
    }

    public final IdentityLightConfig a(e eVar) {
        return new IdentityLightConfig(eVar.a, eVar.b);
    }
}
