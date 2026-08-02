package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class zkw implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tot b;

    public /* synthetic */ zkw(tot totVar, int i) {
        this.a = i;
        this.b = totVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                return new clw(l13Var, this.b);
            default:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(clw.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                int i = 0;
                rp7Var.E(new zkw(this.b, i));
                o18Var.c = hag.I(rlw.class);
                rp7Var.getClass();
                rp7Var.E(new alw(i));
                o18Var.c = hag.I(wlw.class);
                rp7Var.getClass();
                rp7Var.E(new alw(1));
                o18Var.c = hag.I(qfw.class);
                rp7Var.getClass();
                rp7Var.E(new alw(2));
                o18Var.c = hag.I(qiw.class);
                rp7Var.getClass();
                rp7Var.E(new alw(3));
                o18Var.c = hag.I(cfw.class);
                rp7Var.getClass();
                rp7Var.E(new alw(4));
                o18Var.c = hag.I(zhw.class);
                rp7Var.getClass();
                rp7Var.E(new alw(5));
                o18Var.c = hag.I(bfw.class);
                rp7Var.getClass();
                rp7Var.E(new alw(6));
                return Unit.a;
        }
    }
}
