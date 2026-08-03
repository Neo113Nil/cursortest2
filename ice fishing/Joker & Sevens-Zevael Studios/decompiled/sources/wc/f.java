package wc;

import ac.o;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements Iterator, fc.d, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public int f7719g;

    /* renamed from: h, reason: collision with root package name */
    public Object f7720h;

    /* renamed from: i, reason: collision with root package name */
    public fc.d f7721i;

    public final RuntimeException a() {
        int i10 = this.f7719g;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f7719g);
    }

    public final void b(Object obj, hc.i iVar) {
        this.f7720h = obj;
        this.f7719g = 3;
        this.f7721i = iVar;
    }

    @Override // fc.d
    public final fc.i getContext() {
        return fc.j.f2348g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.f7719g;
            if (i10 != 0) {
                break;
            }
            this.f7719g = 5;
            fc.d dVar = this.f7721i;
            pc.j.b(dVar);
            this.f7721i = null;
            dVar.resumeWith(o.f277a);
        }
        if (i10 == 1) {
            pc.j.b(null);
            throw null;
        }
        if (i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f7719g;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f7719g = 1;
            pc.j.b(null);
            throw null;
        }
        if (i10 != 3) {
            throw a();
        }
        this.f7719g = 0;
        Object obj = this.f7720h;
        this.f7720h = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // fc.d
    public final void resumeWith(Object obj) {
        v6.a.W(obj);
        this.f7719g = 4;
    }
}
