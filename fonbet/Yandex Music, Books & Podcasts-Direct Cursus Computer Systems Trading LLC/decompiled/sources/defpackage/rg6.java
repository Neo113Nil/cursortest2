package defpackage;

import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class rg6 implements tyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rg6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                ges gesVar = (ges) obj;
                long j = ((d85) obj2).a;
                int intValue = ((Number) obj3).intValue();
                hq5 hq5Var = (hq5) obj4;
                int intValue2 = ((Number) obj5).intValue();
                gesVar.getClass();
                if ((intValue2 & 6) == 0) {
                    i = (((oq5) hq5Var).f(gesVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((oq5) hq5Var).e(j) ? 32 : 16;
                }
                if ((intValue2 & 384) == 0) {
                    i |= ((oq5) hq5Var).d(intValue) ? 256 : 128;
                }
                if ((i & 1171) == 1170) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                List list = (List) this.b;
                if (list != null) {
                    y2x.d(list, null, j, 0L, 0L, 0, 0L, intValue, null, gesVar, hq5Var, (i << 3) & 896, ((i >> 3) & 112) | ((i << 9) & 7168));
                }
            default:
                ges gesVar2 = (ges) obj;
                long j2 = ((d85) obj2).a;
                int intValue3 = ((Number) obj3).intValue();
                hq5 hq5Var2 = (hq5) obj4;
                int intValue4 = ((Number) obj5).intValue();
                gesVar2.getClass();
                if ((intValue4 & 6) == 0) {
                    i2 = (((oq5) hq5Var2).f(gesVar2) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((oq5) hq5Var2).e(j2) ? 32 : 16;
                }
                if ((intValue4 & 384) == 0) {
                    i2 |= ((oq5) hq5Var2).d(intValue3) ? 256 : 128;
                }
                if ((i2 & 1171) == 1170) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                String str = (String) this.b;
                if (str != null) {
                    int i3 = i2 << 3;
                    xv7.j(str, null, j2, 0L, 0L, 0, 0L, 2, false, intValue3, 0, null, gesVar2, hq5Var2, i3 & 896, (i3 & 7168) | 48 | ((i2 << 18) & 3670016), 55290);
                }
        }
        return Unit.a;
    }
}
