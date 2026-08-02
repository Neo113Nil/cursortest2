package defpackage;

/* loaded from: classes.dex */
public final class u8a implements szm {
    public static final Object c = new Object();
    public volatile p3c a;
    public volatile Object b;

    public static szm a(p3c p3cVar) {
        if (p3cVar instanceof u8a) {
            return p3cVar;
        }
        u8a u8aVar = new u8a();
        u8aVar.b = c;
        u8aVar.a = p3cVar;
        return u8aVar;
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
