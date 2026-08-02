package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class ikf implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ ikf(e00 e00Var, int i) {
        this.a = i;
        this.b = e00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(lwc.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                e00 e00Var = this.b;
                rp7Var.E(new ikf(e00Var, 1));
                o18Var.c = hag.I(mg5.class);
                rp7Var.getClass();
                rp7Var.E(new ikf(e00Var, 2));
                o18Var.c = hag.I(gkf.class);
                rp7Var.getClass();
                rp7Var.E(new ikf(e00Var, 3));
                o18Var.c = hag.I(yxu.class);
                rp7Var.getClass();
                rp7Var.E(new ikf(e00Var, 4));
                o18Var.c = hag.I(v5v.class);
                rp7Var.getClass();
                rp7Var.E(new ikf(e00Var, 5));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (lwc) ((wjf) this.b.b).a.getValue();
            case 2:
                ((l13) obj).getClass();
                return (mg5) ((wjf) this.b.b).b.getValue();
            case 3:
                ((l13) obj).getClass();
                return (gkf) ((wjf) this.b.b).c.getValue();
            case 4:
                ((l13) obj).getClass();
                return (yxu) ((wjf) this.b.b).d.getValue();
            default:
                ((l13) obj).getClass();
                return (v5v) ((wjf) this.b.b).e.getValue();
        }
    }
}
