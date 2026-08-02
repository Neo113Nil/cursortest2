package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes9.dex */
public final class tf00 implements Map.Entry, agx {
    public final MapBuilder a;
    public final int b;
    public final int c;

    public tf00(MapBuilder mapBuilder, int i) {
        int i2;
        this.a = mapBuilder;
        this.b = i;
        i2 = mapBuilder.modCount;
        this.c = i2;
    }

    public final void a() {
        int i;
        i = this.a.modCount;
        if (i != this.c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return jl40.l(entry.getKey(), getKey()) && jl40.l(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.a.keysArray[this.b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        return this.a.valuesArray[this.b];
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
        MapBuilder mapBuilder = this.a;
        mapBuilder.k();
        Object[] i = mapBuilder.i();
        int i2 = this.b;
        Object obj2 = i[i2];
        i[i2] = obj;
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
