package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class qfw {
    public static final String H = f1d.g("YnisonShared:", "Client");
    public final jyr A;
    public final jyr B;
    public final jyr C;
    public final xdr D;
    public final xdr E;
    public final xdr F;
    public final jyr G;
    public final vlv a;
    public final jyr b;
    public final rjq c;
    public final um6 d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final jyr p;
    public final jyr q;
    public final jyr r;
    public final jyr s;
    public final jyr t;
    public final jyr u;
    public final jyr v;
    public final jyr w;
    public final jyr x;
    public final jyr y;
    public final jyr z;

    public qfw(diw diwVar, vlv vlvVar) {
        this.a = vlvVar;
        this.b = diwVar.b(hag.I(rgw.class), true);
        rjq b = hyf.b();
        this.c = b;
        b().getClass();
        this.d = hld.s(b, (a) few.e.getValue());
        this.e = diwVar.b(hag.I(akw.class), true);
        this.f = diwVar.b(hag.I(amw.class), true);
        this.g = diwVar.b(hag.I(Context.class), true);
        this.h = diwVar.b(hag.I(wfw.class), true);
        this.i = btf.b(new dfw(this, 0));
        this.j = diwVar.b(hag.I(qsw.class), true);
        this.k = diwVar.b(hag.I(qrw.class), true);
        this.l = diwVar.b(hag.I(xfw.class), true);
        this.m = diwVar.b(hag.I(cew.class), true);
        this.n = btf.b(new dfw(this, 4));
        this.o = btf.b(new dfw(this, 5));
        this.p = btf.b(new dfw(this, 6));
        this.q = diwVar.b(hag.I(ndw.class), true);
        this.r = diwVar.b(hag.I(jmw.class), true);
        this.s = diwVar.b(hag.I(jsw.class), true);
        this.t = btf.b(new dfw(this, 7));
        this.u = diwVar.b(hag.I(anw.class), true);
        this.v = diwVar.b(hag.I(hnw.class), true);
        this.w = diwVar.b(hag.I(dgw.class), true);
        this.x = diwVar.b(hag.I(ldw.class), true);
        this.y = diwVar.b(hag.I(hgw.class), true);
        this.z = diwVar.b(hag.I(ysw.class), true);
        this.A = diwVar.b(hag.I(ldw.class), true);
        this.B = diwVar.b(hag.I(ykw.class), true);
        this.C = btf.b(new dfw(this, 8));
        this.D = ydr.a(Boolean.FALSE);
        this.E = ydr.a(null);
        this.F = ydr.a(null);
        this.G = diwVar.b(hag.I(yhw.class), true);
    }

    public static void j(qfw qfwVar, String str, zsw zswVar, int i) {
        how a;
        boolean z = (i & 2) == 0;
        if ((i & 4) != 0) {
            zswVar = null;
        }
        if (qfwVar.c.d.a()) {
            sqw sqwVar = (sqw) qfwVar.F.getValue();
            gow gowVar = (sqwVar == null || (a = sqwVar.a()) == null) ? null : a.c;
            if (str == null) {
                if (Intrinsics.d(gowVar != null ? Boolean.valueOf(gowVar.j) : null, Boolean.TRUE)) {
                    ((xhw) qfwVar.a()).e(null);
                    return;
                } else {
                    if (z) {
                        ((xhw) qfwVar.a()).e(null);
                        return;
                    }
                    return;
                }
            }
            if (zswVar != null) {
                jsw jswVar = (jsw) qfwVar.s.getValue();
                jswVar.getClass();
                ssg.a(2, jsw.f, "transition: begin", null);
                xdr xdrVar = jswVar.e;
                ohw a2 = jswVar.b.a("override", str, zswVar);
                xdrVar.getClass();
                xdrVar.m(null, a2);
            }
            ((xhw) qfwVar.a()).e(str);
        }
    }

    public final dcw a() {
        return (dcw) this.i.getValue();
    }

    public final rgw b() {
        return (rgw) this.b.getValue();
    }

    public final boolean c() {
        return this.c.d.a();
    }

    public final gfw d() {
        return ((ykw) this.B.getValue()).c((sqw) this.F.getValue()).a;
    }

    public final bca e() {
        return new bca(this.F, 18);
    }

    public final void f() {
        rea reaVar = q6k.g;
        if (this.c.d.a()) {
            return;
        }
        this.c.g();
        Continuation continuation = null;
        ssg.a(4, H, "init", null);
        qsw qswVar = (qsw) this.j.getValue();
        if (!qswVar.c.d.a()) {
            qswVar.c.g();
            ox6.B(zsd.d0(qswVar.b.h, 1), qswVar.d, new nqw(1, qswVar));
        }
        ((akw) this.e.getValue()).f.compareAndSet(false, true);
        ldw ldwVar = (ldw) this.A.getValue();
        if (!ldwVar.b.d.a()) {
            ldwVar.b.g();
            ycw ycwVar = new ycw(ldwVar.a.c(), ldwVar, ldwVar, 0);
            san sanVar = san.m;
            ox6.B(new scw(q6k.m(ycwVar, sanVar, reaVar), ldwVar, 0), ldwVar.c, new ddw(ldwVar, 2));
            ox6.B(new scw(q6k.m(new ycw(ldwVar.a.c(), ldwVar, ldwVar, 1), sanVar, reaVar), ldwVar, 1), ldwVar.c, new ddw(ldwVar, 3));
            ox6.B(new scw(q6k.m(new ycw(ldwVar.a.c(), ldwVar, ldwVar, 2), sanVar, reaVar), ldwVar, 2), ldwVar.c, new ddw(ldwVar, 4));
            ox6.B(new scw(q6k.m(new ycw(ldwVar.a.c(), ldwVar, ldwVar, 3), sanVar, reaVar), ldwVar, 3), ldwVar.c, new ddw(ldwVar, 0));
            ox6.B(new scw(q6k.m(new l8v(ldwVar.a.c(), ldwVar, 6), sanVar, reaVar), ldwVar, 4), ldwVar.c, new ddw(ldwVar, 1));
        }
        hgw hgwVar = (hgw) this.y.getValue();
        if (!hgwVar.f.d.a()) {
            hgwVar.f.g();
            ox6.B(new l8v(hgwVar.a.i(qqw.a), hgwVar, 11), hgwVar.g, new lot(25, hgwVar));
        }
        ysw yswVar = (ysw) this.z.getValue();
        if (!yswVar.i.d.a()) {
            yswVar.i.g();
            ox6.B(new bca(((oqw) yswVar.g).c(), 18), yswVar.j, new vsw(yswVar, 1));
            ox6.B(ox6.L(q6k.m(zsd.M0(yswVar.a.e(), new j0v(continuation, yswVar, 11)), new rsw(0), reaVar), 1000L), yswVar.j, new vsw(yswVar, 0));
        }
        etw etwVar = (etw) this.C.getValue();
        if (etwVar != null && !etwVar.d.d.a()) {
            etwVar.d.g();
            ox6.B(etwVar.f, etwVar.e, new nqw(2, etwVar));
        }
        xhw xhwVar = (xhw) a();
        um6 um6Var = xhwVar.n;
        rn5 rn5Var = xhwVar.h;
        if (xhwVar.j.compareAndSet(false, true)) {
            xhwVar.l.g();
            AtomicLong atomicLong = (AtomicLong) xhwVar.e.b;
            long currentTimeMillis = System.currentTimeMillis();
            atomicLong.set(new d7w((int) currentTimeMillis, (int) (currentTimeMillis >> 32)).g());
            long j = atomicLong.get();
            String str = xhw.w;
            ssg.a(4, str, dfi.e(j, "start(sessionId=", ")"), null);
            ReentrantLock reentrantLock = xhwVar.p;
            reentrantLock.lock();
            try {
                hgp hgpVar = xhwVar.b;
                vtm vtmVar = xhwVar.c;
                elw elwVar = xhwVar.d;
                ghw ghwVar = new ghw(hgpVar, vtmVar, elwVar, (anw) rn5Var.f, xhwVar.f, xhwVar.g, (atw) xhwVar.s.getValue(), xhwVar.e, xhwVar.i, new dxv(19, xhwVar));
                xhwVar.o = ghwVar;
                reentrantLock.unlock();
                um6 um6Var2 = ghwVar.j;
                if (ghwVar.k.compareAndSet(false, true)) {
                    ghwVar.i.g();
                    ox6.B(zsd.b0(new e7v(((bew) vtmVar.a).a.c(), 21)), um6Var2, new ahw(ghwVar, 2));
                    ox6.B(zsd.b0(new e7v((vdr) elwVar.a.a.getValue(), 27)), um6Var2, new ahw(ghwVar, 1));
                    ox6.B(zsd.M0(new u21(10, new bca(ghwVar.r, 18), new bca(ghwVar.s, 18), bhw.a), new j0v((Continuation) null, ghwVar, 6)), um6Var2, new ahw(ghwVar, 0));
                }
                ox6.B(new l8v(new bca(ghwVar.q, 18), xhwVar, 15), xhwVar.m, new azu(14, xhwVar, ghwVar, new xqn()));
                anw anwVar = (anw) rn5Var.f;
                Continuation continuation2 = null;
                int i = 2;
                ox6.B(new bca(new l8v(new v81(new ub7(12, zsd.C(zsd.M0(anwVar.k, new xmw(continuation2, anwVar, 0)), 0), new d4t(i, 6, continuation2)), 9), xhwVar, 13), 18), um6Var, new shw(xhwVar, ghwVar, 1));
                hnw hnwVar = (hnw) rn5Var.g;
                Continuation continuation3 = null;
                ox6.B(new v81(new ub7(12, zsd.M0(hnwVar.g, new fnw(continuation3, hnwVar, 0)), new d4t(i, 8, continuation3)), 11), um6Var, new shw(xhwVar, ghwVar, 0));
                ssg.a(4, str, "start volume observer", null);
                ox6.B(new l8v(((cju) xhwVar.t.getValue()).j, xhwVar, 14), um6Var, new shw(xhwVar, ghwVar, 2));
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        Continuation continuation4 = null;
        ox6.B(zsd.b0(zsd.C(zsd.M0(zsd.M0(ox6.L(zsd.M0(zsd.M0(this.E, new jfw(0, this, continuation4)), new jfw(1, this, continuation4)), 1000L), new gv6(continuation4, (jsw) this.s.getValue(), 16)), new gv6(continuation4, this, 17)), 0)), this.d, new kfw(this, 0));
        Continuation continuation5 = null;
        ox6.B(zsd.M0(this.F, new j0v(continuation5, new bca(zsd.d0(zsd.b0(((amw) this.f.getValue()).a.b.c), 1), 18), 5)), this.d, new kfw(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(cg6 cg6Var) {
        mfw mfwVar;
        int i;
        if (cg6Var instanceof mfw) {
            mfwVar = (mfw) cg6Var;
            int i2 = mfwVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mfwVar.l = i2 - Integer.MIN_VALUE;
                Object obj = mfwVar.j;
                nm6 nm6Var = nm6.a;
                i = mfwVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    lf2 lf2Var = new lf2(2, 17, continuation);
                    mfwVar.l = 1;
                    if (zsd.h0(this.D, lf2Var, mfwVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                j(this, null, null, 6);
                return Unit.a;
            }
        }
        mfwVar = new mfw(this, cg6Var);
        Object obj2 = mfwVar.j;
        nm6 nm6Var2 = nm6.a;
        i = mfwVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        j(this, null, null, 6);
        return Unit.a;
    }

    public final void h(boolean z) {
        if (this.c.d.a()) {
            this.c.V();
            ssg.a(4, H, vz1.q("release(transition=", ")", z), null);
            xhw xhwVar = (xhw) a();
            uiq uiqVar = xhwVar.e;
            if (xhwVar.j.compareAndSet(true, false)) {
                ssg.a(4, xhw.w, "stop(sessionId=" + uiqVar.C() + ")", null);
                xhwVar.l.V();
                ((AtomicLong) uiqVar.b).set(-1L);
                ReentrantLock reentrantLock = xhwVar.p;
                reentrantLock.lock();
                try {
                    ghw ghwVar = xhwVar.o;
                    if (ghwVar != null) {
                        ghwVar.g();
                    }
                    xhwVar.o = null;
                    xhwVar.v = null;
                    reentrantLock.unlock();
                    xhwVar.u.set(null);
                    uiw uiwVar = xhwVar.q;
                    ReentrantLock reentrantLock2 = uiwVar.a;
                    reentrantLock2.lock();
                    try {
                        uiwVar.d = null;
                        uiwVar.e = 0L;
                        uiwVar.c = null;
                        uiwVar.f = null;
                        uiwVar.g = 0L;
                        uiwVar.b.clear();
                        reentrantLock2.unlock();
                        xhwVar.k.set(false);
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            sqw sqwVar = (sqw) this.F.getValue();
            xdr xdrVar = this.D;
            Boolean bool = Boolean.FALSE;
            xdrVar.getClass();
            xdrVar.m(null, bool);
            this.E.l(null);
            this.F.l(null);
            etw etwVar = (etw) this.C.getValue();
            if (etwVar != null && etwVar.d.d.a()) {
                etwVar.d.V();
                etwVar.f.l(null);
                rvh rvhVar = etwVar.b.a;
                rvhVar.c = null;
                rvhVar.a();
            }
            ysw yswVar = (ysw) this.z.getValue();
            if (!z) {
                sqwVar = null;
            }
            yswVar.d(sqwVar);
            ysw yswVar2 = (ysw) this.z.getValue();
            if (yswVar2.i.d.a()) {
                yswVar2.i.V();
            }
            hgw hgwVar = (hgw) this.y.getValue();
            if (hgwVar.f.d.a()) {
                hgwVar.f.V();
            }
            ldw ldwVar = (ldw) this.A.getValue();
            if (ldwVar.b.d.a()) {
                ldwVar.b.V();
                ldwVar.e.l(null);
                ldwVar.g.l(null);
                ldwVar.i.l(null);
                ldwVar.j.l(null);
                ldwVar.h.l(null);
            }
            qsw qswVar = (qsw) this.j.getValue();
            if (qswVar.c.d.a()) {
                qswVar.c.V();
            }
            akw akwVar = (akw) this.e.getValue();
            if (akwVar.f.compareAndSet(true, false)) {
                akwVar.i = null;
                qkw qkwVar = akwVar.h;
                qkwVar.getClass();
                ssg.a(2, qkw.d, "clear", null);
                ReentrantLock reentrantLock3 = qkwVar.a;
                reentrantLock3.lock();
                try {
                    nur nurVar = qkwVar.b;
                    nurVar.b = null;
                    ((HashMap) nurVar.c).clear();
                    bjt bjtVar = qkwVar.c;
                    ((HashMap) bjtVar.b).clear();
                    ((HashMap) bjtVar.c).clear();
                    ((HashMap) bjtVar.d).clear();
                } finally {
                    reentrantLock3.unlock();
                }
            }
        }
    }

    public final l8v i(qqw qqwVar) {
        return new l8v(new z78(e(), 9), qqwVar, 10);
    }

    public final Object k(String str, Continuation continuation) {
        Object a;
        jmw jmwVar = (jmw) this.r.getValue();
        jmg jmgVar = jmwVar.c;
        jmwVar.b.a().getClass();
        e6l e6lVar = (e6l) jmwVar.d.c.getValue();
        e6lVar.getClass();
        if (Intrinsics.d(e6lVar, b6l.a)) {
            qmg qmgVar = (qmg) jmgVar;
            qmgVar.h(img.IO, new IOException("Ynison not connected ".concat(str)).getMessage());
            qmgVar.k = str;
            a = jmwVar.a.a(continuation);
            if (a != nm6.a) {
                a = Unit.a;
            }
        } else {
            a = Unit.a;
        }
        return a == nm6.a ? a : Unit.a;
    }
}
