package w7;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: w7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5158e implements Map.Entry, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final C5159f f41671n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41672u;

    /* renamed from: v, reason: collision with root package name */
    public final int f41673v;

    public C5158e(C5159f map, int i) {
        kotlin.jvm.internal.h.e(map, "map");
        this.f41671n = map;
        this.f41672u = i;
        this.f41673v = map.f41675A;
    }

    public final void a() {
        if (this.f41671n.f41675A != this.f41673v) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return kotlin.jvm.internal.h.a(entry.getKey(), getKey()) && kotlin.jvm.internal.h.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f41671n.f41681n[this.f41672u];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f41671n.f41682u;
        kotlin.jvm.internal.h.b(objArr);
        return objArr[this.f41672u];
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
        C5159f c5159f = this.f41671n;
        c5159f.d();
        Object[] objArr = c5159f.f41682u;
        if (objArr == null) {
            int length = c5159f.f41681n.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c5159f.f41682u = objArr;
        }
        int i = this.f41672u;
        Object obj2 = objArr[i];
        objArr[i] = obj;
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
