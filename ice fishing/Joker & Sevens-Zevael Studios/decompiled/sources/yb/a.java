package yb;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8813c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile c f8814a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f8815b;

    public static c a(c cVar) {
        if (cVar instanceof a) {
            return cVar;
        }
        a aVar = new a();
        aVar.f8815b = f8813c;
        aVar.f8814a = cVar;
        return aVar;
    }

    @Override // zb.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f8815b;
        Object obj3 = f8813c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f8815b;
                if (obj == obj3) {
                    obj = this.f8814a.get();
                    Object obj4 = this.f8815b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f8815b = obj;
                    this.f8814a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
