package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ig2 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ig2(float f, float f2, mg2 mg2Var) {
        this.b = f;
        this.c = f2;
        this.d = mg2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Object obj3 = (mg2) this.d;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                Object K = oq5Var2.K();
                if (K == gq5.a) {
                    oq5Var2.k0(obj3);
                } else {
                    obj3 = K;
                }
                bcx.b((mg2) obj3, this.b, null, this.c, oq5Var2, 0);
            default:
                ((Integer) obj2).getClass();
                int R = rvf.R(3079);
                q7g.m(this.b, (uoi) this.d, this.c, (hq5) obj, R);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ig2(float f, uoi uoiVar, float f2, int i) {
        this.b = f;
        this.d = uoiVar;
        this.c = f2;
    }
}
