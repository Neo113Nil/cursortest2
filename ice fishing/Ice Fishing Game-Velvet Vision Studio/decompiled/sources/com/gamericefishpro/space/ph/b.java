package com.gamericefishpro.space.ph;

import java.io.File;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Iterator, com.gamericefishpro.space.fi.a {
    public int d;
    public File e;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        if (i == 0) {
            this.d = 3;
            a();
            return this.d == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i == 1) {
            this.d = 0;
            return this.e;
        }
        if (i != 2) {
            this.d = 3;
            a();
            if (this.d == 1) {
                this.d = 0;
                return this.e;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
