package wc;

import a0.a0;
import bc.t;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements Iterator, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final Iterator f7712g;

    /* renamed from: h, reason: collision with root package name */
    public int f7713h = -1;

    /* renamed from: i, reason: collision with root package name */
    public Object f7714i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f7715j;

    public c(d dVar) {
        this.f7715j = dVar;
        this.f7712g = ((Iterable) ((t) dVar.f7717b).f1065b).iterator();
    }

    public final void a() {
        Object next;
        do {
            Iterator it = this.f7712g;
            if (!it.hasNext()) {
                this.f7713h = 0;
                return;
            }
            next = it.next();
        } while (!((Boolean) ((a0) this.f7715j.f7718c).invoke(next)).booleanValue());
        this.f7714i = next;
        this.f7713h = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7713h == -1) {
            a();
        }
        return this.f7713h == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7713h == -1) {
            a();
        }
        if (this.f7713h == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f7714i;
        this.f7714i = null;
        this.f7713h = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
