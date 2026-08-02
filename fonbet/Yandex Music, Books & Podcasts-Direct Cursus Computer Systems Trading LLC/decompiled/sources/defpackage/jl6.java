package defpackage;

import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jl6 extends uif implements Function2 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl6(qbs qbsVar, axf axfVar, boolean z, Function1 function1, ybs ybsVar, mnj mnjVar, jx7 jx7Var, int i) {
        super(2);
        this.u = qbsVar;
        this.v = axfVar;
        this.s = z;
        this.w = function1;
        this.x = ybsVar;
        this.y = mnjVar;
        this.z = jx7Var;
        this.t = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00de, code lost:
    
        if (r2 != false) goto L30;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                qbs qbsVar = (qbs) this.u;
                axf axfVar = (axf) this.v;
                boolean z = true;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    il6 il6Var = new il6(axfVar, (Function1) this.w, (ybs) this.x, (mnj) this.y, (jx7) this.z, this.t);
                    int i = oq5Var.P;
                    a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, vci.a);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, il6Var, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                        ouj.x(i, oq5Var, i, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    oq5Var.p(true);
                    zrd a = axfVar.a();
                    zrd zrdVar = zrd.a;
                    boolean z2 = this.s;
                    if (a != zrdVar && axfVar.c() != null) {
                        wof c = axfVar.c();
                        c.getClass();
                        if (c.d()) {
                        }
                    }
                    z = false;
                    j66.E(qbsVar, z, oq5Var, 0);
                    if (axfVar.a() == zrd.c && z2) {
                        oq5Var.Z(-7167858);
                        j66.B(qbsVar, oq5Var, 0);
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(-7090978);
                        oq5Var.p(false);
                    }
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ((Number) obj2).intValue();
                s7g.h((androidx.compose.foundation.lazy.a) this.u, (ayn) this.v, this.w, (yci) this.x, this.s, (yci) this.y, (wn5) this.z, (hq5) obj, rvf.R(this.t | 1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl6(androidx.compose.foundation.lazy.a aVar, ayn aynVar, Object obj, yci yciVar, boolean z, yci yciVar2, wn5 wn5Var, int i) {
        super(2);
        this.u = aVar;
        this.v = aynVar;
        this.w = obj;
        this.x = yciVar;
        this.s = z;
        this.y = yciVar2;
        this.z = wn5Var;
        this.t = i;
    }
}
