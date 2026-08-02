package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class zuv implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pzl b;

    public /* synthetic */ zuv(pzl pzlVar, int i) {
        this.a = i;
        this.b = pzlVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(nuv.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.E(new zuv(this.b, 1));
                o18Var.c = hag.I(lvv.class);
                rp7Var.getClass();
                rp7Var.E(new ulv(22));
                return Unit.a;
            default:
                ((l13) obj).getClass();
                return (nuv) ((o) this.b.b).a.getValue();
        }
    }
}
