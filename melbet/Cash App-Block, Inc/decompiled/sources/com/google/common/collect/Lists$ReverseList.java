package com.google.common.collect;

import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public class Lists$ReverseList extends AbstractList {
    public final List forwardList;

    public Lists$ReverseList(List list) {
        list.getClass();
        this.forwardList = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.forwardList.add(reversePosition(i), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.forwardList.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.forwardList;
        int size = list.size();
        Trace.checkElementIndex(i, size);
        return list.get((size - 1) - i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        final ListIterator listIterator = this.forwardList.listIterator(reversePosition(i));
        return new ListIterator(this) { // from class: com.google.common.collect.Lists$ReverseList.1
            public boolean canRemoveOrSet;
            public final /* synthetic */ Lists$ReverseList this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.ListIterator
            public final void add(Object obj) {
                ListIterator listIterator2 = listIterator;
                listIterator2.add(obj);
                listIterator2.previous();
                this.canRemoveOrSet = false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return listIterator.hasPrevious();
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return listIterator.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final Object next() {
                ListIterator listIterator2 = listIterator;
                if (listIterator2.hasPrevious()) {
                    this.canRemoveOrSet = true;
                    return listIterator2.previous();
                }
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.this$0.reversePosition(listIterator.nextIndex());
            }

            @Override // java.util.ListIterator
            public final Object previous() {
                ListIterator listIterator2 = listIterator;
                if (listIterator2.hasNext()) {
                    this.canRemoveOrSet = true;
                    return listIterator2.next();
                }
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return nextIndex() - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                Trace.checkState("no calls to next() since the last call to remove()", this.canRemoveOrSet);
                listIterator.remove();
                this.canRemoveOrSet = false;
            }

            @Override // java.util.ListIterator
            public final void set(Object obj) {
                Trace.checkState(this.canRemoveOrSet);
                listIterator.set(obj);
            }
        };
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        List list = this.forwardList;
        int size = list.size();
        Trace.checkElementIndex(i, size);
        return list.remove((size - 1) - i);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    public final int reversePosition(int i) {
        int size = this.forwardList.size();
        Trace.checkPositionIndex(i, size);
        return size - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        List list = this.forwardList;
        int size = list.size();
        Trace.checkElementIndex(i, size);
        return list.set((size - 1) - i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.forwardList.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        List list = this.forwardList;
        Trace.checkPositionIndexes(i, i2, list.size());
        return Maps.reverse(list.subList(reversePosition(i2), reversePosition(i)));
    }
}
