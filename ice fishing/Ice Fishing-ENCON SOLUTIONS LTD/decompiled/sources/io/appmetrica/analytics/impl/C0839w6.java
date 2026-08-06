package io.appmetrica.analytics.impl;

import i1.AbstractC0251h;
import i1.AbstractC0253j;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.w6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0839w6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0674pm[] fromModel(Map<String, ? extends List<String>> map) {
        C0674pm[] c0674pmArr = new C0674pm[map.size()];
        int i2 = 0;
        for (Object obj : map.entrySet()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0253j.D();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C0674pm c0674pm = new C0674pm();
            c0674pm.f6755a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c0674pm.f6756b = (String[]) array;
            c0674pmArr[i2] = c0674pm;
            i2 = i3;
        }
        return c0674pmArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(C0674pm[] c0674pmArr) {
        int G = i1.v.G(c0674pmArr.length);
        if (G < 16) {
            G = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(G);
        for (C0674pm c0674pm : c0674pmArr) {
            linkedHashMap.put(c0674pm.f6755a, AbstractC0251h.U(c0674pm.f6756b));
        }
        return linkedHashMap;
    }
}
