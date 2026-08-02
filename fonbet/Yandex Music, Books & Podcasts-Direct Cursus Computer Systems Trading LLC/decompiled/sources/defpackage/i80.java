package defpackage;

import com.yandex.music.core.ui.compose.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class i80 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ i80(int i, Function0 function0) {
        this.a = 3;
        this.c = i;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).intValue();
                int R = rvf.R(this.c | 1);
                a.a(this.b, (hq5) obj, R);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int R2 = rvf.R(this.c | 1);
                xl1.g(this.b, (hq5) obj, R2);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int R3 = rvf.R(this.c | 1);
                xl1.b(this.b, (hq5) obj, R3);
                break;
            case 3:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                kfh d = ug3.d(b2c.f, false);
                oq5 oq5Var2 = (oq5) hq5Var;
                int i = oq5Var2.P;
                androidx.compose.runtime.internal.a l = oq5Var2.l();
                vci vciVar = vci.a;
                yci H = vnj.H(hq5Var, vciVar);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(hq5Var, d, wp5.f);
                g0g.U(hq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var2, i, kb5Var);
                }
                g0g.U(hq5Var, H, wp5.d);
                gae.b(a0g.E(this.c, 0, hq5Var), null, wyf.s(vciVar, this.b), 0L, hq5Var, 48, 8);
                oq5Var2.p(true);
                break;
            case 4:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                int intValue = ((Number) this.b.invoke()).intValue();
                oq5 oq5Var4 = (oq5) hq5Var2;
                Object K = oq5Var4.K();
                if (K == gq5.a) {
                    K = new xnq(19);
                    oq5Var4.k0(K);
                }
                ild.h(intValue, this.c, 0, oq5Var4, nfp.a(vci.a, (Function1) K));
            case 5:
                ((Integer) obj2).intValue();
                int R4 = rvf.R(this.c | 1);
                rzf.l(this.b, (hq5) obj, R4);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int R5 = rvf.R(this.c | 1);
                gut.k(this.b, (hq5) obj, R5);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int R6 = rvf.R(this.c | 1);
                o8g.g(this.b, (hq5) obj, R6);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int R7 = rvf.R(this.c | 1);
                c9g.m(this.b, (hq5) obj, R7);
                break;
            default:
                ((Integer) obj2).getClass();
                int R8 = rvf.R(this.c | 1);
                dag.n(this.b, (hq5) obj, R8);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i80(int i, int i2, Function0 function0, boolean z) {
        this.a = i2;
        this.b = function0;
        this.c = i;
    }

    public /* synthetic */ i80(Function0 function0, int i, int i2) {
        this.a = i2;
        this.b = function0;
        this.c = i;
    }
}
