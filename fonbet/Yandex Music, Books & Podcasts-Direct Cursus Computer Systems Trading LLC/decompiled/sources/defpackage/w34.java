package defpackage;

import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class w34 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ kkp b;
    public final /* synthetic */ sai c;

    public /* synthetic */ w34(kkp kkpVar, sai saiVar, int i) {
        this.a = i;
        this.b = kkpVar;
        this.c = saiVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                bci bciVar = (bci) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                bciVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? ((oq5) hq5Var).f(bciVar) : ((oq5) hq5Var).h(bciVar) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    pd.b(new qzm[0], false, ild.C(2039616393, new sh1(13, bciVar, this.b, this.c), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    kkp kkpVar = this.b;
                    boolean z = ((c44) kkpVar.b).c;
                    boolean h = oq5Var2.h(kkpVar);
                    sai saiVar = this.c;
                    boolean f = h | oq5Var2.f(saiVar);
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (f || K == kjnVar) {
                        K = new ap1(kkpVar, saiVar);
                        oq5Var2.k0(K);
                    }
                    v7g.e(384, oq5Var2, a.a(vci.a, "section_pin_bottom_sheet"), (Function0) K, z);
                    Unit unit = Unit.a;
                    boolean h2 = oq5Var2.h(kkpVar);
                    Object K2 = oq5Var2.K();
                    if (h2 || K2 == kjnVar) {
                        K2 = new ox1(kkpVar, null, 5);
                        oq5Var2.k0(K2);
                    }
                    gld.w(oq5Var2, unit, (Function2) K2);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
