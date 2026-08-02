package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class x7x extends u6x {
    public final transient Object c;

    public x7x(Object obj) {
        this.c = obj;
    }

    @Override // defpackage.a6x
    public final int a(Object[] objArr) {
        objArr[0] = this.c;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.equals(obj);
    }

    @Override // defpackage.u6x, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new x6x(this.c);
    }

    @Override // defpackage.u6x, defpackage.a6x
    public final i6x o() {
        Object[] objArr = {this.c};
        for (int i = 0; i < 1; i++) {
            e6x e6xVar = i6x.b;
            if (objArr[i] == null) {
                jj4.j(k5r.i(i, "at index "));
                return null;
            }
        }
        return i6x.u(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return hrg.q("[", this.c.toString(), "]");
    }
}
