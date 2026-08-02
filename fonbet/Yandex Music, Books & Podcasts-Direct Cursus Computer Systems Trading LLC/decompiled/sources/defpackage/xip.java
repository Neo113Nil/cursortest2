package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class xip {
    public static final Logger m = Logger.getLogger(xip.class.getName());
    public final tjp a;
    public final k3i b;
    public final e3s c;
    public final qe6 d;
    public final byte[] e;
    public final ch7 f;
    public final kkp g;
    public volatile boolean h;
    public boolean i;
    public boolean j;
    public e3s k;
    public boolean l;

    public xip(tjp tjpVar, k3i k3iVar, s2i s2iVar, qe6 qe6Var, ch7 ch7Var, kkp kkpVar) {
        this.a = tjpVar;
        this.b = k3iVar;
        this.d = qe6Var;
        this.e = (byte[]) s2iVar.c(xqd.f);
        this.f = ch7Var;
        this.g = kkpVar;
        ((uug) kkpVar.c).i();
        ((hs4) kkpVar.b).x();
        this.c = jee.a;
    }

    public final void a(sgr sgrVar, s2i s2iVar) {
        jkk.c();
        try {
            jkk.a();
            b(sgrVar, s2iVar);
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

    public final void b(sgr sgrVar, s2i s2iVar) {
        kkp kkpVar = this.g;
        o2g.U("call already closed", !this.j);
        try {
            this.j = true;
            if (sgrVar.g() && this.b.a.a() && !this.l) {
                c(sgr.n.i("Completed without a response").b());
            } else {
                this.a.Q(sgrVar, s2iVar);
            }
        } finally {
            kkpVar.D(sgrVar.g());
        }
    }

    public final void c(RuntimeException runtimeException) {
        m.log(Level.WARNING, "Cancelling the stream because of internal error", (Throwable) runtimeException);
        this.a.f(runtimeException instanceof wgr ? ((wgr) runtimeException).a : sgr.n.h(runtimeException).i("Internal error so cancelling stream."));
        this.g.D(false);
    }

    public final void d() {
        jkk.c();
        try {
            jkk.a();
            this.a.a();
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

    public final void e(s2i s2iVar) {
        jkk.c();
        try {
            jkk.a();
            f(s2iVar);
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

    public final void f(s2i s2iVar) {
        e3s e3sVar = e3s.b;
        o2g.U("sendHeaders has already been called", !this.i);
        o2g.U("call is closed", !this.j);
        s2iVar.a(xqd.i);
        s2iVar.a(xqd.e);
        if (this.k == null) {
            this.k = e3sVar;
        } else {
            byte[] bArr = this.e;
            if (bArr != null) {
                rjp rjpVar = xqd.m;
                String str = new String(bArr, xqd.c);
                rjpVar.getClass();
                Iterable p8rVar = new p8r(rjpVar, str);
                this.k.getClass();
                boolean z = false;
                if (p8rVar instanceof Collection) {
                    try {
                        z = ((Collection) p8rVar).contains("identity");
                    } catch (ClassCastException | NullPointerException unused) {
                    }
                } else {
                    Iterator it = p8rVar.iterator();
                    while (true) {
                        o8r o8rVar = (o8r) it;
                        if (!o8rVar.hasNext()) {
                            break;
                        } else if (hdg.S(o8rVar.next(), "identity")) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z) {
                    this.k = e3sVar;
                }
            } else {
                this.k = e3sVar;
            }
        }
        o2i o2iVar = xqd.e;
        this.k.getClass();
        s2iVar.g(o2iVar, "identity");
        e3s e3sVar2 = this.k;
        tjp tjpVar = this.a;
        tjpVar.r(e3sVar2);
        o2i o2iVar2 = xqd.f;
        s2iVar.a(o2iVar2);
        byte[] bArr2 = this.f.b;
        if (bArr2.length != 0) {
            s2iVar.g(o2iVar2, bArr2);
        }
        this.i = true;
        this.b.a.getClass();
        tjpVar.d0(s2iVar);
    }

    public final void g(Object obj) {
        tjp tjpVar = this.a;
        o2g.U("sendHeaders has not been called", this.i);
        o2g.U("call is closed", !this.j);
        k3i k3iVar = this.b;
        j3i j3iVar = k3iVar.a;
        if (j3iVar.a() && this.l) {
            c(sgr.n.i("Too many responses").b());
            return;
        }
        this.l = true;
        try {
            sym symVar = k3iVar.e;
            symVar.getClass();
            tjpVar.E(new rym((vzh) obj, symVar.a));
            if (j3iVar.a()) {
                return;
            }
            tjpVar.flush();
        } catch (Error e) {
            a(sgr.f.i("Server sendMessage() failed with Error"), new s2i());
            throw e;
        } catch (RuntimeException e2) {
            c(e2);
        }
    }
}
