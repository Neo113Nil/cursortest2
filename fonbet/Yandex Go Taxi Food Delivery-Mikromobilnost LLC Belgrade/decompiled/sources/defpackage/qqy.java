package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes9.dex */
public final class qqy implements ListIterator, xfx {
    public final ListBuilder a;
    public int b;
    public int c = -1;
    public int w;

    public qqy(ListBuilder listBuilder, int i) {
        this.a = listBuilder;
        this.b = i;
        this.w = ((AbstractList) listBuilder).modCount;
    }

    public final void a() {
        if (((AbstractList) this.a).modCount == this.w) {
            return;
        }
        ny61.y();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.b;
        this.b = i + 1;
        ListBuilder listBuilder = this.a;
        listBuilder.add(i, obj);
        this.c = -1;
        this.w = ((AbstractList) listBuilder).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.b;
        i = this.a.length;
        return i2 < i;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i;
        a();
        int i2 = this.b;
        ListBuilder listBuilder = this.a;
        i = listBuilder.length;
        if (i2 >= i) {
            ny61.p();
            return null;
        }
        int i3 = this.b;
        this.b = i3 + 1;
        this.c = i3;
        return listBuilder.backing[this.c];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        int i = this.b;
        if (i <= 0) {
            ny61.p();
            return null;
        }
        int i2 = i - 1;
        this.b = i2;
        this.c = i2;
        return this.a.backing[this.c];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.c;
        if (i == -1) {
            ny61.r("Call next() or previous() before removing element from the iterator.");
            return;
        }
        ListBuilder listBuilder = this.a;
        listBuilder.removeAt(i);
        this.b = this.c;
        this.c = -1;
        this.w = ((AbstractList) listBuilder).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.c;
        if (i != -1) {
            this.a.set(i, obj);
        } else {
            ny61.r("Call next() or previous() before replacing element from the iterator.");
        }
    }
}
