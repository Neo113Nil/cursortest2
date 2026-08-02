package defpackage;

/* loaded from: classes3.dex */
public final class m6 extends qwp {
    @Override // defpackage.qwp
    public final boolean A(v6 v6Var, j6 j6Var, j6 j6Var2) {
        synchronized (v6Var) {
            try {
                if (v6Var.b != j6Var) {
                    return false;
                }
                v6Var.b = j6Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qwp
    public final boolean B(v6 v6Var, Object obj, Object obj2) {
        synchronized (v6Var) {
            try {
                if (v6Var.a != obj) {
                    return false;
                }
                v6Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qwp
    public final boolean C(v6 v6Var, u6 u6Var, u6 u6Var2) {
        synchronized (v6Var) {
            try {
                if (v6Var.c != u6Var) {
                    return false;
                }
                v6Var.c = u6Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qwp
    public final j6 L(v6 v6Var) {
        j6 j6Var;
        j6 j6Var2 = j6.d;
        synchronized (v6Var) {
            try {
                j6Var = v6Var.b;
                if (j6Var != j6Var2) {
                    v6Var.b = j6Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j6Var;
    }

    @Override // defpackage.qwp
    public final u6 M(v6 v6Var) {
        u6 u6Var;
        u6 u6Var2 = u6.c;
        synchronized (v6Var) {
            try {
                u6Var = v6Var.c;
                if (u6Var != u6Var2) {
                    v6Var.c = u6Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u6Var;
    }

    @Override // defpackage.qwp
    public final void k0(u6 u6Var, u6 u6Var2) {
        u6Var.b = u6Var2;
    }

    @Override // defpackage.qwp
    public final void l0(u6 u6Var, Thread thread) {
        u6Var.a = thread;
    }
}
