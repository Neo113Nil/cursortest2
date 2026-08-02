package defpackage;

import androidx.compose.animation.b;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class en6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ en6(xxk xxkVar, xo6 xo6Var, boolean z, pbu pbuVar, boolean z2, int i) {
        this.a = 1;
        this.e = xxkVar;
        this.f = xo6Var;
        this.b = z;
        this.g = pbuVar;
        this.c = z2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Iterator it;
        yci yciVar;
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                xee.p((w4k) this.e, (zn6) this.f, this.b, this.c, (Function0) this.g, (hq5) obj, rvf.R(this.d | 1));
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                xee.g((xxk) this.e, (xo6) this.f, this.b, (pbu) this.g, this.c, (hq5) obj, rvf.R(this.d | 1));
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                zwf.a((yci) this.e, (bci) this.f, this.b, this.c, (Function1) this.g, (hq5) obj, rvf.R(this.d | 1));
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                hyf.e(this.b, this.c, (Function0) this.g, (q0k) this.e, (yci) this.f, (hq5) obj, rvf.R(this.d | 1));
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                oxm.a(this.b, this.c, (d85) this.e, (wn5) this.f, (yci) this.g, (hq5) obj, rvf.R(this.d | 1));
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                hag.a((String) this.e, this.b, (Function0) this.g, this.c, (yci) this.f, (hq5) obj, rvf.R(this.d | 1));
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                hag.h((List) this.e, (wn5) this.f, (yci) this.g, this.b, this.c, (hq5) obj, rvf.R(this.d | 1));
                return Unit.a;
            case 7:
                List list = (List) this.e;
                Function1 function1 = (Function1) this.f;
                aqi aqiVar = (aqi) this.g;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean z = true;
                boolean z2 = false;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    final float f = 8;
                    float f2 = ((cma) yhn.a(new cma((2 * f) + w1g.p(nu0.c(), 0, oq5Var, 0, 2) + w1g.p(nu0.i(), 0, oq5Var, 0, 2)), new cma(60))).a;
                    Iterator it2 = list.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            u75.n();
                            throw null;
                        }
                        final w1s w1sVar = (w1s) next;
                        final boolean z3 = this.d == i ? z : z2;
                        agr agrVar = eq0.a;
                        long j = ((dq0) oq5Var.j(agrVar)).c.c;
                        yci yciVar2 = vci.a;
                        yci u = xp3.u(d.e(yciVar2, f2), ugo.a);
                        if (z3) {
                            oq5Var.Z(-1047935145);
                            it = it2;
                            yciVar = a.b(yciVar2, ((dq0) oq5Var.j(agrVar)).d.c, vnj.i);
                            z2 = false;
                            oq5Var.p(false);
                        } else {
                            it = it2;
                            z2 = false;
                            oq5Var.Z(-1047823421);
                            oq5Var.p(false);
                            yciVar = yciVar2;
                        }
                        yci f3 = u.f(yciVar);
                        if (((Boolean) aqiVar.getValue()).booleanValue()) {
                            yciVar2 = b.a(yciVar2, null, 3);
                        }
                        yci f4 = f3.f(yciVar2);
                        boolean f5 = oq5Var.f(function1) | oq5Var.d(i);
                        Object K = oq5Var.K();
                        if (f5 || K == gq5.a) {
                            K = new q9n(i, 2, function1);
                            oq5Var.k0(K);
                        }
                        final boolean z4 = this.b;
                        final boolean z5 = this.c;
                        f1s.a(z3, (Function0) K, ild.C(-303110172, new Function2() { // from class: n2s
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                long b;
                                hq5 hq5Var2 = (hq5) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    hxe hxeVar = hxe.b;
                                    vci vciVar = vci.a;
                                    yci o = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.r(vciVar, hxeVar), 0.0f, f, 1);
                                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                                    int i3 = oq5Var2.P;
                                    androidx.compose.runtime.internal.a l = oq5Var2.l();
                                    yci H = vnj.H(oq5Var2, o);
                                    xp5.T.getClass();
                                    grb grbVar = wp5.b;
                                    oq5Var2.d0();
                                    if (oq5Var2.O) {
                                        oq5Var2.k(grbVar);
                                    } else {
                                        oq5Var2.n0();
                                    }
                                    g0g.U(oq5Var2, a, wp5.f);
                                    g0g.U(oq5Var2, l, wp5.e);
                                    kb5 kb5Var = wp5.g;
                                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                                        ouj.x(i3, oq5Var2, i3, kb5Var);
                                    }
                                    g0g.U(oq5Var2, H, wp5.d);
                                    w1s w1sVar2 = w1sVar;
                                    String str = w1sVar2.b;
                                    String str2 = w1sVar2.c;
                                    yci D = neg.D();
                                    if (z3) {
                                        oq5Var2.Z(347094817);
                                        b = ((dq0) oq5Var2.j(eq0.a)).b.a;
                                    } else {
                                        oq5Var2.Z(347096140);
                                        b = d85.b(((dq0) oq5Var2.j(eq0.a)).b.a, 0.5f, 0.0f, 0.0f, 0.0f, 14);
                                    }
                                    oq5Var2.p(false);
                                    xcs.b(str, D, b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.c(), oq5Var2, 0, 3120, 55288);
                                    oq5 oq5Var3 = oq5Var2;
                                    if (z4 && (str2 == null || str2.length() == 0)) {
                                        oq5Var3.Z(-2124605315);
                                        u1g.l(oq5Var3, d.e(vciVar, mu0.a));
                                        ivf.k(0, 0, oq5Var3, xp3.u(d.o(vciVar, 80, w1g.p(nu0.i(), 0, oq5Var3, 0, 2)), ugo.a), z5);
                                        oq5Var3.p(false);
                                    } else {
                                        if (str2 == null || str2.length() == 0) {
                                            oq5Var3.Z(-2129888056);
                                        } else {
                                            oq5Var3.Z(-2124068705);
                                            u1g.l(oq5Var3, d.e(vciVar, mu0.a));
                                            xcs.b(w1sVar2.c, neg.D(), ((dq0) oq5Var3.j(eq0.a)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var3, 0, 3120, 55288);
                                            oq5Var3 = oq5Var3;
                                        }
                                        oq5Var3.p(false);
                                    }
                                    oq5Var3.p(true);
                                } else {
                                    oq5Var2.S();
                                }
                                return Unit.a;
                            }
                        }, oq5Var), ild.C(-1534402715, new wl3(w1sVar, z5, 8), oq5Var), f4, false, j, 0L, oq5Var, 3456);
                        i = i2;
                        f = f;
                        it2 = it;
                        z = true;
                    }
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 8:
                ((Integer) obj2).getClass();
                w8u.b((z9u) this.e, this.b, this.c, (m6u) this.f, (yci) this.g, (hq5) obj, rvf.R(this.d | 1));
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                rzf.q((xjv) this.e, this.b, this.c, (yci) this.f, (ihv) this.g, (hq5) obj, rvf.R(this.d | 1));
                return Unit.a;
        }
    }

    public /* synthetic */ en6(Object obj, Object obj2, boolean z, boolean z2, syc sycVar, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.f = obj2;
        this.b = z;
        this.c = z2;
        this.g = sycVar;
        this.d = i;
    }

    public /* synthetic */ en6(Object obj, boolean z, boolean z2, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.b = z;
        this.c = z2;
        this.f = obj2;
        this.g = obj3;
        this.d = i;
    }

    public /* synthetic */ en6(String str, boolean z, Function0 function0, boolean z2, yci yciVar, int i) {
        this.a = 5;
        this.e = str;
        this.b = z;
        this.g = function0;
        this.c = z2;
        this.f = yciVar;
        this.d = i;
    }

    public /* synthetic */ en6(List list, int i, Function1 function1, aqi aqiVar, boolean z, boolean z2) {
        this.a = 7;
        this.e = list;
        this.d = i;
        this.f = function1;
        this.g = aqiVar;
        this.b = z;
        this.c = z2;
    }

    public /* synthetic */ en6(List list, wn5 wn5Var, yci yciVar, boolean z, boolean z2, int i) {
        this.a = 6;
        this.e = list;
        this.f = wn5Var;
        this.g = yciVar;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    public /* synthetic */ en6(boolean z, boolean z2, d85 d85Var, wn5 wn5Var, yci yciVar, int i) {
        this.a = 4;
        this.b = z;
        this.c = z2;
        this.e = d85Var;
        this.f = wn5Var;
        this.g = yciVar;
        this.d = i;
    }

    public /* synthetic */ en6(boolean z, boolean z2, Function0 function0, q0k q0kVar, yci yciVar, int i) {
        this.a = 3;
        this.b = z;
        this.c = z2;
        this.g = function0;
        this.e = q0kVar;
        this.f = yciVar;
        this.d = i;
    }
}
