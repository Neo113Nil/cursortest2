package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.gl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0440gl implements InterfaceC0298b8 {

    /* renamed from: a, reason: collision with root package name */
    public final Yi f6089a;

    public C0440gl() {
        this(new Yi());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Di> fromModel(C0414fl c0414fl) {
        C0789u8 c0789u8 = new C0789u8();
        c0789u8.f6984a = 1;
        c0789u8.f6985b = new C0763t8();
        Di fromModel = this.f6089a.fromModel(c0414fl.f5998a);
        c0789u8.f6985b.f6939a = (C0686q8) fromModel.f4305a;
        C0267a3 c0267a3 = new C0267a3(C0267a3.b(fromModel));
        fromModel.f4306b.getBytesTruncated();
        return Collections.singletonList(new Di(c0789u8, c0267a3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0440gl(Yi yi) {
        this.f6089a = yi;
    }

    public final C0414fl a(List<Di> list) {
        throw new UnsupportedOperationException();
    }
}
