package io.appmetrica.analytics.impl;

import defpackage.jj4;
import defpackage.tah;
import defpackage.u75;
import defpackage.xz0;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.p7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0541p7 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0674tp[] fromModel(@NotNull Map<String, ? extends List<String>> map) {
        C0674tp[] c0674tpArr = new C0674tp[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C0674tp c0674tp = new C0674tp();
            c0674tp.a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                jj4.j("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return null;
            }
            c0674tp.b = (String[]) array;
            c0674tpArr[i] = c0674tp;
            i = i2;
        }
        return c0674tpArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(@NotNull C0674tp[] c0674tpArr) {
        int a = tah.a(c0674tpArr.length);
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (C0674tp c0674tp : c0674tpArr) {
            linkedHashMap.put(c0674tp.a, xz0.X(c0674tp.b));
        }
        return linkedHashMap;
    }
}
