package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class Z implements Map.Entry, Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final Comparable f1404f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1405g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y f1406h;

    public Z(Y y2, Comparable comparable, Object obj) {
        this.f1406h = y2;
        this.f1404f = comparable;
        this.f1405g = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1404f.compareTo(((Z) obj).f1404f);
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
        Comparable comparable = this.f1404f;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f1405g;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1404f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1405g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f1404f;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f1405g;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f1406h.b();
        Object obj2 = this.f1405g;
        this.f1405g = obj;
        return obj2;
    }

    public final String toString() {
        return this.f1404f + "=" + this.f1405g;
    }
}
