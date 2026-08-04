package com.gamericefishpro.space.bb;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements com.gamericefishpro.space.nb.a {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile com.gamericefishpro.space.nb.a b;

    public q(com.gamericefishpro.space.nb.a aVar) {
        this.b = aVar;
    }

    @Override // com.gamericefishpro.space.nb.a
    public final Object get() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.a;
                if (obj == obj3) {
                    obj = this.b.get();
                    this.a = obj;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
