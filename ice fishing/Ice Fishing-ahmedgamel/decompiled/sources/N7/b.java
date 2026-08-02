package N7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b implements Iterator, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final int f2108n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2109u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2110v;

    /* renamed from: w, reason: collision with root package name */
    public int f2111w;

    public b(int i, int i4, int i6) {
        this.f2108n = i6;
        this.f2109u = i4;
        boolean z6 = false;
        if (i6 <= 0 ? i >= i4 : i <= i4) {
            z6 = true;
        }
        this.f2110v = z6;
        this.f2111w = z6 ? i : i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2110v;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2111w;
        if (i != this.f2109u) {
            this.f2111w = this.f2108n + i;
        } else {
            if (!this.f2110v) {
                throw new NoSuchElementException();
            }
            this.f2110v = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
