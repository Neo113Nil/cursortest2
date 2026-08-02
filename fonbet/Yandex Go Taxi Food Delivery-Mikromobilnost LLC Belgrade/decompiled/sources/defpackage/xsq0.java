package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes.dex */
public abstract class xsq0 {
    public static final a a = new a(EmptyList.a);
    public static final c b = new c(b.f());

    public static final kotlinx.serialization.json.b a(Object obj) {
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        if (obj instanceof String) {
            return qcx.c((String) obj);
        }
        if (obj instanceof Number) {
            return qcx.b((Number) obj);
        }
        if (obj instanceof Boolean) {
            return qcx.a((Boolean) obj);
        }
        if (obj instanceof Map) {
            return b((Map) obj);
        }
        boolean z = obj instanceof Collection;
        a aVar = a;
        if (z) {
            Collection collection = (Collection) obj;
            if (collection.isEmpty()) {
                return aVar;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return new a(arrayList);
        }
        int i = 0;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 0) {
                return aVar;
            }
            ArrayList arrayList2 = new ArrayList(objArr.length);
            int length = objArr.length;
            while (i < length) {
                arrayList2.add(a(objArr[i]));
                i++;
            }
            return new a(arrayList2);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr.length == 0) {
                return aVar;
            }
            ArrayList arrayList3 = new ArrayList(iArr.length);
            int length2 = iArr.length;
            while (i < length2) {
                arrayList3.add(qcx.b(Integer.valueOf(iArr[i])));
                i++;
            }
            return new a(arrayList3);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr.length == 0) {
                return aVar;
            }
            ArrayList arrayList4 = new ArrayList(jArr.length);
            int length3 = jArr.length;
            while (i < length3) {
                arrayList4.add(qcx.b(Long.valueOf(jArr[i])));
                i++;
            }
            return new a(arrayList4);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            if (fArr.length == 0) {
                return aVar;
            }
            ArrayList arrayList5 = new ArrayList(fArr.length);
            int length4 = fArr.length;
            while (i < length4) {
                arrayList5.add(qcx.b(Float.valueOf(fArr[i])));
                i++;
            }
            return new a(arrayList5);
        }
        if (!(obj instanceof double[])) {
            if (obj instanceof kotlinx.serialization.json.b) {
                return (kotlinx.serialization.json.b) obj;
            }
            ny61.g(qv10.l(obj.getClass(), "Unsupported type "));
            return null;
        }
        double[] dArr = (double[]) obj;
        if (dArr.length == 0) {
            return aVar;
        }
        ArrayList arrayList6 = new ArrayList(dArr.length);
        int length5 = dArr.length;
        while (i < length5) {
            arrayList6.add(qcx.b(Double.valueOf(dArr[i])));
            i++;
        }
        return new a(arrayList6);
    }

    public static final c b(Map map) {
        if (map.isEmpty()) {
            return b;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry entry : entrySet) {
            Pair pair = new Pair(String.valueOf(entry.getKey()), a(entry.getValue()));
            linkedHashMap.put(pair.c(), pair.f());
        }
        return new c(linkedHashMap);
    }

    public static final LinkedHashMap c(c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVar.a.size());
        for (Map.Entry entry : cVar.a.entrySet()) {
            Object d = d((kotlinx.serialization.json.b) entry.getValue());
            if (d != null) {
                linkedHashMap.put(entry.getKey(), d);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object d(kotlinx.serialization.json.b bVar) {
        if (bVar instanceof JsonNull) {
            return null;
        }
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            if (dVar.b()) {
                return qcx.g(dVar);
            }
            Object f = qcx.f(dVar);
            return (f == null && (f = qcx.k(dVar)) == null && (f = qcx.o(dVar)) == null) ? qcx.i(dVar) : f;
        }
        if (bVar instanceof c) {
            return c((c) bVar);
        }
        if (!(bVar instanceof a)) {
            w511.b();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) bVar).iterator();
        while (it.hasNext()) {
            Object d = d((kotlinx.serialization.json.b) it.next());
            if (d != null) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }
}
