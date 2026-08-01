package s;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public final int f40419n;

    /* renamed from: u, reason: collision with root package name */
    public int f40420u;

    /* renamed from: v, reason: collision with root package name */
    public int f40421v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f40422w = false;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f40423x;

    public f(j jVar, int i) {
        this.f40423x = jVar;
        this.f40419n = i;
        this.f40420u = jVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40421v < this.f40420u;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object c9 = this.f40423x.c(this.f40421v, this.f40419n);
        this.f40421v++;
        this.f40422w = true;
        return c9;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f40422w) {
            throw new IllegalStateException();
        }
        int i = this.f40421v - 1;
        this.f40421v = i;
        this.f40420u--;
        this.f40422w = false;
        this.f40423x.i(i);
    }
}
