package defpackage;

import androidx.compose.foundation.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class pg6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yci b;
    public final /* synthetic */ wn5 c;

    public /* synthetic */ pg6(yci yciVar, wn5 wn5Var, int i) {
        this.a = 0;
        this.b = yciVar;
        this.c = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                leu.l(this.b, this.c, (hq5) obj, rvf.R(55));
                break;
            case 1:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                bg3.a(this.b, null, false, ild.C(-1293845144, new j26(this.c, 3), hq5Var), hq5Var, 3072, 6);
            case 2:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                float f = 16;
                yci q = a.q(this.b, f, 0.0f, f, 20, 2);
                kfh d = ug3.d(b2c.b, false);
                oq5 oq5Var3 = (oq5) hq5Var2;
                int i = oq5Var3.P;
                androidx.compose.runtime.internal.a l = oq5Var3.l();
                yci H = vnj.H(hq5Var2, q);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(hq5Var2, d, wp5.f);
                g0g.U(hq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var3, i, kb5Var);
                }
                g0g.U(hq5Var2, H, wp5.d);
                this.c.invoke(hq5Var2, 0);
                oq5Var3.p(true);
                break;
            default:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var3;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                zwf.i(((dq0) ((oq5) hq5Var3).j(eq0.a)).b.a, ild.C(-2051177788, new pg6(this.b, this.c, 2, (byte) 0), hq5Var3), hq5Var3, 48);
        }
        return Unit.a;
    }

    public /* synthetic */ pg6(yci yciVar, wn5 wn5Var, int i, byte b) {
        this.a = i;
        this.b = yciVar;
        this.c = wn5Var;
    }
}
