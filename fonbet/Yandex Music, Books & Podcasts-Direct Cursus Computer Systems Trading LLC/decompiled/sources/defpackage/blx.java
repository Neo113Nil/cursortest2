package defpackage;

/* loaded from: classes.dex */
public final class blx extends w1g {
    @Override // defpackage.w1g
    public final zkx M(flx flxVar) {
        zkx zkxVar;
        zkx zkxVar2 = zkx.d;
        synchronized (flxVar) {
            try {
                zkxVar = flxVar.b;
                if (zkxVar != zkxVar2) {
                    flxVar.b = zkxVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zkxVar;
    }

    @Override // defpackage.w1g
    public final elx N(flx flxVar) {
        elx elxVar;
        elx elxVar2 = elx.c;
        synchronized (flxVar) {
            try {
                elxVar = flxVar.c;
                if (elxVar != elxVar2) {
                    flxVar.c = elxVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return elxVar;
    }

    @Override // defpackage.w1g
    public final void O(elx elxVar, elx elxVar2) {
        elxVar.b = elxVar2;
    }

    @Override // defpackage.w1g
    public final void P(elx elxVar, Thread thread) {
        elxVar.a = thread;
    }

    @Override // defpackage.w1g
    public final boolean Q(flx flxVar, zkx zkxVar, zkx zkxVar2) {
        synchronized (flxVar) {
            try {
                if (flxVar.b != zkxVar) {
                    return false;
                }
                flxVar.b = zkxVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w1g
    public final boolean R(flx flxVar, Object obj, Object obj2) {
        synchronized (flxVar) {
            try {
                if (flxVar.a != obj) {
                    return false;
                }
                flxVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w1g
    public final boolean S(flx flxVar, elx elxVar, elx elxVar2) {
        synchronized (flxVar) {
            try {
                if (flxVar.c != elxVar) {
                    return false;
                }
                flxVar.c = elxVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
