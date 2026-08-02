package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class s7x extends u6x {
    public final transient u7x c;
    public final transient t7x d;

    public s7x(u7x u7xVar, t7x t7xVar) {
        this.c = u7xVar;
        this.d = t7xVar;
    }

    @Override // defpackage.a6x
    public final int a(Object[] objArr) {
        return this.d.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // defpackage.u6x, defpackage.a6x
    public final i6x o() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.d;
    }
}
