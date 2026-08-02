package defpackage;

/* loaded from: classes.dex */
public final class i8s {
    public final onx a = new onx();

    public i8s(sml smlVar) {
        k4x k4xVar = new k4x(this);
        smlVar.getClass();
        ((onx) smlVar.a).d(j8s.a, new f4m(28, k4xVar));
    }

    public final void a(Exception exc) {
        this.a.p(exc);
    }

    public final void b(Object obj) {
        this.a.q(obj);
    }

    public final boolean c(Exception exc) {
        onx onxVar = this.a;
        onxVar.getClass();
        y1g.H(exc, "Exception must not be null");
        synchronized (onxVar.a) {
            try {
                if (onxVar.c) {
                    return false;
                }
                onxVar.c = true;
                onxVar.f = exc;
                onxVar.b.D(onxVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        this.a.s(obj);
    }

    public i8s() {
    }
}
