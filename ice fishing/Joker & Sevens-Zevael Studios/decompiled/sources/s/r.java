package s;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r implements Map, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public final g0 f6326g;

    /* renamed from: h, reason: collision with root package name */
    public h f6327h;

    /* renamed from: i, reason: collision with root package name */
    public h f6328i;

    /* renamed from: j, reason: collision with root package name */
    public s0 f6329j;

    public r(g0 g0Var) {
        pc.j.e(g0Var, "parent");
        this.f6326g = g0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f6326g.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f6326g.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.f6327h;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.f6326g, 0);
        this.f6327h = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        return pc.j.a(this.f6326g, ((r) obj).f6326g);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f6326g.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f6326g.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f6326g.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.f6328i;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.f6326g, 1);
        this.f6328i = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f6326g.f6270e;
    }

    public final String toString() {
        return this.f6326g.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        s0 s0Var = this.f6329j;
        if (s0Var != null) {
            return s0Var;
        }
        s0 s0Var2 = new s0(this.f6326g);
        this.f6329j = s0Var2;
        return s0Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
