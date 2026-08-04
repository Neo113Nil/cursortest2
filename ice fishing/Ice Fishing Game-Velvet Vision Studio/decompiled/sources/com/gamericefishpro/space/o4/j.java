package com.gamericefishpro.space.o4;

import com.gamericefishpro.space.ph.l0;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.ph.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends com.gamericefishpro.space.vh.i implements com.gamericefishpro.space.di.c {
    public /* synthetic */ com.gamericefishpro.space.n4.e d;
    public /* synthetic */ com.gamericefishpro.space.p4.b e;

    @Override // com.gamericefishpro.space.di.c
    public final Object a(Object obj, Object obj2, Object obj3) {
        j jVar = new j(3, (com.gamericefishpro.space.th.a) obj3);
        jVar.d = (com.gamericefishpro.space.n4.e) obj;
        jVar.e = (com.gamericefishpro.space.p4.b) obj2;
        return jVar.invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        com.gamericefishpro.space.wa.b.P(obj);
        com.gamericefishpro.space.n4.e eVar = this.d;
        com.gamericefishpro.space.p4.b bVar = this.e;
        Set setKeySet = bVar.a().keySet();
        ArrayList arrayList = new ArrayList(y.j(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.gamericefishpro.space.p4.d) it.next()).a);
        }
        Map<String, ?> all = eVar.a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set set = eVar.b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(l0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.O((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        com.gamericefishpro.space.p4.b bVar2 = new com.gamericefishpro.space.p4.b(m0.i(bVar.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String name = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                com.gamericefishpro.space.p4.d key3 = com.gamericefishpro.space.hj.c.j(name);
                Intrinsics.checkNotNullParameter(key3, "key");
                bVar2.f(key3, value2);
            } else if (value2 instanceof Float) {
                Intrinsics.checkNotNullParameter(name, "name");
                com.gamericefishpro.space.p4.d key4 = new com.gamericefishpro.space.p4.d(name);
                Intrinsics.checkNotNullParameter(key4, "key");
                bVar2.f(key4, value2);
            } else if (value2 instanceof Integer) {
                Intrinsics.checkNotNullParameter(name, "name");
                com.gamericefishpro.space.p4.d key5 = new com.gamericefishpro.space.p4.d(name);
                Intrinsics.checkNotNullParameter(key5, "key");
                bVar2.f(key5, value2);
            } else if (value2 instanceof Long) {
                Intrinsics.checkNotNullParameter(name, "name");
                com.gamericefishpro.space.p4.d key6 = new com.gamericefishpro.space.p4.d(name);
                Intrinsics.checkNotNullParameter(key6, "key");
                bVar2.f(key6, value2);
            } else if (value2 instanceof String) {
                Intrinsics.checkNotNullParameter(name, "name");
                com.gamericefishpro.space.p4.d key7 = new com.gamericefishpro.space.p4.d(name);
                Intrinsics.checkNotNullParameter(key7, "key");
                bVar2.f(key7, value2);
            } else if (value2 instanceof Set) {
                com.gamericefishpro.space.p4.d key8 = com.gamericefishpro.space.hj.c.W(name);
                Intrinsics.checkNotNullParameter(key8, "key");
                bVar2.f(key8, (Set) value2);
            }
        }
        return new com.gamericefishpro.space.p4.b(m0.i(bVar2.a()), true);
    }
}
