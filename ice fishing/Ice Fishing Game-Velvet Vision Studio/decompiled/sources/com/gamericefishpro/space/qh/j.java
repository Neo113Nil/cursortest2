package com.gamericefishpro.space.qh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends a {
    public final i d;

    public j(i backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.d = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // com.gamericefishpro.space.ph.m
    public final int b() {
        return this.d.B;
    }

    @Override // com.gamericefishpro.space.qh.a
    public final boolean c(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.d.h(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.d.f(elements);
    }

    @Override // com.gamericefishpro.space.qh.a
    public final boolean d(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        i iVar = this.d;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(entry, "entry");
        iVar.c();
        int iJ = iVar.j(entry.getKey());
        if (iJ < 0) {
            return false;
        }
        Object[] objArr = iVar.e;
        Intrinsics.b(objArr);
        if (!Intrinsics.a(objArr[iJ], entry.getValue())) {
            return false;
        }
        iVar.n(iJ);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i map = this.d;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new f(map, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d.c();
        return super.retainAll(elements);
    }
}
