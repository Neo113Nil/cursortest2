package j1;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.i;

/* renamed from: j1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0968b implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final C0969c f8039a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8040b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8041c;

    public C0968b(C0969c map, int i2) {
        i.e(map, "map");
        this.f8039a = map;
        this.f8040b = i2;
        this.f8041c = map.f8050h;
    }

    public final void a() {
        if (this.f8039a.f8050h != this.f8041c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (i.a(entry.getKey(), getKey()) && i.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f8039a.f8043a[this.f8040b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f8039a.f8044b;
        i.b(objArr);
        return objArr[this.f8040b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        C0969c c0969c = this.f8039a;
        c0969c.b();
        Object[] objArr = c0969c.f8044b;
        if (objArr == null) {
            int length = c0969c.f8043a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c0969c.f8044b = objArr;
        }
        int i2 = this.f8040b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
