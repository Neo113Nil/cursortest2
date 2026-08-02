package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class tcc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ tcc(e00 e00Var, int i) {
        this.a = i;
        this.b = e00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(ddc.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                e00 e00Var = this.b;
                rp7Var.E(new tcc(e00Var, 1));
                o18Var.c = hag.I(ncc.class);
                rp7Var.getClass();
                rp7Var.E(new tcc(e00Var, 2));
                o18Var.c = hag.I(bdc.class);
                rp7Var.getClass();
                rp7Var.E(new qxb(27));
                o18Var.c = hag.I(pzk.class);
                rp7Var.getClass();
                rp7Var.E(new tcc(e00Var, 3));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                u12 u12Var = (u12) this.b.b;
                return new ddc((e0j) u12Var.a.getValue(), (cc7) u12Var.b.getValue(), (frt) u12Var.c.getValue());
            case 2:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new ncc((frt) ((u12) this.b.b).c.getValue(), (ddc) l13Var.a.D(hag.I(ddc.class), l13Var, l13Var.b));
            default:
                ((l13) obj).getClass();
                return new pzk((oq7) ((u12) this.b.b).d.getValue());
        }
    }
}
