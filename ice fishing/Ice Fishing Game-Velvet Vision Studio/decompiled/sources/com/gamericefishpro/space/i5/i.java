package com.gamericefishpro.space.i5;

import com.gamericefishpro.space.f5.x;
import com.gamericefishpro.space.t.r;
import com.gamericefishpro.space.t.s0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator, com.gamericefishpro.space.fi.a {
    public int d = -1;
    public boolean e;
    public final /* synthetic */ j i;

    public i(j jVar) {
        this.i = jVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d + 1 < this.i.b.f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.e = true;
        s0 s0Var = this.i.b;
        int i = this.d + 1;
        this.d = i;
        return (x) s0Var.g(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.e) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        s0 s0Var = this.i.b;
        ((x) s0Var.g(this.d)).i = null;
        int i = this.d;
        Object[] objArr = s0Var.i;
        Object obj = objArr[i];
        Object obj2 = r.c;
        if (obj != obj2) {
            objArr[i] = obj2;
            s0Var.d = true;
        }
        this.d = i - 1;
        this.e = false;
    }
}
