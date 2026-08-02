package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class lfv implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pzl b;

    public /* synthetic */ lfv(pzl pzlVar, int i) {
        this.a = i;
        this.b = pzlVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(igv.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                pzl pzlVar = this.b;
                rp7Var.D(new lfv(pzlVar, 1));
                o18Var.c = hag.I(z66.class);
                rp7Var.getClass();
                rp7Var.D(new lfv(pzlVar, 2));
                o18Var.c = hag.I(jgv.class);
                rp7Var.getClass();
                rp7Var.D(new lfv(pzlVar, 3));
                o18Var.c = hag.I(oev.class);
                rp7Var.getClass();
                rp7Var.D(new lfv(pzlVar, 4));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                l13 l13Var = ((efv) this.b.b).a;
                return (igv) l13Var.a.D(hag.I(igv.class), l13Var, l13Var.b);
            case 2:
                ((l13) obj).getClass();
                l13 l13Var2 = ((efv) this.b.b).a;
                return (z66) l13Var2.a.D(hag.I(z66.class), l13Var2, l13Var2.b);
            case 3:
                ((l13) obj).getClass();
                l13 l13Var3 = ((efv) this.b.b).a;
                return (jgv) l13Var3.a.D(hag.I(jgv.class), l13Var3, l13Var3.b);
            default:
                ((l13) obj).getClass();
                l13 l13Var4 = ((efv) this.b.b).a;
                return (oev) l13Var4.a.D(hag.I(oev.class), l13Var4, l13Var4.b);
        }
    }
}
