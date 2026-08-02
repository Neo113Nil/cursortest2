package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class wi7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qw b;
    public final /* synthetic */ yci c;

    public /* synthetic */ wi7(qw qwVar, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = qwVar;
        this.c = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                etn.n(this.b, this.c, hq5Var, rvf.R(1));
                break;
            default:
                etn.q(this.b, this.c, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
