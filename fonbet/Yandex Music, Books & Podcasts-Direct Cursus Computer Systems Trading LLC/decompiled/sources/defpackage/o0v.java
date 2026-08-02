package defpackage;

import androidx.compose.ui.graphics.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class o0v implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ onu b;
    public final /* synthetic */ k2v c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ o0v(onu onuVar, k2v k2vVar, Function0 function0) {
        this.b = onuVar;
        this.c = k2vVar;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        oq5 oq5Var;
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                onu onuVar = onu.a;
                onu onuVar2 = this.b;
                if (onuVar2 == onuVar || onuVar2 == onu.b) {
                    oq5Var = (oq5) hq5Var;
                    oq5Var.Z(1973846576);
                    Function0 function0 = this.d;
                    boolean f = oq5Var.f(function0);
                    Object K = oq5Var.K();
                    if (f || K == gq5.a) {
                        K = new ex(22, function0);
                        oq5Var.k0(K);
                    }
                    yci a = a.a(vci.a, (Function1) K);
                    kfh d = ug3.d(b2c.f, false);
                    int i2 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, a);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var, i2, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    w0v.a(this.c, onuVar2 == onu.b, oq5Var, 0);
                    oq5Var.p(true);
                } else {
                    oq5Var = (oq5) hq5Var;
                    oq5Var.Z(1963879301);
                }
                oq5Var.p(false);
                break;
            default:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                oq5 oq5Var4 = (oq5) hq5Var;
                if (this.b == onu.a) {
                    oq5Var4.Z(-1089037165);
                    y9l.d(this.c.a, a.a(vci.a, new r8u(1, this.d, true)), oq5Var4, 0);
                } else {
                    oq5Var4.Z(-1099488412);
                }
                oq5Var4.p(false);
        }
        return Unit.a;
    }

    public /* synthetic */ o0v(onu onuVar, Function0 function0, k2v k2vVar) {
        this.b = onuVar;
        this.d = function0;
        this.c = k2vVar;
    }
}
