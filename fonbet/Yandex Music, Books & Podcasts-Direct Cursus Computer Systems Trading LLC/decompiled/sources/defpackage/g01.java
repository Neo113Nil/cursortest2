package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class g01 implements knq {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final tmb c;
    public final Object d;
    public final Object e;
    public final Object f;

    public g01(g76 g76Var, tmb tmbVar, k76 k76Var, Function2 function2) {
        g76Var.getClass();
        tmbVar.getClass();
        this.d = g76Var;
        this.c = tmbVar;
        this.b = k76Var;
        this.e = function2;
        this.f = btf.b(new r25(28, this));
    }

    @Override // defpackage.knq
    public final rrf a(rnq rnqVar, qnq qnqVar) {
        Object znkVar;
        switch (this.a) {
            case 0:
                m01 m01Var = (m01) rnqVar;
                qnqVar.getClass();
                ((f01) this.d).getClass();
                hn5 hn5Var = qnqVar.b;
                return (rrf) ((j3) this.f).invoke(m01Var.h, new i01(m01Var, new nsh(hn5Var, qnqVar.a, hn5Var.getViewModelStore()), m01Var.e));
            case 1:
                cl1 cl1Var = (cl1) rnqVar;
                qnqVar.getClass();
                rj1 rj1Var = (rj1) this.f;
                ke1 ke1Var = cl1Var.h;
                u51 u51Var = (u51) this.b;
                le1 le1Var = (le1) this.d;
                le1Var.getClass();
                me1 me1Var = new me1(qnqVar.b);
                je1 je1Var = new je1(qnqVar, 0);
                return (rrf) rj1Var.invoke(ke1Var, new ne1(u51Var, (kxi) this.e, cl1Var, cl1Var.e, me1Var, je1Var, (fdj) le1Var.d.getValue()));
            case 2:
                dg1 dg1Var = (dg1) rnqVar;
                qnqVar.getClass();
                ((of1) this.d).getClass();
                return (rrf) ((rj1) this.f).invoke(dg1Var.i, new rf1(dg1Var, new qf1(qnqVar.b, qnqVar.a, 0), dg1Var.e));
            case 3:
                yg1 yg1Var = (yg1) rnqVar;
                qnqVar.getClass();
                ((rg1) this.d).getClass();
                return (rrf) ((j3) this.f).invoke(yg1Var.h, new vg1(yg1Var, new sg1(qnqVar.b, 0), yg1Var.e));
            case 4:
                p04 p04Var = (p04) rnqVar;
                qnqVar.getClass();
                hz3 hz3Var = p04Var.a;
                nrf nrfVar = hz3Var.a;
                ssg.a(3, "Collection:Skeleton:FavoriteArtistsBlock", hrg.r("createBlockUi: type=", nrfVar.b, " id=", nrfVar.a), null);
                tz3 tz3Var = (tz3) this.b;
                hn5 hn5Var2 = qnqVar.b;
                int i = tz3Var.a;
                hn5Var2.getClass();
                switch (i) {
                    case 0:
                        znkVar = new znk(hn5Var2);
                        break;
                    default:
                        znkVar = new kz3(hn5Var2);
                        break;
                }
                dqj Q = rzf.Q(new g73(nrfVar.a, nrfVar.b, new wn5(new wl(p04Var, znkVar, this, qnqVar.d, 25), 1761722662, true), (cma) null, 24), hz3Var.b, null, new vd(8, p04Var, this, znkVar), p04Var.l, null, 50);
                by7 by7Var = p04Var.k;
                by7Var.getClass();
                return new cyd(Q, by7Var);
            case 5:
                jy5 jy5Var = (jy5) rnqVar;
                qnqVar.getClass();
                by5 by5Var = jy5Var.f;
                nrf nrfVar2 = by5Var.a;
                ssg.a(3, "Skeleton:ConcertPlaceBlock", hrg.r("createBlockUi: type=", nrfVar2.b, " id=", nrfVar2.a), null);
                fp5 fp5Var = (fp5) this.f;
                rmb rmbVar = jy5Var.d;
                ((dy5) this.b).getClass();
                return (rrf) fp5Var.invoke(by5Var, new hy5(jy5Var, rmbVar, new jzi(qnqVar)));
            default:
                m76 m76Var = (m76) rnqVar;
                qnqVar.getClass();
                g76 g76Var = (g76) this.d;
                g76Var.getClass();
                qnqVar.getClass();
                osh oshVar = new osh();
                oshVar.a = qnqVar;
                bdt I = hag.I(vxr.class);
                l18 l18Var = l18.b;
                oshVar.b = l18Var.b(I, true);
                oshVar.c = l18Var.b(hag.I(skr.class), true);
                int i2 = m76Var.a.b;
                return (rrf) ((Function2) this.e).invoke(m76Var.a(), new j76(m76Var, qnqVar.b, this.c, i2, oshVar, (nmj) g76Var.a.getValue()));
        }
    }

    @Override // defpackage.knq
    public final rnq b(s63 s63Var) {
        switch (this.a) {
            case 0:
                return new m01(s63Var, (u51) this.b, q5g.x(this.c, s63Var), (q01) this.e, new ozw((d01) s63Var.a));
            case 1:
                u51 u51Var = (u51) this.b;
                rmb x = q5g.x(this.c, s63Var);
                le1 le1Var = (le1) this.d;
                return new cl1(s63Var, u51Var, x, (qe1) le1Var.c.getValue(), new bm1((a2t) le1Var.b.getValue(), 0));
            case 2:
                u51 u51Var2 = (u51) this.b;
                rmb x2 = q5g.x(this.c, s63Var);
                fg1 fg1Var = (fg1) this.e;
                of1 of1Var = (of1) this.d;
                return new dg1(s63Var, u51Var2, x2, fg1Var, new kkp((f91) of1Var.b.getValue(), (gg1) of1Var.c.getValue()), btf.b(new z3(26, this)));
            case 3:
                return new yg1(s63Var, (u51) this.b, q5g.x(this.c, s63Var), (ah1) this.e, btf.b(new z3(28, this)));
            case 4:
                hz3 hz3Var = (hz3) s63Var.a;
                ssg.a(3, "Collection:Skeleton:FavoriteArtistsBlock", "createViewModel: block=" + hz3Var.a, null);
                return new p04(hz3Var, q5g.x(this.c, s63Var), (c04) this.e, (jp1) this.f);
            case 5:
                ssg.a(3, "Skeleton:ConcertPlaceBlock", "createViewModel: block=" + ((by5) s63Var.a).a, null);
                return new jy5((String) this.d, s63Var, q5g.x(this.c, s63Var), new o(((i06) this.e).a));
            default:
                return new m76(s63Var, (k76) this.b, (z66) ((jyr) this.f).getValue());
        }
    }

    public g01(f01 f01Var, u51 u51Var, tmb tmbVar, q01 q01Var, j3 j3Var) {
        f01Var.getClass();
        u51Var.getClass();
        tmbVar.getClass();
        q01Var.getClass();
        this.d = f01Var;
        this.b = u51Var;
        this.c = tmbVar;
        this.e = q01Var;
        this.f = j3Var;
    }

    public g01(le1 le1Var, u51 u51Var, kxi kxiVar, tmb tmbVar, rj1 rj1Var) {
        le1Var.getClass();
        u51Var.getClass();
        tmbVar.getClass();
        this.d = le1Var;
        this.b = u51Var;
        this.e = kxiVar;
        this.c = tmbVar;
        this.f = rj1Var;
    }

    public g01(rg1 rg1Var, u51 u51Var, tmb tmbVar, ah1 ah1Var, j3 j3Var) {
        rg1Var.getClass();
        u51Var.getClass();
        tmbVar.getClass();
        ah1Var.getClass();
        this.d = rg1Var;
        this.b = u51Var;
        this.c = tmbVar;
        this.e = ah1Var;
        this.f = j3Var;
    }

    public g01(of1 of1Var, u51 u51Var, tmb tmbVar, fg1 fg1Var, rj1 rj1Var) {
        of1Var.getClass();
        u51Var.getClass();
        tmbVar.getClass();
        fg1Var.getClass();
        this.d = of1Var;
        this.b = u51Var;
        this.c = tmbVar;
        this.e = fg1Var;
        this.f = rj1Var;
    }

    public g01(p21 p21Var, tz3 tz3Var, tmb tmbVar, c04 c04Var, jp1 jp1Var) {
        tz3Var.getClass();
        jp1Var.getClass();
        this.d = p21Var;
        this.b = tz3Var;
        this.c = tmbVar;
        this.e = c04Var;
        this.f = jp1Var;
    }

    public g01(String str, dy5 dy5Var, i06 i06Var, tmb tmbVar, fp5 fp5Var) {
        str.getClass();
        dy5Var.getClass();
        i06Var.getClass();
        tmbVar.getClass();
        this.d = str;
        this.b = dy5Var;
        this.e = i06Var;
        this.c = tmbVar;
        this.f = fp5Var;
    }
}
