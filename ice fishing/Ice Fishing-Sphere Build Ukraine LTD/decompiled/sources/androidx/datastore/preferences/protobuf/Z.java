package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class Z implements Map.Entry, Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final Comparable f1412e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1413f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y f1414g;

    public Z(Y y2, Comparable comparable, Object obj) {
        this.f1414g = y2;
        this.f1412e = comparable;
        this.f1413f = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1412e.compareTo(((Z) obj).f1412e);
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
        Comparable comparable = this.f1412e;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f1413f;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1412e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1413f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f1412e;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f1413f;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f1414g.b();
        Object obj2 = this.f1413f;
        this.f1413f = obj;
        return obj2;
    }

    public final String toString() {
        return this.f1412e + "=" + this.f1413f;
    }
}
