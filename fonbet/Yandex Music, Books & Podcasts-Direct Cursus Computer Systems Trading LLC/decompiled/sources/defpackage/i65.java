package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class i65 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ i65(e00 e00Var, int i) {
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
                e00 e00Var = this.b;
                rp7Var.D(new i65(e00Var, 1));
                o18Var.c = hag.I(p3u.class);
                rp7Var.getClass();
                rp7Var.D(new i65(e00Var, 2));
                o18Var.c = hag.I(jrk.class);
                rp7Var.getClass();
                rp7Var.D(new i65(e00Var, 3));
                o18Var.c = hag.I(a65.class);
                rp7Var.getClass();
                rp7Var.E(new i65(e00Var, 4));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (frt) ((f65) this.b.b).a.getValue();
            case 2:
                ((l13) obj).getClass();
                return (p3u) ((f65) this.b.b).b.getValue();
            case 3:
                ((l13) obj).getClass();
                return (jrk) ((f65) this.b.b).e.getValue();
            default:
                ((l13) obj).getClass();
                f65 f65Var = (f65) this.b.b;
                return new a65((rus) f65Var.d.getValue(), (p3u) f65Var.b.getValue(), (b8u) f65Var.c.getValue());
        }
    }
}
