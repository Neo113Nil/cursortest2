package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class gyq implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pzl b;

    public /* synthetic */ gyq(pzl pzlVar, int i) {
        this.a = i;
        this.b = pzlVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 1;
        pzl pzlVar = this.b;
        switch (i) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(c72.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.E(new gyq(pzlVar, i2));
                o18Var.c = hag.I(g22.class);
                rp7Var.getClass();
                rp7Var.E(new gyq(pzlVar, 2));
                o18Var.c = hag.I(dyq.class);
                rp7Var.getClass();
                rp7Var.E(new gyq(pzlVar, 3));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (c72) ((u12) pzlVar.b).c.getValue();
            case 2:
                ((l13) obj).getClass();
                return new j22((cc7) ((u12) pzlVar.b).b.getValue());
            default:
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                u12 u12Var = (u12) pzlVar.b;
                Context context = (Context) u12Var.a.getValue();
                jyr b = l13Var.b(hag.I(g22.class), true);
                jyr b2 = l13Var.b(hag.I(c72.class), true);
                jyr jyrVar = dvu.e;
                return new dyq(context, u12Var, b, b2, kwl.d());
        }
    }
}
