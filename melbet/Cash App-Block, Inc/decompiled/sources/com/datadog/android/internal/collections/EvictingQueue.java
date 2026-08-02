package com.datadog.android.internal.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.ArrayIteratorKt;

/* loaded from: classes4.dex */
public final class EvictingQueue implements Queue {
    public final LinkedList delegate = new LinkedList();
    public final int maxSize;

    public EvictingQueue(int i) {
        this.maxSize = Math.max(0, i);
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        return offer(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int i = 0;
        int i2 = this.maxSize;
        if (i2 == 0) {
            return false;
        }
        int size = collection.size();
        LinkedList linkedList = this.delegate;
        if (size < i2) {
            int size2 = collection.size() - (i2 - linkedList.size());
            while (i < size2) {
                linkedList.poll();
                i++;
            }
            return linkedList.addAll(collection);
        }
        clear();
        for (Object obj : collection) {
            int i3 = i + 1;
            if (i >= collection.size() - i2) {
                linkedList.add(obj);
            }
            i = i3;
        }
        return true;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.delegate.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.delegate.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.delegate.containsAll(collection);
    }

    @Override // java.util.Queue
    public final Object element() {
        return this.delegate.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.delegate.iterator();
        it.getClass();
        return it;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        int i = this.maxSize;
        if (i == 0) {
            return false;
        }
        LinkedList linkedList = this.delegate;
        if (linkedList.size() >= i) {
            linkedList.poll();
        }
        return linkedList.offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.delegate.peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return this.delegate.poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return this.delegate.remove();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        return this.delegate.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.delegate.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.delegate.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return ArrayIteratorKt.toArray(this, objArr);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.delegate.remove(obj);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return ArrayIteratorKt.toArray(this);
    }
}
