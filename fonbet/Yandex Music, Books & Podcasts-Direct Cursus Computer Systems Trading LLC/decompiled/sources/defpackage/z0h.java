package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class z0h implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0h b;

    public /* synthetic */ z0h(t0h t0hVar, int i) {
        this.a = i;
        this.b = t0hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(b1h.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                t0h t0hVar = this.b;
                rp7Var.E(new z0h(t0hVar, 1));
                o18Var.c = hag.I(cc7.class);
                rp7Var.getClass();
                rp7Var.E(new z0h(t0hVar, 2));
                o18Var.c = hag.I(frt.class);
                rp7Var.getClass();
                rp7Var.E(new z0h(t0hVar, 3));
                o18Var.c = hag.I(q0h.class);
                rp7Var.getClass();
                rp7Var.E(new z0h(t0hVar, 4));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return new b1h((e0j) this.b.a.getValue());
            case 2:
                ((l13) obj).getClass();
                return (cc7) this.b.b.getValue();
            case 3:
                ((l13) obj).getClass();
                return (frt) this.b.c.getValue();
            default:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                jyr b = l13Var.b(hag.I(b1h.class), true);
                jyr b2 = l13Var.b(hag.I(cc7.class), true);
                jyr b3 = l13Var.b(hag.I(frt.class), true);
                t0h t0hVar2 = this.b;
                return new q0h(b, b2, b3, t0hVar2.d, new opg(16, t0hVar2), t0hVar2.e);
        }
    }
}
