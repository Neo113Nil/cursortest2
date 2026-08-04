package com.gamericefishpro.space.w6;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = h.z;
        }
        if (!h.y.n(this, null, obj)) {
            return false;
        }
        h.c(this);
        return true;
    }

    public final boolean j(Throwable th) {
        if (!h.y.n(this, null, new b(th))) {
            return false;
        }
        h.c(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public final boolean k(com.gamericefishpro.space.va.b bVar) {
        b bVar2;
        bVar.getClass();
        Object obj = this.d;
        if (obj != null) {
            if (obj instanceof a) {
                bVar.cancel(((a) obj).a);
            }
        } else if (bVar.isDone()) {
            if (h.y.n(this, null, h.f(bVar))) {
                h.c(this);
                return true;
            }
        } else {
            e eVar = new e(this, bVar);
            if (h.y.n(this, null, eVar)) {
                try {
                    bVar.a(eVar, i.d);
                    return true;
                } catch (Throwable th) {
                    try {
                        bVar2 = new b(th);
                    } catch (Throwable unused) {
                        bVar2 = b.b;
                    }
                    h.y.n(this, eVar, bVar2);
                    return true;
                }
            }
            obj = this.d;
            if (obj instanceof a) {
                bVar.cancel(((a) obj).a);
            }
        }
        return false;
    }
}
