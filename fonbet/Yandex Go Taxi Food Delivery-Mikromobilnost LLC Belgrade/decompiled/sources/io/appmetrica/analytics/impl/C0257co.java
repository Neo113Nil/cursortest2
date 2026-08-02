package io.appmetrica.analytics.impl;

import defpackage.gw00;
import defpackage.uza;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.co, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0257co implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0314eo fromModel(Map<String, byte[]> map) {
        C0314eo c0314eo = new C0314eo();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            C0343fo c0343fo = new C0343fo();
            c0343fo.a = entry.getKey().getBytes(uza.a);
            c0343fo.b = entry.getValue();
            arrayList.add(c0343fo);
        }
        c0314eo.a = (C0343fo[]) arrayList.toArray(new C0343fo[0]);
        return c0314eo;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(C0314eo c0314eo) {
        C0343fo[] c0343foArr = c0314eo.a;
        int d = gw00.d(c0343foArr.length);
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (C0343fo c0343fo : c0343foArr) {
            Pair pair = new Pair(new String(c0343fo.a, uza.a), c0343fo.b);
            linkedHashMap.put(pair.c(), pair.f());
        }
        return linkedHashMap;
    }
}
