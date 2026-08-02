package defpackage;

import java.util.ListIterator;

/* loaded from: classes9.dex */
public final class r2k0 implements ListIterator, xfx {
    public final ListIterator a;
    public final /* synthetic */ s2k0 b;

    public r2k0(s2k0 s2k0Var, int i) {
        this.b = s2k0Var;
        this.a = s2k0Var.a.listIterator(zcc.C(i, s2k0Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.a;
        listIterator.add(obj);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return scc.f(this.b) - this.a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return scc.f(this.b) - this.a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.a.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.a.set(obj);
    }
}
