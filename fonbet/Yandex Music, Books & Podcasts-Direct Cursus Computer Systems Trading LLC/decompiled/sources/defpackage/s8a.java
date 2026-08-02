package defpackage;

/* loaded from: classes3.dex */
public final class s8a implements szm, xqf {
    public static final Object c = new Object();
    public volatile szm a;
    public volatile Object b = c;

    public s8a(szm szmVar) {
        this.a = szmVar;
    }

    public static szm a(o3c o3cVar) {
        return o3cVar instanceof s8a ? o3cVar : new s8a(o3cVar);
    }

    @Override // defpackage.szm
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.get();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
