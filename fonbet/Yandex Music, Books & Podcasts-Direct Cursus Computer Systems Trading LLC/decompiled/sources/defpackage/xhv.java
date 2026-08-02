package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class xhv implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jac b;
    public final /* synthetic */ pzl c;

    public /* synthetic */ xhv(jac jacVar, pzl pzlVar, int i) {
        this.a = i;
        this.b = jacVar;
        this.c = pzlVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(giv.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                jac jacVar = this.b;
                rp7Var.E(new q0v(6, jacVar));
                o18Var.c = hag.I(zhv.class);
                rp7Var.getClass();
                pzl pzlVar = this.c;
                rp7Var.E(new q0v(7, pzlVar));
                o18Var.c = hag.I(bkv.class);
                rp7Var.getClass();
                rp7Var.E(new xhv(jacVar, pzlVar, 1));
                o18Var.c = hag.I(thv.class);
                rp7Var.getClass();
                rp7Var.E(new xhv(jacVar, pzlVar, 2));
                return Unit.a;
            case 1:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new bkv((i0j) this.b.c, (zhv) l13Var.a.D(hag.I(zhv.class), l13Var, l13Var.b), this.c.d());
            default:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                bkv bkvVar = (bkv) l13Var2.a.D(hag.I(bkv.class), l13Var2, l13Var2.b);
                jac jacVar2 = this.b;
                return new thv(bkvVar, (tf6) jacVar2.b, (oq7) jacVar2.d, (z66) jacVar2.a, l13Var2.b(hag.I(zhv.class), true), new jvu(18, jacVar2), this.c.d());
        }
    }
}
