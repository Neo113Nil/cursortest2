package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;

/* loaded from: classes5.dex */
public final class pv7 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public pv7(g2a g2aVar, bfg bfgVar) {
        this.a = 8;
        this.b = g2aVar;
        o2g.O(bfgVar, "savedListener");
        this.c = bfgVar;
    }

    private final void a() {
        int i = 0;
        while (true) {
            try {
                ((Runnable) this.c).run();
            } catch (Throwable th) {
                cxb.V(th, g.a);
            }
            Runnable J0 = ((p5g) this.b).J0();
            if (J0 == null) {
                return;
            }
            try {
                this.c = J0;
                i++;
                if (i >= 16) {
                    p5g p5gVar = (p5g) this.b;
                    if (w98.c(p5gVar.e, p5gVar)) {
                        p5g p5gVar2 = (p5g) this.b;
                        w98.b(this, p5gVar2, p5gVar2.e);
                        return;
                    }
                }
            } catch (Throwable th2) {
                p5g p5gVar3 = (p5g) this.b;
                synchronized (p5gVar3.h) {
                    p5g.i.decrementAndGet(p5gVar3);
                    throw th2;
                }
            }
        }
    }

    private final void b() {
        Set set = bp6.a;
        if (set.contains(this)) {
            return;
        }
        try {
            gtg gtgVar = (gtg) this.b;
            mka mkaVar = null;
            if (!set.contains(gtg.class)) {
                try {
                    mkaVar = gtgVar.a;
                } catch (Throwable th) {
                    bp6.a(gtg.class, th);
                }
            }
            mkaVar.l((Bundle) this.c, "fb_mobile_login_heartbeat");
        } catch (Throwable th2) {
            bp6.a(this, th2);
        }
    }

    private final void c() {
        vjp vjpVar;
        Uri uri;
        p2f p2fVar = ((g4h) this.b).a.f;
        dkp dkpVar = (dkp) ((ckp) this.c);
        String str = dkpVar.a;
        String str2 = dkpVar.b;
        int i = 2;
        while (true) {
            int i2 = i - 1;
            vjpVar = null;
            if (i < 0) {
                break;
            }
            a R0 = p2fVar.R0(str, str2, "", false);
            p2f.X0(R0, 5000L);
            a aVar = R0.j() ? R0 : null;
            if (aVar != null) {
                vjpVar = vjp.b(aVar);
                break;
            }
            i = i2;
        }
        if (vjpVar == null || (uri = vjpVar.f) == null) {
            return;
        }
        vjp.e(uri, 2000, new fw0(3, this));
    }

    private final void d() {
        MulticastSocket multicastSocket = (MulticastSocket) this.c;
        if (!multicastSocket.isClosed()) {
            multicastSocket.close();
        }
        jjo.b(new dsd(8, this));
    }

    private final void e() {
        b8h b8hVar = (b8h) this.b;
        sgr sgrVar = (sgr) this.c;
        Logger logger = j8h.c0;
        Level level = Level.WARNING;
        j8h j8hVar = b8hVar.c;
        logger.log(level, "[{0}] Failed to resolve name. status={1}", new Object[]{j8hVar.a, sgrVar});
        g8h g8hVar = j8hVar.P;
        if (g8hVar.a.get() == j8h.i0) {
            g8hVar.i(null);
        }
        if (j8hVar.b0 != 3) {
            j8hVar.N.J(3, "Failed to resolve name: {0}", sgrVar);
            j8hVar.b0 = 3;
        }
        a8h a8hVar = b8hVar.a;
        if (a8hVar != j8hVar.w) {
            return;
        }
        ((ceg) a8hVar.a.c).p(sgrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:220:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        nq1 nq1Var;
        reb rebVar;
        List list;
        xu1 xu1Var;
        sgr sgrVar;
        lwi lwiVar;
        List list2;
        kwe kweVar;
        sgr sgrVar2;
        Object obj;
        es6 es6Var = null;
        r2 = null;
        Throwable th = null;
        es6Var = null;
        es6 es6Var2 = null;
        int i = 2;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ((oo4) ((qv7) this.b).b).t((ljr) this.c);
                return;
            case 1:
                ((oo4) ((qv7) this.b).b).d((s2i) this.c);
                return;
            case 2:
                jsg j = jsg.j();
                String str = rv7.e;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                t4w t4wVar = (t4w) this.c;
                sb.append(t4wVar.a);
                j.e(str, sb.toString());
                ((rv7) this.b).a.c(t4wVar);
                return;
            case 3:
                hf9 hf9Var = (hf9) this.c;
                c11 c11Var = hf9Var.k;
                Throwable th2 = (Throwable) this.b;
                Throwable th3 = th2;
                if (th2 == null) {
                    th3 = new UnknownError("No stack provided");
                }
                c11Var.a.add(th3);
                c11Var.b--;
                hf9.h0(hf9Var);
                return;
            case 4:
                ((um9) this.b).b.clear();
                return;
            case 5:
                ((qu9) this.c).c(((iu9) this.b).h);
                return;
            case 6:
                bz9 bz9Var = (bz9) this.c;
                kxt[] kxtVarArr = (kxt[]) this.b;
                bz9.a(bz9Var, (kxt[]) Arrays.copyOf(kxtVarArr, kxtVarArr.length));
                return;
            case 7:
                bz9 bz9Var2 = (bz9) this.c;
                String[] strArr = (String[]) this.b;
                bz9.b(bz9Var2, (String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            case 8:
                bfg bfgVar = (bfg) this.c;
                g2a g2aVar = (g2a) this.b;
                String str2 = g2aVar.f;
                vq6 vq6Var = g2aVar.j;
                Logger logger = g2a.t;
                Level level = Level.FINER;
                if (logger.isLoggable(level)) {
                    logger.finer("Attempting DNS resolution of " + str2);
                }
                try {
                    try {
                        wzm a = g2aVar.b.a(InetSocketAddress.createUnresolved(str2, g2aVar.g));
                        rebVar = a != null ? new reb(a) : null;
                        list = Collections.EMPTY_LIST;
                        xu1Var = xu1.b;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (IOException e) {
                    e = e;
                }
                if (rebVar != null) {
                    if (logger.isLoggable(level)) {
                        logger.finer("Using proxy address " + rebVar);
                    }
                    list2 = Collections.singletonList(rebVar);
                    lwiVar = null;
                } else {
                    es6 T = g2aVar.T();
                    try {
                        sgrVar = (sgr) T.a;
                    } catch (IOException e2) {
                        e = e2;
                        es6Var = T;
                        bfgVar.z(sgr.o.i("Unable to resolve host " + str2).h(e));
                        nq1Var = new nq1(this, es6Var != null && ((sgr) es6Var.a) == null, 2);
                        vq6Var.execute(nq1Var);
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                        es6Var2 = T;
                        vq6Var.execute(new nq1(this, es6Var2 != null && ((sgr) es6Var2.a) == null, 2));
                        throw th;
                    }
                    if (sgrVar != null) {
                        bfgVar.z(sgrVar);
                        nq1Var = new nq1(this, ((sgr) T.a) == null, 2);
                        vq6Var.execute(nq1Var);
                        return;
                    } else {
                        List list3 = (List) T.b;
                        if (list3 != null) {
                            list = list3;
                        }
                        lwi lwiVar2 = (lwi) T.c;
                        lwiVar = lwiVar2 != null ? lwiVar2 : null;
                        es6Var = T;
                        list2 = list;
                    }
                }
                bfgVar.A(new mwi(list2, xu1Var, lwiVar));
                nq1Var = new nq1(this, es6Var != null && ((sgr) es6Var.a) == null, 2);
                vq6Var.execute(nq1Var);
                return;
            case 9:
                kzc kzcVar = (kzc) this.b;
                Future future = (Future) this.c;
                if (future instanceof v6) {
                    v6 v6Var = (v6) future;
                    if (v6Var instanceof n6) {
                        Object obj2 = v6Var.a;
                        if (obj2 instanceof i6) {
                            th = ((i6) obj2).a;
                        }
                    }
                    if (th != null) {
                        kzcVar.onFailure(th);
                        return;
                    }
                }
                try {
                    kzcVar.onSuccess(leu.O(future));
                    return;
                } catch (ExecutionException e3) {
                    kzcVar.onFailure(e3.getCause());
                    return;
                } catch (Throwable th6) {
                    kzcVar.onFailure(th6);
                    return;
                }
            case 10:
                mld mldVar = (mld) this.b;
                if (mldVar.d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.c).run();
                    return;
                } catch (Throwable th7) {
                    mldVar.c.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th7);
                        return;
                    }
                    return;
                }
            case 11:
                qod qodVar = (qod) this.b;
                if (bp6.a.contains(this)) {
                    return;
                }
                try {
                    Iterator it = ((ArrayList) this.c).iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        lod lodVar = (lod) pair.first;
                        Object obj3 = pair.second;
                        obj3.getClass();
                        lodVar.a((rod) obj3);
                    }
                    Iterator it2 = qodVar.d.iterator();
                    while (it2.hasNext()) {
                        ((oa) it2.next()).a(qodVar);
                    }
                    return;
                } catch (Throwable th8) {
                    bp6.a(this, th8);
                    return;
                }
            case 12:
                ((f4e) this.c).a.I((Throwable) this.b);
                return;
            case 13:
                qdc qdcVar = (qdc) this.b;
                v7o v7oVar = (v7o) qdcVar.b;
                try {
                    v7oVar.onSuccess(((y7e) qdcVar.c).f((Map) this.c));
                    return;
                } catch (Exception e4) {
                    v7oVar.onError(veb.b(e4));
                    return;
                }
            case 14:
                ((x7e) this.c).b((Exception) this.b);
                return;
            case 15:
                lwe lweVar = ((owe) this.b).k;
                SocketAddress socketAddress = (SocketAddress) ((reb) lweVar.a.get(lweVar.b)).a.get(lweVar.c);
                lwe lweVar2 = ((owe) this.b).k;
                lweVar2.a = (List) this.c;
                lweVar2.d();
                ((owe) this.b).l = (List) this.c;
                r76 r76Var = ((owe) this.b).v.a;
                r76 r76Var2 = r76.b;
                if (r76Var == r76Var2 || ((owe) this.b).v.a == r76.a) {
                    lwe lweVar3 = ((owe) this.b).k;
                    while (true) {
                        if (i2 < lweVar3.a.size()) {
                            int indexOf = ((reb) lweVar3.a.get(i2)).a.indexOf(socketAddress);
                            if (indexOf == -1) {
                                i2++;
                            } else {
                                lweVar3.b = i2;
                                lweVar3.c = indexOf;
                            }
                        } else {
                            r76 r76Var3 = ((owe) this.b).v.a;
                            owe oweVar = (owe) this.b;
                            if (r76Var3 == r76Var2) {
                                kweVar = oweVar.u;
                                ((owe) this.b).u = null;
                                ((owe) this.b).k.d();
                                owe.e((owe) this.b, r76.d);
                            } else {
                                oweVar.t.b(sgr.o.i("InternalSubchannel closed pending transport due to address change"));
                                owe oweVar2 = (owe) this.b;
                                oweVar2.t = null;
                                oweVar2.k.d();
                                owe.g((owe) this.b);
                            }
                        }
                    }
                    if (kweVar == null) {
                        owe oweVar3 = (owe) this.b;
                        if (oweVar3.p != null) {
                            oweVar3.q.b(sgr.o.i("InternalSubchannel closed transport early due to address change"));
                            ((owe) this.b).p.c();
                            owe oweVar4 = (owe) this.b;
                            oweVar4.p = null;
                            oweVar4.q = null;
                        }
                        owe oweVar5 = (owe) this.b;
                        oweVar5.q = kweVar;
                        oweVar5.p = oweVar5.j.c(oweVar5.f, new dsd(i, this), 5L, TimeUnit.SECONDS);
                        return;
                    }
                    return;
                }
                kweVar = null;
                if (kweVar == null) {
                }
                break;
            case 16:
                if (((owe) ((r0o) this.b).d).v.a == r76.e) {
                    return;
                }
                kwe kweVar2 = ((owe) ((r0o) this.b).d).u;
                r0o r0oVar = (r0o) this.b;
                kwe kweVar3 = (kwe) r0oVar.c;
                owe oweVar6 = (owe) r0oVar.d;
                if (kweVar2 == kweVar3) {
                    oweVar6.u = null;
                    ((owe) ((r0o) this.b).d).k.d();
                    owe.e((owe) ((r0o) this.b).d, r76.d);
                    return;
                }
                if (oweVar6.t == kweVar3) {
                    o2g.S(((owe) ((r0o) this.b).d).v.a, "Expected state is CONNECTING, actual state is %s", oweVar6.v.a == r76.a);
                    lwe lweVar4 = ((owe) ((r0o) this.b).d).k;
                    reb rebVar2 = (reb) lweVar4.a.get(lweVar4.b);
                    int i3 = lweVar4.c + 1;
                    lweVar4.c = i3;
                    if (i3 >= rebVar2.a.size()) {
                        lweVar4.b++;
                        lweVar4.c = 0;
                    }
                    lwe lweVar5 = ((owe) ((r0o) this.b).d).k;
                    int i4 = lweVar5.b;
                    int size = lweVar5.a.size();
                    owe oweVar7 = (owe) ((r0o) this.b).d;
                    if (i4 < size) {
                        owe.g(oweVar7);
                        return;
                    }
                    oweVar7.t = null;
                    oweVar7.k.d();
                    owe oweVar8 = (owe) ((r0o) this.b).d;
                    sgr sgrVar3 = (sgr) this.c;
                    oweVar8.j.e();
                    o2g.J("The error status must not be OK", !sgrVar3.g());
                    oweVar8.h(new s76(r76.c, sgrVar3));
                    if (oweVar8.m == null) {
                        oweVar8.c.getClass();
                        oweVar8.m = wvo.A();
                    }
                    long a2 = oweVar8.m.a();
                    hhr hhrVar = oweVar8.n;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long a3 = a2 - hhrVar.a();
                    oweVar8.i.J(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", owe.i(sgrVar3), Long.valueOf(a3));
                    o2g.U("previous reconnectTask is not done", oweVar8.o == null);
                    oweVar8.o = oweVar8.j.c(oweVar8.f, new gwe(oweVar8, i2), a3, timeUnit);
                    return;
                }
                return;
            case 17:
                p0f p0fVar = (p0f) this.c;
                opn opnVar = p0fVar.e;
                s0f s0fVar = (s0f) this.b;
                RecyclerView recyclerView = s0fVar.r;
                if (recyclerView == null || !recyclerView.s || p0fVar.k || opnVar.b() == -1) {
                    return;
                }
                von itemAnimator = s0fVar.r.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.f()) {
                    ArrayList arrayList = s0fVar.p;
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        if (((p0f) arrayList.get(i2)).l) {
                            i2++;
                        }
                    }
                    n8n n8nVar = s0fVar.m;
                    n8nVar.getClass();
                    opnVar.getClass();
                    p8n.w((p8n) n8nVar.e, opnVar.c());
                    return;
                }
                s0fVar.r.post(this);
                return;
            case 18:
                cdg cdgVar = (cdg) this.c;
                dkp dkpVar = (dkp) this.b;
                synchronized (cdgVar) {
                    try {
                        fkp fkpVar = dkpVar.c;
                        if (fkpVar == null || !fkpVar.j()) {
                            cdg.d.warning("Service Resolved called for an unresolved event: " + dkpVar);
                        } else {
                            String str3 = dkpVar.b + "." + dkpVar.a;
                            fkp fkpVar2 = (fkp) cdgVar.c.get(str3);
                            if (fkpVar2 != null && fkpVar.equals(fkpVar2)) {
                                byte[] h = fkpVar.h();
                                byte[] h2 = fkpVar2.h();
                                if (h.length == h2.length) {
                                    while (i2 < h.length) {
                                        if (h[i2] == h2[i2]) {
                                            i2++;
                                        }
                                    }
                                    cdg.d.finer("Service Resolved called for a service already resolved: " + dkpVar);
                                }
                            }
                            ConcurrentHashMap concurrentHashMap = cdgVar.c;
                            if (fkpVar2 == null) {
                                if (concurrentHashMap.putIfAbsent(str3, ((a) fkpVar).clone()) == null) {
                                    ((ikp) cdgVar.a).serviceResolved(dkpVar);
                                }
                            } else if (concurrentHashMap.replace(str3, fkpVar2, ((a) fkpVar).clone())) {
                                ((ikp) cdgVar.a).serviceResolved(dkpVar);
                            }
                        }
                    } finally {
                    }
                }
                return;
            case 19:
                Continuation b = qxe.b((eif) this.c);
                Exception exc = (Exception) this.b;
                r7o r7oVar = z7o.b;
                b.resumeWith(qgg.J(exc));
                return;
            case 20:
                a();
                return;
            case 21:
                b();
                return;
            case 22:
                c();
                return;
            case 23:
                ((ew0) ((nud) this.b).c).onError(veb.b((IOException) this.c));
                return;
            case 24:
                ((ew0) ((nud) this.b).c).onSuccess((vjp) this.c);
                return;
            case 25:
                ((k4h) ((fw0) this.b).b).e.onSuccess((vjp) this.c);
                return;
            case 26:
                d();
                return;
            case 27:
                ((ew0) this.c).onError(veb.b((Exception) this.b));
                return;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                e();
                return;
            default:
                wu1 wu1Var = nte.a;
                b8h b8hVar = (b8h) this.b;
                j8h j8hVar = b8hVar.c;
                if (j8hVar.u != b8hVar.b) {
                    return;
                }
                mwi mwiVar = (mwi) this.c;
                List list4 = mwiVar.a;
                j8hVar.N.J(1, "Resolved address: {0}, config={1}", list4, mwiVar.b);
                j8h j8hVar2 = ((b8h) this.b).c;
                if (j8hVar2.b0 != 2) {
                    j8hVar2.N.J(2, "Address resolved: {0}", list4);
                    ((b8h) this.b).c.b0 = 2;
                }
                mwi mwiVar2 = (mwi) this.c;
                lwi lwiVar3 = mwiVar2.c;
                vco vcoVar = (vco) mwiVar2.b.a.get(xco.e);
                nte nteVar = (nte) ((mwi) this.c).b.a.get(wu1Var);
                q8h q8hVar = (lwiVar3 == null || (obj = lwiVar3.b) == null) ? null : (q8h) obj;
                sgr sgrVar4 = lwiVar3 != null ? lwiVar3.a : null;
                j8h j8hVar3 = ((b8h) this.b).c;
                int i5 = 28;
                int i6 = 8;
                if (j8hVar3.S) {
                    if (q8hVar != null) {
                        g8h g8hVar = j8hVar3.P;
                        if (nteVar != null) {
                            g8hVar.i(nteVar);
                            if (q8hVar.b() != null) {
                                ((b8h) this.b).c.N.I(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            g8hVar.i(q8hVar.b());
                        }
                    } else if (sgrVar4 == null) {
                        q8hVar = j8h.h0;
                        j8hVar3.P.i(null);
                    } else {
                        if (!j8hVar3.R) {
                            j8hVar3.N.I(2, "Fallback to error due to invalid first service config without default config");
                            ((b8h) this.b).z(lwiVar3.a);
                            if (vcoVar != null) {
                                boolean g = lwiVar3.a.g();
                                xco xcoVar = vcoVar.a;
                                ck2 ck2Var = xcoVar.c;
                                if (!g) {
                                    ck2Var.a(new dsd(i5, xcoVar));
                                    return;
                                }
                                vq6 vq6Var2 = ck2Var.b;
                                vq6Var2.e();
                                vq6Var2.execute(new he0(i6, ck2Var));
                                return;
                            }
                            return;
                        }
                        q8hVar = j8hVar3.Q;
                    }
                    if (!q8hVar.equals(((b8h) this.b).c.Q)) {
                        ((b8h) this.b).c.N.J(2, "Service config changed{0}", q8hVar == j8h.h0 ? " to empty" : "");
                        j8h j8hVar4 = ((b8h) this.b).c;
                        j8hVar4.Q = q8hVar;
                        j8hVar4.Z.b = q8hVar.d;
                    }
                    try {
                        ((b8h) this.b).c.R = true;
                    } catch (RuntimeException e5) {
                        j8h.c0.log(Level.WARNING, "[" + ((b8h) this.b).c.a + "] Unexpected exception from parsing service config", (Throwable) e5);
                    }
                } else {
                    if (q8hVar != null) {
                        j8hVar3.N.I(2, "Service config from name resolver discarded by channel settings");
                    }
                    j8h j8hVar5 = ((b8h) this.b).c;
                    q8hVar = j8h.h0;
                    if (nteVar != null) {
                        j8hVar5.N.I(2, "Config selector from name resolver discarded by channel settings");
                    }
                    ((b8h) this.b).c.P.i(q8hVar.b());
                }
                xu1 xu1Var2 = ((mwi) this.c).b;
                b8h b8hVar2 = (b8h) this.b;
                if (b8hVar2.a == b8hVar2.c.w) {
                    xu1Var2.getClass();
                    yfx yfxVar = new yfx(xu1Var2);
                    if (xu1Var2.a.containsKey(wu1Var)) {
                        IdentityHashMap identityHashMap = new IdentityHashMap(((xu1) yfxVar.b).a);
                        identityHashMap.remove(wu1Var);
                        yfxVar.b = new xu1(identityHashMap);
                    }
                    IdentityHashMap identityHashMap2 = (IdentityHashMap) yfxVar.c;
                    if (identityHashMap2 != null) {
                        identityHashMap2.remove(wu1Var);
                    }
                    Map map = q8hVar.f;
                    if (map != null) {
                        yfxVar.w(ceg.c, map);
                        yfxVar.h();
                    }
                    xu1 h3 = yfxVar.h();
                    kkp kkpVar = ((b8h) this.b).a.a;
                    xu1 xu1Var3 = xu1.b;
                    ydg ydgVar = new ydg(list4, h3, q8hVar.e);
                    a8h a8hVar = (a8h) kkpVar.b;
                    akp akpVar = (akp) ydgVar.c;
                    if (akpVar == null) {
                        try {
                            nnk nnkVar = (nnk) kkpVar.e;
                            String str4 = (String) nnkVar.b;
                            deg b2 = ((eeg) nnkVar.a).b(str4);
                            if (b2 == null) {
                                throw new b52("Trying to load '" + str4 + "' because using default policy, but it's unavailable");
                            }
                            akpVar = new akp(b2, null);
                        } catch (b52 e6) {
                            a8hVar.Z(r76.c, new w7h(sgr.n.i(e6.getMessage())));
                            ((ceg) kkpVar.c).y();
                            kkpVar.d = null;
                            kkpVar.c = new a52(0);
                            sgrVar2 = sgr.e;
                        }
                    }
                    Object obj4 = akpVar.b;
                    deg degVar = akpVar.a;
                    if (((deg) kkpVar.d) == null || !degVar.a().equals(((deg) kkpVar.d).a())) {
                        a8hVar.Z(r76.a, new z42(i2));
                        ((ceg) kkpVar.c).y();
                        kkpVar.d = degVar;
                        ceg cegVar = (ceg) kkpVar.c;
                        kkpVar.c = degVar.b(a8hVar);
                        a8hVar.b.N.J(2, "Load balancer changed from {0} to {1}", cegVar.getClass().getSimpleName(), ((ceg) kkpVar.c).getClass().getSimpleName());
                    }
                    if (obj4 != null) {
                        a8hVar.b.N.J(1, "Load-balancing config: {0}", obj4);
                    }
                    sgrVar2 = ((ceg) kkpVar.c).a(new ydg(ydgVar.a, ydgVar.b, obj4));
                    if (vcoVar != null) {
                        boolean g2 = sgrVar2.g();
                        xco xcoVar2 = vcoVar.a;
                        ck2 ck2Var2 = xcoVar2.c;
                        if (!g2) {
                            ck2Var2.a(new dsd(i5, xcoVar2));
                            return;
                        }
                        vq6 vq6Var3 = ck2Var2.b;
                        vq6Var3.e();
                        vq6Var3.execute(new he0(i6, ck2Var2));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 9:
                z0j Y = ezf.Y(this);
                kzc kzcVar = (kzc) this.b;
                ime imeVar = new ime(12);
                ((ime) Y.e).d = imeVar;
                Y.e = imeVar;
                imeVar.c = kzcVar;
                return Y.toString();
            default:
                return super.toString();
        }
    }

    public pv7(qu9 qu9Var, iu9 iu9Var, gc8 gc8Var) {
        this.a = 5;
        this.c = qu9Var;
        this.b = iu9Var;
    }

    public /* synthetic */ pv7(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ pv7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public pv7(s0f s0fVar, p0f p0fVar, int i) {
        this.a = 17;
        this.b = s0fVar;
        this.c = p0fVar;
    }
}
