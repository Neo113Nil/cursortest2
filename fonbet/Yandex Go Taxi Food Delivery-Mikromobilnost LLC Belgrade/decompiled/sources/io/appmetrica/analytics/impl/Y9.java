package io.appmetrica.analytics.impl;

import defpackage.gw00;
import defpackage.scc;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes9.dex */
public final class Y9 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Map<String, byte[]> map) {
        C0185aa c0185aa = new C0185aa();
        Z9[] z9Arr = new Z9[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            Z9 z9 = new Z9();
            z9.a = (String) entry.getKey();
            z9.b = (byte[]) entry.getValue();
            z9Arr[i] = z9;
            i = i2;
        }
        c0185aa.a = z9Arr;
        return MessageNano.toByteArray(c0185aa);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(byte[] bArr) {
        Z9[] z9Arr = ((C0185aa) MessageNano.mergeFrom(new C0185aa(), bArr)).a;
        int d = gw00.d(z9Arr.length);
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Z9 z9 : z9Arr) {
            Pair pair = new Pair(z9.a, z9.b);
            linkedHashMap.put(pair.c(), pair.f());
        }
        return linkedHashMap;
    }
}
