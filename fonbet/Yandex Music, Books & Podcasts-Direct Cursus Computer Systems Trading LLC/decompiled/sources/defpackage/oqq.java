package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class oqq implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qqq b;
    public final /* synthetic */ List c;
    public final /* synthetic */ fvf d;
    public final /* synthetic */ vm e;
    public final /* synthetic */ q0k f;

    public /* synthetic */ oqq(qqq qqqVar, List list, fvf fvfVar, vm vmVar, q0k q0kVar, int i) {
        this.a = 1;
        this.b = qqqVar;
        this.c = list;
        this.d = fvfVar;
        this.e = vmVar;
        this.f = q0kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    irv.a(zs4.f(oq5Var), 0.0f, 0.0f, ild.C(573523450, new oqq(this.c, this.d, this.e, this.f, this.b, 2), oq5Var), oq5Var, 3072, 6);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                y7g.e(this.b, this.c, this.d, this.e, this.f, (hq5) obj, rvf.R(1));
                break;
            case 2:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    pm0.a(null, ild.C(-1360860527, new oqq(this.c, this.d, this.e, this.f, this.b, 3), oq5Var2), oq5Var2, 48, 1);
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
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = gld.R(g.a, oq5Var3);
                        oq5Var3.k0(K);
                    }
                    mm6 mm6Var = (mm6) K;
                    Object K2 = oq5Var3.K();
                    if (K2 == kjnVar) {
                        mm6Var.getClass();
                        qqq qqqVar = this.b;
                        mrf mrfVar = new mrf(mm6Var, qqqVar.a, qqqVar.b);
                        oq5Var3.k0(mrfVar);
                        K2 = mrfVar;
                    }
                    irf.u(this.c, (krf) K2, a.a(d.c(vci.a, 1.0f), "skeleton_screen_list"), null, null, this.d, null, 0, null, ghh.C(this.e, this.f), 0.0f, 0, oq5Var3, 432, 0, 3544);
                } else {
                    oq5Var3.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ oqq(List list, fvf fvfVar, vm vmVar, q0k q0kVar, qqq qqqVar, int i) {
        this.a = i;
        this.c = list;
        this.d = fvfVar;
        this.e = vmVar;
        this.f = q0kVar;
        this.b = qqqVar;
    }
}
