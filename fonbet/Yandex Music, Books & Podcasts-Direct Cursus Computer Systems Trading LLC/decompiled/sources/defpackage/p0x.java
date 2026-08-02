package defpackage;

/* loaded from: classes3.dex */
public final class p0x implements u0x {
    public static final Object c = new Object();
    public volatile u0x a;
    public volatile Object b;

    public static u0x a(u0x u0xVar) {
        if (u0xVar instanceof p0x) {
            return u0xVar;
        }
        p0x p0xVar = new p0x();
        p0xVar.b = c;
        p0xVar.a = u0xVar;
        return p0xVar;
    }

    @Override // defpackage.u0x
    public final Object d() {
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
                    obj = this.a.d();
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
