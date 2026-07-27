package m6;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: m6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4783a implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f39570n;

    /* renamed from: u, reason: collision with root package name */
    public Map.Entry f39571u;

    /* renamed from: v, reason: collision with root package name */
    public Object f39572v;

    public C4783a(AbstractRunnableC4786d abstractRunnableC4786d, Iterator it) {
        this.f39570n = it;
        a();
    }

    public final void a() {
        T t9;
        do {
            Iterator it = this.f39570n;
            if (!it.hasNext()) {
                this.f39571u = null;
                this.f39572v = null;
                return;
            } else {
                Map.Entry entry = (Map.Entry) it.next();
                this.f39571u = entry;
                t9 = ((C4785c) entry.getKey()).get();
                this.f39572v = t9;
            }
        } while (t9 == 0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39572v != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f39572v;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        try {
            return new C4784b(obj, this.f39571u);
        } finally {
            a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
