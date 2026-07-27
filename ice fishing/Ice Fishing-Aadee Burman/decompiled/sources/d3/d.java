package d3;

import D.y;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class d implements Serializable, c {

    /* renamed from: n, reason: collision with root package name */
    public final transient f f37039n = new f();

    /* renamed from: u, reason: collision with root package name */
    public final c f37040u;

    /* renamed from: v, reason: collision with root package name */
    public volatile transient boolean f37041v;

    /* renamed from: w, reason: collision with root package name */
    public transient Object f37042w;

    public d(c cVar) {
        this.f37040u = cVar;
    }

    @Override // d3.c
    public final Object c() {
        if (!this.f37041v) {
            synchronized (this.f37039n) {
                try {
                    if (!this.f37041v) {
                        Object c9 = this.f37040u.c();
                        this.f37042w = c9;
                        this.f37041v = true;
                        return c9;
                    }
                } finally {
                }
            }
        }
        return this.f37042w;
    }

    public final String toString() {
        return y.o("Suppliers.memoize(", (this.f37041v ? y.o("<supplier that returned ", String.valueOf(this.f37042w), ">") : this.f37040u).toString(), ")");
    }
}
