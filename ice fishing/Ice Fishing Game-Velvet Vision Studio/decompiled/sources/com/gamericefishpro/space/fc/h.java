package com.gamericefishpro.space.fc;

import com.gamericefishpro.space.ph.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class h extends i implements Map, com.gamericefishpro.space.fi.e {
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
        Set<Map.Entry<String, Object>> setEntrySet = getData().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if ((obj instanceof Map.Entry) && (!(obj instanceof com.gamericefishpro.space.fi.a) || (obj instanceof com.gamericefishpro.space.fi.d))) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.N(arrayList);
    }

    public Set<String> getKeys() {
        return getData().keySet();
    }

    public int getSize() {
        return getData().size();
    }

    public Collection<Object> getValues() {
        Collection<Object> collectionValues = getData().values();
        ArrayList arrayList = new ArrayList(y.j(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return CollectionsKt.M(arrayList);
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
        Intrinsics.checkNotNullParameter(from, "from");
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

    public /* synthetic */ h(i iVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : iVar, (i & 2) != 0 ? null : str);
    }

    public boolean containsKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getData().containsKey(key);
    }

    public Object get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return i.getOptAnyProperty$default(this, key, null, 2, null);
    }

    @Override // java.util.Map
    public Object put(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        i.setOptAnyProperty$default(this, key, obj, null, false, 12, null);
        return obj;
    }

    public Object remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, key, null, 2, null);
        i.setOptAnyProperty$default(this, key, null, null, false, 12, null);
        return optAnyProperty$default;
    }

    public h(i iVar, String str) {
        super(iVar, str);
    }
}
