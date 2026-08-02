package defpackage;

/* loaded from: classes5.dex */
public final class t8a implements rzm, zqf {
    public static final Object c = new Object();
    public volatile rzm a;
    public volatile Object b = c;

    public t8a(rzm rzmVar) {
        this.a = rzmVar;
    }

    public static zqf a(rzm rzmVar) {
        if (rzmVar instanceof zqf) {
            return (zqf) rzmVar;
        }
        rzmVar.getClass();
        return new t8a(rzmVar);
    }

    public static rzm b(rzm rzmVar) {
        rzmVar.getClass();
        return rzmVar instanceof t8a ? rzmVar : new t8a(rzmVar);
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
        }
        return obj;
    }
}
