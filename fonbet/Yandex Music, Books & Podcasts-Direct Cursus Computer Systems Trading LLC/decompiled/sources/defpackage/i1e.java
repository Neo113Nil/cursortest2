package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class i1e implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ i1e(e00 e00Var, int i) {
        this.a = i;
        this.b = e00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(ses.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.E(new mvd(3));
                o18Var.c = hag.I(c1e.class);
                rp7Var.getClass();
                rp7Var.D(new i1e(this.b, 1));
                return Unit.a;
            default:
                ((l13) obj).getClass();
                return (c1e) ((z1e) this.b.b).b.getValue();
        }
    }
}
