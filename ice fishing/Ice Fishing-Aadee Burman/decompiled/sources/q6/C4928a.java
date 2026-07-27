package q6;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: q6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4928a implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final Iterator f40241n;

    /* renamed from: u, reason: collision with root package name */
    public Map.Entry f40242u;

    /* renamed from: v, reason: collision with root package name */
    public Object f40243v;

    public C4928a(AbstractRunnableC4931d abstractRunnableC4931d, Iterator it) {
        this.f40241n = it;
        a();
    }

    public final void a() {
        T t6;
        do {
            Iterator it = this.f40241n;
            if (!it.hasNext()) {
                this.f40242u = null;
                this.f40243v = null;
                return;
            } else {
                Map.Entry entry = (Map.Entry) it.next();
                this.f40242u = entry;
                t6 = ((C4930c) entry.getKey()).get();
                this.f40243v = t6;
            }
        } while (t6 == 0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40243v != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f40243v;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        try {
            return new C4929b(obj, this.f40242u);
        } finally {
            a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
