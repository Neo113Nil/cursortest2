package defpackage;

import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class lo1 implements ryc {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn5 b;

    public /* synthetic */ lo1(wn5 wn5Var, int i) {
        this.a = i;
        this.b = wn5Var;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                ((Integer) obj).getClass();
                hq5 hq5Var = (hq5) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 48) == 0) {
                    intValue |= (intValue & 64) == 0 ? ((oq5) hq5Var).f(obj2) : ((oq5) hq5Var).h(obj2) ? 32 : 16;
                }
                if ((intValue & 145) == 144) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                this.b.invoke(obj2, hq5Var, Integer.valueOf((intValue >> 3) & 14));
            case 1:
                ((Integer) obj).getClass();
                hq5 hq5Var2 = (hq5) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= (intValue2 & 64) == 0 ? ((oq5) hq5Var2).f(obj2) : ((oq5) hq5Var2).h(obj2) ? 32 : 16;
                }
                if ((intValue2 & 145) == 144) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                this.b.invoke(obj2, hq5Var2, Integer.valueOf((intValue2 >> 3) & 14));
            case 2:
                int intValue3 = ((Integer) obj4).intValue();
                ((spd) obj).getClass();
                this.b.invoke(obj2, (hq5) obj3, Integer.valueOf((intValue3 >> 3) & 14));
                break;
            case 3:
                ((Integer) obj).getClass();
                hq5 hq5Var3 = (hq5) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                obj2.getClass();
                if ((intValue4 & 48) == 0) {
                    intValue4 |= (intValue4 & 64) == 0 ? ((oq5) hq5Var3).f(obj2) : ((oq5) hq5Var3).h(obj2) ? 32 : 16;
                }
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue4 & 1, (intValue4 & 145) != 144)) {
                    this.b.invoke(obj2, oq5Var3, Integer.valueOf((intValue4 >> 3) & 14));
                } else {
                    oq5Var3.S();
                }
                break;
            default:
                ((Integer) obj).getClass();
                hq5 hq5Var4 = (hq5) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                obj2.getClass();
                if ((intValue5 & 48) == 0) {
                    intValue5 |= (intValue5 & 64) == 0 ? ((oq5) hq5Var4).f(obj2) : ((oq5) hq5Var4).h(obj2) ? 32 : 16;
                }
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue5 & 1, (intValue5 & 145) != 144)) {
                    this.b.invoke(obj2, oq5Var4, Integer.valueOf((intValue5 >> 3) & 14));
                } else {
                    oq5Var4.S();
                }
                break;
        }
        return Unit.a;
    }
}
