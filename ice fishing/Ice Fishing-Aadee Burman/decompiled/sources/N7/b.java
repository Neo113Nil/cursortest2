package N7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b implements Iterator, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final int f2020n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2021u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2022v;

    /* renamed from: w, reason: collision with root package name */
    public int f2023w;

    public b(int i, int i6, int i9) {
        this.f2020n = i9;
        this.f2021u = i6;
        boolean z3 = false;
        if (i9 <= 0 ? i >= i6 : i <= i6) {
            z3 = true;
        }
        this.f2022v = z3;
        this.f2023w = z3 ? i : i6;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2022v;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2023w;
        if (i != this.f2021u) {
            this.f2023w = this.f2020n + i;
        } else {
            if (!this.f2022v) {
                throw new NoSuchElementException();
            }
            this.f2022v = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
