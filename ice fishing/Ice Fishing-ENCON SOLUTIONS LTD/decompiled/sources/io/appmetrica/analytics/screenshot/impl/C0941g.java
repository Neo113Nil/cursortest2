package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.screenshot.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941g implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N fromModel(C0939e c0939e) {
        N n2 = new N();
        n2.f7599a = c0939e.f7638a;
        return n2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C0939e(((N) obj).f7599a);
    }

    public final C0939e a(N n2) {
        return new C0939e(n2.f7599a);
    }
}
