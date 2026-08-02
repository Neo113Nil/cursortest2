package s;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b extends k implements Map {

    /* renamed from: A, reason: collision with root package name */
    public C4914a f40236A;

    public b(int i) {
        if (i == 0) {
            this.f40274n = d.f40247a;
            this.f40275u = d.f40249c;
        } else {
            a(i);
        }
        this.f40276v = 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f40236A == null) {
            this.f40236A = new C4914a(0, this);
        }
        C4914a c4914a = this.f40236A;
        if (((g) c4914a.f40267a) == null) {
            c4914a.f40267a = new g(c4914a, 0);
        }
        return (g) c4914a.f40267a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f40236A == null) {
            this.f40236A = new C4914a(0, this);
        }
        C4914a c4914a = this.f40236A;
        if (((g) c4914a.f40268b) == null) {
            c4914a.f40268b = new g(c4914a, 1);
        }
        return (g) c4914a.f40268b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f40276v);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f40236A == null) {
            this.f40236A = new C4914a(0, this);
        }
        C4914a c4914a = this.f40236A;
        if (((i) c4914a.f40269c) == null) {
            c4914a.f40269c = new i(c4914a);
        }
        return (i) c4914a.f40269c;
    }
}
