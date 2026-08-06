package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class Y implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0814v7 f5407a;

    /* renamed from: b, reason: collision with root package name */
    public final C0739sa f5408b;

    public Y() {
        this(new C0814v7(), new C0739sa(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(Z z2) {
        C0324c8 c0324c8 = new C0324c8();
        c0324c8.f5730b = this.f5407a.fromModel(z2.f5458a);
        Mn a2 = this.f5408b.a(z2.f5459b);
        c0324c8.f5729a = StringUtils.getUTF8Bytes((String) a2.f4785a);
        return new Di(c0324c8, new C0267a3(C0267a3.b(a2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Y(C0814v7 c0814v7, C0739sa c0739sa) {
        this.f5407a = c0814v7;
        this.f5408b = c0739sa;
    }

    public final Z a(Di di) {
        throw new UnsupportedOperationException();
    }
}
