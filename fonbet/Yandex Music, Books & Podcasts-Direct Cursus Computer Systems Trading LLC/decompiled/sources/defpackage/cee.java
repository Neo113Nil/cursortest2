package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes3.dex */
public abstract class cee implements Map, Serializable {
    private static final long serialVersionUID = 912559;
    public transient hee a;
    public transient hee b;
    public transient qde c;

    public static cee a(Map map) {
        if ((map instanceof cee) && !(map instanceof SortedMap)) {
            return (cee) map;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        boolean z = entrySet instanceof Collection;
        x0 x0Var = new x0(z ? entrySet.size() : 4);
        if (z) {
            int size = entrySet.size() * 2;
            Object[] objArr = (Object[]) x0Var.c;
            if (size > objArr.length) {
                x0Var.c = Arrays.copyOf(objArr, pde.e(objArr.length, size));
            }
        }
        for (Map.Entry entry : entrySet) {
            x0Var.V(entry.getKey(), entry.getValue());
        }
        return x0Var.r();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract ssn b();

    public abstract tsn c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract qde d();

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final hee keySet() {
        hee heeVar = this.b;
        if (heeVar != null) {
            return heeVar;
        }
        tsn c = c();
        this.b = c;
        return c;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        hee heeVar = this.a;
        if (heeVar != null) {
            return heeVar;
        }
        ssn b = b();
        this.a = b;
        return b;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return gdg.v(obj, this);
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public qde values() {
        qde qdeVar = this.c;
        if (qdeVar != null) {
            return qdeVar;
        }
        qde d = d();
        this.c = d;
        return d;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        hee heeVar = this.a;
        if (heeVar == null) {
            heeVar = b();
            this.a = heeVar;
        }
        return ezf.E(heeVar);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        hld.w(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public Object writeReplace() {
        return new bee(this);
    }
}
