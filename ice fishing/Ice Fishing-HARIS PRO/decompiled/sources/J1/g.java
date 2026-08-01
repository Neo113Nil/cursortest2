package J1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator, v1.d, E1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f365a;

    /* renamed from: b, reason: collision with root package name */
    public Object f366b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f367c;

    /* renamed from: d, reason: collision with root package name */
    public v1.d f368d;

    public final RuntimeException a() {
        int i = this.f365a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f365a);
    }

    @Override // v1.d
    public final void b(Object obj) {
        h0.f.D(obj);
        this.f365a = 4;
    }

    @Override // v1.d
    public final v1.i h() {
        return v1.j.f4497a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f365a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f367c;
                D1.i.b(it);
                if (it.hasNext()) {
                    this.f365a = 2;
                    return true;
                }
                this.f367c = null;
            }
            this.f365a = 5;
            v1.d dVar = this.f368d;
            D1.i.b(dVar);
            this.f368d = null;
            dVar.b(t1.i.f4388c);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f365a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f365a = 1;
            Iterator it = this.f367c;
            D1.i.b(it);
            return it.next();
        }
        if (i != 3) {
            throw a();
        }
        this.f365a = 0;
        Object obj = this.f366b;
        this.f366b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
