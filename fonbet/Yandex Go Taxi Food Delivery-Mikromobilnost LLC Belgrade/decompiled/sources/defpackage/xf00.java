package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes9.dex */
public final class xf00 extends u8 {
    public final MapBuilder a;

    public xf00(MapBuilder mapBuilder) {
        this.a = mapBuilder;
    }

    @Override // defpackage.u8
    public final int a() {
        return this.a.getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        MapBuilder mapBuilder = this.a;
        mapBuilder.getClass();
        return new sf00(mapBuilder, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        MapBuilder mapBuilder = this.a;
        mapBuilder.k();
        int q = mapBuilder.q(obj);
        if (q < 0) {
            return false;
        }
        mapBuilder.v(q);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.a.k();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.a.k();
        return super.retainAll(collection);
    }
}
