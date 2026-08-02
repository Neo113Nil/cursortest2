package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes3.dex */
public class p7 extends AbstractMap {
    public transient n7 a;
    public transient e8 b;
    public final transient Map c;
    public final /* synthetic */ y7 d;

    public p7(y7 y7Var, Map map) {
        this.d = y7Var;
        this.c = map;
    }

    public final rde a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        g7 g7Var = (g7) this.d;
        List list = (List) collection;
        return new rde(key, list instanceof RandomAccess ? new t7(g7Var, key, list, null) : new x7(g7Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        y7 y7Var = this.d;
        if (this.c == y7Var.d) {
            y7Var.c();
            return;
        }
        o7 o7Var = new o7(this);
        while (o7Var.hasNext()) {
            o7Var.next();
            o7Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        n7 n7Var = this.a;
        if (n7Var != null) {
            return n7Var;
        }
        n7 n7Var2 = new n7(this);
        this.a = n7Var2;
        return n7Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        g7 g7Var = (g7) this.d;
        List list = (List) collection;
        return list instanceof RandomAccess ? new t7(g7Var, obj, list, null) : new x7(g7Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        y7 y7Var = this.d;
        Set set = y7Var.a;
        if (set != null) {
            return set;
        }
        Set f = y7Var.f();
        y7Var.a = f;
        return f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        y7 y7Var = this.d;
        Collection e = y7Var.e();
        e.addAll(collection);
        y7Var.e -= collection.size();
        collection.clear();
        return e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        e8 e8Var = this.b;
        if (e8Var != null) {
            return e8Var;
        }
        e8 e8Var2 = new e8(this);
        this.b = e8Var2;
        return e8Var2;
    }
}
