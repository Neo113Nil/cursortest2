package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class cgf implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ cgf(e00 e00Var, int i) {
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
                rp7Var.E(new cgf(this.b, 1));
                o18Var.c = hag.I(ggf.class);
                rp7Var.getClass();
                rp7Var.E(new s3f(14));
                return Unit.a;
            default:
                ((l13) obj).getClass();
                return (frt) ((zff) this.b.b).a.getValue();
        }
    }
}
