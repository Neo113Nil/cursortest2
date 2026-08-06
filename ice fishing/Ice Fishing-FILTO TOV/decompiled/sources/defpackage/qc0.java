package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qc0 implements Map, q40 {
    public nq AvO7iQsrTN;
    public nq EljAMC1QTz;
    public final hg0 OOA6hdeuvCS;
    public q61 encWxUiV2;

    public qc0(hg0 hg0Var) {
        hg0Var.getClass();
        this.OOA6hdeuvCS = hg0Var;
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
        return this.OOA6hdeuvCS.X1lG3V04pd(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.OOA6hdeuvCS.xqGvceK5x(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        nq nqVar = this.EljAMC1QTz;
        if (nqVar != null) {
            return nqVar;
        }
        nq nqVar2 = new nq(this.OOA6hdeuvCS, 0);
        this.EljAMC1QTz = nqVar2;
        return nqVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qc0.class != obj.getClass()) {
            return false;
        }
        return o30.rQPn8YBR(this.OOA6hdeuvCS, ((qc0) obj).OOA6hdeuvCS);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.OOA6hdeuvCS.AvO7iQsrTN(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.OOA6hdeuvCS.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.OOA6hdeuvCS.mOu10nynGul();
    }

    @Override // java.util.Map
    public final Set keySet() {
        nq nqVar = this.AvO7iQsrTN;
        if (nqVar != null) {
            return nqVar;
        }
        nq nqVar2 = new nq(this.OOA6hdeuvCS, 1);
        this.AvO7iQsrTN = nqVar2;
        return nqVar2;
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
        return this.OOA6hdeuvCS.OOA6hdeuvCS;
    }

    public final String toString() {
        return this.OOA6hdeuvCS.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        q61 q61Var = this.encWxUiV2;
        if (q61Var != null) {
            return q61Var;
        }
        q61 q61Var2 = new q61(this.OOA6hdeuvCS);
        this.encWxUiV2 = q61Var2;
        return q61Var2;
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
