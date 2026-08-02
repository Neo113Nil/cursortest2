package f3;

import D.x;

/* loaded from: classes2.dex */
public final class e implements c {

    /* renamed from: n, reason: collision with root package name */
    public final f f37445n = new f();

    /* renamed from: u, reason: collision with root package name */
    public volatile c f37446u;

    /* renamed from: v, reason: collision with root package name */
    public Object f37447v;

    public e(c cVar) {
        this.f37446u = cVar;
    }

    @Override // f3.c
    public final Object c() {
        if (this.f37446u != null) {
            synchronized (this.f37445n) {
                try {
                    if (this.f37446u != null) {
                        Object c9 = this.f37446u.c();
                        this.f37447v = c9;
                        this.f37446u = null;
                        return c9;
                    }
                } finally {
                }
            }
        }
        return this.f37447v;
    }

    public final String toString() {
        Object obj = this.f37446u;
        if (obj == null) {
            obj = x.l("<supplier that returned ", String.valueOf(this.f37447v), ">");
        }
        return x.l("Suppliers.memoize(", obj.toString(), ")");
    }
}
