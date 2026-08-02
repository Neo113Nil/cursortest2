package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class e1h implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0h b;

    public /* synthetic */ e1h(v0h v0hVar, int i) {
        this.a = i;
        this.b = v0hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(q0h.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                v0h v0hVar = this.b;
                rp7Var.E(new e1h(v0hVar, 1));
                o18Var.c = hag.I(u0h.class);
                rp7Var.getClass();
                rp7Var.E(new e1h(v0hVar, 2));
                o18Var.c = hag.I(oev.class);
                rp7Var.getClass();
                rp7Var.E(new e1h(v0hVar, 3));
                o18Var.c = hag.I(pu0.class);
                rp7Var.getClass();
                rp7Var.E(new brg(v0hVar, 19));
                o18Var.c = hag.I(x0h.class);
                rp7Var.getClass();
                rp7Var.E(new brg(v0hVar, 20));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (q0h) this.b.a.getValue();
            case 2:
                ((l13) obj).getClass();
                return (u0h) this.b.b.getValue();
            default:
                ((l13) obj).getClass();
                return (oev) this.b.c.getValue();
        }
    }
}
