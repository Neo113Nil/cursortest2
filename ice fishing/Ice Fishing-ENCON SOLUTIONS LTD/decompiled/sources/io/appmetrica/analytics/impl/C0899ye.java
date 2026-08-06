package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0899ye implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0777tm fromModel(C0873xe c0873xe) {
        C0777tm c0777tm = new C0777tm();
        c0777tm.f6956a = c0873xe.f7198a;
        c0777tm.f6957b = c0873xe.f7199b;
        return c0777tm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C0777tm c0777tm = (C0777tm) obj;
        return new C0873xe(c0777tm.f6956a, c0777tm.f6957b);
    }

    public final C0873xe a(C0777tm c0777tm) {
        return new C0873xe(c0777tm.f6956a, c0777tm.f6957b);
    }
}
