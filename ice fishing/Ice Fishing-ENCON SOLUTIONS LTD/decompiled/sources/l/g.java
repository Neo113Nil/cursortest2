package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f8106a;

    /* renamed from: b, reason: collision with root package name */
    public int f8107b;

    /* renamed from: c, reason: collision with root package name */
    public int f8108c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8109d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0977a f8110e;

    public g(C0977a c0977a, int i2) {
        this.f8110e = c0977a;
        this.f8106a = i2;
        this.f8107b = c0977a.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8108c < this.f8107b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f8110e.b(this.f8108c, this.f8106a);
        this.f8108c++;
        this.f8109d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8109d) {
            throw new IllegalStateException();
        }
        int i2 = this.f8108c - 1;
        this.f8108c = i2;
        this.f8107b--;
        this.f8109d = false;
        this.f8110e.g(i2);
    }
}
