package io.appmetrica.analytics.impl;

import i1.AbstractC0253j;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class J8 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Map<String, byte[]> map) {
        L8 l8 = new L8();
        K8[] k8Arr = new K8[map.size()];
        int i2 = 0;
        for (Object obj : map.entrySet()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0253j.D();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            K8 k8 = new K8();
            k8.f4629a = (String) entry.getKey();
            k8.f4630b = (byte[]) entry.getValue();
            k8Arr[i2] = k8;
            i2 = i3;
        }
        l8.f4690a = k8Arr;
        return MessageNano.toByteArray(l8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(byte[] bArr) {
        K8[] k8Arr = ((L8) MessageNano.mergeFrom(new L8(), bArr)).f4690a;
        int G = i1.v.G(k8Arr.length);
        if (G < 16) {
            G = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(G);
        for (K8 k8 : k8Arr) {
            linkedHashMap.put(k8.f4629a, k8.f4630b);
        }
        return linkedHashMap;
    }
}
