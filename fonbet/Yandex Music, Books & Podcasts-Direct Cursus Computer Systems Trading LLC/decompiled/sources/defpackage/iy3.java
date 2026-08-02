package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class iy3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny3 b;

    public /* synthetic */ iy3(ny3 ny3Var, int i, int i2) {
        this.a = i2;
        this.b = ny3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                nt0.h(this.b, hq5Var, rvf.R(1));
                break;
            default:
                tt0.c(this.b, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
