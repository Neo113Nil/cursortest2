package defpackage;

/* loaded from: classes11.dex */
public final class q7 extends qha1 {
    @Override // defpackage.qha1
    public final boolean b(x7 x7Var, o7 o7Var, o7 o7Var2) {
        synchronized (x7Var) {
            try {
                if (x7Var.b != o7Var) {
                    return false;
                }
                x7Var.b = o7Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qha1
    public final boolean c(w4r0 w4r0Var, Object obj, Object obj2) {
        synchronized (w4r0Var) {
            try {
                if (w4r0Var.a != obj) {
                    return false;
                }
                w4r0Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qha1
    public final boolean d(x7 x7Var, w7 w7Var, w7 w7Var2) {
        synchronized (x7Var) {
            try {
                if (x7Var.c != w7Var) {
                    return false;
                }
                x7Var.c = w7Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qha1
    public final o7 e(w4r0 w4r0Var) {
        o7 o7Var;
        o7 o7Var2 = o7.d;
        synchronized (w4r0Var) {
            try {
                o7Var = w4r0Var.b;
                if (o7Var != o7Var2) {
                    w4r0Var.b = o7Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o7Var;
    }

    @Override // defpackage.qha1
    public final w7 f(w4r0 w4r0Var) {
        w7 w7Var;
        w7 w7Var2 = w7.c;
        synchronized (w4r0Var) {
            try {
                w7Var = w4r0Var.c;
                if (w7Var != w7Var2) {
                    w4r0Var.c = w7Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return w7Var;
    }

    @Override // defpackage.qha1
    public final void i(w7 w7Var, w7 w7Var2) {
        w7Var.b = w7Var2;
    }

    @Override // defpackage.qha1
    public final void j(w7 w7Var, Thread thread) {
        w7Var.a = thread;
    }
}
