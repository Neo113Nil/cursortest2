package defpackage;

import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class bb1 implements ryc {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bb1(Object obj, float f, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.a) {
            case 0:
                ib1 ib1Var = (ib1) this.c;
                ((Integer) obj).getClass();
                m7a m7aVar = (m7a) obj2;
                hq5 hq5Var = (hq5) obj3;
                ((Integer) obj4).getClass();
                m7aVar.getClass();
                ib1Var.getClass();
                oq5 oq5Var = (oq5) hq5Var;
                boolean f = oq5Var.f(m7aVar);
                Object K = oq5Var.K();
                Object obj5 = gq5.a;
                if (f || K == obj5) {
                    K = ib1Var.o(m7aVar);
                    oq5Var.k0(K);
                }
                p7a p7aVar = (p7a) K;
                s7a s7aVar = (s7a) gld.O(p7aVar.getState(), hq5Var).getValue();
                boolean h = oq5Var.h(p7aVar);
                Object K2 = oq5Var.K();
                if (h || K2 == obj5) {
                    Object m71Var = new m71(0, p7aVar, p7a.class, "onDonationClick", "onDonationClick()V", 0, 7);
                    oq5Var.k0(m71Var);
                    K2 = m71Var;
                }
                qld.i(s7aVar, this.b, (Function0) ((h9f) K2), d.d(vci.a, 1.0f), null, oq5Var, 27648);
                break;
            default:
                wn5 wn5Var = (wn5) this.c;
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                hq5 hq5Var2 = (hq5) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (((oq5) hq5Var2).d(intValue) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= (intValue2 & 64) == 0 ? ((oq5) hq5Var2).f(obj2) : ((oq5) hq5Var2).h(obj2) ? 32 : 16;
                }
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(i & 1, (i & 147) != 146)) {
                    wn5Var.invoke(num, obj2, new cma(this.b), oq5Var2, Integer.valueOf(i & 126));
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
