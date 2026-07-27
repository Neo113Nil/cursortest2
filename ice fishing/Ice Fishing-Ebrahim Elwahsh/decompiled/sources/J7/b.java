package J7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b implements Iterator, F7.a {

    /* renamed from: n, reason: collision with root package name */
    public final int f1467n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1468u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1469v;

    /* renamed from: w, reason: collision with root package name */
    public int f1470w;

    public b(int i, int i4, int i9) {
        this.f1467n = i9;
        this.f1468u = i4;
        boolean z8 = false;
        if (i9 <= 0 ? i >= i4 : i <= i4) {
            z8 = true;
        }
        this.f1469v = z8;
        this.f1470w = z8 ? i : i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1469v;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f1470w;
        if (i != this.f1468u) {
            this.f1470w = this.f1467n + i;
        } else {
            if (!this.f1469v) {
                throw new NoSuchElementException();
            }
            this.f1469v = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
