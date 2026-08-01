package J1;

import O.L;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m implements Iterator, E1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f375a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f376b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f377c;

    public m(D1.a aVar) {
        this.f375a = 1;
        this.f377c = new ArrayList();
        this.f376b = aVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f375a) {
        }
        return this.f376b.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [C1.l, D1.j] */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f375a) {
            case 0:
                return ((l) this.f377c).f374c.g(this.f376b.next());
            default:
                Object next = this.f376b.next();
                Iterator it = (Iterator) L.f752b.g(next);
                ArrayList arrayList = (ArrayList) this.f377c;
                if (it == null || !it.hasNext()) {
                    while (!this.f376b.hasNext() && !arrayList.isEmpty()) {
                        this.f376b = (Iterator) u1.g.R(arrayList);
                        u1.m.K(arrayList);
                    }
                } else {
                    arrayList.add(this.f376b);
                    this.f376b = it;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f375a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public m(l lVar) {
        this.f375a = 0;
        this.f377c = lVar;
        this.f376b = ((f) lVar.f373b).iterator();
    }
}
