package io.appmetrica.analytics.impl;

import h1.C0234d;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.pd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0665pd implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0879xk f6740a = C0610na.k().p();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0751sm[] fromModel(Map<String, ? extends Object> map) {
        C0751sm c0751sm;
        Map<String, Yc> c2 = this.f6740a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Yc yc = c2.get(key);
            if (yc == null || value == null) {
                c0751sm = null;
            } else {
                c0751sm = new C0751sm();
                c0751sm.f6916a = key;
                c0751sm.f6917b = (byte[]) yc.f5431c.fromModel(value);
            }
            if (c0751sm != null) {
                arrayList.add(c0751sm);
            }
        }
        Object[] array = arrayList.toArray(new C0751sm[0]);
        if (array != null) {
            return (C0751sm[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(C0751sm[] c0751smArr) {
        Map<String, Yc> c2 = this.f6740a.c();
        ArrayList arrayList = new ArrayList();
        for (C0751sm c0751sm : c0751smArr) {
            Yc yc = c2.get(c0751sm.f6916a);
            C0234d c0234d = yc != null ? new C0234d(c0751sm.f6916a, yc.f5431c.toModel(c0751sm.f6917b)) : null;
            if (c0234d != null) {
                arrayList.add(c0234d);
            }
        }
        return i1.u.L(arrayList);
    }
}
