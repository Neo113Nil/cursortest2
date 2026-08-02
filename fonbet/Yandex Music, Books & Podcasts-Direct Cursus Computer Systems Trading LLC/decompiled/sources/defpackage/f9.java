package defpackage;

/* loaded from: classes5.dex */
public final class f9 extends leu {
    @Override // defpackage.leu
    public final boolean H(j9 j9Var, b9 b9Var, b9 b9Var2) {
        synchronized (j9Var) {
            try {
                if (j9Var.b != b9Var) {
                    return false;
                }
                j9Var.b = b9Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.leu
    public final boolean I(j9 j9Var, Object obj, Object obj2) {
        synchronized (j9Var) {
            try {
                if (j9Var.a != obj) {
                    return false;
                }
                j9Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.leu
    public final boolean J(j9 j9Var, h9 h9Var, h9 h9Var2) {
        synchronized (j9Var) {
            try {
                if (j9Var.c != h9Var) {
                    return false;
                }
                j9Var.c = h9Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.leu
    public final void V(h9 h9Var, h9 h9Var2) {
        h9Var.b = h9Var2;
    }

    @Override // defpackage.leu
    public final void W(h9 h9Var, Thread thread) {
        h9Var.a = thread;
    }
}
