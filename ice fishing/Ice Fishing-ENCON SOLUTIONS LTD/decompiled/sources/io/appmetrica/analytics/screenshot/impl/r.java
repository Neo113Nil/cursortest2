package io.appmetrica.analytics.screenshot.impl;

import i1.AbstractC0251h;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class r implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O fromModel(C0950p c0950p) {
        O o2 = new O();
        o2.f7601a = c0950p.f7671a;
        Object[] array = c0950p.f7672b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        o2.f7603c = (String[]) array;
        o2.f7602b = c0950p.f7673c;
        return o2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0950p toModel(O o2) {
        return new C0950p(o2.f7601a, AbstractC0251h.U(o2.f7603c), o2.f7602b);
    }
}
