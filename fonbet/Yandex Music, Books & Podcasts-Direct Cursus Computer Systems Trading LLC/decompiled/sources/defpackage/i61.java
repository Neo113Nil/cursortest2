package defpackage;

import androidx.fragment.app.y;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class i61 implements knq {
    public final /* synthetic */ int a = 0;
    public final tmb b;
    public final Object c;
    public final Object d;
    public final Function2 e;

    public i61(h61 h61Var, tmb tmbVar, q61 q61Var, rj1 rj1Var) {
        h61Var.getClass();
        tmbVar.getClass();
        q61Var.getClass();
        this.c = h61Var;
        this.b = tmbVar;
        this.d = q61Var;
        this.e = rj1Var;
    }

    @Override // defpackage.knq
    public final rrf a(rnq rnqVar, qnq qnqVar) {
        switch (this.a) {
            case 0:
                o61 o61Var = (o61) rnqVar;
                qnqVar.getClass();
                rj1 rj1Var = (rj1) this.e;
                f61 f61Var = o61Var.f;
                ((h61) this.c).getClass();
                hn5 hn5Var = qnqVar.b;
                hn5Var.getClass();
                jzi jziVar = new jzi();
                jziVar.a = hn5Var;
                return (rrf) rj1Var.invoke(f61Var, new k61(o61Var, o61Var.d, jziVar));
            default:
                oh6 oh6Var = (oh6) rnqVar;
                qnqVar.getClass();
                gg6 gg6Var = oh6Var.g;
                nrf nrfVar = gg6Var.a;
                ssg.a(3, "Skeleton:ContinueListenBlock", hrg.r("createBlockUi: type=", nrfVar.b, " id=", nrfVar.a), null);
                fp5 fp5Var = (fp5) this.e;
                nrf nrfVar2 = gg6Var.a;
                y yVar = qnqVar.a;
                kxi kxiVar = (kxi) this.d;
                yVar.getClass();
                mmo mmoVar = new mmo(qnqVar, yVar, nrfVar2, kxiVar);
                l18 l18Var = l18.b;
                bdt I = hag.I(g0l.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return (rrf) fp5Var.invoke(gg6Var, new zg6(oh6Var, mmoVar, (g0l) qdcVar.C(I), (kxi) this.d, q5g.x(this.b, oh6Var.a), new fp5(this), new cp5(17, this)));
        }
    }

    @Override // defpackage.knq
    public final rnq b(s63 s63Var) {
        switch (this.a) {
            case 0:
                return new o61(s63Var, q5g.x(this.b, s63Var), (q61) this.d);
            default:
                gg6 gg6Var = (gg6) s63Var.a;
                if (gg6Var.e != f73.d) {
                    dfi.r(ouj.n(gg6Var.a.b, " block must have a LoadAndShow policy"), "Skeleton:ContinueListenBlock");
                }
                ssg.a(3, "Skeleton:ContinueListenBlock", "createViewModel: block=" + gg6Var.a, null);
                l18 l18Var = l18.b;
                bdt I = hag.I(ch6.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                ch6 ch6Var = (ch6) qdcVar.C(I);
                g06 g06Var = new g06(s63Var, (jnq) this.c);
                lnq lnqVar = new lnq();
                at5 at5Var = new at5(8, this);
                bdt I2 = hag.I(o8q.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                return new oh6(s63Var, ch6Var, g06Var, lnqVar, at5Var, new jzi((o8q) qdcVar2.C(I2)));
        }
    }

    public i61(jnq jnqVar, vg6 vg6Var, kxi kxiVar, tmb tmbVar, fp5 fp5Var) {
        jnqVar.getClass();
        tmbVar.getClass();
        this.c = jnqVar;
        this.d = kxiVar;
        this.b = tmbVar;
        this.e = fp5Var;
    }
}
