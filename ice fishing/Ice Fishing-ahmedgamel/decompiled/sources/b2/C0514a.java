package b2;

import t7.InterfaceC5044a;

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514a implements InterfaceC5044a {

    /* renamed from: v, reason: collision with root package name */
    public static final Object f5411v = new Object();

    /* renamed from: n, reason: collision with root package name */
    public volatile InterfaceC0515b f5412n;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f5413u;

    public static InterfaceC5044a a(InterfaceC0515b interfaceC0515b) {
        if (interfaceC0515b instanceof C0514a) {
            return interfaceC0515b;
        }
        C0514a c0514a = new C0514a();
        c0514a.f5413u = f5411v;
        c0514a.f5412n = interfaceC0515b;
        return c0514a;
    }

    @Override // t7.InterfaceC5044a
    public final Object get() {
        Object obj;
        Object obj2 = this.f5413u;
        Object obj3 = f5411v;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f5413u;
                if (obj == obj3) {
                    obj = this.f5412n.get();
                    Object obj4 = this.f5413u;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f5413u = obj;
                    this.f5412n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
