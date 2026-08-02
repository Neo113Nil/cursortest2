package io.appmetrica.analytics.impl;

import defpackage.jj4;
import defpackage.uah;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Ve implements Converter {
    public final C0788xn a = C0747wb.k().p();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0761wp[] fromModel(@NotNull Map<String, ? extends Object> map) {
        C0761wp c0761wp;
        Map<String, Ee> c = this.a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Ee ee = c.get(key);
            if (ee == null || value == null) {
                c0761wp = null;
            } else {
                c0761wp = new C0761wp();
                c0761wp.a = key;
                c0761wp.b = (byte[]) ee.c.fromModel(value);
            }
            if (c0761wp != null) {
                arrayList.add(c0761wp);
            }
        }
        Object[] array = arrayList.toArray(new C0761wp[0]);
        if (array != null) {
            return (C0761wp[]) array;
        }
        jj4.j("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(@NotNull C0761wp[] c0761wpArr) {
        Map<String, Ee> c = this.a.c();
        ArrayList arrayList = new ArrayList();
        for (C0761wp c0761wp : c0761wpArr) {
            Ee ee = c.get(c0761wp.a);
            Pair pair = ee != null ? new Pair(c0761wp.a, ee.c.toModel(c0761wp.b)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return uah.n(arrayList);
    }
}
