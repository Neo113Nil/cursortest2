package b2;

import p7.InterfaceC4864a;

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0524a implements InterfaceC4864a {

    /* renamed from: v, reason: collision with root package name */
    public static final Object f5523v = new Object();

    /* renamed from: n, reason: collision with root package name */
    public volatile InterfaceC0525b f5524n;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f5525u;

    public static InterfaceC4864a a(InterfaceC0525b interfaceC0525b) {
        if (interfaceC0525b instanceof C0524a) {
            return interfaceC0525b;
        }
        C0524a c0524a = new C0524a();
        c0524a.f5525u = f5523v;
        c0524a.f5524n = interfaceC0525b;
        return c0524a;
    }

    @Override // p7.InterfaceC4864a
    public final Object get() {
        Object obj;
        Object obj2 = this.f5525u;
        Object obj3 = f5523v;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f5525u;
                if (obj == obj3) {
                    obj = this.f5524n.get();
                    Object obj4 = this.f5525u;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f5525u = obj;
                    this.f5524n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
