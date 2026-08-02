package defpackage;

import java.util.Iterator;
import kotlin.collections.IndexedValue;

/* loaded from: classes5.dex */
public final class ora implements Iterator, j9f {
    public final /* synthetic */ int a = 1;
    public final Iterator b;
    public int c;

    public ora(pra praVar, byte b) {
        this.c = praVar.c;
        this.b = praVar.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.a) {
            case 0:
                break;
            case 1:
                return this.b.hasNext();
            case 2:
                return this.b.hasNext();
            default:
                return this.c > 0 && this.b.hasNext();
        }
        while (true) {
            int i = this.c;
            it = this.b;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.a) {
            case 0:
                break;
            case 1:
                int i = this.c;
                this.c = i + 1;
                if (i >= 0) {
                    return new IndexedValue(i, this.b.next());
                }
                u75.n();
                throw null;
            case 2:
                int i2 = this.c;
                this.c = i2 + 1;
                if (i2 >= 0) {
                    return new IndexedValue(i2, this.b.next());
                }
                u75.n();
                throw null;
            default:
                int i3 = this.c;
                if (i3 != 0) {
                    this.c = i3 - 1;
                    return this.b.next();
                }
                wvs.n();
                return null;
        }
        while (true) {
            int i4 = this.c;
            it = this.b;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ora(wz0 wz0Var) {
        this.b = ((wz0) wz0Var.b).iterator();
    }

    public ora(Iterator it) {
        it.getClass();
        this.b = it;
    }

    public ora(pra praVar) {
        this.b = praVar.b.iterator();
        this.c = praVar.c;
    }
}
