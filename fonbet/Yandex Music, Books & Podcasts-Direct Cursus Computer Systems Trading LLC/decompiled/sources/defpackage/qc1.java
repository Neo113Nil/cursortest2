package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class qc1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wc1 b;

    public /* synthetic */ qc1(wc1 wc1Var, int i) {
        this.a = 2;
        this.b = wc1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                zsd.d(this.b, hq5Var, 0);
                return Unit.a;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                zsd.d(this.b, hq5Var2, 0);
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                zsd.d(this.b, (hq5) obj, R);
                return Unit.a;
            default:
                tun tunVar = (tun) obj;
                uc1 uc1Var = (uc1) obj2;
                tunVar.getClass();
                uc1Var.getClass();
                return new g73(tunVar.a, new wn5(new a3(25, uc1Var, this.b), -706637648, true));
        }
    }

    public /* synthetic */ qc1(wc1 wc1Var, int i, byte b) {
        this.a = i;
        this.b = wc1Var;
    }
}
