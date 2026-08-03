package v2;

import u.l0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends l0 {
    @Override // u.l0
    public final boolean f(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f7206h != dVar) {
                    return false;
                }
                hVar.f7206h = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u.l0
    public final boolean g(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f7205g != obj) {
                    return false;
                }
                hVar.f7205g = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u.l0
    public final boolean h(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f7207i != gVar) {
                    return false;
                }
                hVar.f7207i = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u.l0
    public final void n(g gVar, g gVar2) {
        gVar.f7200b = gVar2;
    }

    @Override // u.l0
    public final void o(g gVar, Thread thread) {
        gVar.f7199a = thread;
    }
}
