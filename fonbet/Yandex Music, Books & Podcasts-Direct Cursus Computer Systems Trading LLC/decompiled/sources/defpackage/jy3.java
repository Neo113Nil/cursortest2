package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class jy3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ jy3(e00 e00Var, int i) {
        this.a = i;
        this.b = e00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(i0j.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                e00 e00Var = this.b;
                rp7Var.E(new jy3(e00Var, 1));
                o18Var.c = hag.I(oy3.class);
                rp7Var.getClass();
                rp7Var.E(new jy3(e00Var, 2));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (i0j) ((gy3) this.b.b).e.getValue();
            default:
                ((l13) obj).getClass();
                return new oy3(new le0(2, (gy3) this.b.b, gy3.class, "getCards", "getCards(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 5));
        }
    }
}
