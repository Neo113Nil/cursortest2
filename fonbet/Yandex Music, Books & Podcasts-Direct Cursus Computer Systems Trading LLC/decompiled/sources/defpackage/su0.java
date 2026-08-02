package defpackage;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class su0 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qzm[] b;
    public final /* synthetic */ dq0 c;
    public final /* synthetic */ cce d;
    public final /* synthetic */ q8r e;
    public final /* synthetic */ Function2 f;

    public /* synthetic */ su0(qzm[] qzmVarArr, dq0 dq0Var, cce cceVar, q8r q8rVar, Function2 function2) {
        this.b = qzmVarArr;
        this.c = dq0Var;
        this.d = cceVar;
        this.e = q8rVar;
        this.f = function2;
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
                        break;
                    }
                }
                qzm[] qzmVarArr = this.b;
                xv.g((qzm[]) Arrays.copyOf(qzmVarArr, qzmVarArr.length), this.c, this.d, this.e, this.f, hq5Var, 8);
            default:
                ((Integer) obj2).getClass();
                int R = rvf.R(9);
                xv.g(this.b, this.c, this.d, this.e, this.f, (hq5) obj, R);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ su0(qzm[] qzmVarArr, dq0 dq0Var, cce cceVar, q8r q8rVar, Function2 function2, int i) {
        this.b = qzmVarArr;
        this.c = dq0Var;
        this.d = cceVar;
        this.e = q8rVar;
        this.f = function2;
    }
}
