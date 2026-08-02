package defpackage;

import androidx.compose.foundation.layout.d;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class k2e implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2e b;
    public final /* synthetic */ qnq c;
    public final /* synthetic */ List d;
    public final /* synthetic */ fvf e;
    public final /* synthetic */ vm f;
    public final /* synthetic */ q0k g;

    public /* synthetic */ k2e(j2e j2eVar, qnq qnqVar, List list, fvf fvfVar, vm vmVar, q0k q0kVar, int i) {
        this.a = 1;
        this.b = j2eVar;
        this.c = qnqVar;
        this.d = list;
        this.e = fvfVar;
        this.f = vmVar;
        this.g = q0kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    irv.a(zs4.f(oq5Var), 0.0f, 0.0f, ild.C(2036753537, new k2e(this.d, this.c, this.e, this.f, this.g, this.b, 2), oq5Var), oq5Var, 3072, 6);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ox6.o(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, rvf.R(65));
                break;
            case 2:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    pm0.a(null, ild.C(-2101293480, new k2e(this.d, this.c, this.e, this.f, this.g, this.b, 3), oq5Var2), oq5Var2, 48, 1);
                } else {
                    oq5Var2.S();
                }
                break;
            default:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Object K = oq5Var3.K();
                    Object obj3 = gq5.a;
                    if (K == obj3) {
                        K = gld.R(g.a, oq5Var3);
                        oq5Var3.k0(K);
                    }
                    mm6 mm6Var = (mm6) K;
                    qnq qnqVar = this.c;
                    boolean f = oq5Var3.f(qnqVar);
                    Object K2 = oq5Var3.K();
                    if (f || K2 == obj3) {
                        j2e j2eVar = this.b;
                        j2eVar.getClass();
                        mm6Var.getClass();
                        xqq xqqVar = j2eVar.a;
                        xqqVar.getClass();
                        K2 = new mrf(mm6Var, qnqVar, xqqVar);
                        oq5Var3.k0(K2);
                    }
                    irf.u(this.d, (krf) K2, d.c(vci.a, 1.0f), null, null, this.e, null, 0, null, ghh.C(this.f, this.g), 0.0f, 0, oq5Var3, 384, 0, 3544);
                } else {
                    oq5Var3.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ k2e(List list, qnq qnqVar, fvf fvfVar, vm vmVar, q0k q0kVar, j2e j2eVar, int i) {
        this.a = i;
        this.d = list;
        this.c = qnqVar;
        this.e = fvfVar;
        this.f = vmVar;
        this.g = q0kVar;
        this.b = j2eVar;
    }
}
