package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class jlk implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e00 b;

    public /* synthetic */ jlk(e00 e00Var, int i) {
        this.a = i;
        this.b = e00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(Context.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                rp7Var.E(new jlk(this.b, 1));
                o18Var.c = hag.I(klk.class);
                rp7Var.getClass();
                rp7Var.E(new mjk(10));
                o18Var.c = hag.I(tkk.class);
                rp7Var.getClass();
                rp7Var.E(new mjk(11));
                o18Var.c = hag.I(flk.class);
                rp7Var.getClass();
                rp7Var.E(new mjk(12));
                o18Var.c = hag.I(h1o.class);
                rp7Var.getClass();
                rp7Var.E(new mjk(13));
                return Unit.a;
            default:
                ((l13) obj).getClass();
                return (Context) ((hlk) this.b.b).a.getValue();
        }
    }
}
