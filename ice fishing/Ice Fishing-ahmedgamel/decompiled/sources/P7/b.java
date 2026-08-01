package P7;

import java.util.Iterator;
import v7.AbstractC5130k;
import v7.s;

/* loaded from: classes2.dex */
public final class b implements Iterator, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2603n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Iterator f2604u;

    /* renamed from: v, reason: collision with root package name */
    public int f2605v;

    public b(Iterator iterator) {
        kotlin.jvm.internal.h.e(iterator, "iterator");
        this.f2604u = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f2603n) {
            case 0:
                break;
            default:
                return this.f2604u.hasNext();
        }
        while (true) {
            int i = this.f2605v;
            it = this.f2604u;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f2605v--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f2603n) {
            case 0:
                break;
            default:
                int i = this.f2605v;
                this.f2605v = i + 1;
                if (i >= 0) {
                    return new s(i, this.f2604u.next());
                }
                AbstractC5130k.x();
                throw null;
        }
        while (true) {
            int i6 = this.f2605v;
            it = this.f2604u;
            if (i6 > 0 && it.hasNext()) {
                it.next();
                this.f2605v--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2603n) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar) {
        this.f2604u = cVar.f2606a.iterator();
        this.f2605v = cVar.f2607b;
    }
}
