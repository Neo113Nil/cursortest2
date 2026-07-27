package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class Tv extends PA implements Queue, Collection {

    /* renamed from: U, reason: collision with root package name */
    public final LinkedList f27877U;

    public Tv() {
        super(27);
        this.f27877U = new LinkedList();
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        Ov ov = (Ov) obj;
        int i = ov.f26785f;
        LinkedList linkedList = this.f27877U;
        if (i != 3) {
            linkedList.add(ov);
            return true;
        }
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            Ov ov2 = (Ov) listIterator.next();
            if (ov2.f26785f == 3) {
                double d2 = ov.f26784e;
                double d3 = ov2.f26784e;
                if (d3 < d2 || (d3 == d2 && ov2.a() > ov.a())) {
                    listIterator.set(ov);
                    ov = ov2;
                }
            }
        }
        linkedList.add(ov);
        return true;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f27877U.addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f27877U.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f27877U.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f27877U.containsAll(collection);
    }

    @Override // java.util.Queue
    public final Object element() {
        return this.f27877U.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f27877U.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f27877U.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return this.f27877U.offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.f27877U.peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return this.f27877U.poll();
    }

    @Override // com.google.android.gms.internal.ads.PA
    public final /* synthetic */ Object q() {
        return this.f27877U;
    }

    @Override // java.util.Queue
    public final Object remove() {
        return this.f27877U.remove();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f27877U.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f27877U.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f27877U.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f27877U.toArray();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f27877U.remove(obj);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f27877U.toArray(objArr);
    }
}
