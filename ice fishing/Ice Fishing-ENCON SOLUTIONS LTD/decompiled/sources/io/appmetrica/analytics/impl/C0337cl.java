package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.cl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337cl implements InterfaceC0298b8 {

    /* renamed from: a, reason: collision with root package name */
    public final Yi f5765a;

    /* renamed from: b, reason: collision with root package name */
    public final Gf f5766b;

    public C0337cl() {
        this(new Yi(), new Gf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Di> fromModel(C0311bl c0311bl) {
        C0789u8 c0789u8 = new C0789u8();
        c0789u8.f6984a = 2;
        c0789u8.f6986c = new C0711r8();
        Di fromModel = this.f5765a.fromModel(c0311bl.f5685b);
        c0789u8.f6986c.f6817b = (C0686q8) fromModel.f4305a;
        Di fromModel2 = this.f5766b.fromModel(c0311bl.f5684a);
        c0789u8.f6986c.f6816a = (C0608n8) fromModel2.f4305a;
        return Collections.singletonList(new Di(c0789u8, new C0267a3(C0267a3.b(fromModel, fromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0337cl(Yi yi, Gf gf) {
        this.f5765a = yi;
        this.f5766b = gf;
    }

    public final C0311bl a(List<Di> list) {
        throw new UnsupportedOperationException();
    }
}
