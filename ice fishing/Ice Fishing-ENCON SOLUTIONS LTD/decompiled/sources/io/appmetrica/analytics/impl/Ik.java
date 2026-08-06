package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Ik implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Kk fromModel(Map<String, byte[]> map) {
        Kk kk = new Kk();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            Lk lk = new Lk();
            lk.f4717a = entry.getKey().getBytes(z1.a.f8620a);
            lk.f4718b = entry.getValue();
            arrayList.add(lk);
        }
        Object[] array = arrayList.toArray(new Lk[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        kk.f4647a = (Lk[]) array;
        return kk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(Kk kk) {
        Lk[] lkArr = kk.f4647a;
        int G = i1.v.G(lkArr.length);
        if (G < 16) {
            G = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(G);
        for (Lk lk : lkArr) {
            linkedHashMap.put(new String(lk.f4717a, z1.a.f8620a), lk.f4718b);
        }
        return linkedHashMap;
    }
}
