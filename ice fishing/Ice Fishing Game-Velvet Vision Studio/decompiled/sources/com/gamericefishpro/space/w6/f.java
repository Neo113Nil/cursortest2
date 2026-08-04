package com.gamericefishpro.space.w6;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.gamericefishpro.space.d9.h {
    @Override // com.gamericefishpro.space.d9.h
    public final void G(g gVar, g gVar2) {
        gVar.b = gVar2;
    }

    @Override // com.gamericefishpro.space.d9.h
    public final void H(g gVar, Thread thread) {
        gVar.a = thread;
    }

    @Override // com.gamericefishpro.space.d9.h
    public final boolean m(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            try {
                if (hVar.e != cVar) {
                    return false;
                }
                hVar.e = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.gamericefishpro.space.d9.h
    public final boolean n(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.d != obj) {
                    return false;
                }
                hVar.d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.gamericefishpro.space.d9.h
    public final boolean o(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.i != gVar) {
                    return false;
                }
                hVar.i = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
