package U0;

/* loaded from: classes.dex */
public final class g extends t8.g {
    @Override // t8.g
    public final boolean b(i iVar, d dVar, d dVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f3160u != dVar) {
                    return false;
                }
                iVar.f3160u = dVar2;
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
                if (iVar.f3159n != obj) {
                    return false;
                }
                iVar.f3159n = obj2;
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
                if (iVar.f3161v != hVar) {
                    return false;
                }
                iVar.f3161v = hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t8.g
    public final void v(h hVar, h hVar2) {
        hVar.f3154b = hVar2;
    }

    @Override // t8.g
    public final void w(h hVar, Thread thread) {
        hVar.f3153a = thread;
    }
}
