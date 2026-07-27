package s;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b extends k implements Map {

    /* renamed from: A, reason: collision with root package name */
    public C4964a f40397A;

    public b(int i) {
        if (i == 0) {
            this.f40435n = d.f40408a;
            this.f40436u = d.f40410c;
        } else {
            a(i);
        }
        this.f40437v = 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f40397A == null) {
            this.f40397A = new C4964a(0, this);
        }
        C4964a c4964a = this.f40397A;
        if (((g) c4964a.f40428a) == null) {
            c4964a.f40428a = new g(c4964a, 0);
        }
        return (g) c4964a.f40428a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f40397A == null) {
            this.f40397A = new C4964a(0, this);
        }
        C4964a c4964a = this.f40397A;
        if (((g) c4964a.f40429b) == null) {
            c4964a.f40429b = new g(c4964a, 1);
        }
        return (g) c4964a.f40429b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f40437v);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f40397A == null) {
            this.f40397A = new C4964a(0, this);
        }
        C4964a c4964a = this.f40397A;
        if (((i) c4964a.f40430c) == null) {
            c4964a.f40430c = new i(c4964a);
        }
        return (i) c4964a.f40430c;
    }
}
