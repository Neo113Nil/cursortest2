package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class s2d implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ s2d(e00 e00Var, int i) {
        this.a = i;
        this.b = e00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(w1d.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                e00 e00Var = this.b;
                rp7Var.E(new s2d(e00Var, 1));
                o18Var.c = hag.I(pu0.class);
                rp7Var.getClass();
                rp7Var.D(new cnc(e00Var));
                return Unit.a;
            default:
                ((l13) obj).getClass();
                return (w1d) ((r2d) this.b.b).a.getValue();
        }
    }
}
