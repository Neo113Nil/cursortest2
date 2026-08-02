package P7;

import java.util.Iterator;
import v7.AbstractC5120k;
import v7.s;

/* loaded from: classes2.dex */
public final class b implements Iterator, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2438n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Iterator f2439u;

    /* renamed from: v, reason: collision with root package name */
    public int f2440v;

    public b(Iterator iterator) {
        kotlin.jvm.internal.h.e(iterator, "iterator");
        this.f2439u = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f2438n) {
            case 0:
                break;
            default:
                return this.f2439u.hasNext();
        }
        while (true) {
            int i = this.f2440v;
            it = this.f2439u;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f2440v--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f2438n) {
            case 0:
                break;
            default:
                int i = this.f2440v;
                this.f2440v = i + 1;
                if (i >= 0) {
                    return new s(i, this.f2439u.next());
                }
                AbstractC5120k.v();
                throw null;
        }
        while (true) {
            int i4 = this.f2440v;
            it = this.f2439u;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.f2440v--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2438n) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar) {
        this.f2439u = cVar.f2441a.iterator();
        this.f2440v = cVar.f2442b;
    }
}
