package defpackage;

import java.util.List;

/* loaded from: classes11.dex */
public final class yzr implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ tls w;

    public /* synthetic */ yzr(List list, tls tlsVar, tls tlsVar2, int i) {
        this.a = i;
        this.b = list;
        this.c = tlsVar;
        this.w = tlsVar2;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.a;
        zy11 zy11Var = zy11.a;
        o430 o430Var = did.a;
        c530 c530Var = c530.a;
        List list = this.b;
        boolean z = true;
        switch (i3) {
            case 0:
                u4y u4yVar = (u4y) obj;
                int intValue = ((Number) obj2).intValue();
                fid fidVar = (fid) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((bts) fidVar).k(u4yVar) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= fidVar.c(intValue) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(i & 1, (i & 147) != 146)) {
                    btsVar.Y();
                    break;
                } else {
                    zxu zxuVar = (zxu) list.get(intValue);
                    btsVar.e0(1185100737);
                    if ((((i & 112) ^ 48) <= 32 || !btsVar.c(intValue)) && (i & 48) != 32) {
                        z = false;
                    }
                    boolean k = btsVar.k(zxuVar) | z;
                    Object Q = btsVar.Q();
                    if (k || Q == o430Var) {
                        Q = new xzr(intValue, zxuVar);
                        btsVar.o0(Q);
                    }
                    cta1.a(zxuVar, this.c, this.w, fnq0.b(c530Var, false, (tls) Q), btsVar, 0);
                    btsVar.t(false);
                    break;
                }
                break;
            default:
                u4y u4yVar2 = (u4y) obj;
                int intValue3 = ((Number) obj2).intValue();
                fid fidVar2 = (fid) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((bts) fidVar2).k(u4yVar2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= fidVar2.c(intValue3) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
                    btsVar2.Y();
                    break;
                } else {
                    zvd zvdVar = (zvd) list.get(intValue3);
                    btsVar2.e0(1825156997);
                    if ((((i2 & 112) ^ 48) <= 32 || !btsVar2.c(intValue3)) && (i2 & 48) != 32) {
                        z = false;
                    }
                    Object Q2 = btsVar2.Q();
                    if (z || Q2 == o430Var) {
                        Q2 = new yx8(intValue3, 3);
                        btsVar2.o0(Q2);
                    }
                    qpb1.a(zvdVar, u4y.a(u4yVar2, fnq0.b(c530Var, false, (tls) Q2), 7), this.c, this.w, btsVar2, 0);
                    btsVar2.t(false);
                    break;
                }
        }
        return zy11Var;
    }
}
