package com.gamericefishpro.space.ua;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends f {
    public final transient m v;
    public final transient Object[] w;
    public final transient int y;

    public j(m mVar, Object[] objArr, int i) {
        this.v = mVar;
        this.w = objArr;
        this.y = i;
    }

    @Override // com.gamericefishpro.space.ua.a
    public final int b(Object[] objArr) {
        return h().b(objArr);
    }

    @Override // com.gamericefishpro.space.ua.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.v.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.gamericefishpro.space.ua.f
    public final d m() {
        return new i(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final com.gamericefishpro.space.h9.g iterator() {
        return h().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.y;
    }
}
