package defpackage;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class vz40 implements ListIterator, xfx {
    public final List a;
    public int b;

    public vz40(List list, int i) {
        this.a = list;
        this.b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.a.add(this.b, obj);
        this.b++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.b;
        this.b = i + 1;
        return this.a.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.b - 1;
        this.b = i;
        return this.a.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.b - 1;
        this.b = i;
        this.a.remove(i);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.a.set(this.b, obj);
    }
}
