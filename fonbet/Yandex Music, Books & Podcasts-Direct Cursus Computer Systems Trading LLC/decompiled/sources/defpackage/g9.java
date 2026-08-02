package defpackage;

/* loaded from: classes.dex */
public final class g9 extends i4w {
    @Override // defpackage.i4w
    public final void P(i9 i9Var, i9 i9Var2) {
        i9Var.b = i9Var2;
    }

    @Override // defpackage.i4w
    public final void Q(i9 i9Var, Thread thread) {
        i9Var.a = thread;
    }

    @Override // defpackage.i4w
    public final boolean t(k9 k9Var, c9 c9Var, c9 c9Var2) {
        synchronized (k9Var) {
            try {
                if (k9Var.b != c9Var) {
                    return false;
                }
                k9Var.b = c9Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.i4w
    public final boolean u(k9 k9Var, Object obj, Object obj2) {
        synchronized (k9Var) {
            try {
                if (k9Var.a != obj) {
                    return false;
                }
                k9Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.i4w
    public final boolean v(k9 k9Var, i9 i9Var, i9 i9Var2) {
        synchronized (k9Var) {
            try {
                if (k9Var.c != i9Var) {
                    return false;
                }
                k9Var.c = i9Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
