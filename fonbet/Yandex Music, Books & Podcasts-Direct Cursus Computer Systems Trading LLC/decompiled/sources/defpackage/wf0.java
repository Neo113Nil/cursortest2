package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class wf0 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf0(long j, ges gesVar, wn5 wn5Var, int i) {
        super(2);
        this.r = 2;
        this.s = j;
        this.t = gesVar;
        this.u = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        Object obj3 = this.u;
        Object obj4 = this.t;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                bg0.a((onj) obj4, (yci) obj3, this.s, (hq5) obj, rvf.R(1));
                break;
            case 1:
                hq5 hq5Var = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                fxf.f(this.s, ((rdt) ((oq5) hq5Var).j(vdt.a)).m, ild.C(1327513942, new s30(11, (o0k) obj4, (wn5) obj3), hq5Var), hq5Var, 384);
            case 2:
                ((Number) obj2).intValue();
                int R = rvf.R(385);
                fxf.f(this.s, (ges) obj4, (wn5) obj3, (hq5) obj, R);
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                g1r g1rVar = (g1r) obj4;
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    q0k q0kVar = bl3.a;
                    kk7 c = bl3.c(this.s, oq5Var2, 5);
                    boolean h = oq5Var2.h(g1rVar);
                    Object K = oq5Var2.K();
                    if (h || K == gq5.a) {
                        K = new d1r(g1rVar, 1);
                        oq5Var2.k0(K);
                    }
                    xee.q((Function0) K, null, false, c, ild.C(-929149933, new wk0(10, (String) obj3), oq5Var2), oq5Var2, 805306368, 382);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wf0(int i, long j, Object obj, Object obj2) {
        super(2);
        this.r = i;
        this.s = j;
        this.t = obj;
        this.u = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf0(onj onjVar, yci yciVar, long j, int i) {
        super(2);
        this.r = 0;
        this.t = onjVar;
        this.u = yciVar;
        this.s = j;
    }
}
