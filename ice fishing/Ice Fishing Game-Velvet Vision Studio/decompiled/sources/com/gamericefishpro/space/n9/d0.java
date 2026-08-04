package com.gamericefishpro.space.n9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static final Object f = new Object();
    public final String a;
    public final v b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public /* synthetic */ d0(String str, Object obj, v vVar) {
        this.a = str;
        this.c = obj;
        this.b = vVar;
    }

    public final Object a(Object obj) {
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (f2.k == null) {
            return this.c;
        }
        synchronized (f) {
            try {
                if (com.gamericefishpro.space.lb.e.g()) {
                    return this.e == null ? this.c : this.e;
                }
                try {
                    for (d0 d0Var : e0.a) {
                        if (com.gamericefishpro.space.lb.e.g()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objA = null;
                        try {
                            v vVar = d0Var.b;
                            if (vVar != null) {
                                objA = vVar.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f) {
                            d0Var.e = objA;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                v vVar2 = this.b;
                if (vVar2 != null) {
                    try {
                        return vVar2.a();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
