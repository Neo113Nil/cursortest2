package s;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b extends k implements Map {

    /* renamed from: A, reason: collision with root package name */
    public C4964a f40400A;

    public b(int i) {
        if (i == 0) {
            this.f40438n = d.f40411a;
            this.f40439u = d.f40413c;
        } else {
            a(i);
        }
        this.f40440v = 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f40400A == null) {
            this.f40400A = new C4964a(0, this);
        }
        C4964a c4964a = this.f40400A;
        if (((g) c4964a.f40431a) == null) {
            c4964a.f40431a = new g(c4964a, 0);
        }
        return (g) c4964a.f40431a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f40400A == null) {
            this.f40400A = new C4964a(0, this);
        }
        C4964a c4964a = this.f40400A;
        if (((g) c4964a.f40432b) == null) {
            c4964a.f40432b = new g(c4964a, 1);
        }
        return (g) c4964a.f40432b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f40440v);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f40400A == null) {
            this.f40400A = new C4964a(0, this);
        }
        C4964a c4964a = this.f40400A;
        if (((i) c4964a.f40433c) == null) {
            c4964a.f40433c = new i(c4964a);
        }
        return (i) c4964a.f40433c;
    }
}
