package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class md1 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ aj1 b;
    public final /* synthetic */ gvd c;
    public final /* synthetic */ yi1 d;
    public final /* synthetic */ q0d e;

    public /* synthetic */ md1(aj1 aj1Var, gvd gvdVar, yi1 yi1Var, q0d q0dVar, int i) {
        this.b = aj1Var;
        this.c = gvdVar;
        this.d = yi1Var;
        this.e = q0dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                nt0.c(this.b, this.c, this.d, this.e, (hq5) obj, R);
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
                nt0.c(this.b, this.c, this.d, this.e, hq5Var, 0);
        }
        return Unit.a;
    }

    public /* synthetic */ md1(aj1 aj1Var, ivd ivdVar, yi1 yi1Var, q0d q0dVar) {
        this.b = aj1Var;
        this.c = ivdVar;
        this.d = yi1Var;
        this.e = q0dVar;
    }
}
