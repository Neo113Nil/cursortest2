package yc;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class h0 extends fd.i {

    /* renamed from: i, reason: collision with root package name */
    public int f8853i;

    public h0(int i10) {
        super(0L, fd.l.f2392g);
        this.f8853i = i10;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract fc.d c();

    public Throwable d(Object obj) {
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null) {
            return pVar.f8889a;
        }
        return null;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            i7.b.k(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        pc.j.b(th);
        a0.m(c().getContext(), new nc.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (yc.b1) r7.v(yc.v.f8910h);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = ac.o.f277a;
        fd.j jVar = this.f2383h;
        try {
            fc.d c3 = c();
            pc.j.c(c3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            dd.h hVar = (dd.h) c3;
            hc.c cVar = hVar.f1856k;
            Object obj2 = hVar.f1858m;
            fc.i context = cVar.getContext();
            Object l10 = dd.a.l(context, obj2);
            z1 z10 = l10 != dd.a.f1844f ? a0.z(cVar, context, l10) : null;
            try {
                fc.i context2 = cVar.getContext();
                Object h10 = h();
                Throwable d10 = d(h10);
                if (d10 == null) {
                    int i10 = this.f8853i;
                    boolean z11 = true;
                    if (i10 != 1 && i10 != 2) {
                        z11 = false;
                    }
                }
                b1 b1Var = null;
                if (b1Var != null && !b1Var.b()) {
                    CancellationException m10 = b1Var.m();
                    b(h10, m10);
                    cVar.resumeWith(v6.a.s(m10));
                } else if (d10 != null) {
                    cVar.resumeWith(v6.a.s(d10));
                } else {
                    cVar.resumeWith(f(h10));
                }
                if (z10 == null || z10.g0()) {
                    dd.a.f(context, l10);
                }
                try {
                    jVar.getClass();
                } catch (Throwable th) {
                    obj = v6.a.s(th);
                }
                g(null, ac.l.a(obj));
            } catch (Throwable th2) {
                if (z10 == null || z10.g0()) {
                    dd.a.f(context, l10);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                jVar.getClass();
            } catch (Throwable th4) {
                obj = v6.a.s(th4);
            }
            g(th3, ac.l.a(obj));
        }
    }

    public Object f(Object obj) {
        return obj;
    }
}
