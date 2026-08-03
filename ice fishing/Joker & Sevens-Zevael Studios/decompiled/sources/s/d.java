package s;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {

    /* renamed from: g, reason: collision with root package name */
    public int f6241g;

    /* renamed from: h, reason: collision with root package name */
    public int f6242h = -1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6243i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f6244j;

    public d(f fVar) {
        this.f6244j = fVar;
        this.f6241g = fVar.f6325i - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f6243i) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.f6242h;
        f fVar = this.f6244j;
        return pc.j.a(key, fVar.e(i10)) && pc.j.a(entry.getValue(), fVar.h(this.f6242h));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f6243i) {
            return this.f6244j.e(this.f6242h);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f6243i) {
            return this.f6244j.h(this.f6242h);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6242h < this.f6241g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f6243i) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.f6242h;
        f fVar = this.f6244j;
        Object e10 = fVar.e(i10);
        Object h10 = fVar.h(this.f6242h);
        return (e10 == null ? 0 : e10.hashCode()) ^ (h10 != null ? h10.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6242h++;
        this.f6243i = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f6243i) {
            throw new IllegalStateException();
        }
        this.f6244j.f(this.f6242h);
        this.f6242h--;
        this.f6241g--;
        this.f6243i = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f6243i) {
            return this.f6244j.g(this.f6242h, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
