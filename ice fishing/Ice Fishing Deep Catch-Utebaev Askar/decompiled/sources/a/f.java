package a;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f26d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24b = -1;

    public f(a aVar) {
        this.f26d = aVar;
        this.f23a = aVar.f3d.f10c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f25c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f24b;
        a aVar = this.f26d;
        Object objA = aVar.a(i2, 0);
        if (!(key == objA || (key != null && key.equals(objA)))) {
            return false;
        }
        Object value = entry.getValue();
        Object objA2 = aVar.a(this.f24b, 1);
        return value == objA2 || (value != null && value.equals(objA2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f25c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f26d.a(this.f24b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f25c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f26d.a(this.f24b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24b < this.f23a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f25c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f24b;
        a aVar = this.f26d;
        Object objA = aVar.a(i2, 0);
        Object objA2 = aVar.a(this.f24b, 1);
        return (objA == null ? 0 : objA.hashCode()) ^ (objA2 != null ? objA2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f24b++;
        this.f25c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f25c) {
            throw new IllegalStateException();
        }
        this.f26d.b(this.f24b);
        this.f24b--;
        this.f23a--;
        this.f25c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f25c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = (this.f24b << 1) + 1;
        Object[] objArr = this.f26d.f3d.f9b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
