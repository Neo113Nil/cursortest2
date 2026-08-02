package s;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final int f40255n;

    /* renamed from: u, reason: collision with root package name */
    public int f40256u;

    /* renamed from: v, reason: collision with root package name */
    public int f40257v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f40258w = false;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f40259x;

    public f(j jVar, int i) {
        this.f40259x = jVar;
        this.f40255n = i;
        this.f40256u = jVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40257v < this.f40256u;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object c9 = this.f40259x.c(this.f40257v, this.f40255n);
        this.f40257v++;
        this.f40258w = true;
        return c9;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f40258w) {
            throw new IllegalStateException();
        }
        int i = this.f40257v - 1;
        this.f40257v = i;
        this.f40256u--;
        this.f40258w = false;
        this.f40259x.i(i);
    }
}
