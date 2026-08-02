package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class om2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yci d;

    public /* synthetic */ om2(float f, boolean z, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = f;
        this.c = z;
        this.d = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                nt0.f(this.b, this.c, this.d, hq5Var, rvf.R(1));
                break;
            case 1:
                hdg.h(this.b, this.c, this.d, hq5Var, rvf.R(1));
                break;
            case 2:
                w1g.c(this.b, this.c, this.d, hq5Var, rvf.R(1));
                break;
            default:
                y5g.e(this.b, this.c, this.d, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }
}
