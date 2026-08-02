package com.yandex.plus.core.serialization.kotlin.kserializer;

import defpackage.avf;
import defpackage.b5f;
import defpackage.b6e;
import defpackage.c4f;
import defpackage.eg7;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.ohp;
import defpackage.q5f;
import defpackage.s4f;
import defpackage.t9f;
import defpackage.tah;
import defpackage.v6f;
import defpackage.v75;
import defpackage.w4f;
import defpackage.x4f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class a implements t9f {
    public static final a a = new a();
    public static final ohp b = avf.w("kotlin.Any", new mhp[0]);

    /* JADX WARN: Multi-variable type inference failed */
    public static Serializable a(w4f w4fVar) {
        if (w4fVar instanceof q5f) {
            Map map = (Map) w4fVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), a((w4f) entry.getValue()));
            }
            return linkedHashMap;
        }
        if (!(w4fVar instanceof c4f)) {
            if (w4fVar instanceof v6f) {
                return ((v6f) w4fVar).a();
            }
            b6e.s();
            return null;
        }
        Iterable iterable = (Iterable) w4fVar;
        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(a((w4f) it.next()));
        }
        return arrayList;
    }

    public static w4f b(Object obj) {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                return obj instanceof Number ? x4f.b((Number) obj) : obj instanceof Boolean ? x4f.a((Boolean) obj) : x4f.c(String.valueOf(obj));
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(b(it.next()));
            }
            return new c4f(arrayList);
        }
        Set<Map.Entry> entrySet = ((Map) obj).entrySet();
        int a2 = tah.a(v75.o(entrySet, 10));
        if (a2 < 16) {
            a2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(String.valueOf(entry.getKey()), b(entry.getValue()));
        }
        return new q5f(linkedHashMap);
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        return a(((s4f) eg7Var).f());
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l6bVar.getClass();
        obj.getClass();
        ((b5f) l6bVar).D(b(obj));
    }
}
