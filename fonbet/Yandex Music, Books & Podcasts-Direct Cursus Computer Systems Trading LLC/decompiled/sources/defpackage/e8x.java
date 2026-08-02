package defpackage;

/* loaded from: classes.dex */
public final class e8x extends rvf {
    @Override // defpackage.rvf
    public final b8x S(j8x j8xVar) {
        b8x b8xVar;
        b8x b8xVar2 = b8x.d;
        synchronized (j8xVar) {
            try {
                b8xVar = j8xVar.b;
                if (b8xVar != b8xVar2) {
                    j8xVar.b = b8xVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b8xVar;
    }

    @Override // defpackage.rvf
    public final i8x T(j8x j8xVar) {
        i8x i8xVar;
        i8x i8xVar2 = i8x.c;
        synchronized (j8xVar) {
            try {
                i8xVar = j8xVar.c;
                if (i8xVar != i8xVar2) {
                    j8xVar.c = i8xVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i8xVar;
    }

    @Override // defpackage.rvf
    public final void U(i8x i8xVar, i8x i8xVar2) {
        i8xVar.b = i8xVar2;
    }

    @Override // defpackage.rvf
    public final void V(i8x i8xVar, Thread thread) {
        i8xVar.a = thread;
    }

    @Override // defpackage.rvf
    public final boolean W(j8x j8xVar, b8x b8xVar, b8x b8xVar2) {
        synchronized (j8xVar) {
            try {
                if (j8xVar.b != b8xVar) {
                    return false;
                }
                j8xVar.b = b8xVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rvf
    public final boolean X(j8x j8xVar, Object obj, Object obj2) {
        synchronized (j8xVar) {
            try {
                if (j8xVar.a != obj) {
                    return false;
                }
                j8xVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rvf
    public final boolean Y(j8x j8xVar, i8x i8xVar, i8x i8xVar2) {
        synchronized (j8xVar) {
            try {
                if (j8xVar.c != i8xVar) {
                    return false;
                }
                j8xVar.c = i8xVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
