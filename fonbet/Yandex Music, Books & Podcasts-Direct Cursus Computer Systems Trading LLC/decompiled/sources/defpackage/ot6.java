package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ot6 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ut6 b;
    public final /* synthetic */ bci c;
    public final /* synthetic */ pt6 d;
    public final /* synthetic */ yci e;

    public /* synthetic */ ot6(ut6 ut6Var, bci bciVar, pt6 pt6Var, yci yciVar) {
        this.b = ut6Var;
        this.c = bciVar;
        this.d = pt6Var;
        this.e = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(65);
                kg5.f(this.b, this.c, this.d, this.e, (hq5) obj, R);
                break;
            default:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                kg5.f(this.b, this.c, this.d, this.e, hq5Var, 64);
        }
        return Unit.a;
    }

    public /* synthetic */ ot6(ut6 ut6Var, bci bciVar, pt6 pt6Var, yci yciVar, int i) {
        this.b = ut6Var;
        this.c = bciVar;
        this.d = pt6Var;
        this.e = yciVar;
    }
}
