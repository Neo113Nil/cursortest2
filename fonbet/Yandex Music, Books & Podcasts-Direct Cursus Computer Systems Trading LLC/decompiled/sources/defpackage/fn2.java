package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class fn2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ fn2(e00 e00Var, int i) {
        this.a = i;
        this.b = e00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(yyi.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                e00 e00Var = this.b;
                rp7Var.D(new fn2(e00Var, 1));
                o18Var.c = hag.I(bzi.class);
                rp7Var.getClass();
                rp7Var.D(new tf2(24));
                o18Var.c = hag.I(puu.class);
                rp7Var.getClass();
                rp7Var.D(new fn2(e00Var, 2));
                o18Var.c = hag.I(tuu.class);
                rp7Var.getClass();
                rp7Var.D(new tf2(25));
                o18Var.c = hag.I(un2.class);
                rp7Var.getClass();
                rp7Var.D(new tf2(e00Var));
                o18Var.c = hag.I(xm2.class);
                rp7Var.getClass();
                rp7Var.E(new fn2(e00Var, 3));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                l13 l13Var = ((hn2) this.b.b).a;
                return new azi((z66) l13Var.a.D(hag.I(z66.class), l13Var, l13Var.b));
            case 2:
                ((l13) obj).getClass();
                l13 l13Var2 = ((hn2) this.b.b).a;
                return new suu((f7l) l13Var2.a.D(hag.I(f7l.class), l13Var2, l13Var2.b));
            default:
                l13 l13Var3 = (l13) obj;
                l13Var3.getClass();
                return new xm2(l13Var3.b(hag.I(un2.class), true), new uu1(this.b, 14));
        }
    }
}
