package defpackage;

import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class xd1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ xd1(float f) {
        this.a = 3;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.getClass();
                ot0.n(this.b, hq5Var, rvf.R(1));
                break;
            case 1:
                num.getClass();
                gh6.a(this.b, hq5Var, rvf.R(1));
                break;
            case 2:
                num.getClass();
                tt0.k(this.b, hq5Var, rvf.R(1));
                break;
            case 3:
                if ((num.intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                u1g.l(hq5Var, d.e(vci.a, this.b));
            case 4:
                num.getClass();
                zdg.c(this.b, hq5Var, rvf.R(1));
                break;
            default:
                num.getClass();
                y5g.I(this.b, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xd1(int i, float f, int i2) {
        this.a = i2;
        this.b = f;
    }
}
