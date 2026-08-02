package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class bnl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ikl b;

    public /* synthetic */ bnl(ikl iklVar, int i) {
        this.a = i;
        this.b = iklVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(rpq.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                ikl iklVar = this.b;
                rp7Var.E(new bnl(iklVar, 1));
                o18Var.c = hag.I(jnl.class);
                rp7Var.getClass();
                rp7Var.E(new bnl(iklVar, 2));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                ikl iklVar2 = this.b;
                return new rpq((bvb) ((jyr) iklVar2.e).getValue(), (wjl) ((jyr) iklVar2.f).getValue(), (z66) ((jyr) iklVar2.g).getValue());
            default:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                ikl iklVar3 = this.b;
                return new jnl((tf6) iklVar3.b, btf.b(new ril(7, iklVar3)), (rpq) l13Var.a.D(hag.I(rpq.class), l13Var, l13Var.b), (List) ((jyr) iklVar3.d).getValue(), (ufl) iklVar3.i, (ekl) ((jyr) iklVar3.h).getValue(), iklVar3.a);
        }
    }
}
