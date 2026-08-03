package com.onesignal.common.modeling;

import bc.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class h extends i implements Map, qc.e {
    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // java.util.Map
    public void clear() {
        Iterator<String> it = getData().keySet().iterator();
        while (it.hasNext()) {
            i.setOptAnyProperty$default(this, it.next(), null, null, false, 12, null);
        }
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getData().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public Set<Map.Entry<String, Object>> getEntries() {
        Set<Map.Entry<String, Object>> entrySet = getData().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if ((obj instanceof Map.Entry) && (!(obj instanceof qc.a) || (obj instanceof qc.d))) {
                arrayList.add(obj);
            }
        }
        return bc.m.h0(arrayList);
    }

    public Set<String> getKeys() {
        return getData().keySet();
    }

    public int getSize() {
        return getData().size();
    }

    public Collection<Object> getValues() {
        Collection<Object> values = getData().values();
        ArrayList arrayList = new ArrayList(o.O(values));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return bc.m.f0(arrayList);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getData().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, Object> map) {
        pc.j.e(map, "from");
        for (Map.Entry<? extends String, Object> entry : map.entrySet()) {
            i.setOptAnyProperty$default(this, entry.getKey(), entry.getValue(), null, false, 12, null);
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    public /* synthetic */ h(i iVar, String str, int i10, pc.f fVar) {
        this((i10 & 1) != 0 ? null : iVar, (i10 & 2) != 0 ? null : str);
    }

    public boolean containsKey(String str) {
        pc.j.e(str, "key");
        return getData().containsKey(str);
    }

    public Object get(String str) {
        pc.j.e(str, "key");
        return i.getOptAnyProperty$default(this, str, null, 2, null);
    }

    @Override // java.util.Map
    public Object put(String str, Object obj) {
        pc.j.e(str, "key");
        i.setOptAnyProperty$default(this, str, obj, null, false, 12, null);
        return obj;
    }

    public Object remove(String str) {
        pc.j.e(str, "key");
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, str, null, 2, null);
        i.setOptAnyProperty$default(this, str, null, null, false, 12, null);
        return optAnyProperty$default;
    }

    public h(i iVar, String str) {
        super(iVar, str);
    }
}
