package w7;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: w7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5158e implements Map.Entry, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final C5159f f41674n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41675u;

    /* renamed from: v, reason: collision with root package name */
    public final int f41676v;

    public C5158e(C5159f map, int i) {
        kotlin.jvm.internal.h.e(map, "map");
        this.f41674n = map;
        this.f41675u = i;
        this.f41676v = map.f41678A;
    }

    public final void a() {
        if (this.f41674n.f41678A != this.f41676v) {
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
        return this.f41674n.f41684n[this.f41675u];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f41674n.f41685u;
        kotlin.jvm.internal.h.b(objArr);
        return objArr[this.f41675u];
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
        C5159f c5159f = this.f41674n;
        c5159f.d();
        Object[] objArr = c5159f.f41685u;
        if (objArr == null) {
            int length = c5159f.f41684n.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c5159f.f41685u = objArr;
        }
        int i = this.f41675u;
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
