package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.el, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0388el implements InterfaceC0298b8 {

    /* renamed from: a, reason: collision with root package name */
    public final Gf f5951a;

    /* renamed from: b, reason: collision with root package name */
    public final C0435gg f5952b;

    public C0388el() {
        this(new Gf(), new C0435gg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Di> fromModel(C0363dl c0363dl) {
        Di di;
        C0789u8 c0789u8 = new C0789u8();
        c0789u8.f6984a = 3;
        c0789u8.f6987d = new C0737s8();
        Di fromModel = this.f5951a.fromModel(c0363dl.f5821a);
        c0789u8.f6987d.f6888a = (C0608n8) fromModel.f4305a;
        C0875xg c0875xg = c0363dl.f5822b;
        if (c0875xg != null) {
            di = this.f5952b.fromModel(c0875xg);
            c0789u8.f6987d.f6889b = (C0660p8) di.f4305a;
        } else {
            di = null;
        }
        return Collections.singletonList(new Di(c0789u8, new C0267a3(C0267a3.b(fromModel, di))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0388el(Gf gf, C0435gg c0435gg) {
        this.f5951a = gf;
        this.f5952b = c0435gg;
    }

    public final C0363dl a(List<Di> list) {
        throw new UnsupportedOperationException();
    }
}
