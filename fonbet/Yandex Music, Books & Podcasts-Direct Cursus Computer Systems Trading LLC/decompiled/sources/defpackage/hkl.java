package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class hkl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ evj b;

    public /* synthetic */ hkl(evj evjVar, int i) {
        this.a = i;
        this.b = evjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(mm6.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                evj evjVar = this.b;
                rp7Var.E(new hkl(evjVar, 5));
                o18Var.c = hag.I(oq7.class);
                rp7Var.getClass();
                rp7Var.E(new hkl(evjVar, 9));
                o18Var.c = hag.I(nnq.class);
                rp7Var.getClass();
                rp7Var.E(new hkl(evjVar, 10));
                o18Var.c = hag.I(z66.class);
                rp7Var.getClass();
                rp7Var.E(new hkl(evjVar, 11));
                o18Var.c = hag.I(k1l.class);
                rp7Var.getClass();
                rp7Var.E(new hkl(evjVar, 12));
                o18Var.c = hag.I(tll.class);
                rp7Var.getClass();
                rp7Var.E(new hkl(evjVar, 1));
                o18Var.c = hag.I(a2t.class);
                rp7Var.getClass();
                rp7Var.E(new hkl(evjVar, 2));
                o18Var.c = hag.I(uil.class);
                rp7Var.getClass();
                rp7Var.E(new hkl(evjVar, 3));
                o18Var.c = hag.I(anl.class);
                rp7Var.getClass();
                rp7Var.E(new hkl(evjVar, 4));
                o18Var.c = hag.I(jnl.class);
                rp7Var.getClass();
                rp7Var.E(new sjl(5));
                o18Var.c = hag.I(wjl.class);
                rp7Var.getClass();
                rp7Var.E(new hkl(evjVar, 6));
                o18Var.c = hag.I(e3h.class);
                rp7Var.getClass();
                rp7Var.D(new hkl(evjVar, 7));
                o18Var.c = hag.I(fdn.class);
                rp7Var.getClass();
                rp7Var.E(new sjl(13));
                o18Var.c = hag.I(cvb.class);
                rp7Var.getClass();
                rp7Var.E(new hkl(evjVar, 8));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (tll) ((jyr) ((ce5) this.b.d).a).getValue();
            case 2:
                ((l13) obj).getClass();
                return (oo6) ((ce5) this.b.d).l;
            case 3:
                ((l13) obj).getClass();
                return (uil) ((jyr) this.b.f).getValue();
            case 4:
                ((l13) obj).getClass();
                return new anl(new ikl(this.b));
            case 5:
                ((l13) obj).getClass();
                return (tf6) ((xdh) this.b.c).d;
            case 6:
                ((l13) obj).getClass();
                return (wjl) ((jyr) ((xdh) this.b.c).c).getValue();
            case 7:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                ce5 ce5Var = (ce5) this.b.d;
                iwe iweVar = new iwe((dkl) ((jyr) ce5Var.b).getValue());
                bdt I = hag.I(tll.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                return new e3h(iweVar, (tll) qdcVar.D(I, l13Var, set), (a2h) ce5Var.k, (oq7) qdcVar.D(hag.I(oq7.class), l13Var, set), (mm6) qdcVar.D(hag.I(mm6.class), l13Var, set), (wjl) qdcVar.D(hag.I(wjl.class), l13Var, set));
            case 8:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                bdt I2 = hag.I(wjl.class);
                qdc qdcVar2 = l13Var2.a;
                Set set2 = l13Var2.b;
                return new cvb((wjl) qdcVar2.D(I2, l13Var2, set2), (fdn) qdcVar2.D(hag.I(fdn.class), l13Var2, set2), (jnl) qdcVar2.D(hag.I(jnl.class), l13Var2, set2), (zpl) ((jyr) ((ce5) this.b.d).j).getValue());
            case 9:
                ((l13) obj).getClass();
                return (oq7) ((jyr) ((xdh) this.b.c).a).getValue();
            case 10:
                ((l13) obj).getClass();
                return (nnq) ((jyr) ((ce5) this.b.d).i).getValue();
            case 11:
                ((l13) obj).getClass();
                return (z66) ((ce5) this.b.d).e;
            default:
                ((l13) obj).getClass();
                return (k1l) ((jyr) ((xdh) this.b.c).b).getValue();
        }
    }
}
