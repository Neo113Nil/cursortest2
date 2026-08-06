package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.j3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0499j3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Gf f6240a;

    /* renamed from: b, reason: collision with root package name */
    public final C0814v7 f6241b;

    /* renamed from: c, reason: collision with root package name */
    public final C0874xf f6242c;

    /* renamed from: d, reason: collision with root package name */
    public final C0435gg f6243d;

    public C0499j3() {
        this(new Gf(), new C0814v7(), new C0874xf(), new C0435gg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(C0525k3 c0525k3) {
        Di di;
        C0375e8 c0375e8 = new C0375e8();
        Di fromModel = this.f6240a.fromModel(c0525k3.f6337a);
        c0375e8.f5876a = (C0608n8) fromModel.f4305a;
        c0375e8.f5878c = this.f6241b.fromModel(c0525k3.f6338b);
        Di fromModel2 = this.f6242c.fromModel(c0525k3.f6339c);
        c0375e8.f5879d = (C0582m8) fromModel2.f4305a;
        C0875xg c0875xg = c0525k3.f6340d;
        if (c0875xg != null) {
            di = this.f6243d.fromModel(c0875xg);
            c0375e8.f5877b = (C0660p8) di.f4305a;
        } else {
            di = null;
        }
        return new Di(c0375e8, new C0267a3(C0267a3.b(fromModel, fromModel2, di)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0499j3(Gf gf, C0814v7 c0814v7, C0874xf c0874xf, C0435gg c0435gg) {
        this.f6240a = gf;
        this.f6241b = c0814v7;
        this.f6242c = c0874xf;
        this.f6243d = c0435gg;
    }

    public final C0525k3 a(Di di) {
        throw new UnsupportedOperationException();
    }
}
