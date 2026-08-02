package f3;

import D.x;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class d implements Serializable, c {

    /* renamed from: n, reason: collision with root package name */
    public final transient f f37441n = new f();

    /* renamed from: u, reason: collision with root package name */
    public final c f37442u;

    /* renamed from: v, reason: collision with root package name */
    public volatile transient boolean f37443v;

    /* renamed from: w, reason: collision with root package name */
    public transient Object f37444w;

    public d(c cVar) {
        this.f37442u = cVar;
    }

    @Override // f3.c
    public final Object c() {
        if (!this.f37443v) {
            synchronized (this.f37441n) {
                try {
                    if (!this.f37443v) {
                        Object c9 = this.f37442u.c();
                        this.f37444w = c9;
                        this.f37443v = true;
                        return c9;
                    }
                } finally {
                }
            }
        }
        return this.f37444w;
    }

    public final String toString() {
        return x.l("Suppliers.memoize(", (this.f37443v ? x.l("<supplier that returned ", String.valueOf(this.f37444w), ">") : this.f37442u).toString(), ")");
    }
}
