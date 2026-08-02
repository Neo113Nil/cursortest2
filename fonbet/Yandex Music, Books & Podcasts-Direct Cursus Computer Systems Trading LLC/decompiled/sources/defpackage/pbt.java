package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class pbt implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qbt b;
    public final /* synthetic */ yci c;

    public /* synthetic */ pbt(qbt qbtVar, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = qbtVar;
        this.c = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                this.b.o(this.c, hq5Var, rvf.R(7));
                break;
            default:
                this.b.f(this.c, hq5Var, rvf.R(7));
                break;
        }
        return Unit.a;
    }
}
