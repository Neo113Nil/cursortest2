package com.gamericefishpro.space.li;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Iterator, com.gamericefishpro.space.fi.a {
    public final Iterator d;
    public final /* synthetic */ n e;

    public o(n nVar) {
        this.e = nVar;
        this.d = nVar.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.e.c.invoke(this.d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
