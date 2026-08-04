package com.gamericefishpro.space.x0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends com.gamericefishpro.space.ph.f implements com.gamericefishpro.space.w0.b {
    @Override // java.util.Collection, java.util.List, com.gamericefishpro.space.w0.b
    public com.gamericefishpro.space.w0.b addAll(Collection collection) {
        e eVarBuilder = builder();
        eVarBuilder.addAll(collection);
        return eVarBuilder.d();
    }

    @Override // com.gamericefishpro.space.ph.a, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.gamericefishpro.space.ph.a, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.gamericefishpro.space.ph.f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.gamericefishpro.space.ph.f, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // com.gamericefishpro.space.ph.f, java.util.List
    public final List subList(int i, int i2) {
        return new com.gamericefishpro.space.w0.a(this, i, i2);
    }
}
