package l;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f8113a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0977a f8116d;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8115c = false;

    /* renamed from: b, reason: collision with root package name */
    public int f8114b = -1;

    public i(C0977a c0977a) {
        this.f8116d = c0977a;
        this.f8113a = c0977a.d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f8115c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f8114b;
        C0977a c0977a = this.f8116d;
        Object b2 = c0977a.b(i2, 0);
        if (key != b2 && (key == null || !key.equals(b2))) {
            return false;
        }
        Object value = entry.getValue();
        Object b3 = c0977a.b(this.f8114b, 1);
        return value == b3 || (value != null && value.equals(b3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f8115c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f8116d.b(this.f8114b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f8115c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f8116d.b(this.f8114b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8114b < this.f8113a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f8115c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f8114b;
        C0977a c0977a = this.f8116d;
        Object b2 = c0977a.b(i2, 0);
        Object b3 = c0977a.b(this.f8114b, 1);
        return (b2 == null ? 0 : b2.hashCode()) ^ (b3 != null ? b3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8114b++;
        this.f8115c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8115c) {
            throw new IllegalStateException();
        }
        this.f8116d.g(this.f8114b);
        this.f8114b--;
        this.f8113a--;
        this.f8115c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f8115c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        C0977a c0977a = this.f8116d;
        int i2 = this.f8114b;
        switch (c0977a.f8081d) {
            case 0:
                int i3 = (i2 << 1) + 1;
                Object[] objArr = ((C0978b) c0977a.f8082e).f8123b;
                Object obj2 = objArr[i3];
                objArr[i3] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
