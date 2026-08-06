package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435gg implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Yi f6078a;

    /* renamed from: b, reason: collision with root package name */
    public final C0739sa f6079b;

    /* renamed from: c, reason: collision with root package name */
    public final C0739sa f6080c;

    public C0435gg() {
        this(new Yi(), new C0739sa(100), new C0739sa(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(C0875xg c0875xg) {
        Di di;
        C0660p8 c0660p8 = new C0660p8();
        Mn a2 = this.f6079b.a(c0875xg.f7202a);
        c0660p8.f6730a = StringUtils.getUTF8Bytes((String) a2.f4785a);
        Mn a3 = this.f6080c.a(c0875xg.f7203b);
        c0660p8.f6731b = StringUtils.getUTF8Bytes((String) a3.f4785a);
        C0335cj c0335cj = c0875xg.f7204c;
        if (c0335cj != null) {
            di = this.f6078a.fromModel(c0335cj);
            c0660p8.f6732c = (C0686q8) di.f4305a;
        } else {
            di = null;
        }
        return new Di(c0660p8, new C0267a3(C0267a3.b(a2, a3, di)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0435gg(Yi yi, C0739sa c0739sa, C0739sa c0739sa2) {
        this.f6078a = yi;
        this.f6079b = c0739sa;
        this.f6080c = c0739sa2;
    }

    public final C0875xg a(Di di) {
        throw new UnsupportedOperationException();
    }
}
