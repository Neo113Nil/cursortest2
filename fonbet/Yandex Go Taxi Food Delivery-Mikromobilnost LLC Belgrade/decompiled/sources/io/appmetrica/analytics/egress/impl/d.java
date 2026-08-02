package io.appmetrica.analytics.egress.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.egress.internal.config.EgressConfig;

/* loaded from: classes9.dex */
public final class d implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b fromModel(EgressConfig egressConfig) {
        b bVar = new b();
        bVar.a = egressConfig.getEnabled();
        bVar.b = egressConfig.getUrl();
        bVar.c = egressConfig.getRepeatedDelay();
        bVar.d = egressConfig.getRandomDelayWindow();
        bVar.f = egressConfig.isDiagnosticsEnabled();
        bVar.e = egressConfig.isBackgroundAllowed();
        return bVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final EgressConfig toModel(b bVar) {
        return new EgressConfig(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f);
    }
}
