package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class po2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ po2(e00 e00Var, int i) {
        this.a = i;
        this.b = e00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(fzi.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.D(new po2(this.b, 1));
                o18Var.c = hag.I(um2.class);
                rp7Var.getClass();
                rp7Var.D(new gn2(10));
                o18Var.c = hag.I(sm2.class);
                rp7Var.getClass();
                rp7Var.E(new gn2(11));
                return Unit.a;
            default:
                ((l13) obj).getClass();
                e00 e00Var = this.b;
                in2 in2Var = (in2) e00Var.b;
                l13 l13Var = in2Var.a;
                uaa uaaVar = (uaa) l13Var.a.D(hag.I(uaa.class), l13Var, l13Var.b);
                l13 l13Var2 = in2Var.a;
                f7l f7lVar = (f7l) l13Var2.a.D(hag.I(f7l.class), l13Var2, l13Var2.b);
                bdt I = hag.I(c72.class);
                qdc qdcVar = l13Var2.a;
                Set set = l13Var2.b;
                c72 c72Var = (c72) qdcVar.D(I, l13Var2, set);
                bdt I2 = hag.I(lwc.class);
                qdc qdcVar2 = l13Var2.a;
                return new fzi(uaaVar, f7lVar, c72Var, (lwc) qdcVar2.D(I2, l13Var2, set), btf.b(new uu1(e00Var, 18)), new uu1(e00Var, 19), (z66) qdcVar2.D(hag.I(z66.class), l13Var2, set), new uu1(e00Var, 20));
        }
    }
}
