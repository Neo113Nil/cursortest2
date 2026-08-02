package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class vwc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ vwc(e00 e00Var, int i) {
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
                rp7Var.E(new vwc(e00Var, 1));
                o18Var.c = hag.I(z66.class);
                rp7Var.getClass();
                rp7Var.E(new vwc(e00Var, 2));
                o18Var.c = hag.I(k5m.class);
                rp7Var.getClass();
                rp7Var.E(new vwc(e00Var, 3));
                o18Var.c = hag.I(sw0.class);
                rp7Var.getClass();
                rp7Var.E(new vwc(e00Var, 4));
                o18Var.c = hag.I(mh7.class);
                rp7Var.getClass();
                rp7Var.E(new vwc(e00Var, 5));
                o18Var.c = hag.I(xwc.class);
                rp7Var.getClass();
                rp7Var.E(new cnc(7));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (frt) ((jyr) ((gs4) this.b.b).b).getValue();
            case 2:
                ((l13) obj).getClass();
                return (z66) ((jyr) ((gs4) this.b.b).a).getValue();
            case 3:
                ((l13) obj).getClass();
                return (k5m) ((jyr) ((gs4) this.b.b).c).getValue();
            case 4:
                ((l13) obj).getClass();
                return (sw0) ((jyr) ((gs4) this.b.b).d).getValue();
            default:
                ((l13) obj).getClass();
                return (mh7) ((jyr) ((gs4) this.b.b).e).getValue();
        }
    }
}
