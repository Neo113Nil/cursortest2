package t;

/* loaded from: classes.dex */
public final class e extends h0.f {
    @Override // h0.f
    public final boolean c(g gVar, c cVar) {
        c cVar2 = c.f4345b;
        synchronized (gVar) {
            try {
                if (gVar.f4357b != cVar) {
                    return false;
                }
                gVar.f4357b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h0.f
    public final boolean d(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f4356a != obj) {
                    return false;
                }
                gVar.f4356a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h0.f
    public final boolean e(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f4358c != fVar) {
                    return false;
                }
                gVar.f4358c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h0.f
    public final void x(f fVar, f fVar2) {
        fVar.f4352b = fVar2;
    }

    @Override // h0.f
    public final void y(f fVar, Thread thread) {
        fVar.f4351a = thread;
    }
}
