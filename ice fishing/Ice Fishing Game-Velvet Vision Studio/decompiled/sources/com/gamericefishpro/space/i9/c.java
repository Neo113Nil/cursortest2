package com.gamericefishpro.space.i9;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator {
    public final /* synthetic */ Iterator d;
    public final /* synthetic */ Iterator e;

    public c(d dVar, Iterator it, Iterator it2) {
        this.d = it;
        this.e = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d.hasNext()) {
            return true;
        }
        return this.e.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.d;
        if (it.hasNext()) {
            return new q(((Integer) it.next()).toString());
        }
        Iterator it2 = this.e;
        if (it2.hasNext()) {
            return new q((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
