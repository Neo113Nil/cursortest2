package com.bumptech.glide.util;

import androidx.collection.ArrayMap;

/* loaded from: classes4.dex */
public final class CachedHashCodeArrayMap extends ArrayMap {
    public int hashCode;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final void clear() {
        this.hashCode = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = super.hashCode();
        }
        return this.hashCode;
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.hashCode = 0;
        return super.put(obj, obj2);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final void putAll(ArrayMap arrayMap) {
        this.hashCode = 0;
        super.putAll(arrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final Object removeAt(int i) {
        this.hashCode = 0;
        return super.removeAt(i);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final Object setValueAt(int i, Object obj) {
        this.hashCode = 0;
        return super.setValueAt(i, obj);
    }
}
