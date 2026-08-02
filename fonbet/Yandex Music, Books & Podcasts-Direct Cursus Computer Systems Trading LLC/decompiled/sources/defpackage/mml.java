package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class mml implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lml b;

    public /* synthetic */ mml(lml lmlVar, int i) {
        this.a = i;
        this.b = lmlVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((l13) obj).getClass();
                return this.b.B();
            case 1:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                mm6 c = this.b.c();
                bdt I = hag.I(oq7.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                return new l1g((kll) qdcVar.D(hag.I(kll.class), l13Var, set), (oq7) qdcVar.D(I, l13Var, set), c);
            case 2:
                ((l13) obj).getClass();
                return this.b.t();
            default:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(oq7.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                lml lmlVar = this.b;
                rp7Var.E(new mml(lmlVar, 0));
                o18Var.c = hag.I(l1g.class);
                rp7Var.getClass();
                rp7Var.E(new mml(lmlVar, 1));
                o18Var.c = hag.I(kll.class);
                rp7Var.getClass();
                rp7Var.E(new mml(lmlVar, 2));
                o18Var.c = hag.I(fil.class);
                rp7Var.getClass();
                rp7Var.E(new sjl(18));
                return Unit.a;
        }
    }
}
