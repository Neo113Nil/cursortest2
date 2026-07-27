package s;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final int f40416n;

    /* renamed from: u, reason: collision with root package name */
    public int f40417u;

    /* renamed from: v, reason: collision with root package name */
    public int f40418v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f40419w = false;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f40420x;

    public f(j jVar, int i) {
        this.f40420x = jVar;
        this.f40416n = i;
        this.f40417u = jVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40418v < this.f40417u;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object c9 = this.f40420x.c(this.f40418v, this.f40416n);
        this.f40418v++;
        this.f40419w = true;
        return c9;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f40419w) {
            throw new IllegalStateException();
        }
        int i = this.f40418v - 1;
        this.f40418v = i;
        this.f40417u--;
        this.f40419w = false;
        this.f40420x.i(i);
    }
}
