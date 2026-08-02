package defpackage;

import android.os.SystemClock;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.e0;
import com.yandex.media.ynison.service.f;
import com.yandex.media.ynison.service.x;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ghw {
    public static final String w;
    public final hgp a;
    public final anw b;
    public final kqn c;
    public final u13 d;
    public final atw e;
    public final uiq f;
    public final jyr g;
    public final dxv h;
    public final rjq i;
    public final um6 j;
    public final AtomicBoolean k;
    public final AtomicBoolean l;
    public final xdr m;
    public final ReentrantLock n;
    public final ogw o;
    public final mnw p;
    public final xdr q;
    public final xdr r;
    public final xdr s;
    public final AtomicReference t;
    public final x0q u;
    public final xdr v;

    static {
        String str = xhw.w;
        w = "YnisonCore:".concat("YnisonFacade");
    }

    public ghw(hgp hgpVar, vtm vtmVar, elw elwVar, anw anwVar, kqn kqnVar, u13 u13Var, atw atwVar, uiq uiqVar, jyr jyrVar, dxv dxvVar) {
        vtmVar.getClass();
        atwVar.getClass();
        this.a = hgpVar;
        this.b = anwVar;
        this.c = kqnVar;
        this.d = u13Var;
        this.e = atwVar;
        this.f = uiqVar;
        this.g = jyrVar;
        this.h = dxvVar;
        rjq rjqVar = new rjq(false);
        this.i = rjqVar;
        um6 s = hld.s(rjqVar, dm6.b.I0(1));
        this.j = s;
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.m = ydr.a(null);
        this.n = new ReentrantLock();
        this.o = new ogw(hgpVar);
        this.p = new mnw(w, s, new sgw(this, 0));
        this.q = ydr.a(null);
        this.r = ydr.a(null);
        this.s = ydr.a(null);
        this.t = new AtomicReference(null);
        this.u = y0q.b(0, 1, null, 5);
        this.v = ydr.a(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ghw ghwVar, Throwable th, ccw ccwVar, cg6 cg6Var) {
        ehw ehwVar;
        int i;
        e0 e0Var;
        a0 n;
        xdr xdrVar = ghwVar.q;
        if (cg6Var instanceof ehw) {
            ehwVar = (ehw) cg6Var;
            int i2 = ehwVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ehwVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ehwVar.j;
                nm6 nm6Var = nm6.a;
                i = ehwVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    AtomicReference atomicReference = ghwVar.t;
                    orw orwVar = (orw) xdrVar.getValue();
                    atomicReference.set((orwVar == null || (e0Var = orwVar.a) == null || (n = e0Var.n()) == null) ? null : n.j());
                    xdrVar.l(null);
                    xdr xdrVar2 = ghwVar.v;
                    Boolean bool = Boolean.FALSE;
                    xdrVar2.getClass();
                    xdrVar2.m(null, bool);
                    ccwVar.f();
                    ghwVar.j();
                    mnw mnwVar = ghwVar.p;
                    o5g b = ghwVar.o.b(th);
                    sgw sgwVar = new sgw(ghwVar, 1);
                    ehwVar.l = 1;
                    if (mnwVar.a(b, sgwVar, ehwVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (!ghwVar.l.get()) {
                    ghwVar.i();
                }
                return Unit.a;
            }
        }
        ehwVar = new ehw(ghwVar, cg6Var);
        Object obj2 = ehwVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ehwVar.l;
        if (i != 0) {
        }
        if (!ghwVar.l.get()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(3:(2:3|(8:5|6|(1:(1:(2:10|11)(2:13|14))(3:15|16|17))(5:61|62|63|64|65)|18|19|20|21|(9:23|24|25|26|27|28|29|30|(1:32)(1:33))(2:47|(2:49|50)(2:51|52))))|21|(0)(0))|74|6|(0)(0)|18|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0108, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0109, code lost:
    
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0075, code lost:
    
        if (r15 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f A[Catch: all -> 0x0108, TRY_LEAVE, TryCatch #3 {all -> 0x0108, blocks: (B:20:0x0079, B:23:0x007f, B:26:0x00be, B:29:0x00ca), top: B:19:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c A[Catch: all -> 0x011a, TryCatch #5 {all -> 0x011a, blocks: (B:45:0x0116, B:46:0x0119, B:47:0x011c, B:49:0x0121, B:51:0x013c, B:52:0x0141, B:25:0x0088), top: B:21:0x007d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v15, types: [hgp] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(ghw ghwVar, cg6 cg6Var) {
        fhw fhwVar;
        int i;
        Long C;
        ghw ghwVar2;
        Throwable th;
        ?? r7;
        Long l;
        ghw ghwVar3;
        gqn gqnVar;
        try {
            if (cg6Var instanceof fhw) {
                fhwVar = (fhw) cg6Var;
                int i2 = fhwVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fhwVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = fhwVar.k;
                    nm6 nm6Var = nm6.a;
                    i = fhwVar.m;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        C = ghwVar.f.C();
                        mdw e = ghwVar.e();
                        e.getClass();
                        e.i = SystemClock.elapsedRealtime();
                        e.e(new nsw("YNISON_START", e.b(C)));
                        try {
                            kqn kqnVar = ghwVar.c;
                            fhwVar.j = C;
                            fhwVar.m = 1;
                            try {
                                r7 = 16;
                                r7 = 16;
                                obj = x97.V(dm6.b, new s1n(kqnVar, continuation, (int) r7), fhwVar);
                            } catch (Throwable th2) {
                                ghwVar2 = ghwVar;
                                th = th2;
                                mdw e2 = ghwVar2.e();
                                e2.getClass();
                                f9h f9hVar = new f9h();
                                f9hVar.putAll(e2.b(C));
                                f9hVar.putAll(mdw.a(th));
                                f9hVar.put("destination", "hub");
                                e2.e(new nsw("YNISON_CONNECTING_ERROR", f9hVar.b()));
                                throw th;
                            }
                        } catch (Throwable th3) {
                            ghwVar2 = ghwVar;
                            th = th3;
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                qgg.h0(obj);
                                return obj;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        C = fhwVar.j;
                        try {
                            qgg.h0(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            ghwVar2 = ghwVar;
                            mdw e22 = ghwVar2.e();
                            e22.getClass();
                            f9h f9hVar2 = new f9h();
                            f9hVar2.putAll(e22.b(C));
                            f9hVar2.putAll(mdw.a(th));
                            f9hVar2.put("destination", "hub");
                            e22.e(new nsw("YNISON_CONNECTING_ERROR", f9hVar2.b()));
                            throw th;
                        }
                    }
                    l = C;
                    gqnVar = (gqn) obj;
                    if (gqnVar instanceof fqn) {
                        if (!(gqnVar instanceof eqn)) {
                            throw new x7j();
                        }
                        eqn eqnVar = (eqn) gqnVar;
                        ghwVar.e().d(l, eqnVar.s());
                        return new tgw(eqnVar.s(), eqnVar.getMessage());
                    }
                    xpn xpnVar = ((fqn) gqnVar).a;
                    ReentrantLock reentrantLock = ghwVar.n;
                    reentrantLock.lock();
                    try {
                        ghwVar.h();
                        u13 u13Var = ghwVar.d;
                        cr crVar = (cr) u13Var.b;
                        rn5 rn5Var = (rn5) u13Var.c;
                        jyr jyrVar = (jyr) u13Var.d;
                        dd4 dd4Var = (dd4) ((jyr) crVar.i).getValue();
                        dgw dgwVar = (dgw) crVar.g;
                        r7 = (hgp) crVar.c;
                        ccw ccwVar = new ccw(r7, new z6u(6, xpnVar, dd4Var, dgwVar), rn5Var, jyrVar);
                        xdr xdrVar = ghwVar.m;
                        xdrVar.getClass();
                        xdrVar.m(null, ccwVar);
                        reentrantLock.unlock();
                        atw atwVar = ghwVar.e;
                        try {
                            atwVar.e.set(true);
                            atwVar.f = null;
                            ghwVar.e().c(l);
                            xdr a = ydr.a(null);
                            ox6.B(new clc((pjc) ccwVar.k.getValue(), new i04(ghwVar, l, a, ccwVar, (Continuation) null)), ghwVar.j, new azu(13, a, ghwVar));
                            bca bcaVar = new bca(a, 18);
                            fhwVar.j = null;
                            fhwVar.m = 2;
                            Object g0 = zsd.g0(bcaVar, fhwVar);
                            return g0 == nm6Var ? nm6Var : g0;
                        } catch (Throwable th5) {
                            ghwVar3 = ghwVar;
                            th = th5;
                            C = l;
                            ghwVar2 = ghwVar3;
                            mdw e222 = ghwVar2.e();
                            e222.getClass();
                            f9h f9hVar22 = new f9h();
                            f9hVar22.putAll(e222.b(C));
                            f9hVar22.putAll(mdw.a(th));
                            f9hVar22.put("destination", "hub");
                            e222.e(new nsw("YNISON_CONNECTING_ERROR", f9hVar22.b()));
                            throw th;
                        }
                    } catch (Throwable th6) {
                        reentrantLock.unlock();
                        throw th6;
                    }
                }
            }
            if (gqnVar instanceof fqn) {
            }
        } catch (Throwable th7) {
            th = th7;
            ghw ghwVar4 = r7;
            th = th;
            ghwVar3 = ghwVar4;
            C = l;
            ghwVar2 = ghwVar3;
            mdw e2222 = ghwVar2.e();
            e2222.getClass();
            f9h f9hVar222 = new f9h();
            f9hVar222.putAll(e2222.b(C));
            f9hVar222.putAll(mdw.a(th));
            f9hVar222.put("destination", "hub");
            e2222.e(new nsw("YNISON_CONNECTING_ERROR", f9hVar222.b()));
            throw th;
        }
        fhwVar = new fhw(ghwVar, cg6Var);
        Object obj2 = fhwVar.k;
        nm6 nm6Var2 = nm6.a;
        i = fhwVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        l = C;
        gqnVar = (gqn) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [q5b] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashSet] */
    public static Pair d(x xVar) {
        Object obj;
        String u = xVar.u();
        List A = xVar.A();
        if (A != null) {
            obj = new HashSet();
            Iterator it = A.iterator();
            while (it.hasNext()) {
                obj.add(((f) it.next()).u());
            }
        } else {
            obj = q5b.a;
        }
        return new Pair(u, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0104, code lost:
    
        if (f(r2) == r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0119, code lost:
    
        if (r4.invoke(r5, r2) == r3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Function2 function2, Continuation continuation) {
        xgw xgwVar;
        Object obj;
        int i;
        long elapsedRealtime;
        String str2;
        Function2 function22;
        Object L;
        long j;
        ccw ccwVar;
        if (continuation instanceof xgw) {
            xgwVar = (xgw) continuation;
            int i2 = xgwVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xgwVar.p = i2 - Integer.MIN_VALUE;
                Object obj2 = xgwVar.n;
                obj = nm6.a;
                i = xgwVar.p;
                int i3 = 1;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    ygw ygwVar = new ygw(this, continuation2, 0);
                    xgwVar.j = str;
                    xgwVar.k = function2;
                    xgwVar.l = elapsedRealtime;
                    xgwVar.p = 1;
                    if (tyf.L(5000L, ygwVar, xgwVar) != obj) {
                        str2 = str;
                        function22 = function2;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        if (i == 4) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = xgwVar.m;
                    elapsedRealtime = xgwVar.l;
                    function22 = xgwVar.k;
                    str2 = xgwVar.j;
                    qgg.h0(obj2);
                    L = obj2;
                    ccwVar = (ccw) L;
                    if (ccwVar != null) {
                        ssg.a(6, w, "event lost, cause ynison not available", null);
                        mdw e = e();
                        e.getClass();
                        str2.getClass();
                        f9h f9hVar = new f9h();
                        f9hVar.putAll(e.b(null));
                        f9hVar.putAll(tah.b(new Pair("type", str2)));
                        e.e(new nsw("YNISON_EVENT_LOST", f9hVar.b()));
                        pgw pgwVar = pgw.YNISON_MESSAGE_LOST;
                        String str3 = ogw.b;
                        e5b e5bVar = e5b.a;
                        e5bVar.getClass();
                        this.o.c(pgwVar, e5bVar);
                        xgwVar.j = null;
                        xgwVar.k = null;
                        xgwVar.l = elapsedRealtime;
                        xgwVar.m = j;
                        xgwVar.p = 3;
                    } else {
                        xgwVar.j = null;
                        xgwVar.k = null;
                        xgwVar.l = elapsedRealtime;
                        xgwVar.m = j;
                        xgwVar.p = 4;
                    }
                    return obj;
                }
                elapsedRealtime = xgwVar.l;
                function22 = xgwVar.k;
                str2 = xgwVar.j;
                qgg.h0(obj2);
                long elapsedRealtime2 = ScreenMirroringConfig.Test.pcVideoUdpPort - (SystemClock.elapsedRealtime() - elapsedRealtime);
                long j2 = elapsedRealtime2 >= 1000 ? 1000L : elapsedRealtime2;
                ygw ygwVar2 = new ygw(this, continuation2, i3);
                xgwVar.j = str2;
                xgwVar.k = function22;
                xgwVar.l = elapsedRealtime;
                xgwVar.m = elapsedRealtime2;
                xgwVar.p = 2;
                L = tyf.L(j2, ygwVar2, xgwVar);
                if (L != obj) {
                    j = elapsedRealtime2;
                    ccwVar = (ccw) L;
                    if (ccwVar != null) {
                    }
                }
                return obj;
            }
        }
        xgwVar = new xgw(this, continuation);
        Object obj22 = xgwVar.n;
        obj = nm6.a;
        i = xgwVar.p;
        int i32 = 1;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        long elapsedRealtime22 = ScreenMirroringConfig.Test.pcVideoUdpPort - (SystemClock.elapsedRealtime() - elapsedRealtime);
        if (elapsedRealtime22 >= 1000) {
        }
        ygw ygwVar22 = new ygw(this, continuation22, i32);
        xgwVar.j = str2;
        xgwVar.k = function22;
        xgwVar.l = elapsedRealtime;
        xgwVar.m = elapsedRealtime22;
        xgwVar.p = 2;
        L = tyf.L(j2, ygwVar22, xgwVar);
        if (L != obj) {
        }
        return obj;
    }

    public final mdw e() {
        return (mdw) this.g.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var) {
        dhw dhwVar;
        int i;
        x j;
        x xVar;
        if (cg6Var instanceof dhw) {
            dhwVar = (dhw) cg6Var;
            int i2 = dhwVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dhwVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dhwVar.j;
                nm6 nm6Var = nm6.a;
                i = dhwVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    dhwVar.l = 1;
                    obj = this.b.b.a(dhwVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                j = ((a0) obj).j();
                xVar = (x) this.t.getAndSet(j);
                if (!Intrinsics.d(xVar == null ? d(xVar) : null, j != null ? d(j) : null)) {
                    this.u.a(Unit.a);
                }
                return Unit.a;
            }
        }
        dhwVar = new dhw(this, cg6Var);
        Object obj2 = dhwVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dhwVar.l;
        if (i != 0) {
        }
        j = ((a0) obj2).j();
        xVar = (x) this.t.getAndSet(j);
        if (!Intrinsics.d(xVar == null ? d(xVar) : null, j != null ? d(j) : null)) {
        }
        return Unit.a;
    }

    public final void g() {
        if (this.k.compareAndSet(true, false)) {
            this.i.V();
            j();
            this.t.set(null);
            this.q.l(null);
            Boolean bool = Boolean.FALSE;
            xdr xdrVar = this.v;
            xdrVar.getClass();
            xdrVar.m(null, bool);
            this.r.l(null);
            this.s.l(null);
            h();
        }
    }

    public final void h() {
        xdr xdrVar = this.m;
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            ccw ccwVar = (ccw) xdrVar.getValue();
            if (ccwVar == null) {
                return;
            }
            ccwVar.f();
            xdrVar.l(null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void i() {
        j();
        rs rsVar = new rs(this, null, 11);
        List list = mnw.i;
        law lawVar = new law(12);
        mnw mnwVar = this.p;
        mnwVar.getClass();
        ReentrantLock reentrantLock = mnwVar.d;
        reentrantLock.lock();
        try {
            rar rarVar = mnwVar.e;
            if (rarVar != null) {
                rarVar.g(null);
            }
            mnwVar.e = x97.y(mnwVar.b, null, null, new knw(mnwVar, rsVar, lawVar, null), 3);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void j() {
        if (this.l.compareAndSet(true, false)) {
            ssg.a(4, w, "stop", null);
            mnw mnwVar = this.p;
            ReentrantLock reentrantLock = mnwVar.d;
            reentrantLock.lock();
            try {
                rar rarVar = mnwVar.e;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                reentrantLock.unlock();
                h();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}
