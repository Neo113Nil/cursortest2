package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class Hm implements ProtobufConverter {
    public final C0829vm a(Gm gm) {
        C0829vm c0829vm = new C0829vm();
        c0829vm.f7076a = gm.f4443a;
        return c0829vm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C0829vm c0829vm = new C0829vm();
        c0829vm.f7076a = ((Gm) obj).f4443a;
        return c0829vm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Gm(((C0829vm) obj).f7076a);
    }

    public final Gm a(C0829vm c0829vm) {
        return new Gm(c0829vm.f7076a);
    }
}
