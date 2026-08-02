package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class oi0 extends uif implements Function2 {
    public final /* synthetic */ long r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ onj u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi0(long j, boolean z, yci yciVar, onj onjVar) {
        super(2);
        this.r = j;
        this.s = z;
        this.t = yciVar;
        this.u = onjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Number) obj2).intValue();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
            long j = this.r;
            kjn kjnVar = gq5.a;
            onj onjVar = this.u;
            boolean z = this.s;
            if (j != 9205357640488583168L) {
                oq5Var.Z(-837626688);
                mx0 mx0Var = z ? lg3.b : lg3.a;
                yci k = d.k(this.t, fma.c(j), fma.b(j), 0.0f, 0.0f, 12);
                nho a = lho.a(mx0Var, b2c.k, oq5Var, 0);
                int i = oq5Var.P;
                a l = oq5Var.l();
                yci H = vnj.H(oq5Var, k);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var, i, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                boolean h = oq5Var.h(onjVar);
                Object K = oq5Var.K();
                if (h || K == kjnVar) {
                    K = new ni0(onjVar, 0);
                    oq5Var.k0(K);
                }
                qld.t(6, oq5Var, vci.a, (Function0) K, z);
                oq5Var.p(true);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-836697680);
                boolean h2 = oq5Var.h(onjVar);
                Object K2 = oq5Var.K();
                if (h2 || K2 == kjnVar) {
                    K2 = new ni0(onjVar, 1);
                    oq5Var.k0(K2);
                }
                qld.t(0, oq5Var, this.t, (Function0) K2, z);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
