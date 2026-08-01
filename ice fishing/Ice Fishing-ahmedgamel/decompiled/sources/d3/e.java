package d3;

import D.y;

/* loaded from: classes2.dex */
public final class e implements c {

    /* renamed from: n, reason: collision with root package name */
    public final f f37043n = new f();

    /* renamed from: u, reason: collision with root package name */
    public volatile c f37044u;

    /* renamed from: v, reason: collision with root package name */
    public Object f37045v;

    public e(c cVar) {
        this.f37044u = cVar;
    }

    @Override // d3.c
    public final Object c() {
        if (this.f37044u != null) {
            synchronized (this.f37043n) {
                try {
                    if (this.f37044u != null) {
                        Object c9 = this.f37044u.c();
                        this.f37045v = c9;
                        this.f37044u = null;
                        return c9;
                    }
                } finally {
                }
            }
        }
        return this.f37045v;
    }

    public final String toString() {
        Object obj = this.f37044u;
        if (obj == null) {
            obj = y.o("<supplier that returned ", String.valueOf(this.f37045v), ">");
        }
        return y.o("Suppliers.memoize(", obj.toString(), ")");
    }
}
