package defpackage;

import io.grpc.okhttp.a;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class u5 implements mo4, bjr {
    public static final Logger g = Logger.getLogger(u5.class.getName());
    public final xiu a;
    public final tvc b;
    public final boolean c;
    public final boolean d;
    public s2i e;
    public volatile boolean f;

    public u5(mvn mvnVar, qgr qgrVar, xiu xiuVar, s2i s2iVar, ks3 ks3Var, boolean z) {
        o2g.O(s2iVar, "headers");
        o2g.O(xiuVar, "transportTracer");
        this.a = xiuVar;
        this.c = !Boolean.TRUE.equals(ks3Var.a(xqd.p));
        this.d = z;
        if (!z) {
            this.b = new pzh(this, mvnVar, qgrVar);
            this.e = s2iVar;
            return;
        }
        yk3 yk3Var = new yk3();
        yk3Var.e = this;
        o2g.O(s2iVar, "headers");
        yk3Var.b = s2iVar;
        yk3Var.c = qgrVar;
        this.b = yk3Var;
    }

    @Override // defpackage.bjr
    public final void E(rym rymVar) {
        tvc tvcVar = this.b;
        try {
            if (!tvcVar.isClosed()) {
                tvcVar.s(rymVar);
            }
        } finally {
            xqd.b(rymVar);
        }
    }

    @Override // defpackage.mo4
    public final void M(int i) {
        ((a) this).l.a.b = i;
    }

    @Override // defpackage.bjr
    public final void X() {
        koj kojVar = ((a) this).l;
        jzh jzhVar = kojVar.d;
        jzhVar.a = kojVar;
        kojVar.a = jzhVar;
    }

    @Override // defpackage.bjr
    public final void a() {
        koj kojVar = ((a) this).l;
        kojVar.getClass();
        jkk.b();
        q9 q9Var = new q9(0, kojVar);
        synchronized (kojVar.v) {
            q9Var.run();
        }
    }

    @Override // defpackage.mo4
    public final void a0(ch7 ch7Var) {
        koj kojVar = ((a) this).l;
        o2g.U("Already called start", kojVar.j == null);
        o2g.O(ch7Var, "decompressorRegistry");
        kojVar.k = ch7Var;
    }

    public final void b(dpj dpjVar, boolean z, boolean z2, int i) {
        hi3 hi3Var;
        o2g.J("null frame before EOS", dpjVar != null || z);
        qec qecVar = ((a) this).m;
        qecVar.getClass();
        jkk.c();
        try {
            if (dpjVar == null) {
                hi3Var = a.p;
            } else {
                hi3Var = dpjVar.a;
                int i2 = (int) hi3Var.b;
                if (i2 > 0) {
                    koj kojVar = ((a) qecVar.b).l;
                    synchronized (kojVar.b) {
                        kojVar.e += i2;
                    }
                }
            }
            synchronized (((a) qecVar.b).l.v) {
                koj.b(((a) qecVar.b).l, hi3Var, z, z2);
                xiu xiuVar = ((a) qecVar.b).a;
                if (i == 0) {
                    xiuVar.getClass();
                } else {
                    xiuVar.getClass();
                    ((hs4) xiuVar.b).x();
                }
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

    @Override // defpackage.mo4
    public final void f(sgr sgrVar) {
        o2g.J("Should not cancel with OK status", !sgrVar.g());
        this.f = true;
        qec qecVar = ((a) this).m;
        qecVar.getClass();
        jkk.c();
        try {
            synchronized (((a) qecVar.b).l.v) {
                ((a) qecVar.b).l.d(sgrVar, true, null);
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

    @Override // defpackage.bjr
    public final void flush() {
        tvc tvcVar = this.b;
        if (tvcVar.isClosed()) {
            return;
        }
        tvcVar.flush();
    }

    @Override // defpackage.mo4
    public final void h0(ce7 ce7Var) {
        s2i s2iVar = this.e;
        l2i l2iVar = xqd.d;
        s2iVar.a(l2iVar);
        this.e.g(l2iVar, Long.valueOf(Math.max(0L, ce7Var.e())));
    }

    @Override // defpackage.mo4
    public final void l(int i) {
        this.b.l(i);
    }

    @Override // defpackage.mo4
    public final void l0() {
        a aVar = (a) this;
        if (aVar.l.n) {
            return;
        }
        aVar.l.n = true;
        this.b.close();
    }

    @Override // defpackage.bjr
    public final boolean p() {
        return ((a) this).l.i() && !this.f;
    }

    @Override // defpackage.bjr
    public final void r(nq4 nq4Var) {
        this.b.r(nq4Var);
    }

    @Override // defpackage.mo4
    public final void v0(oo4 oo4Var) {
        a aVar = (a) this;
        koj kojVar = aVar.l;
        o2g.U("Already called setListener", kojVar.j == null);
        o2g.O(oo4Var, "listener");
        kojVar.j = oo4Var;
        if (this.d) {
            return;
        }
        aVar.m.b0(this.e, null);
        this.e = null;
    }

    @Override // defpackage.mo4
    public final void y0(joe joeVar) {
        joeVar.f(((a) this).n.a.get(wdp.f), "remote_addr");
    }
}
