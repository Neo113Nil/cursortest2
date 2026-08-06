package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.l3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0551l3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0713ra f6413a;

    public C0551l3() {
        this(new C0713ra(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(List<String> list) {
        Mn a2 = this.f6413a.a((List<Object>) list);
        C0401f8 c0401f8 = new C0401f8();
        c0401f8.f5967a = StringUtils.getUTF8Bytes((List<String>) a2.f4785a);
        InterfaceC0293b3 interfaceC0293b3 = a2.f4786b;
        int i2 = ((C0604n4) interfaceC0293b3).f5544a;
        return new Di(c0401f8, interfaceC0293b3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0551l3(C0713ra c0713ra) {
        this.f6413a = c0713ra;
    }

    public final List<String> a(Di di) {
        throw new UnsupportedOperationException();
    }
}
