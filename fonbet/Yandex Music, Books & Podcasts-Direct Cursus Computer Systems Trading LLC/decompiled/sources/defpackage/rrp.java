package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class rrp implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ arp b;

    public /* synthetic */ rrp(arp arpVar, int i) {
        this.a = i;
        this.b = arpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        oq5 oq5Var;
        sdr o0;
        yci u;
        int i = this.a;
        vci vciVar = vci.a;
        arp arpVar = this.b;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((3 & ((Integer) obj2).intValue()) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                int i2 = 1;
                if (arpVar instanceof xqp) {
                    oq5 oq5Var3 = (oq5) hq5Var;
                    oq5Var3.Z(-967188555);
                    xqp xqpVar = (xqp) arpVar;
                    float f2 = xqpVar.b;
                    if (xqpVar.c) {
                        oq5Var3.Z(-967162453);
                        float f3 = 1.0f - f2;
                        long j = xqpVar.a;
                        if (f2 != 0.0f) {
                            j = (long) (j / f2);
                        }
                        f = 1.0f;
                        oq5Var = oq5Var3;
                        o0 = gut.T0(f3, j, 0.0f, false, null, oq5Var, 0, 252);
                        oq5Var.p(false);
                    } else {
                        f = 1.0f;
                        oq5Var = oq5Var3;
                        oq5Var.Z(-966885871);
                        o0 = szf.o0(Float.valueOf(1.0f - f2), oq5Var);
                        oq5Var.p(false);
                    }
                    float floatValue = ((Number) o0.getValue()).floatValue();
                    long j2 = d85.m;
                    long j3 = ((d85) oq5Var.j(sb6.a)).a;
                    if ((12 & 1) != 0) {
                        j2 = ((ma5) oq5Var.j(pa5.a)).d();
                    }
                    long j4 = j2;
                    if ((12 & 2) != 0) {
                        j3 = d85.b(j4, 0.24f, 0.0f, 0.0f, 0.0f, 14);
                    }
                    long b = d85.b(((ma5) oq5Var.j(pa5.a)).c(), 0.32f, 0.0f, 0.0f, 0.0f, 14);
                    vyj vyjVar = new vyj(j4, j3, b, d85.b(b, 0.12f, 0.0f, 0.0f, 0.0f, 14));
                    float f4 = 2;
                    Object K = oq5Var.K();
                    if (K == gq5.a) {
                        K = new qpp(26);
                        oq5Var.k0(K);
                    }
                    oq5 oq5Var4 = oq5Var;
                    wdg.b(floatValue, d.c(nfp.a(vciVar, (Function1) K), f), false, f4, vyjVar, oq5Var4, 3072);
                    agr agrVar = es5.h;
                    etn.l(agrVar.a(new kx7(((jx7) oq5Var4.j(agrVar)).getDensity(), f)), ild.C(1523600600, new rrp(arpVar, i2), oq5Var4), oq5Var4, 56);
                    oq5Var4.p(false);
                } else {
                    if (!Intrinsics.d(arpVar, yqp.a) && !Intrinsics.d(arpVar, zqp.a)) {
                        throw vz1.i((oq5) hq5Var, -169748963, false);
                    }
                    oq5 oq5Var5 = (oq5) hq5Var;
                    oq5Var5.Z(-965533558);
                    kfh d = ug3.d(b2c.f, false);
                    int i3 = oq5Var5.P;
                    a l = oq5Var5.l();
                    yci H = vnj.H(oq5Var5, vciVar);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var5.d0();
                    if (oq5Var5.O) {
                        oq5Var5.k(grbVar);
                    } else {
                        oq5Var5.n0();
                    }
                    g0g.U(oq5Var5, d, wp5.f);
                    g0g.U(oq5Var5, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var5, i3, kb5Var);
                    }
                    g0g.U(oq5Var5, H, wp5.d);
                    gae.b(a0g.E(R.drawable.ic_timer_24, 0, oq5Var5), null, null, 0L, oq5Var5, 48, 12);
                    oq5Var5.p(true);
                    oq5Var5.p(false);
                }
                return Unit.a;
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var2;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        return Unit.a;
                    }
                }
                xqp xqpVar2 = (xqp) arpVar;
                String K2 = lxe.K(xqpVar2.a);
                ges i4 = nu0.i();
                u = d.u(ksw.D(vciVar, xee.N(xqpVar2.a, hq5Var2), null), b2c.l, (r2 & 2) == 0);
                xcs.b(K2, u, 0L, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, i4, hq5Var2, 0, 0, 65020);
                return Unit.a;
        }
    }
}
