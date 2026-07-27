package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class Rv extends AbstractC2772Sd implements Queue, Collection {

    /* renamed from: M, reason: collision with root package name */
    public final LinkedList f27369M;

    public Rv() {
        super(28);
        this.f27369M = new LinkedList();
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        Mv mv = (Mv) obj;
        int i = mv.f26375f;
        LinkedList linkedList = this.f27369M;
        if (i != 3) {
            linkedList.add(mv);
            return true;
        }
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            Mv mv2 = (Mv) listIterator.next();
            if (mv2.f26375f == 3) {
                double d2 = mv.f26374e;
                double d9 = mv2.f26374e;
                if (d9 < d2 || (d9 == d2 && mv2.a() > mv.a())) {
                    listIterator.set(mv);
                    mv = mv2;
                }
            }
        }
        linkedList.add(mv);
        return true;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f27369M.addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f27369M.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f27369M.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f27369M.containsAll(collection);
    }

    @Override // java.util.Queue
    public final Object element() {
        return this.f27369M.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f27369M.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f27369M.iterator();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2772Sd
    public final /* synthetic */ Object m() {
        return this.f27369M;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return this.f27369M.offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.f27369M.peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return this.f27369M.poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return this.f27369M.remove();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f27369M.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f27369M.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f27369M.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f27369M.toArray();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f27369M.remove(obj);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f27369M.toArray(objArr);
    }
}
