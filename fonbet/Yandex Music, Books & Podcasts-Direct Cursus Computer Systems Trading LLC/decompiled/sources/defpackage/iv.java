package defpackage;

import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class iv implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ iv(String str, Function0 function0, int i) {
        this.a = i;
        this.b = str;
        this.c = function0;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                ((Boolean) obj).getClass();
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    irf.h(this.b, a.a(vci.a, "show_more"), null, null, this.c, false, null, false, null, oq5Var, 48, 492);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                uvd uvdVar = (uvd) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                uvdVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? ((oq5) hq5Var2).f(uvdVar) : ((oq5) hq5Var2).h(uvdVar) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                bkp.R(uvdVar, this.b, this.c, null, nu0.e(), hq5Var2, intValue2 & 14, 4);
            default:
                uvd uvdVar2 = (uvd) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                uvdVar2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= (intValue3 & 8) == 0 ? ((oq5) hq5Var3).f(uvdVar2) : ((oq5) hq5Var3).h(uvdVar2) ? 4 : 2;
                }
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 19) != 18)) {
                    bkp.R(uvdVar2, this.b, this.c, null, null, oq5Var3, intValue3 & 14, 12);
                } else {
                    oq5Var3.S();
                }
                break;
        }
        return Unit.a;
    }
}
