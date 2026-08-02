package io.appmetrica.analytics.accessibility.impl;

import io.appmetrica.analytics.accessibility.internal.config.AccessibilityConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes9.dex */
public final class c implements Converter {
    public final d a = new d();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AccessibilityConfig toModel(byte[] bArr) {
        d dVar = this.a;
        b bVar = (b) MessageNano.mergeFrom(new b(), bArr);
        dVar.getClass();
        return new AccessibilityConfig(bVar.a, bVar.b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.a.fromModel((AccessibilityConfig) obj));
    }

    public final byte[] a(AccessibilityConfig accessibilityConfig) {
        return MessageNano.toByteArray(this.a.fromModel(accessibilityConfig));
    }
}
