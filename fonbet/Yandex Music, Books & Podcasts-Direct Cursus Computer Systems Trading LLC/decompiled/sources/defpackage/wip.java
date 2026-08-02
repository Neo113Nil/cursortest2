package defpackage;

import java.io.InputStream;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class wip implements ujp {
    public final xip a;
    public final uip b;
    public final qe6 c;

    public wip(xip xipVar, uip uipVar, qe6 qe6Var) {
        this.a = xipVar;
        this.b = uipVar;
        this.c = qe6Var;
        qe6Var.a(new knn(6, this));
    }

    public final void a(sgr sgrVar) {
        wgr wgrVar = null;
        try {
            if (sgrVar.g()) {
                this.b.b();
            } else {
                this.a.h = true;
                this.b.a();
                sgr i = sgr.f.i("RPC cancelled");
                q2i q2iVar = dwe.a;
                wgrVar = new wgr(i, false);
            }
            this.c.Q(wgrVar);
        } catch (Throwable th) {
            this.c.Q(null);
            throw th;
        }
    }

    public final void b(uhe uheVar) {
        if (this.a.h) {
            Logger logger = xqd.a;
            while (true) {
                InputStream next = uheVar.next();
                if (next == null) {
                    return;
                } else {
                    xqd.b(next);
                }
            }
        } else {
            while (true) {
                try {
                    InputStream next2 = uheVar.next();
                    if (next2 == null) {
                        return;
                    }
                    try {
                        this.b.d(this.a.b.d.a(next2));
                        next2.close();
                    } catch (Throwable th) {
                        xqd.b(next2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Logger logger2 = xqd.a;
                    while (true) {
                        InputStream next3 = uheVar.next();
                        if (next3 == null) {
                            fgs.a(th2);
                            b6e.q(th2);
                            return;
                        }
                        xqd.b(next3);
                    }
                }
            }
        }
    }

    @Override // defpackage.mjr
    public final void onReady() {
        jkk.c();
        try {
            e3s e3sVar = this.a.c;
            jkk.a();
            if (!this.a.h) {
                this.b.e();
            }
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
            e3s e3sVar = this.a.c;
            jkk.a();
            if (!this.a.h) {
                this.b.c();
            }
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
            e3s e3sVar = this.a.c;
            jkk.a();
            a(sgrVar);
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
            e3s e3sVar = this.a.c;
            jkk.a();
            b((uhe) ljrVar);
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
