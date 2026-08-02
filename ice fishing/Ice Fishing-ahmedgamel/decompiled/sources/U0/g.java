package U0;

/* loaded from: classes.dex */
public final class g extends t8.g {
    @Override // t8.g
    public final boolean b(i iVar, d dVar, d dVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f3277u != dVar) {
                    return false;
                }
                iVar.f3277u = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t8.g
    public final boolean c(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f3276n != obj) {
                    return false;
                }
                iVar.f3276n = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t8.g
    public final boolean d(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f3278v != hVar) {
                    return false;
                }
                iVar.f3278v = hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t8.g
    public final void o(h hVar, h hVar2) {
        hVar.f3271b = hVar2;
    }

    @Override // t8.g
    public final void p(h hVar, Thread thread) {
        hVar.f3270a = thread;
    }
}
