package defpackage;

import androidx.compose.foundation.lazy.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class gxv extends uif implements ryc {
    public final /* synthetic */ int r;
    public final /* synthetic */ List s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gxv(List list, Object obj, int i) {
        super(4);
        this.r = i;
        this.s = list;
        this.t = obj;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.r) {
            case 0:
                a aVar = (a) obj;
                int intValue = ((Number) obj2).intValue();
                hq5 hq5Var = (hq5) obj3;
                int intValue2 = ((Number) obj4).intValue();
                hxv hxvVar = (hxv) this.t;
                if ((intValue2 & 6) == 0) {
                    i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
                }
                if ((i & 147) == 146) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                bxv bxvVar = (bxv) this.s.get(intValue);
                oq5 oq5Var2 = (oq5) hq5Var;
                oq5Var2.Z(-2141783284);
                jd1 jd1Var = (jd1) bxvVar.g.getValue();
                int i3 = (i & 112) ^ 48;
                boolean z = true;
                boolean h = oq5Var2.h(hxvVar) | oq5Var2.f(bxvVar) | ((i3 > 32 && oq5Var2.d(intValue)) || (i & 48) == 32);
                Object K = oq5Var2.K();
                kjn kjnVar = gq5.a;
                if (h || K == kjnVar) {
                    K = new i25(hxvVar, bxvVar, intValue, 3);
                    oq5Var2.k0(K);
                }
                Function0 function0 = (Function0) K;
                boolean h2 = oq5Var2.h(hxvVar) | oq5Var2.f(bxvVar);
                if ((i3 <= 32 || !oq5Var2.d(intValue)) && (i & 48) != 32) {
                    z = false;
                }
                boolean z2 = h2 | z;
                Object K2 = oq5Var2.K();
                if (z2 || K2 == kjnVar) {
                    K2 = new fxv(hxvVar, bxvVar, intValue);
                    oq5Var2.k0(K2);
                }
                c9g.n(jd1Var, null, function0, (Function1) K2, oq5Var2, 0);
                oq5Var2.p(false);
                break;
            default:
                a aVar2 = (a) obj;
                int intValue3 = ((Number) obj2).intValue();
                hq5 hq5Var2 = (hq5) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = (((oq5) hq5Var2).f(aVar2) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((oq5) hq5Var2).d(intValue3) ? 32 : 16;
                }
                if ((i2 & 147) == 146) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                w1w w1wVar = (w1w) this.s.get(intValue3);
                oq5 oq5Var4 = (oq5) hq5Var2;
                oq5Var4.Z(824291611);
                zwf.p(w1wVar, intValue3, (Function2) this.t, null, oq5Var4, i2 & 112, 8);
                oq5Var4.p(false);
        }
        return Unit.a;
    }
}
