package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x0n extends uif implements pyc {
    public final /* synthetic */ long r;
    public final /* synthetic */ d1n s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0n(long j, d1n d1nVar) {
        super(3);
        this.r = j;
        this.s = d1nVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).g(booleanValue) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            vci vciVar = vci.a;
            yci c = d.c(vciVar, 1.0f);
            kfh d = ug3.d(b2c.f, false);
            int i = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                ouj.x(i, oq5Var, i, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            float f = z0n.c;
            float f2 = z0n.d;
            float f3 = (f + f2) * 2;
            long j = this.r;
            if (booleanValue) {
                oq5Var.Z(-1566007818);
                vum.b(d.m(vciVar, f3), j, f2, 0L, 0, oq5Var, 390, 24);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1565760097);
                z0n.b(this.s, j, d.m(vciVar, f3), oq5Var, 384);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
