package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class rul implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ po6 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ bg5 d;

    public /* synthetic */ rul(bg5 bg5Var, po6 po6Var, boolean z) {
        this.a = 0;
        this.d = bg5Var;
        this.b = po6Var;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        yci f;
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                Unit unit = Unit.a;
                oq5 oq5Var2 = (oq5) hq5Var;
                bg5 bg5Var = this.d;
                boolean h = oq5Var2.h(bg5Var);
                Object K = oq5Var2.K();
                if (h || K == gq5.a) {
                    K = new tul(bg5Var, null, 1);
                    oq5Var2.k0(K);
                }
                f = vci.a.f(new SuspendPointerInputElement(unit, null, null, new dur((Function2) K), 6));
                kfh d = ug3.d(b2c.b, false);
                int i2 = oq5Var2.P;
                a l = oq5Var2.l();
                yci H = vnj.H(oq5Var2, f);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(oq5Var2, d, wp5.f);
                g0g.U(oq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var2, i2, kb5Var);
                }
                g0g.U(oq5Var2, H, wp5.d);
                ngg.k(this.b, this.c, bg5Var.k(), oq5Var2, 0);
                oq5Var2.p(true);
                break;
            case 1:
                oq5 oq5Var3 = (oq5) hq5Var;
                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                    u7g.p(this.b, this.c, this.d.k(), null, oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                break;
            default:
                oq5 oq5Var4 = (oq5) hq5Var;
                if (oq5Var4.P(intValue & 1, (intValue & 3) != 2)) {
                    u7g.p(this.b, this.c, this.d.k(), null, oq5Var4, 0);
                } else {
                    oq5Var4.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rul(po6 po6Var, boolean z, bg5 bg5Var, int i) {
        this.a = i;
        this.b = po6Var;
        this.c = z;
        this.d = bg5Var;
    }
}
