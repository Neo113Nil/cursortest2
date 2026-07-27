package k;

import D.C0013n;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator, Map.Entry {

    /* renamed from: e, reason: collision with root package name */
    public int f2658e;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0013n f2661h;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2660g = false;

    /* renamed from: f, reason: collision with root package name */
    public int f2659f = -1;

    public g(C0013n c0013n) {
        this.f2661h = c0013n;
        this.f2658e = ((C0189a) c0013n.f246d).f2669g - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f2660g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f2659f;
        C0013n c0013n = this.f2661h;
        Object b2 = c0013n.b(i2, 0);
        if (key != b2 && (key == null || !key.equals(b2))) {
            return false;
        }
        Object value = entry.getValue();
        Object b3 = c0013n.b(this.f2659f, 1);
        return value == b3 || (value != null && value.equals(b3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f2660g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f2661h.b(this.f2659f, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f2660g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f2661h.b(this.f2659f, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2659f < this.f2658e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f2660g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f2659f;
        C0013n c0013n = this.f2661h;
        Object b2 = c0013n.b(i2, 0);
        Object b3 = c0013n.b(this.f2659f, 1);
        return (b2 == null ? 0 : b2.hashCode()) ^ (b3 != null ? b3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2659f++;
        this.f2660g = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2660g) {
            throw new IllegalStateException();
        }
        this.f2661h.c(this.f2659f);
        this.f2659f--;
        this.f2658e--;
        this.f2660g = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f2660g) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = (this.f2659f << 1) + 1;
        Object[] objArr = ((C0189a) this.f2661h.f246d).f2668f;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
