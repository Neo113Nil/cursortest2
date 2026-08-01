package r;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: r.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338f extends C0342j implements Map {

    /* renamed from: d, reason: collision with root package name */
    public C0333a f4309d;
    public C0335c e;

    /* renamed from: f, reason: collision with root package name */
    public C0337e f4310f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0338f(C0342j c0342j) {
        super(0);
        int i = c0342j.f4322c;
        b(this.f4322c + i);
        if (this.f4322c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c0342j.f(i2), c0342j.i(i2));
            }
        } else if (i > 0) {
            u1.f.E(0, 0, i, c0342j.f4320a, this.f4320a);
            u1.f.F(c0342j.f4321b, this.f4321b, 0, 0, i << 1);
            this.f4322c = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0333a c0333a = this.f4309d;
        if (c0333a != null) {
            return c0333a;
        }
        C0333a c0333a2 = new C0333a(this);
        this.f4309d = c0333a2;
        return c0333a2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.f4322c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f4322c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0335c c0335c = this.e;
        if (c0335c != null) {
            return c0335c;
        }
        C0335c c0335c2 = new C0335c(this);
        this.e = c0335c2;
        return c0335c2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f4322c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0337e c0337e = this.f4310f;
        if (c0337e != null) {
            return c0337e;
        }
        C0337e c0337e2 = new C0337e(this);
        this.f4310f = c0337e2;
        return c0337e2;
    }
}
