package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class wfe implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ wfe(e00 e00Var, int i) {
        this.a = i;
        this.b = e00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(frt.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                e00 e00Var = this.b;
                rp7Var.E(new wfe(e00Var, 1));
                o18Var.c = hag.I(vrt.class);
                rp7Var.getClass();
                rp7Var.E(new wfe(e00Var, 2));
                o18Var.c = hag.I(cc7.class);
                rp7Var.getClass();
                rp7Var.E(new wfe(e00Var, 3));
                o18Var.c = hag.I(it0.class);
                rp7Var.getClass();
                rp7Var.E(new wfe(e00Var, 4));
                o18Var.c = hag.I(cfe.class);
                rp7Var.getClass();
                rp7Var.E(new mvd(e00Var));
                o18Var.c = hag.I(afe.class);
                rp7Var.getClass();
                rp7Var.E(new wfe(e00Var, 5));
                o18Var.c = hag.I(z66.class);
                rp7Var.getClass();
                rp7Var.E(new wfe(e00Var, 6));
                o18Var.c = hag.I(efe.class);
                rp7Var.getClass();
                rp7Var.E(new mvd(21));
                o18Var.c = hag.I(xfe.class);
                rp7Var.getClass();
                rp7Var.D(new mvd(17));
                o18Var.c = hag.I(lge.class);
                rp7Var.getClass();
                rp7Var.E(new mvd(18));
                o18Var.c = hag.I(nee.class);
                rp7Var.getClass();
                rp7Var.E(new mvd(19));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (frt) ((ofe) this.b.b).a.getValue();
            case 2:
                ((l13) obj).getClass();
                return (vrt) ((ofe) this.b.b).b.getValue();
            case 3:
                ((l13) obj).getClass();
                return (cc7) ((ofe) this.b.b).c.getValue();
            case 4:
                ((l13) obj).getClass();
                return ((ofe) this.b.b).d;
            case 5:
                ((l13) obj).getClass();
                return (afe) ((ofe) this.b.b).e.getValue();
            default:
                ((l13) obj).getClass();
                return (z66) ((ofe) this.b.b).f.getValue();
        }
    }
}
