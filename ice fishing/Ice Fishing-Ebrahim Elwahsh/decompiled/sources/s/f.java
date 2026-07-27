package s;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final int f40388n;

    /* renamed from: u, reason: collision with root package name */
    public int f40389u;

    /* renamed from: v, reason: collision with root package name */
    public int f40390v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f40391w = false;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f40392x;

    public f(j jVar, int i) {
        this.f40392x = jVar;
        this.f40388n = i;
        this.f40389u = jVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40390v < this.f40389u;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object c4 = this.f40392x.c(this.f40390v, this.f40388n);
        this.f40390v++;
        this.f40391w = true;
        return c4;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f40391w) {
            throw new IllegalStateException();
        }
        int i = this.f40390v - 1;
        this.f40390v = i;
        this.f40389u--;
        this.f40391w = false;
        this.f40392x.i(i);
    }
}
