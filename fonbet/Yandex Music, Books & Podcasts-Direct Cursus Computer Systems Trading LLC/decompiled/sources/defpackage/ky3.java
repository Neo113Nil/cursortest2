package defpackage;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ky3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ my3 b;

    public /* synthetic */ ky3(my3 my3Var, int i) {
        this.a = i;
        this.b = my3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        switch (this.a) {
            case 0:
                Bundle arguments = this.b.getArguments();
                if (arguments != null && (string = arguments.getString("CardsFragment.promoId")) != null) {
                    return string;
                }
                e7o.f(new uf3(4));
                return null;
            default:
                my3 my3Var = this.b;
                dy3 dy3Var = my3Var.k;
                String str = (String) my3Var.l.getValue();
                fnb m = my3Var.g.m();
                dy3Var.getClass();
                str.getClass();
                e00 e00Var = dy3Var.b;
                bdt I = hag.I(oy3.class);
                qdc qdcVar = e00Var.a;
                qdcVar.getClass();
                return new az3(str, (oy3) qdcVar.C(I), m);
        }
    }
}
