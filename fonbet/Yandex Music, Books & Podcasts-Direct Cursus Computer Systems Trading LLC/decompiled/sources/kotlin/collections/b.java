package kotlin.collections;

import defpackage.i7;
import defpackage.j9f;
import defpackage.k7;
import defpackage.l7;
import defpackage.v5;
import defpackage.w5;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class b implements Map, j9f {

    @NotNull
    public static final i7 c = new i7(null);
    public volatile k7 a;
    public volatile l7 b;

    public abstract Set a();

    public Set b() {
        if (this.a == null) {
            this.a = new k7(this);
        }
        k7 k7Var = this.a;
        k7Var.getClass();
        return k7Var;
    }

    public Collection c() {
        if (this.b == null) {
            this.b = new l7(0, this);
        }
        l7 l7Var = this.b;
        l7Var.getClass();
        return l7Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set a = a();
        if (a.isEmpty()) {
            return false;
        }
        Iterator it = a.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final Map.Entry d(Object obj) {
        Object obj2;
        Iterator it = a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.d(((Map.Entry) obj2).getKey(), obj)) {
                break;
            }
        }
        return (Map.Entry) obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (f() != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : entrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (Intrinsics.d(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    public int f() {
        return ((w5) a()).f();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Map.Entry d = d(obj);
        if (d != null) {
            return d.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return f() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return b();
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
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return f();
    }

    public final String toString() {
        return CollectionsKt.X(a(), ", ", "{", "}", new v5(2, this), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return c();
    }
}
