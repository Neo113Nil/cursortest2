package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class rml implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rdk b;

    public /* synthetic */ rml(int i, rdk rdkVar) {
        this.a = i;
        this.b = rdkVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(oq7.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rdk rdkVar = this.b;
                rp7Var.E(new rml(1, rdkVar));
                o18Var.c = hag.I(qml.class);
                rp7Var.getClass();
                rp7Var.E(new rml(2, rdkVar));
                o18Var.c = hag.I(fil.class);
                rp7Var.getClass();
                rp7Var.E(new sjl(19));
                o18Var.c = hag.I(tml.class);
                rp7Var.getClass();
                rp7Var.E(new sjl(20));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (oq7) this.b.g;
            default:
                ((l13) obj).getClass();
                return new qml(new t1f(new sml(this.b)));
        }
    }
}
