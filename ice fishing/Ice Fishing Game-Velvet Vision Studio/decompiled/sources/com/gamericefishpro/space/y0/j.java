package com.gamericefishpro.space.y0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j implements Iterator, com.gamericefishpro.space.fi.a {
    public Object[] d = i.e.d;
    public int e;
    public int i;

    public final void a(Object[] objArr, int i, int i2) {
        this.d = objArr;
        this.e = i;
        this.i = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
