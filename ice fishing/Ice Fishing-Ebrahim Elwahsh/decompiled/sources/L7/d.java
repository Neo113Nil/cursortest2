package L7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import z4.c;

/* loaded from: classes2.dex */
public final class d implements Iterator, F7.a {

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f1796n;

    /* renamed from: u, reason: collision with root package name */
    public int f1797u = -1;

    /* renamed from: v, reason: collision with root package name */
    public Object f1798v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f1799w;

    public d(e eVar) {
        this.f1799w = eVar;
        this.f1796n = ((Iterable) ((g) eVar.f1801b).f1807b).iterator();
    }

    public final void a() {
        Object next;
        do {
            Iterator it = this.f1796n;
            if (!it.hasNext()) {
                this.f1797u = 0;
                return;
            }
            next = it.next();
        } while (!((Boolean) ((c.b) this.f1799w.f1802c).invoke(next)).booleanValue());
        this.f1798v = next;
        this.f1797u = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1797u == -1) {
            a();
        }
        return this.f1797u == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1797u == -1) {
            a();
        }
        if (this.f1797u == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f1798v;
        this.f1798v = null;
        this.f1797u = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
