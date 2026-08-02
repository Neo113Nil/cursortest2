package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class fjp implements ujp {
    public final Executor a;
    public final Executor b;
    public final qe6 c;
    public final tjp d;
    public ujp e;

    public fjp(Executor executor, Executor executor2, tjp tjpVar, qe6 qe6Var) {
        this.a = executor;
        this.b = executor2;
        this.d = tjpVar;
        this.c = qe6Var;
    }

    public static void a(fjp fjpVar, Throwable th) {
        fjpVar.d.Q(sgr.g.i("Application error processing RPC").h(th), new s2i());
    }

    public final void b(sgr sgrVar) {
        if (!sgrVar.g()) {
            Throwable th = sgrVar.c;
            boolean z = false;
            if (th == null) {
                sgr i = sgr.f.i("RPC cancelled");
                q2i q2iVar = dwe.a;
                th = new wgr(i, false);
            }
            this.b.execute(new e8h(this.c, th, z, 20));
        }
        jkk.b();
        this.a.execute(new wn4(this, sgrVar));
    }

    public final void c(ujp ujpVar) {
        o2g.O(ujpVar, "listener must not be null");
        o2g.U("Listener already set", this.e == null);
        this.e = ujpVar;
    }

    @Override // defpackage.mjr
    public final void onReady() {
        jkk.c();
        try {
            jkk.a();
            jkk.b();
            this.a.execute(new ejp(this, 1));
            jkk.a.getClass();
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ujp
    public final void q() {
        jkk.c();
        try {
            jkk.a();
            jkk.b();
            this.a.execute(new ejp(this, 0));
            jkk.a.getClass();
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ujp
    public final void s(sgr sgrVar) {
        jkk.c();
        try {
            jkk.a();
            b(sgrVar);
            jkk.a.getClass();
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mjr
    public final void t(ljr ljrVar) {
        jkk.c();
        try {
            jkk.a();
            jkk.b();
            this.a.execute(new wn4(this, (uhe) ljrVar));
            jkk.a.getClass();
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
