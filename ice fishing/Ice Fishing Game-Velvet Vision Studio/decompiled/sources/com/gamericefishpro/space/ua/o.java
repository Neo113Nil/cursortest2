package com.gamericefishpro.space.ua;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends f {
    public final transient Object v;

    public o(Object obj) {
        this.v = obj;
    }

    @Override // com.gamericefishpro.space.ua.a
    public final int b(Object[] objArr) {
        objArr[0] = this.v;
        return 1;
    }

    @Override // com.gamericefishpro.space.ua.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.v.equals(obj);
    }

    @Override // com.gamericefishpro.space.ua.f, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new g(this.v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.v.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
