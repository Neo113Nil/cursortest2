package P7;

import D4.c;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class d implements Iterator, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f2443n;

    /* renamed from: u, reason: collision with root package name */
    public int f2444u = -1;

    /* renamed from: v, reason: collision with root package name */
    public Object f2445v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f2446w;

    public d(e eVar) {
        this.f2446w = eVar;
        this.f2443n = ((Iterable) ((g) eVar.f2448b).f2454b).iterator();
    }

    public final void a() {
        Object next;
        do {
            Iterator it = this.f2443n;
            if (!it.hasNext()) {
                this.f2444u = 0;
                return;
            }
            next = it.next();
        } while (!((Boolean) ((c.b) this.f2446w.f2449c).invoke(next)).booleanValue());
        this.f2445v = next;
        this.f2444u = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2444u == -1) {
            a();
        }
        return this.f2444u == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2444u == -1) {
            a();
        }
        if (this.f2444u == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f2445v;
        this.f2445v = null;
        this.f2444u = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
