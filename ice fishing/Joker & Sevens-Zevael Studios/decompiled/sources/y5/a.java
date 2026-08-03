package y5;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements zb.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8787c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f8788a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f8789b;

    public static zb.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f8789b = f8787c;
        aVar.f8788a = bVar;
        return aVar;
    }

    @Override // zb.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f8789b;
        Object obj3 = f8787c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f8789b;
                if (obj == obj3) {
                    obj = this.f8788a.get();
                    Object obj4 = this.f8789b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f8789b = obj;
                    this.f8788a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
