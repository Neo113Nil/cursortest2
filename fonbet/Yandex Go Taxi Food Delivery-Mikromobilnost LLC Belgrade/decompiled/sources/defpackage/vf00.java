package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes9.dex */
public final class vf00 extends q8 {
    public final MapBuilder a;

    public vf00(MapBuilder mapBuilder) {
        this.a = mapBuilder;
    }

    @Override // defpackage.w8
    public final int a() {
        return this.a.getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.q8
    public final boolean b(Map.Entry entry) {
        return this.a.m(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        MapBuilder mapBuilder = this.a;
        mapBuilder.getClass();
        for (Object obj : collection) {
            if (obj == null) {
                return false;
            }
            try {
                if (!mapBuilder.m((Map.Entry) obj)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.q8
    public final boolean f(Map.Entry entry) {
        return this.a.u(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        MapBuilder mapBuilder = this.a;
        mapBuilder.getClass();
        return new sf00(mapBuilder, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        this.a.k();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        this.a.k();
        return super.retainAll(collection);
    }
}
