package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class Z implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f2364a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y f2366c;

    public Z(Y y2, Comparable comparable, Object obj) {
        this.f2366c = y2;
        this.f2364a = comparable;
        this.f2365b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2364a.compareTo(((Z) obj).f2364a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f2364a;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f2365b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2364a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2365b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f2364a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f2365b;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2366c.b();
        Object obj2 = this.f2365b;
        this.f2365b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f2364a + "=" + this.f2365b;
    }
}
