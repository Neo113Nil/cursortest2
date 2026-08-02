package io.appmetrica.analytics.screenshot.impl;

import defpackage.jj4;
import defpackage.xz0;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class r implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O fromModel(@NotNull C0948p c0948p) {
        O o = new O();
        o.a = c0948p.a;
        Object[] array = c0948p.b.toArray(new String[0]);
        if (array == null) {
            jj4.j("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return null;
        }
        o.c = (String[]) array;
        o.b = c0948p.c;
        return o;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0948p toModel(@NotNull O o) {
        return new C0948p(o.a, xz0.X(o.c), o.b);
    }
}
