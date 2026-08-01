package s;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h implements Iterator, Map.Entry {

    /* renamed from: n, reason: collision with root package name */
    public int f40426n;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f40429w;

    /* renamed from: v, reason: collision with root package name */
    public boolean f40428v = false;

    /* renamed from: u, reason: collision with root package name */
    public int f40427u = -1;

    public h(j jVar) {
        this.f40429w = jVar;
        this.f40426n = jVar.e() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f40428v) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f40427u;
        j jVar = this.f40429w;
        Object c9 = jVar.c(i, 0);
        if (key != c9 && (key == null || !key.equals(c9))) {
            return false;
        }
        Object value = entry.getValue();
        Object c10 = jVar.c(this.f40427u, 1);
        return value == c10 || (value != null && value.equals(c10));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f40428v) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f40429w.c(this.f40427u, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f40428v) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f40429w.c(this.f40427u, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40427u < this.f40426n;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f40428v) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f40427u;
        j jVar = this.f40429w;
        Object c9 = jVar.c(i, 0);
        Object c10 = jVar.c(this.f40427u, 1);
        return (c9 == null ? 0 : c9.hashCode()) ^ (c10 != null ? c10.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f40427u++;
        this.f40428v = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f40428v) {
            throw new IllegalStateException();
        }
        this.f40429w.i(this.f40427u);
        this.f40427u--;
        this.f40426n--;
        this.f40428v = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f40428v) {
            return this.f40429w.j(this.f40427u, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
