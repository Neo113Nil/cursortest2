package com.yandex.plus.bdui.shared;

import com.yandex.plus.bdui.plus.shared.f;
import com.yandex.plus.core.reflect.TraversableCollectionField;
import defpackage.e5b;
import defpackage.ern;
import defpackage.f9f;
import defpackage.k5r;
import defpackage.lm4;
import defpackage.tah;
import defpackage.uah;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class b {
    public static final b a;

    @TraversableCollectionField
    @NotNull
    private final Map<f9f, a> slicesMap;

    static {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        a = new b(e5bVar);
    }

    public b(ArrayList arrayList) {
        int a2 = tah.a(v75.o(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a2 < 16 ? 16 : a2);
        for (Object obj : arrayList) {
            linkedHashMap.put(ern.a(((a) obj).getClass()), obj);
        }
        this.slicesMap = linkedHashMap;
    }

    public final b a() {
        Map<f9f, a> map = this.slicesMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((a) entry.getValue()).copy());
        }
        return new b(linkedHashMap);
    }

    public final Collection b() {
        return this.slicesMap.values();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.yandex.plus.bdui.shared.a] */
    public final b c(f fVar) {
        LinkedHashMap q = uah.q(this.slicesMap);
        lm4 a2 = ern.a(f.class);
        a aVar = (a) q.get(a2);
        f fVar2 = fVar;
        if (aVar != null) {
            fVar2 = aVar.a(fVar);
        }
        q.put(a2, fVar2);
        return new b(q);
    }

    public final b d(b bVar) {
        bVar.getClass();
        LinkedHashMap q = uah.q(this.slicesMap);
        for (Map.Entry<f9f, a> entry : bVar.slicesMap.entrySet()) {
            f9f key = entry.getKey();
            a value = entry.getValue();
            a aVar = (a) q.get(key);
            if (aVar != null) {
                value = aVar.a(value);
            }
            q.put(key, value);
        }
        return new b(q);
    }

    public final a e(lm4 lm4Var) {
        a aVar = this.slicesMap.get(lm4Var);
        if (aVar instanceof a) {
            return aVar;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.slicesMap, ((b) obj).slicesMap);
    }

    public final int hashCode() {
        return this.slicesMap.hashCode();
    }

    public final String toString() {
        return k5r.p(new StringBuilder("SharedData(slicesMap="), this.slicesMap, ')');
    }

    public b(Map map) {
        map.getClass();
        this.slicesMap = map;
    }
}
