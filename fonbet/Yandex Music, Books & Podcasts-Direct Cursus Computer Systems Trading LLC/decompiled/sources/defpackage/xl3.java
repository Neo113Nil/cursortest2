package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class xl3 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yci b;
    public final /* synthetic */ ubb c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ xl3(ubb ubbVar, boolean z, yci yciVar, int i) {
        this.c = ubbVar;
        this.d = z;
        this.b = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.getClass();
                ltg.l(this.c, this.d, this.b, hq5Var, rvf.R(1));
                break;
            default:
                if ((num.intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                yci d = d.d(this.b, 1.0f);
                kfh d2 = ug3.d(b2c.f, false);
                oq5 oq5Var2 = (oq5) hq5Var;
                int i = oq5Var2.P;
                a l = oq5Var2.l();
                yci H = vnj.H(hq5Var, d);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(hq5Var, d2, wp5.f);
                g0g.U(hq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var2, i, kb5Var);
                }
                g0g.U(hq5Var, H, wp5.d);
                ltg.l(this.c, this.d, null, hq5Var, 0);
                oq5Var2.p(true);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xl3(yci yciVar, ubb ubbVar, boolean z) {
        this.b = yciVar;
        this.c = ubbVar;
        this.d = z;
    }
}
