package defpackage;

import com.yandex.plus.pay.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class r8m implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pzl b;

    public /* synthetic */ r8m(pzl pzlVar, int i) {
        this.a = i;
        this.b = pzlVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(a.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                pzl pzlVar = this.b;
                rp7Var.D(new r8m(pzlVar, 1));
                o18Var.c = hag.I(com.yandex.plus.pay.ui.core.a.class);
                rp7Var.getClass();
                rp7Var.D(new r8m(pzlVar, 2));
                o18Var.c = hag.I(c7m.class);
                rp7Var.getClass();
                rp7Var.D(new r8m(pzlVar, 3));
                o18Var.c = hag.I(fjk.class);
                rp7Var.getClass();
                rp7Var.D(new k7m(24));
                o18Var.c = hag.I(kik.class);
                rp7Var.getClass();
                rp7Var.E(new k7m(25));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return ((s5m) ((l8m) this.b.b).a.a(hag.I(s5m.class))).a();
            case 2:
                ((l13) obj).getClass();
                return (com.yandex.plus.pay.ui.core.a) ((s5m) ((l8m) this.b.b).a.a(hag.I(s5m.class))).b.getValue();
            default:
                ((l13) obj).getClass();
                return (c7m) ((s5m) ((l8m) this.b.b).a.a(hag.I(s5m.class))).j.getValue();
        }
    }
}
