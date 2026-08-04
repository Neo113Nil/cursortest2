package com.gamericefishpro.space.e8;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.nh.a {
    public static final Object i = new Object();
    public volatile b d;
    public volatile Object e;

    public static com.gamericefishpro.space.nh.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.e = i;
        aVar.d = bVar;
        return aVar;
    }

    @Override // com.gamericefishpro.space.nh.a
    public final Object get() {
        Object obj;
        Object obj2 = this.e;
        Object obj3 = i;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.e;
                if (obj == obj3) {
                    obj = this.d.get();
                    Object obj4 = this.e;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.e = obj;
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
