package defpackage;

import androidx.compose.ui.graphics.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pu6 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu6(vdr vdrVar, yci yciVar, xbl xblVar, wbl wblVar, int i) {
        super(2);
        this.r = 1;
        this.s = vdrVar;
        this.t = yciVar;
        this.u = xblVar;
        this.v = wblVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    d8t d8tVar = (d8t) this.s;
                    wk0 wk0Var = new wk0(2, (wdc) this.t);
                    oct octVar = azt.a;
                    Object c = d8tVar.c();
                    oq5Var.Z(-438678252);
                    Object obj3 = this.u;
                    float f = Intrinsics.d(c, obj3) ? 1.0f : 0.0f;
                    oq5Var.p(false);
                    Float valueOf = Float.valueOf(f);
                    Object value = d8tVar.d.getValue();
                    oq5Var.Z(-438678252);
                    float f2 = Intrinsics.d(value, obj3) ? 1.0f : 0.0f;
                    oq5Var.p(false);
                    z7t c2 = i8t.c(d8tVar, valueOf, Float.valueOf(f2), (wdc) wk0Var.invoke(d8tVar.f(), oq5Var, 0), octVar, oq5Var, 0);
                    boolean f3 = oq5Var.f(c2);
                    Object K = oq5Var.K();
                    if (f3 || K == gq5.a) {
                        K = new m40(29, c2);
                        oq5Var.k0(K);
                    }
                    yci a = a.a(vci.a, (Function1) K);
                    wn5 wn5Var = (wn5) this.v;
                    kfh d = ug3.d(b2c.b, false);
                    int i = oq5Var.P;
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
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                        ouj.x(i, oq5Var, i, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    wn5Var.invoke(obj3, oq5Var, 0);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                lf7.b((vdr) this.s, (yci) this.t, (xbl) this.u, (wbl) this.v, (hq5) obj, rvf.R(1));
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                oq5 oq5Var3 = (oq5) hq5Var2;
                oq5Var3.a0(105784523);
                tdt tdtVar = (tdt) oq5Var3.j(bfs.b);
                oq5Var3.p(false);
                long j = tdtVar.b;
                vdr vdrVar = (vdr) this.s;
                xbl xblVar = (xbl) this.t;
                oq5Var3.a0(881494809);
                boolean e = oq5Var3.e(j);
                Object K2 = oq5Var3.K();
                if (e || K2 == gq5.a) {
                    K2 = new zf0(j, 2);
                    oq5Var3.k0(K2);
                }
                Function1 function1 = (Function1) K2;
                oq5Var3.p(false);
                function1.getClass();
                vbl vblVar = new vbl();
                function1.invoke(vblVar);
                lf7.b(vdrVar, null, xblVar, new wbl(vblVar.a), oq5Var3, 0);
                hag.b((qe7) ((sdr) this.u).getValue(), (jag) ((aqi) this.v).getValue(), null, oq5Var3, 0);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pu6(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(2);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
        this.v = obj4;
    }
}
