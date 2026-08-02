package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class pv1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qv1 b;

    public /* synthetic */ pv1(qv1 qv1Var, int i) {
        this.a = i;
        this.b = qv1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(cc7.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.E(new pv1(this.b, 1));
                o18Var.c = hag.I(gjr.class);
                rp7Var.getClass();
                rp7Var.E(new ci1(25));
                o18Var.c = hag.I(nv1.class);
                rp7Var.getClass();
                rp7Var.E(new ci1(26));
                return Unit.a;
            default:
                ((l13) obj).getClass();
                return (cc7) this.b.a.getValue();
        }
    }
}
