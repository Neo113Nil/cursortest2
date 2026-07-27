package s;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b extends k implements Map {

    /* renamed from: A, reason: collision with root package name */
    public C4986a f40369A;

    public b(int i) {
        if (i == 0) {
            this.f40407n = d.f40380a;
            this.f40408u = d.f40382c;
        } else {
            a(i);
        }
        this.f40409v = 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f40369A == null) {
            this.f40369A = new C4986a(0, this);
        }
        C4986a c4986a = this.f40369A;
        if (((g) c4986a.f40400a) == null) {
            c4986a.f40400a = new g(c4986a, 0);
        }
        return (g) c4986a.f40400a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f40369A == null) {
            this.f40369A = new C4986a(0, this);
        }
        C4986a c4986a = this.f40369A;
        if (((g) c4986a.f40401b) == null) {
            c4986a.f40401b = new g(c4986a, 1);
        }
        return (g) c4986a.f40401b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f40409v);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f40369A == null) {
            this.f40369A = new C4986a(0, this);
        }
        C4986a c4986a = this.f40369A;
        if (((i) c4986a.f40402c) == null) {
            c4986a.f40402c = new i(c4986a);
        }
        return (i) c4986a.f40402c;
    }
}
