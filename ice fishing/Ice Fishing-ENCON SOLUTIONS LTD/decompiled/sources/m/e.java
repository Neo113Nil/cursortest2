package m;

import u0.AbstractC1050a;

/* loaded from: classes.dex */
public final class e extends AbstractC1050a {
    @Override // u0.AbstractC1050a
    public final boolean c(g gVar, c cVar) {
        c cVar2 = c.f8142b;
        synchronized (gVar) {
            try {
                if (gVar.f8157b != cVar) {
                    return false;
                }
                gVar.f8157b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u0.AbstractC1050a
    public final boolean d(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f8156a != obj) {
                    return false;
                }
                gVar.f8156a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u0.AbstractC1050a
    public final boolean e(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f8158c != fVar) {
                    return false;
                }
                gVar.f8158c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // u0.AbstractC1050a
    public final void v(f fVar, f fVar2) {
        fVar.f8151b = fVar2;
    }

    @Override // u0.AbstractC1050a
    public final void w(f fVar, Thread thread) {
        fVar.f8150a = thread;
    }
}
