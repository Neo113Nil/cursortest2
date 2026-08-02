package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.kf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0478kf implements Converter {
    public final Pn a = Jb.k().p();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Op[] fromModel(Map<String, ? extends Object> map) {
        Op op;
        Map<String, Te> b = this.a.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Te te = b.get(key);
            if (te == null || value == null) {
                op = null;
            } else {
                op = new Op();
                op.a = key;
                op.b = (byte[]) te.c.fromModel(value);
            }
            if (op != null) {
                arrayList.add(op);
            }
        }
        return (Op[]) arrayList.toArray(new Op[0]);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(Op[] opArr) {
        Map<String, Te> b = this.a.b();
        ArrayList arrayList = new ArrayList();
        for (Op op : opArr) {
            Te te = b.get(op.a);
            Pair pair = te != null ? new Pair(op.a, te.c.toModel(op.b)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return kotlin.collections.b.s(arrayList);
    }
}
