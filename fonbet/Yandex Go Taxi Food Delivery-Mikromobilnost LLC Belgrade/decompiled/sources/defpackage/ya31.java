package defpackage;

import java.util.List;
import kotlin.Pair;

/* loaded from: classes12.dex */
public final class ya31 implements bms {
    public final /* synthetic */ List a;
    public final /* synthetic */ rqy b;
    public final /* synthetic */ float c;
    public final /* synthetic */ tls w;

    public ya31(List list, rqy rqyVar, float f, tls tlsVar) {
        this.a = list;
        this.b = rqyVar;
        this.c = f;
        this.w = tlsVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Pair pair;
        bts btsVar;
        u4y u4yVar = (u4y) obj;
        int intValue = ((Number) obj2).intValue();
        fid fidVar = (fid) obj3;
        int intValue2 = ((Number) obj4).intValue();
        x2x x2xVar = x2x.b;
        if ((intValue2 & 6) == 0) {
            i = (((bts) fidVar).k(u4yVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= fidVar.c(intValue) ? 32 : 16;
        }
        bts btsVar2 = (bts) fidVar;
        if (btsVar2.V(i & 1, (i & 147) != 146)) {
            dme dmeVar = (dme) this.a.get(intValue);
            btsVar2.e0(1524469749);
            rqy rqyVar = this.b;
            List list = rqyVar.b;
            boolean z = rqyVar.a;
            int f = scc.f(list);
            float f2 = this.c;
            if (intValue == f) {
                pair = new Pair(new q590(f2, f2, 0.0f, 4), x2xVar);
            } else {
                pair = intValue == 0 ? new Pair(new q590(f2, f2, f2, 8), x2x.a) : new Pair(new q590(f2, f2, 0.0f, 12), x2x.c);
            }
            q590 q590Var = (q590) pair.getFirst();
            x2x x2xVar2 = (x2x) pair.getSecond();
            c530 c530Var = c530.a;
            o430 o430Var = did.a;
            tls tlsVar = this.w;
            if (z) {
                btsVar2.e0(1524933539);
                f530 n = an91.n(c530Var, q590Var.a, q590Var.c, q590Var.b, q590Var.d);
                boolean k = btsVar2.k(tlsVar) | btsVar2.e(dmeVar);
                Object Q = btsVar2.Q();
                if (k || Q == o430Var) {
                    Q = new ehl0(tlsVar, dmeVar, 1);
                    btsVar2.o0(Q);
                }
                ke91.c(u4yVar, x2xVar2, n, dmeVar, (sls) Q, btsVar2, i & 14);
                btsVar = btsVar2;
                btsVar.t(false);
            } else {
                btsVar = btsVar2;
                btsVar.e0(1525271718);
                f530 n2 = an91.n(c530Var, q590Var.a, q590Var.c, q590Var.b, q590Var.d);
                boolean k2 = btsVar.k(tlsVar) | btsVar.e(dmeVar);
                Object Q2 = btsVar.Q();
                if (k2 || Q2 == o430Var) {
                    Q2 = new ehl0(tlsVar, dmeVar, 2);
                    btsVar.o0(Q2);
                }
                ke91.b(u4yVar, n2, dmeVar, (sls) Q2, btsVar, i & 14);
                btsVar.t(false);
            }
            if (jl40.l(x2xVar2, x2xVar)) {
                btsVar.e0(1525814187);
                btsVar.t(false);
            } else {
                btsVar.e0(1525605650);
                yrl.e(an91.o(c530Var, 0.0f, 0.0f, z ? 10.0f : 0.0f, 0.0f, 11), null, btsVar, 0, 6);
                btsVar.t(false);
            }
            btsVar.t(false);
        } else {
            btsVar2.Y();
        }
        return zy11.a;
    }
}
