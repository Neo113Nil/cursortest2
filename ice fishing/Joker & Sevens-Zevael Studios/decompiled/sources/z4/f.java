package z4;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends u5.d {
    @Override // u5.d
    public final boolean b(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f9130h != cVar) {
                    return false;
                }
                hVar.f9130h = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u5.d
    public final boolean c(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f9129g != obj) {
                    return false;
                }
                hVar.f9129g = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u5.d
    public final boolean d(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f9131i != gVar) {
                    return false;
                }
                hVar.f9131i = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u5.d
    public final void h(g gVar, g gVar2) {
        gVar.f9124b = gVar2;
    }

    @Override // u5.d
    public final void i(g gVar, Thread thread) {
        gVar.f9123a = thread;
    }
}
