package defpackage;

import android.content.Context;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ltu {
    public final g9m a;
    public final c1v b;
    public final z6n c;
    public final i4v d;
    public final e4v e;
    public final s3v f;
    public final d4v g;
    public final r3s h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final q1v o;
    public final kxi p;
    public final Context q;
    public final boolean r;
    public final by7 s;
    public final by7 t;
    public final xdr u;
    public final jab v;
    public final itu w;
    public final dxr x;

    public ltu(qyf qyfVar, g9m g9mVar, c1v c1vVar, z6n z6nVar, i4v i4vVar, e4v e4vVar, s3v s3vVar, d4v d4vVar, r3s r3sVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, q1v q1vVar, kxi kxiVar, Context context, g0l g0lVar, boolean z7) {
        this.a = g9mVar;
        this.b = c1vVar;
        this.c = z6nVar;
        this.d = i4vVar;
        this.e = e4vVar;
        this.f = s3vVar;
        this.g = d4vVar;
        this.h = r3sVar;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = q1vVar;
        this.p = kxiVar;
        this.q = context;
        this.r = z7;
        by7 by7Var = d4vVar.m;
        this.s = by7Var;
        this.t = asq.K((vdr) i4vVar.a.b, new xlu(24));
        this.u = ydr.a(new cvo(wjb.WaveLandingScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60));
        this.v = new jab(qkb.MyWave, 1, 1, 1);
        this.w = new itu(this, 1);
        this.x = new dxr(g0lVar, new itu(this, 2));
        ox6.B(by7Var, qyfVar, new jtu(this, 0));
        ox6.B((vdr) c1vVar.c.getValue(), qyfVar, new jtu(this, 1));
        ox6.B(zsd.b0(new y4s((vdr) g9mVar.n.getValue(), 18)), qyfVar, new jtu(this, 2));
    }

    public final s2v a() {
        kxi kxiVar = this.p;
        return new s2v(this.g, this.o, new exa(this.v, kxiVar.a, this.u), kxiVar, this.w, this.x, this.n);
    }

    public final xjv b(spd spdVar) {
        kxi kxiVar = this.p;
        exa exaVar = new exa(new jab(qkb.Wheel, spdVar.a + 1, spdVar.b + 1, 0), kxiVar.a, this.u);
        e4v e4vVar = this.e;
        apo apoVar = new apo(16, this.q, this.h);
        dxr dxrVar = this.x;
        dxrVar.getClass();
        pzl pzlVar = e4vVar.a;
        bdt I = hag.I(thv.class);
        qdc qdcVar = pzlVar.a;
        qdcVar.getClass();
        thv thvVar = (thv) qdcVar.C(I);
        bdt I2 = hag.I(zhv.class);
        qdc qdcVar2 = pzlVar.a;
        qdcVar2.getClass();
        return new xjv(thvVar, apoVar, kxiVar, (zhv) qdcVar2.C(I2), exaVar, dxrVar, pzlVar.d());
    }

    public final r4v c(spd spdVar, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(675929218);
        boolean d = oq5Var.d(spdVar.c);
        Object K = oq5Var.K();
        Object obj = gq5.a;
        if (d || K == obj) {
            K = new exa(new jab(qkb.WordsInWave, spdVar.a + 1, spdVar.b + 1, 0), this.p.a, this.u);
            oq5Var.k0(K);
        }
        Object obj2 = (exa) K;
        i4v i4vVar = this.d;
        jyr jyrVar = i4vVar.c;
        boolean h = oq5Var.h(this);
        Object K2 = oq5Var.K();
        if (h || K2 == obj) {
            K2 = new itu(this, 0);
            oq5Var.k0(K2);
        }
        Function0 function0 = (Function0) K2;
        boolean h2 = oq5Var.h(obj2);
        Object K3 = oq5Var.K();
        if (h2 || K3 == obj) {
            K3 = new wfs(25, obj2);
            oq5Var.k0(K3);
        }
        Function0 function02 = (Function0) K3;
        d18 d18Var = i4vVar.a;
        function0.getClass();
        function02.getClass();
        Object K4 = oq5Var.K();
        if (K4 == obj) {
            K4 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
        }
        mm6 mm6Var = ((fs5) K4).a;
        Object obj3 = (z6v) jyrVar.getValue();
        Object obj4 = (vdr) d18Var.b;
        boolean f = oq5Var.f(obj3) | oq5Var.f(mm6Var) | oq5Var.f(obj4);
        Object K5 = oq5Var.K();
        if (f || K5 == obj) {
            Object r4vVar = new r4v(mm6Var, (z6v) jyrVar.getValue(), (vdr) d18Var.b, function02, function0);
            oq5Var.k0(r4vVar);
            K5 = r4vVar;
        }
        r4v r4vVar2 = (r4v) K5;
        oq5Var.p(false);
        return r4vVar2;
    }
}
