package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.relocation.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class kl6 extends uif implements Function2 {
    public final /* synthetic */ yci A;
    public final /* synthetic */ yci B;
    public final /* synthetic */ lh3 C;
    public final /* synthetic */ qbs D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ Function1 F;
    public final /* synthetic */ mnj G;
    public final /* synthetic */ jx7 H;
    public final /* synthetic */ axf r;
    public final /* synthetic */ ges s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ lbs v;
    public final /* synthetic */ ybs w;
    public final /* synthetic */ tiu x;
    public final /* synthetic */ yci y;
    public final /* synthetic */ yci z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl6(axf axfVar, ges gesVar, int i, int i2, lbs lbsVar, ybs ybsVar, tiu tiuVar, yci yciVar, yci yciVar2, yci yciVar3, yci yciVar4, lh3 lh3Var, qbs qbsVar, boolean z, Function1 function1, mnj mnjVar, jx7 jx7Var) {
        super(2);
        this.r = axfVar;
        this.s = gesVar;
        this.t = i;
        this.u = i2;
        this.v = lbsVar;
        this.w = ybsVar;
        this.x = tiuVar;
        this.y = yciVar;
        this.z = yciVar2;
        this.A = yciVar3;
        this.B = yciVar4;
        this.C = lh3Var;
        this.D = qbsVar;
        this.E = z;
        this.F = function1;
        this.G = mnjVar;
        this.H = jx7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        yci c1uVar;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Number) obj2).intValue();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
            axf axfVar = this.r;
            yci g = d.g(vci.a, ((cma) axfVar.g.getValue()).a, 0.0f, 2);
            ges gesVar = this.s;
            yci q = vnj.q(g, new axd(gesVar, this.t, this.u));
            boolean h = oq5Var.h(axfVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new k5(28, axfVar);
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            lbs lbsVar = this.v;
            bxj bxjVar = (bxj) lbsVar.f.getValue();
            ybs ybsVar = this.w;
            long j = ybsVar.b;
            int i = rds.c;
            int i2 = (int) (j >> 32);
            long j2 = lbsVar.e;
            if (i2 == ((int) (j2 >> 32)) && (i2 = (int) (j & 4294967295L)) == ((int) (4294967295L & j2))) {
                i2 = rds.e(j);
            }
            lbsVar.e = ybsVar.b;
            l7t B = nt0.B(this.x, ybsVar.a);
            int ordinal = bxjVar.ordinal();
            if (ordinal == 0) {
                c1uVar = new c1u(lbsVar, i2, B, function0);
            } else {
                if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
                c1uVar = new g3e(lbsVar, i2, B, function0);
            }
            tyf.h(a.a(vnj.q(xp3.v(q).f(c1uVar).f(this.y).f(this.z), new wk0(13, gesVar)).f(this.A).f(this.B), this.C), ild.C(-1172467467, new jl6(this.D, axfVar, this.E, this.F, this.w, this.G, this.H, this.u), oq5Var), oq5Var, 48);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
