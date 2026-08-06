package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474i3 implements InterfaceC0298b8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0499j3 f6164a;

    public C0474i3() {
        this(new C0499j3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Di> fromModel(C0448h3 c0448h3) {
        C0789u8 c0789u8 = new C0789u8();
        c0789u8.f6988e = new C0350d8();
        Di fromModel = this.f6164a.fromModel(c0448h3.f6115b);
        c0789u8.f6988e.f5807a = (C0375e8) fromModel.f4305a;
        c0789u8.f6984a = c0448h3.f6114a;
        return Collections.singletonList(new Di(c0789u8, new C0267a3(C0267a3.b(fromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0474i3(C0499j3 c0499j3) {
        this.f6164a = c0499j3;
    }

    public final C0448h3 a(List<Di> list) {
        throw new UnsupportedOperationException();
    }
}
