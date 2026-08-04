package com.gamericefishpro.space.sa;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements i {
    public static final Object c = new Object();
    public volatile h a;
    public volatile Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public static g b(h hVar) {
        if (hVar instanceof g) {
            return (g) hVar;
        }
        g gVar = new g();
        gVar.b = c;
        gVar.a = hVar;
        return gVar;
    }

    @Override // com.gamericefishpro.space.sa.i
    public final Object a() {
        Object objA;
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.b;
                if (objA == obj2) {
                    objA = this.a.a();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.b = objA;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
