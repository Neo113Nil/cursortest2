package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.f3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396f3 implements ProtobufConverter {
    public final C0648om a(C0345d3 c0345d3) {
        C0648om c0648om = new C0648om();
        c0648om.f6695a = c0345d3.f5783a;
        return c0648om;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C0648om c0648om = new C0648om();
        c0648om.f6695a = ((C0345d3) obj).f5783a;
        return c0648om;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C0345d3(((C0648om) obj).f6695a);
    }

    public final C0345d3 a(C0648om c0648om) {
        return new C0345d3(c0648om.f6695a);
    }
}
