package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class ycb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ ycb(e00 e00Var, int i) {
        this.a = i;
        this.b = e00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(drj.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                e00 e00Var = this.b;
                rp7Var.E(new ycb(e00Var, 1));
                o18Var.c = hag.I(kdb.class);
                rp7Var.getClass();
                rp7Var.E(new ycb(e00Var, 2));
                o18Var.c = hag.I(lwc.class);
                rp7Var.getClass();
                rp7Var.E(new ycb(e00Var, 3));
                o18Var.c = hag.I(xcb.class);
                rp7Var.getClass();
                rp7Var.D(new ycb(e00Var, 4));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (drj) ((ncb) this.b.b).a.getValue();
            case 2:
                ((l13) obj).getClass();
                return (kdb) ((ncb) this.b.b).c.getValue();
            case 3:
                ((l13) obj).getClass();
                return (lwc) ((ncb) this.b.b).d.getValue();
            default:
                ((l13) obj).getClass();
                return (xcb) ((ncb) this.b.b).b.getValue();
        }
    }
}
