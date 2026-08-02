package defpackage;

/* loaded from: classes.dex */
public final class ahx extends uwf {
    @Override // defpackage.uwf
    public final void O(fix fixVar, fix fixVar2) {
        fixVar.b = fixVar2;
    }

    @Override // defpackage.uwf
    public final void P(fix fixVar, Thread thread) {
        fixVar.a = thread;
    }

    @Override // defpackage.uwf
    public final boolean Q(tjx tjxVar, pex pexVar, pex pexVar2) {
        synchronized (tjxVar) {
            try {
                if (tjxVar.b != pexVar) {
                    return false;
                }
                tjxVar.b = pexVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.uwf
    public final boolean R(tjx tjxVar, Object obj, Object obj2) {
        synchronized (tjxVar) {
            try {
                if (tjxVar.a != obj) {
                    return false;
                }
                tjxVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.uwf
    public final boolean S(tjx tjxVar, fix fixVar, fix fixVar2) {
        synchronized (tjxVar) {
            try {
                if (tjxVar.c != fixVar) {
                    return false;
                }
                tjxVar.c = fixVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
