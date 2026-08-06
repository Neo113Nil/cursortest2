package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class Dm implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0803um fromModel(Cm cm) {
        C0803um c0803um = new C0803um();
        c0803um.f7025a = cm.f4275a;
        return c0803um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Cm(((C0803um) obj).f7025a);
    }

    public final Cm a(C0803um c0803um) {
        return new Cm(c0803um.f7025a);
    }
}
