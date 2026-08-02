package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class gml implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iwe b;

    public /* synthetic */ gml(iwe iweVar, int i) {
        this.a = i;
        this.b = iweVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(oq7.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                iwe iweVar = this.b;
                rp7Var.E(new gml(iweVar, 1));
                o18Var.c = hag.I(k7l.class);
                rp7Var.getClass();
                rp7Var.E(new gml(iweVar, 2));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (oq7) this.b.b;
            default:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new k7l((oq7) l13Var.a.D(hag.I(oq7.class), l13Var, l13Var.b), (gkl) this.b.c);
        }
    }
}
