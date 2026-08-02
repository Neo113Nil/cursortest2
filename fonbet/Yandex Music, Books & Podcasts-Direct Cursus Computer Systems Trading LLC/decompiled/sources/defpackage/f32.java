package defpackage;

import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class f32 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h32 b;

    public /* synthetic */ f32(h32 h32Var, int i) {
        this.a = i;
        this.b = h32Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        h32 h32Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(1880118173, new f32(h32Var, i2), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                jyr jyrVar = h32Var.n;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (K == kjnVar) {
                        K = gld.R(g.a, oq5Var2);
                        oq5Var2.k0(K);
                    }
                    mm6 mm6Var = (mm6) K;
                    Object K2 = oq5Var2.K();
                    if (K2 == kjnVar) {
                        K2 = new q32((t32) h32Var.o.getValue(), (d32) h32Var.p.getValue(), (a32) h32Var.m.getValue(), mm6Var);
                        oq5Var2.k0(K2);
                    }
                    iyq iyqVar = (iyq) ((b32) jyrVar.getValue()).a.getValue();
                    ((b32) jyrVar.getValue()).getClass();
                    jyr jyrVar2 = dzq.f;
                    vut.c((q32) K2, iyqVar, quk.f(), oq5Var2, 64);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
