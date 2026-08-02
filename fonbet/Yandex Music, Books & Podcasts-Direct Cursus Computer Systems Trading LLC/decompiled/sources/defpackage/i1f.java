package defpackage;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class i1f implements Iterator, j9f {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ j1f c;
    public final /* synthetic */ j1f d;

    public i1f(int i, j1f j1fVar, j1f j1fVar2) {
        this.b = i;
        this.c = j1fVar;
        this.d = j1fVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        return i < 400 && this.b + i < this.c.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.d.next();
        this.a++;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
