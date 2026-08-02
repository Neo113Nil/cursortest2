package defpackage;

import androidx.compose.foundation.lazy.a;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class f4k implements ryc {
    public final /* synthetic */ int a;
    public final /* synthetic */ lvf b;
    public final /* synthetic */ wn5 c;

    public /* synthetic */ f4k(lvf lvfVar, wn5 wn5Var, int i) {
        this.a = i;
        this.b = lvfVar;
        this.c = wn5Var;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj2;
                int intValue = num.intValue();
                hq5 hq5Var = (hq5) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((a) obj).getClass();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue2 & 1, (intValue2 & 145) != 144)) {
                    Object c = this.b.c(intValue);
                    if (c == null) {
                        break;
                    } else {
                        this.c.invoke(num, c, oq5Var, Integer.valueOf((intValue2 >> 3) & 14));
                    }
                } else {
                    oq5Var.S();
                }
                break;
            default:
                Integer num2 = (Integer) obj2;
                int intValue3 = num2.intValue();
                hq5 hq5Var2 = (hq5) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((dsf) obj).getClass();
                if ((intValue4 & 48) == 0) {
                    intValue4 |= ((oq5) hq5Var2).d(intValue3) ? 32 : 16;
                }
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue4 & 1, (intValue4 & 145) != 144)) {
                    Object c2 = this.b.c(intValue3);
                    if (c2 == null) {
                        break;
                    } else {
                        this.c.invoke(num2, c2, oq5Var2, Integer.valueOf((intValue4 >> 3) & 14));
                    }
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
