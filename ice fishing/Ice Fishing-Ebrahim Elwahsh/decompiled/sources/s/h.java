package s;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h implements Iterator, Map.Entry {

    /* renamed from: n, reason: collision with root package name */
    public int f40395n;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f40398w;

    /* renamed from: v, reason: collision with root package name */
    public boolean f40397v = false;

    /* renamed from: u, reason: collision with root package name */
    public int f40396u = -1;

    public h(j jVar) {
        this.f40398w = jVar;
        this.f40395n = jVar.e() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f40397v) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f40396u;
        j jVar = this.f40398w;
        Object c4 = jVar.c(i, 0);
        if (key != c4 && (key == null || !key.equals(c4))) {
            return false;
        }
        Object value = entry.getValue();
        Object c9 = jVar.c(this.f40396u, 1);
        return value == c9 || (value != null && value.equals(c9));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f40397v) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f40398w.c(this.f40396u, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f40397v) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f40398w.c(this.f40396u, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40396u < this.f40395n;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f40397v) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f40396u;
        j jVar = this.f40398w;
        Object c4 = jVar.c(i, 0);
        Object c9 = jVar.c(this.f40396u, 1);
        return (c4 == null ? 0 : c4.hashCode()) ^ (c9 != null ? c9.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f40396u++;
        this.f40397v = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f40397v) {
            throw new IllegalStateException();
        }
        this.f40398w.i(this.f40396u);
        this.f40396u--;
        this.f40395n--;
        this.f40397v = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f40397v) {
            return this.f40398w.j(this.f40396u, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
