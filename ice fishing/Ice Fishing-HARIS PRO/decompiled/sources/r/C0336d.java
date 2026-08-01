package r;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: r.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336d implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f4304a;

    /* renamed from: b, reason: collision with root package name */
    public int f4305b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4306c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0338f f4307d;

    public C0336d(C0338f c0338f) {
        this.f4307d = c0338f;
        this.f4304a = c0338f.f4322c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f4306c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f4305b;
        C0338f c0338f = this.f4307d;
        return D1.i.a(key, c0338f.f(i)) && D1.i.a(entry.getValue(), c0338f.i(this.f4305b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f4306c) {
            return this.f4307d.f(this.f4305b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f4306c) {
            return this.f4307d.i(this.f4305b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4305b < this.f4304a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f4306c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f4305b;
        C0338f c0338f = this.f4307d;
        Object f2 = c0338f.f(i);
        Object i2 = c0338f.i(this.f4305b);
        return (f2 == null ? 0 : f2.hashCode()) ^ (i2 != null ? i2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4305b++;
        this.f4306c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4306c) {
            throw new IllegalStateException();
        }
        this.f4307d.g(this.f4305b);
        this.f4305b--;
        this.f4304a--;
        this.f4306c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f4306c) {
            return this.f4307d.h(this.f4305b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
