package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class wu3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xu3 b;

    public /* synthetic */ wu3(xu3 xu3Var, int i) {
        this.a = i;
        this.b = xu3Var;
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
                rp7Var.E(new wu3(this.b, 1));
                o18Var.c = hag.I(dv3.class);
                rp7Var.getClass();
                rp7Var.E(new zj3(10));
                return Unit.a;
            default:
                ((l13) obj).getClass();
                return (Context) this.b.a.getValue();
        }
    }
}
