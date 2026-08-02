package io.appmetrica.analytics.impl;

import defpackage.gw00;
import defpackage.j73;
import defpackage.scc;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.u7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0759u7 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Lp[] fromModel(Map<String, ? extends List<String>> map) {
        Lp[] lpArr = new Lp[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            Lp lp = new Lp();
            lp.a = (String) entry.getKey();
            lp.b = (String[]) ((Collection) entry.getValue()).toArray(new String[0]);
            lpArr[i] = lp;
            i = i2;
        }
        return lpArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(Lp[] lpArr) {
        int d = gw00.d(lpArr.length);
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Lp lp : lpArr) {
            Pair pair = new Pair(lp.a, j73.d0(lp.b));
            linkedHashMap.put(pair.c(), pair.f());
        }
        return linkedHashMap;
    }
}
