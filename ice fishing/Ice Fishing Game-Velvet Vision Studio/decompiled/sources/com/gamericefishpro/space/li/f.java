package com.gamericefishpro.space.li;

import com.gamericefishpro.space.oh.p;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g implements Iterator, com.gamericefishpro.space.th.a, com.gamericefishpro.space.fi.a {
    public int d;
    public Object e;
    public com.gamericefishpro.space.th.a i;

    @Override // com.gamericefishpro.space.li.g
    public final void a(Object obj, com.gamericefishpro.space.vh.h frame) {
        this.e = obj;
        this.d = 3;
        this.i = frame;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    public final RuntimeException b() {
        int i = this.d;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.d);
    }

    @Override // com.gamericefishpro.space.th.a
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.d;
            if (i != 0) {
                break;
            }
            this.d = 5;
            com.gamericefishpro.space.th.a aVar = this.i;
            Intrinsics.b(aVar);
            this.i = null;
            com.gamericefishpro.space.oh.n nVar = p.d;
            aVar.resumeWith(Unit.a);
        }
        if (i == 1) {
            Intrinsics.b(null);
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.d = 1;
            Intrinsics.b(null);
            throw null;
        }
        if (i != 3) {
            throw b();
        }
        this.d = 0;
        Object obj = this.e;
        this.e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // com.gamericefishpro.space.th.a
    public final void resumeWith(Object obj) {
        com.gamericefishpro.space.wa.b.P(obj);
        this.d = 4;
    }
}
