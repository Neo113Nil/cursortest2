package cc;

import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements Map.Entry, qc.d {

    /* renamed from: g, reason: collision with root package name */
    public final g f1308g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1309h;

    public e(g gVar, int i10) {
        pc.j.e(gVar, "map");
        this.f1308g = gVar;
        this.f1309h = i10;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return pc.j.a(entry.getKey(), getKey()) && pc.j.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1308g.f1315g[this.f1309h];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f1308g.f1316h;
        pc.j.b(objArr);
        return objArr[this.f1309h];
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
        g gVar = this.f1308g;
        gVar.d();
        Object[] objArr = gVar.f1316h;
        if (objArr == null) {
            int length = gVar.f1315g.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            gVar.f1316h = objArr;
        }
        int i10 = this.f1309h;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
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
