package U0;

/* loaded from: classes.dex */
public final class g extends com.bumptech.glide.e {
    @Override // com.bumptech.glide.e
    public final boolean b(i iVar, d dVar, d dVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f3238u != dVar) {
                    return false;
                }
                iVar.f3238u = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.e
    public final boolean d(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f3237n != obj) {
                    return false;
                }
                iVar.f3237n = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.e
    public final boolean f(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f3239v != hVar) {
                    return false;
                }
                iVar.f3239v = hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.e
    public final void x(h hVar, h hVar2) {
        hVar.f3232b = hVar2;
    }

    @Override // com.bumptech.glide.e
    public final void z(h hVar, Thread thread) {
        hVar.f3231a = thread;
    }
}
