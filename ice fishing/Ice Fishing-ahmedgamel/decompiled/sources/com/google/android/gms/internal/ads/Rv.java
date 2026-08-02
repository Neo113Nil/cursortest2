package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class Rv extends AbstractC2792Sd implements Queue, Collection {

    /* renamed from: M, reason: collision with root package name */
    public final LinkedList f28083M;

    public Rv() {
        super(28);
        this.f28083M = new LinkedList();
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        Mv mv = (Mv) obj;
        int i = mv.f27160f;
        LinkedList linkedList = this.f28083M;
        if (i != 3) {
            linkedList.add(mv);
            return true;
        }
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            Mv mv2 = (Mv) listIterator.next();
            if (mv2.f27160f == 3) {
                double d9 = mv.f27159e;
                double d10 = mv2.f27159e;
                if (d10 < d9 || (d10 == d9 && mv2.a() > mv.a())) {
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
        return this.f28083M.addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f28083M.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f28083M.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f28083M.containsAll(collection);
    }

    @Override // java.util.Queue
    public final Object element() {
        return this.f28083M.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f28083M.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f28083M.iterator();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2792Sd
    public final /* synthetic */ Object m() {
        return this.f28083M;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return this.f28083M.offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.f28083M.peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return this.f28083M.poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return this.f28083M.remove();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f28083M.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f28083M.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f28083M.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f28083M.toArray();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f28083M.remove(obj);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f28083M.toArray(objArr);
    }
}
