package q6;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: q6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4877a implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f40055n;

    /* renamed from: u, reason: collision with root package name */
    public Map.Entry f40056u;

    /* renamed from: v, reason: collision with root package name */
    public Object f40057v;

    public C4877a(AbstractRunnableC4880d abstractRunnableC4880d, Iterator it) {
        this.f40055n = it;
        a();
    }

    public final void a() {
        T t6;
        do {
            Iterator it = this.f40055n;
            if (!it.hasNext()) {
                this.f40056u = null;
                this.f40057v = null;
                return;
            } else {
                Map.Entry entry = (Map.Entry) it.next();
                this.f40056u = entry;
                t6 = ((C4879c) entry.getKey()).get();
                this.f40057v = t6;
            }
        } while (t6 == 0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40057v != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f40057v;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        try {
            return new C4878b(obj, this.f40056u);
        } finally {
            a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
