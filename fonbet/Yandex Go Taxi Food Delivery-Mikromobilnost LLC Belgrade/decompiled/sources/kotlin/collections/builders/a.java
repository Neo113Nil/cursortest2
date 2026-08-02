package kotlin.collections.builders;

import defpackage.ny61;
import defpackage.xfx;
import java.util.AbstractList;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes4.dex */
public final class a implements ListIterator, xfx {
    public final ListBuilder.BuilderSubList a;
    public int b;
    public int c = -1;
    public int w;

    public a(ListBuilder.BuilderSubList builderSubList, int i) {
        int i2;
        this.a = builderSubList;
        this.b = i;
        i2 = ((AbstractList) builderSubList).modCount;
        this.w = i2;
    }

    public final void a() {
        ListBuilder listBuilder;
        listBuilder = this.a.root;
        if (((AbstractList) listBuilder).modCount == this.w) {
            return;
        }
        ny61.y();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        a();
        int i2 = this.b;
        this.b = i2 + 1;
        ListBuilder.BuilderSubList builderSubList = this.a;
        builderSubList.add(i2, obj);
        this.c = -1;
        i = ((AbstractList) builderSubList).modCount;
        this.w = i;
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
        Object[] objArr;
        int i2;
        a();
        int i3 = this.b;
        ListBuilder.BuilderSubList builderSubList = this.a;
        i = builderSubList.length;
        if (i3 >= i) {
            ny61.p();
            return null;
        }
        int i4 = this.b;
        this.b = i4 + 1;
        this.c = i4;
        objArr = builderSubList.backing;
        i2 = builderSubList.offset;
        return objArr[i2 + this.c];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        Object[] objArr;
        int i;
        a();
        int i2 = this.b;
        if (i2 <= 0) {
            ny61.p();
            return null;
        }
        int i3 = i2 - 1;
        this.b = i3;
        this.c = i3;
        ListBuilder.BuilderSubList builderSubList = this.a;
        objArr = builderSubList.backing;
        i = builderSubList.offset;
        return objArr[i + this.c];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        a();
        int i2 = this.c;
        if (i2 == -1) {
            ny61.r("Call next() or previous() before removing element from the iterator.");
            return;
        }
        ListBuilder.BuilderSubList builderSubList = this.a;
        builderSubList.removeAt(i2);
        this.b = this.c;
        this.c = -1;
        i = ((AbstractList) builderSubList).modCount;
        this.w = i;
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
