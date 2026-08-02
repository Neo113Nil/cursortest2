package io.appmetrica.analytics.accessibility.impl;

import io.appmetrica.analytics.accessibility.internal.config.AccessibilityConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes9.dex */
public final class d implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b fromModel(AccessibilityConfig accessibilityConfig) {
        b bVar = new b();
        bVar.a = accessibilityConfig.getCom.yandex.messaging.core.net.entities.BackendConfig.Restrictions.ENABLED java.lang.String();
        bVar.b = accessibilityConfig.getCollectInterval();
        return bVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        b bVar = (b) obj;
        return new AccessibilityConfig(bVar.a, bVar.b);
    }

    public final AccessibilityConfig a(b bVar) {
        return new AccessibilityConfig(bVar.a, bVar.b);
    }
}
