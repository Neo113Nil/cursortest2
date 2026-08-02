package defpackage;

import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class a7q {
    public final kv6 a;
    public final w1f b;
    public final g7q c;
    public final b7q d;
    public final rdk e;
    public final v33 f;
    public final ncl g;
    public final j0l h;
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final AtomicReference m;
    public final g7q n;
    public final rn5 o;
    public final o6q p;
    public final s70 q;
    public final lu3 r;
    public final d18 s;
    public final yiq t;
    public final vtm u;

    public a7q(kv6 kv6Var, w1f w1fVar, g7q g7qVar, b7q b7qVar, rdk rdkVar, v33 v33Var, ncl nclVar, hs4 hs4Var, j0l j0lVar) {
        g7qVar.getClass();
        b7qVar.getClass();
        nclVar.getClass();
        j0lVar.getClass();
        this.a = kv6Var;
        this.b = w1fVar;
        this.c = g7qVar;
        this.d = b7qVar;
        this.e = rdkVar;
        this.f = v33Var;
        this.g = nclVar;
        this.h = j0lVar;
        jyr b = b7qVar.b(hag.I(tcl.class), true);
        jyr b2 = b7qVar.b(hag.I(oco.class), true);
        this.i = b7qVar.b(hag.I(jmf.class), true);
        jyr b3 = b7qVar.b(hag.I(nbo.class), true);
        jyr b4 = b7qVar.b(hag.I(xol.class), true);
        this.j = b4;
        this.k = b7qVar.b(hag.I(q5q.class), true);
        this.l = b7qVar.b(hag.I(zss.class), true);
        EnumSet noneOf = EnumSet.noneOf(g5q.class);
        noneOf.getClass();
        z75.u(noneOf, new g5q[0]);
        this.m = new AtomicReference(noneOf);
        this.n = g7qVar;
        Continuation continuation = null;
        rn5 rn5Var = new rn5(kv6Var, (oco) b2.getValue(), (nbo) b3.getValue(), new hv0(this, continuation, 28));
        this.o = rn5Var;
        bdt I = hag.I(xol.class);
        qdc qdcVar = b7qVar.a;
        qdcVar.getClass();
        xol xolVar = (xol) qdcVar.C(I);
        bdt I2 = hag.I(ynf.class);
        qdc qdcVar2 = b7qVar.a;
        qdcVar2.getClass();
        this.p = new o6q(kv6Var, xolVar, rn5Var, (ynf) qdcVar2.C(I2), (tcl) b.getValue());
        a b5 = mal.b();
        b5.getClass();
        s70 s70Var = new s70();
        gld.e(b5);
        this.q = s70Var;
        this.r = new lu3(0);
        bdt I3 = hag.I(udp.class);
        qdc qdcVar3 = b7qVar.a;
        qdcVar3.getClass();
        udp udpVar = (udp) qdcVar3.C(I3);
        xol xolVar2 = (xol) b4.getValue();
        sfm sfmVar = new sfm();
        sfmVar.c = this;
        g7q g7qVar2 = this.c;
        sfmVar.a = g7qVar2.d;
        sfmVar.b = g7qVar2.e;
        d18 d18Var = new d18(udpVar, xolVar2, sfmVar);
        this.s = d18Var;
        this.t = new yiq();
        zsd.r0((tf6) d18Var.e, new u21(10, (x0q) sfmVar.a, (xdr) sfmVar.b, new re7(d18Var, continuation, 5)));
        kv6Var.c1(nclVar);
        this.u = new vtm(this);
    }

    public static final void a(a7q a7qVar) {
        r2f r2fVar = (r2f) a7qVar.r.a.getAndSet(null);
        if (r2fVar != null) {
            r2fVar.g(null);
        }
        a7qVar.n.c(false);
    }

    public final long b(boolean z) {
        long duration;
        kv6 kv6Var = this.a;
        sis V = kv6Var.V();
        long m0 = !V.p() ? dvt.m0(V.f(kv6Var.k0(), new ois(), false).d) : 0L;
        if (z) {
            Long l = kv6Var.s;
            duration = l != null ? l.longValue() : kv6Var.getDuration();
        } else {
            duration = kv6Var.getDuration();
        }
        if (m0 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0L;
        }
        return duration;
    }

    public final long c() {
        kv6 kv6Var = this.a;
        sis V = kv6Var.V();
        return !V.p() ? kv6Var.J0() - dvt.m0(V.f(kv6Var.k0(), new ois(), false).e) : kv6Var.J0();
    }
}
