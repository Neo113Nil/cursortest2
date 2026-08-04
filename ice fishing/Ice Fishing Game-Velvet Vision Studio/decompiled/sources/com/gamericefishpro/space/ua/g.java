package com.gamericefishpro.space.ua;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.gamericefishpro.space.h9.g {
    public boolean e;
    public final /* synthetic */ Object i;

    public g(Object obj) {
        super(1);
        this.i = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e) {
            throw new NoSuchElementException();
        }
        this.e = true;
        return this.i;
    }
}
