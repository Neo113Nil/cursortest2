package w7;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: w7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5157e implements Map.Entry, J7.a {

    /* renamed from: n, reason: collision with root package name */
    public final C5158f f41728n;

    /* renamed from: u, reason: collision with root package name */
    public final int f41729u;

    /* renamed from: v, reason: collision with root package name */
    public final int f41730v;

    public C5157e(C5158f map, int i) {
        kotlin.jvm.internal.h.e(map, "map");
        this.f41728n = map;
        this.f41729u = i;
        this.f41730v = map.f41732A;
    }

    public final void a() {
        if (this.f41728n.f41732A != this.f41730v) {
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
        return this.f41728n.f41738n[this.f41729u];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f41728n.f41739u;
        kotlin.jvm.internal.h.b(objArr);
        return objArr[this.f41729u];
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
        C5158f c5158f = this.f41728n;
        c5158f.d();
        Object[] objArr = c5158f.f41739u;
        if (objArr == null) {
            int length = c5158f.f41738n.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c5158f.f41739u = objArr;
        }
        int i = this.f41729u;
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
