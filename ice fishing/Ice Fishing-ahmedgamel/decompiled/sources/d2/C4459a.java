package d2;

import t7.InterfaceC5045a;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4459a implements InterfaceC5045a {

    /* renamed from: v, reason: collision with root package name */
    public static final Object f37178v = new Object();

    /* renamed from: n, reason: collision with root package name */
    public volatile InterfaceC4460b f37179n;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f37180u;

    public static InterfaceC5045a a(InterfaceC4460b interfaceC4460b) {
        if (interfaceC4460b instanceof C4459a) {
            return interfaceC4460b;
        }
        C4459a c4459a = new C4459a();
        c4459a.f37180u = f37178v;
        c4459a.f37179n = interfaceC4460b;
        return c4459a;
    }

    @Override // t7.InterfaceC5045a
    public final Object get() {
        Object obj;
        Object obj2 = this.f37180u;
        Object obj3 = f37178v;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f37180u;
                if (obj == obj3) {
                    obj = this.f37179n.get();
                    Object obj4 = this.f37180u;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f37180u = obj;
                    this.f37179n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
