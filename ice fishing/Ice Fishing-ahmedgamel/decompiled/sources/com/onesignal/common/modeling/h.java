package com.onesignal.common.modeling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import v7.AbstractC5119j;
import v7.AbstractC5121l;
import w7.C5157e;

/* loaded from: classes2.dex */
public class h extends i implements Map, J7.d {
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

    public boolean containsValue(Object obj) {
        return getData().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
        return getEntries();
    }

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
            if ((obj instanceof Map.Entry) && (!(obj instanceof J7.a) || (obj instanceof C5157e))) {
                arrayList.add(obj);
            }
        }
        return AbstractC5119j.M(arrayList);
    }

    public Set<String> getKeys() {
        return getData().keySet();
    }

    public int getSize() {
        return getData().size();
    }

    public Collection<Object> getValues() {
        Collection<Object> values = getData().values();
        ArrayList arrayList = new ArrayList(AbstractC5121l.w(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return AbstractC5119j.K(arrayList);
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
    public void putAll(Map<? extends String, Object> from) {
        kotlin.jvm.internal.h.e(from, "from");
        for (Map.Entry<? extends String, Object> entry : from.entrySet()) {
            i.setOptAnyProperty$default(this, entry.getKey(), entry.getValue(), null, false, 12, null);
        }
    }

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

    public /* synthetic */ h(i iVar, String str, int i, kotlin.jvm.internal.e eVar) {
        this((i & 1) != 0 ? null : iVar, (i & 2) != 0 ? null : str);
    }

    public boolean containsKey(String key) {
        kotlin.jvm.internal.h.e(key, "key");
        return getData().containsKey(key);
    }

    public Object get(String key) {
        kotlin.jvm.internal.h.e(key, "key");
        return i.getOptAnyProperty$default(this, key, null, 2, null);
    }

    @Override // java.util.Map
    public Object put(String key, Object obj) {
        kotlin.jvm.internal.h.e(key, "key");
        i.setOptAnyProperty$default(this, key, obj, null, false, 12, null);
        return obj;
    }

    public Object remove(String key) {
        kotlin.jvm.internal.h.e(key, "key");
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, key, null, 2, null);
        i.setOptAnyProperty$default(this, key, null, null, false, 12, null);
        return optAnyProperty$default;
    }

    public h(i iVar, String str) {
        super(iVar, str);
    }
}
