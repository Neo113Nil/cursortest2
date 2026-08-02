package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class rjl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hgp b;

    public /* synthetic */ rjl(hgp hgpVar, int i) {
        this.a = i;
        this.b = hgpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(oml.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                hgp hgpVar = this.b;
                rp7Var.E(new rjl(hgpVar, 1));
                o18Var.c = hag.I(fil.class);
                rp7Var.getClass();
                rp7Var.E(new sjl(0));
                o18Var.c = hag.I(tml.class);
                rp7Var.getClass();
                rp7Var.E(new sjl(1));
                o18Var.c = hag.I(thl.class);
                rp7Var.getClass();
                rp7Var.E(new rjl(hgpVar, 2));
                o18Var.c = hag.I(fml.class);
                rp7Var.getClass();
                rp7Var.E(new rjl(hgpVar, 3));
                o18Var.c = hag.I(k7l.class);
                rp7Var.getClass();
                rp7Var.E(new sjl(2));
                o18Var.c = hag.I(wjl.class);
                rp7Var.getClass();
                rp7Var.E(new rjl(hgpVar, 4));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return new oml(new rdk(this.b));
            case 2:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                hgp hgpVar2 = this.b;
                h9n h9nVar = (h9n) ((jyr) hgpVar2.g).getValue();
                pjl pjlVar = (pjl) ((jyr) hgpVar2.c).getValue();
                return new thl(h9nVar, (lnl) ((jyr) hgpVar2.a).getValue(), pjlVar, (tml) l13Var.a.D(hag.I(tml.class), l13Var, l13Var.b));
            case 3:
                ((l13) obj).getClass();
                return new fml(new iwe(this.b));
            default:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                bdt I = hag.I(thl.class);
                qdc qdcVar = l13Var2.a;
                Set set = l13Var2.b;
                thl thlVar = (thl) qdcVar.D(I, l13Var2, set);
                k7l k7lVar = (k7l) qdcVar.D(hag.I(k7l.class), l13Var2, set);
                hgp hgpVar3 = this.b;
                return new wjl(thlVar, k7lVar, (tf6) hgpVar3.i, (k1l) ((jyr) hgpVar3.f).getValue(), (fil) qdcVar.D(hag.I(fil.class), l13Var2, set));
        }
    }
}
