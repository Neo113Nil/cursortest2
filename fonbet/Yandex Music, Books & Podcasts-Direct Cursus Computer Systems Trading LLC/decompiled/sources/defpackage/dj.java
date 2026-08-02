package defpackage;

import androidx.compose.ui.graphics.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class dj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dj(long j, ges gesVar, yci yciVar, int i) {
        this.a = 0;
        this.c = j;
        this.d = gesVar;
        this.b = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                lg3.b(this.c, (ges) this.d, (yci) this.b, (hq5) obj, rvf.R(1));
                break;
            case 1:
                jzb jzbVar = (jzb) this.d;
                yci yciVar = (yci) this.b;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                lg3.q(jzbVar, yciVar, this.c, hq5Var, 0, 0);
            case 2:
                sdr sdrVar = (sdr) this.d;
                poi poiVar = (poi) this.b;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                boolean f = oq5Var3.f(sdrVar);
                Object K = oq5Var3.K();
                if (f || K == gq5.a) {
                    K = new xp(sdrVar, 2);
                    oq5Var3.k0(K);
                }
                yci a = a.a(vci.a, (Function1) K);
                kfh d = ug3.d(b2c.b, false);
                int i = oq5Var3.P;
                androidx.compose.runtime.internal.a l = oq5Var3.l();
                yci H = vnj.H(oq5Var3, a);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(oq5Var3, d, wp5.f);
                g0g.U(oq5Var3, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var3, i, kb5Var);
                }
                g0g.U(oq5Var3, H, wp5.d);
                float c = yhn.c(((t6k) poiVar).e(), 0.0f, 1.0f);
                long j = this.c;
                long j2 = (long) (c * j);
                agr agrVar = eq0.a;
                asq.p(j2, j, ((dq0) oq5Var3.j(agrVar)).c.b, ((dq0) oq5Var3.j(agrVar)).b.a, null, oq5Var3, 0);
                oq5Var3.p(true);
                break;
            case 3:
                ((Integer) obj2).getClass();
                dag.h((String) this.d, this.c, (yci) this.b, (hq5) obj, rvf.R(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ixf.i((b0t) this.d, (yci) this.b, this.c, (hq5) obj, rvf.R(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((ift) this.d).a((yci) this.b, this.c, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ dj(int i, long j, Object obj, Object obj2) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = j;
    }

    public /* synthetic */ dj(Object obj, yci yciVar, long j, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = yciVar;
        this.c = j;
    }

    public /* synthetic */ dj(String str, long j, yci yciVar, int i) {
        this.a = 3;
        this.d = str;
        this.c = j;
        this.b = yciVar;
    }
}
